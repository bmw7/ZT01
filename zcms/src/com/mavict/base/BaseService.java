package com.mavict.base;

import java.io.Serializable;
import java.util.List;

import com.mavict.PageInfo;
import com.mavict.PagedContent;

/**
 * 服务基类
 * 
 * @author 沧海软件(北京)有限公司
 * @date   2015年5月29日 下午8:21:40
 */

public interface BaseService<T,ID extends Serializable> {
	
	
	
	/*----------------- 增 ----------------*/
	
	
	/**
	 * 保存实体
	 * 
	 * @param entity 实体
	 * */
	void saveService(T entity);
	
	
	
	/*----------------- 删 ----------------*/
	
	
	
	/**
	 * 删除实体
	 * 
	 * @param id 实体id
	 * */
	void deleteService(ID id);
	
	
	/**
	 * 删除实体
	 * 
	 * @param entity 实体
	 * */
	void deleteService(T entity);
	
	
	/**
	 * 删除实体
	 * 
	 * @param clause 条件语句 包含占位符?
	 * @param values 占位符的对应值
	 * */
	void deleteService(String clause, Object...values);
	
	
	
	
	/*----------------- 改 ----------------*/
	
	
	
	/**
	 * 更新实体
	 * 
	 * @param entity 实体
	 * */
	void updateService(T entity);
	
	
	/**
	 * 更新实体
	 * 
	 * @param clause 条件语句 包含占位符?
	 * @param values 占位符的对应值
	 * */
	void updateService(String clause, Object...values);
	
	
	
	/*----------------- 查 ----------------*/
	
	
	
	/**
	 * 获取单个实体 - 查询实体id获取
	 * 
	 * @param id 实体id
	 * 
	 * @return 实体
	 * */
	T getService(ID id);
	
	
	/**
	 * 获取单个实体 - 查询字段值获取
	 * 
	 * @param column 欲查询的字段名
	 * @param value  查询字段的值
	 * 
	 * @return 实体
	 * */
	T getService(String column, Object value);
	
	
	/**
	 * 获取所有实体
	 * 
	 * 说明：未定义排序，默认排序
	 * 
	 * @return 实体List
	 * */
	List<T> getService(); 
	
	
	/**
	 * [G1] 获取实体集合 - 查询字段值获取 - 默认逆序
	 * 
	 * @param column 欲查询的字段名
	 * @param value  查询字段的值
	 * @param orderColumn 默认逆序排列的字段名
	 * 
	 * @return 实体List集合
	 * */
	List<T> getService(String column,Object value,String orderColumn);
	
	
	/**
	 * [G1-BASE] 获取实体集合 - 查询字段值获取 
	 * 
	 * @param column 欲查询的字段名
	 * @param value  查询字段的值
	 * @param orderColumn 欲排列的字段名
	 * @param sequence 正序或逆序  asc 或  desc
	 * 
	 * @return 实体List集合
	 * */
	List<T> getService(String column,Object value,String orderColumn, String sequence);
	
	
	/**
	 * [G2] 获取所有 满足条件语句的count个实体集合 - 默认从0开始
	 * 
	 * @param count 前count个条目
	 * @param orderColumn 排序字段
	 * @param sequence 正序或逆序 asc 或  desc
	 * @param fiters 检索条件
	 * 
	 * @return 实体List集合
	 * */
	List<T> getService(Integer count, String orderColumn, String sequence, Object[]... filters);
	
	
	/**
	 * [G2-BASE] 获取所有 满足条件语句的 实体集合
	 * 
	 * @param start 开始数字
	 * @param count 数目
	 * @param orderColumn 排序字段
	 * @sequence 正序或逆序
	 * @fiters 检索条件,格式形如 new Object[] {"columnName","=","columnValue"}
	 * 
	 * @return 实体List集合
	 * */
	List<T> getService(Integer start, Integer count, String orderColumn, String sequence, Object[]... filters); 
	
	
	/**
	 * [G3] 获取所有 满足条件语句的count个 实体集合 - 默认从0开始
	 * 
	 * @param count 前count个条目
	 * @param clause 条件语句 形如 "where id = ? and name = ?"
	 * @param values 占位符? 的对应值
	 * 
	 * @return 实体List集合
	 * */
	List<T> getService(Integer count, String clause, Object... values);
	
	
	/**
	 * [G3-BASE] 获取所有 满足条件语句的 count个 实体集合 - [BASE]
	 * 
	 * @param start 开始条目
	 * @param count 条目数
	 * @param clause 条件语句 形如 "where id = ? and name = ?"
	 * @param values 占位符? 的对应值
	 * 
	 * @return 实体List集合
	 * */
	List<T> getService(Integer start, Integer count, String clause, Object... values); 
		
	
	/** 
	 * 获取分页内容 
	 * 
	 * @param pageInfo 分页信息
	 * 
	 * @return 分页实体集合
	 * */
    PagedContent<T> getPagedContentService(PageInfo pageInfo);
   
    
	/** 
	 * 获取单字段条件查询的分页内容 
	 * 
	 * @param pageInfo 分页信息
	 * @param column 查询字段名
	 * @param value 查询字段对应的查询值
	 * @param orderColumn 排序字段名
	 * @param sequence 正序或逆序
	 * 
	 * @return 分页实体集合
	 * */
    PagedContent<T> getPagedContentService(PageInfo pageInfo,String column, Object value,String orderColumn,String sequence);
    
    
	/** 
	 * 获取单字段条件查询的分页内容 
	 * 
	 * @param pageInfo 分页信息
	 * @param clause 查询语句 包含占位符?
	 * @param values 占位符对应的查询值
	 * 
	 * @return 分页实体集合
	 * */
	PagedContent<T> getPagedContentService(PageInfo pageInfo, String clause, Object... values);
}
