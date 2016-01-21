package com.mavict.staticize;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.ServletContext;

import org.apache.commons.io.IOUtils;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;
import org.springframework.web.context.ServletContextAware;
import org.springframework.web.servlet.view.freemarker.FreeMarkerConfigurer;

import com.mavict.PageInfo;
import com.mavict.article.Article;
import com.mavict.article.ArticleService;
import com.mavict.setting.navigation.Navigation;

  
/**
 * 
 * 
 * @author 沧海软件(北京)有限公司
 * @date   2015年7月7日 下午3:52:11
 */
@Service
public class StaticServiceImpl implements StaticService, ServletContextAware {

	private ServletContext servletContext;
	
	@Resource
	private FreeMarkerConfigurer freeMarkerConfigurer;
	
	@Resource(name = "templateServiceImpl")
	private TemplateService templateService;
	
	@Resource(name = "articleServiceImpl")
	private ArticleService articleService;
	
	@Override
	public void setServletContext(ServletContext servletContext) {
		this.servletContext = servletContext;	
	}
	
	/**
	 * 生成静态页面文件
	 * 
	 * @param template
	 * 实体内容所对应的模板实体
	 * 
	 * @param staticFileName
	 * 欲生成的静态文件的地址
	 * 
	 * @param model
	 * 携带 实体内容的model
	 * 
	 * */
	@Override
	public String createStaticFile(Template template,String staticFileName,Map<String, Object> model) {
		Assert.notNull(template);
		
		String templatePath = template.getTemplatePath();
		String staticDir    = template.getStaticDir();
		
		FileOutputStream fileOutputStream = null;
		OutputStreamWriter outputStreamWriter = null;
		Writer writer = null;
		try {
	
			/** 若静态文件所在目录不存在,则创建*/
			File staticDirFile = new File(servletContext.getRealPath(staticDir));  
			if (!staticDirFile.exists()) {
				staticDirFile.mkdirs();
			}
			
			/** 构造静态文件名*/
			String staticPath = staticDir + staticFileName;                          // 静态文件地址
			File staticFile = new File(servletContext.getRealPath(staticPath));      // 获取静态文件

			/** 写文件IO流  writer */
			fileOutputStream = new FileOutputStream(staticFile);
			outputStreamWriter = new OutputStreamWriter(fileOutputStream, "UTF-8");
			writer = new BufferedWriter(outputStreamWriter);
		
			/** 生成静态文件 - 用模板template处理writer */
			freemarker.template.Template freemarkerTemplate = freeMarkerConfigurer.getConfiguration().getTemplate(templatePath,"UTF-8"); // freemarker模板变量
			freemarkerTemplate.process(model, writer); // 生成静态文件
			writer.flush();
			
			return staticPath;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			IOUtils.closeQuietly(writer);
			IOUtils.closeQuietly(outputStreamWriter);
			IOUtils.closeQuietly(fileOutputStream);
		}
		
	}

	/**
	 * 生成文章内容静态文件
	 * 
	 * @param article 
	 * 文章实体
	 * 
	 * @param articleCategoryTypeId
	 * 文章类型 - 多篇or单篇 - 据此选择多篇模板(articles)还是单篇模板(article)
	 * 
	 * @return 生成的静态文件地址
	 * */
	@Override
	public String createStaticFile(Article article, Integer articleCategoryTypeId) {
		Assert.notNull(article);
		Assert.notNull(articleCategoryTypeId);
		
		String articleType = (articleCategoryTypeId == 1) ? "article" : "articles"; 
		/** 该文章对应的模板 */
		Template template = templateService.get(articleType);
		Map<String, Object> model = new HashMap<String, Object>();
		
		String staticFileName = String.valueOf(article.getId())+".html";
		
		/** 写入模板的实体内容*/
		model.put("article", article);
		
		return createStaticFile(template, staticFileName, model);
	}


	@Override
	public String createStaticFile(List<Navigation> navigations) {
		Assert.notNull(navigations);
		
		Template template = templateService.get("navigation");
		Map<String, Object> model = new HashMap<String, Object>();
		String staticFileName = "navigation.html";
		/** 写入模板的实体内容*/
		model.put("navigations", navigations);
		
		/** 针对每一个一级栏目,生成与其对应的 二级菜单栏目列表 静态代码片段*/
		for (Navigation navigation : navigations) {
			if (navigation.getGrade() == 0) {
				Template subTemplate = templateService.get("subNavigation");
				Map<String, Object> subModel = new HashMap<String, Object>();
				String subStaticFileName = "navigation-"+navigation.getId()+".html";
				subModel.put("navigation", navigation);
				createStaticFile(subTemplate, subStaticFileName, subModel);
			}
		}
		
		return createStaticFile(template, staticFileName, model);
	}

	/** 生成内容列表静态文件 */
	@Override
	public String createStaticFile(Integer categoryId,Integer pageNumber) {
		Template template = templateService.get("articleList");
		template.setStaticDir(template.getStaticDir()+String.valueOf(categoryId)+"/");
		String staticFileName = pageNumber+".html";
		PageInfo pageInfo = new PageInfo();
		pageInfo.setPageNumber(pageNumber);
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("categoryId", categoryId);
		model.put("pagedContent", articleService.getPagedContentService(pageInfo));

		return createStaticFile(template, staticFileName, model);
	}

	@Override
	public String createStaticFile(String categoryName,Integer categoryId,Integer limitNumber) {
		Template template = templateService.get("abbreviation");
		String staticFileName = "abbreviation-"+categoryId+".html";
		Map<String, Object> model = new HashMap<String, Object>();
		List<Article> articles = articleService.getAbbreviationService(categoryId,limitNumber);
		
		/** 设置时间格式 */
		List<String> dates = new ArrayList<String>();
		SimpleDateFormat sdf = new SimpleDateFormat("yy/MM/dd");
		for (Article article : articles) {
			String date = sdf.format(article.getCreateDate());
			dates.add(date);
		}
		
		model.put("articles", articles);
		model.put("dates", dates);
		model.put("categoryName", categoryName);
		model.put("categoryId", categoryId);
		return createStaticFile(template, staticFileName, model);
	}

	
}
