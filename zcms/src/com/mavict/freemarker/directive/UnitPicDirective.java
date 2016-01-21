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
 * 
 * 
 * @author 沧海软件(北京)有限公司
 * @date 2015年12月1日 下午8:16:49
 */
@Component
public class UnitPicDirective extends BaseDirective  implements ServletContextAware{

	private ServletContext servletContext;
	
	@Override
	public void setServletContext(ServletContext servletContext) {
		this.servletContext = servletContext;
	}
	
	@Override
	public void execute(Environment env, Map params, TemplateModel[] loopVars, TemplateDirectiveBody body) throws TemplateException, IOException {
		Integer exampleId = FreemarkerUtils.getParameter("id", Integer.class, params);
		String dirFileString = File.separator+"content"+File.separator+"examples"+File.separator+exampleId+"_small";
		File dirFile = new File(servletContext.getRealPath(dirFileString));
		File[] files = dirFile.listFiles();
		String fileName = "";
		
		if (files.length > 0) {
			fileName = files[0].getName();
		}
		String imgSrc = "content/examples/"+String.valueOf(exampleId)+"_small/"+fileName;
		Map<String, Object> variables = new HashMap<String, Object>();
		variables.put("imgSrc", imgSrc);
		setLocalVariables(variables, env, body);
	}
}
