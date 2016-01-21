package com.mavict.freemarker.directive;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
 * @date 2015年12月2日 下午12:00:00
 */
@Component
public class ShowPicsDirective extends BaseDirective implements ServletContextAware {

	private ServletContext servletContext;
	
	@Override
	public void setServletContext(ServletContext servletContext) {
		this.servletContext = servletContext;
	}

	@Override
	public void execute(Environment env, Map params, TemplateModel[] loopVars, TemplateDirectiveBody body) throws TemplateException, IOException {
		Integer exampleId = FreemarkerUtils.getParameter("id", Integer.class, params);
		String dirFileString = File.separator+"content"+File.separator+"examples"+File.separator+exampleId;
		File dirFile = new File(servletContext.getRealPath(dirFileString));
		File[] files = dirFile.listFiles();
		 
		String showAllPics = "";
		
		String carousel_indicators = "";
		String carousel_inner = "";
		
		if (files.length > 0) {
			
			for (int i = 0; i < files.length; i++) {
				String className = "'item'";
				String classLive = "";
				if (i == 0) {
					className = "'active item'";
					classLive = "class='active'";
				}
				carousel_indicators +="<li data-target='#myCarousel' data-slide-to='"+i+"'"+classLive+"></li>";
				carousel_inner += "<div class="+className+"><img src='../content/examples/"+exampleId+"/"+files[i].getName()+"' style='width:858px;height:300px'></div>";	
			}
				
			showAllPics="<div id='myCarousel' class='carousel slide'><ol class='carousel-indicators'>"+carousel_indicators+"</ol><div class='carousel-inner'>"+carousel_inner+"</div><a class='carousel-control left' href='#myCarousel' data-slide='prev' style='margin-top:130px;height:30px'>&lsaquo;</a><a class='carousel-control right' href='#myCarousel' data-slide='next' style='margin-top:130px;height:30px'>&rsaquo;</a></div>";
			
		}
		
		Map<String, Object> variables = new HashMap<String, Object>();
		variables.put("showAllPics", showAllPics);
		setLocalVariables(variables, env, body);
	}
}
