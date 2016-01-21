package com.mavict.staticize;

import java.util.List;

import com.mavict.staticize.Template.Type;

/**
 * 
 * 
 * @author 沧海软件(北京)有限公司
 * @date   2015年6月27日 上午10:50:55
 */

public interface TemplateService {
	/**
	 * 获取所有模板
	 * 
	 * @return 所有模板
	 */
	List<Template> getAll();

	/**
	 * 获取模板
	 * 
	 * @param type
	 *            类型
	 * @return 模板
	 */
	List<Template> getList(Type type);

	/**
	 * 获取模板
	 * 
	 * @param id
	 *            ID
	 * @return 模板
	 */
	Template get(String id);

	/**
	 * 读取模板文件内容
	 * 
	 * @param id
	 *            ID
	 * @return 模板文件内容
	 */
	String read(String id);

	/**
	 * 读取模板文件内容
	 * 
	 * @param template
	 *            模板
	 * @return 模板文件内容
	 */
	String read(Template template);

	/**
	 * 写入模板文件内容
	 * 
	 * @param id
	 *            Id
	 * @param content
	 *            模板文件内容
	 */
	void write(String id, String content);

	/**
	 * 写入模板文件内容
	 * 
	 * @param template
	 *            模板
	 * @param content
	 *            模板文件内容
	 */
	void write(Template template, String content);
}
