package com.mavict.freemarker.directive;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletContext;

import org.springframework.stereotype.Component;
import org.springframework.web.context.ServletContextAware;

import com.mavict.utils.FreemarkerUtils;

import freemarker.core.Environment;
import freemarker.template.TemplateDirectiveBody;
import freemarker.template.TemplateException;
import freemarker.template.TemplateModel;

/**
 * Directive - 判断静态片段文件是否存在 指令
 * 
 * @author 沧海软件(北京)有限公司
 * @date   2015年10月20日 下午10:12:13
 */
@Component
public class AbbrDirective extends BaseDirective implements ServletContextAware{

	private static final String CATEGORY_ID = "categoryId";
	private static final String IS_EXIST = "isExist";
	
	private ServletContext servletContext;
	
	@Override
	public void setServletContext(ServletContext servletContext) {
		this.servletContext = servletContext;
	}
	
	@Override 
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void execute(Environment env, Map params, TemplateModel[] loopVars, TemplateDirectiveBody body) throws TemplateException, IOException {
		Integer categoryId = FreemarkerUtils.getParameter(CATEGORY_ID, Integer.class, params);
		String abbrFilePath = File.separator+"snippet"+File.separator+"abbreviation-"+categoryId+".html";
		File abbrFile = new File(servletContext.getRealPath(abbrFilePath));
		
		Map<String, Object> variables = new HashMap<String, Object>();	
		
		if (abbrFile.exists()) {
			variables.put(IS_EXIST, true);
		}else {
			variables.put(IS_EXIST, false);
		}
		
		setLocalVariables(variables, env, body);
	}


}
