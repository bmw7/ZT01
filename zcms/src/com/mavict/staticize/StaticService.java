package com.mavict.staticize;

import java.util.List;
import java.util.Map;

import com.mavict.article.Article;
import com.mavict.setting.navigation.Navigation;

/**
 * 
 * 
 * @author 沧海软件(北京)有限公司
 * @date   2015年7月7日 下午3:50:56
 */

public interface StaticService {
	
	/** 
	 * 生成静态文件通用操作  
	 * 
	 * @param template
	 * 内容实体所对应的模板实体 - 包含 模板文件路径、静态文件目录 等属性
	 * 
	 * @param model 
	 * 内容实体放入此model 经模板作用生成静态文件  
	 * 
	 * @return 静态页面地址
	 * */
	String createStaticFile(Template template, String staticFileName, Map<String, Object> model);
	
	/** 
	 * 生成文章静态文件 
	 * 
	 *  @param article 文章实体
	 *  @param articleCategoryTypeId 文章所属类型Id (单篇 或 多篇) 
	 *  
	 *  @return 静态页面地址*/
	String createStaticFile(Article article,Integer articleCategoryTypeId);
	
	/** 
	 * 静态列表文件
	 * 
	 * @param pageNumber
	 * 页码
	 * 
	 * */
	String createStaticFile(Integer categoryId,Integer pageNumber);
	
	/** 生成导航栏目静态snippet*/
	String createStaticFile(List<Navigation> navigations);
	
	/** 生成文章列表缩略片段snippet*/
	String createStaticFile(String categoryName,Integer categoryId,Integer limitNumber);
	
}
