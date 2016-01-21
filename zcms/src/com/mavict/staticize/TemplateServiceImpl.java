package com.mavict.staticize;

import java.io.File;
import java.util.List;

import javax.servlet.ServletContext;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;
import org.springframework.web.context.ServletContextAware;

import com.mavict.setting.SettingAttributes;
import com.mavict.staticize.Template.Type;

/**
 * 
 * 
 * @author 沧海软件(北京)有限公司
 * @date   2015年6月27日 上午10:51:24
 */
@Service
public class TemplateServiceImpl implements TemplateService, ServletContextAware {
	
	private ServletContext servletContext;
	
	@Override
	public void setServletContext(ServletContext servletContext) {
		this.servletContext = servletContext;
	}

	@Override
	public List<Template> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Template> getList(Type type) {
		// TODO Auto-generated method stub
		return null;
	}

	
	/** 根据 模板id名称 获取模板数据模型 */
	@Override
	public Template get(String id) {
		try {
			File projectXmlFile = new ClassPathResource(SettingAttributes.PROJECT_XML_PATH).getFile();
			Document document = new SAXReader().read(projectXmlFile);
			Element element = (Element) document.selectSingleNode("/project/template[@id='" + id + "']");
			Template template = getTemplate(element);
			return template;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}		
	}
	
	/** 根据 元素 获取模板数据模型 */
	private Template getTemplate(Element element){
		String id = element.attributeValue("id");
		String type = element.attributeValue("type");
		String name = element.attributeValue("name");
		String templatePath = element.attributeValue("templatePath");
		String staticDir = element.attributeValue("staticDir");
		
		Template template = new Template();
		template.setId(id);
		template.setType(Type.valueOf(type));
		template.setName(name);
		template.setTemplatePath(templatePath);
		template.setStaticDir(staticDir);
		return template;
	}

	
	
	@Override
	public String read(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String read(Template template) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void write(String id, String content) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void write(Template template, String content) {
		// TODO Auto-generated method stub
		
	}

}
