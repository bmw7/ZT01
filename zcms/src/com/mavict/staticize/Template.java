package com.mavict.staticize;

import java.io.Serializable;

/**
 * 不同类型的模板数据模型,具体属性内容在project.xml中预定义
 * 
 * @author 沧海软件(北京)有限公司
 * @date   2015年6月27日 上午10:11:52
 */

public class Template implements Serializable{

	private static final long serialVersionUID = -8780952052907785464L;

	/** 类型 */
	public enum Type {
		page,  //页面模板 
		mail,  //邮件模板 
		print  //打印模板 
	}
	
	private String id;     // 模板id名称
	private Type   type;   // 类型 
	private String name;   // 名称 
	private String templatePath; // 模板文件路径 
	private String staticDir;       // 静态文件目录 
	private String description;  // 描述 
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Type getType() {
		return type;
	}
	public void setType(Type type) {
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTemplatePath() {
		return templatePath;
	}
	public void setTemplatePath(String templatePath) {
		this.templatePath = templatePath;
	}
	public String getStaticDir() {
		return staticDir;
	}
	public void setStaticDir(String staticDir) {
		this.staticDir = staticDir;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
}
