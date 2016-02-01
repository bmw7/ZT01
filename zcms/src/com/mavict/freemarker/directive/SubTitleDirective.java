package com.mavict.freemarker.directive;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.mavict.article.Article;
import com.mavict.article.image.ArticleImage;
import com.mavict.utils.FreemarkerUtils;

import freemarker.core.Environment;
import freemarker.template.TemplateDirectiveBody;
import freemarker.template.TemplateException;
import freemarker.template.TemplateModel;

/**
 * 
 * 
 * @author 沧海软件(北京)有限公司
 * @date 2016年1月31日 下午5:38:31
 */

@Component
public class SubTitleDirective extends BaseDirective{
	
	@Override
	public void execute(Environment env, Map params, TemplateModel[] loopVars, TemplateDirectiveBody body) throws TemplateException, IOException {		
		String title = FreemarkerUtils.getParameter("title", String.class, params);
		Integer start = FreemarkerUtils.getParameter("start", Integer.class, params);
		Integer end = FreemarkerUtils.getParameter("end", Integer.class, params);
		
		if (title.length() > end) {
			title = title.substring(start, end);
		}
		
		Map<String, Object> variables = new HashMap<String, Object>();
		variables.put("title", title);
		setLocalVariables(variables, env, body);
	}

}
