package com.mavict.base;

import java.io.Serializable;
import java.util.List;

import com.mavict.PageInfo;
import com.mavict.PagedContent;

/**
 * 
 * 
 * @author 沧海软件(北京)有限公司
 * @date   2015年5月29日 下午8:21:09
 */

public interface BaseDao<T,ID extends Serializable> {
	/** 增 */
	void save(T entity);
	
	/** 删 */
	void delete(ID id);
	void delete(T entity);
	
	/** 改 */
	void update(T entity);
	
	
	/*----------------- 查 ----------------*/
	
	T get(ID id);      	
	T get(String column,Object value);
	
	List<T> getEntities(String columnName,Object queryValue);
	
	/**
	 * 获取所有实体
	 * 
	 * 说明：未定义排序，默认排序
	 * 
	 * @return 实体List
	 * */
	List<T> get(); 
	
	
	/**
	 * 获取所有 满足条件语句的 实体集合
	 * 
	 * @param start 开始数字
	 * @param count 数目
	 * @param orderColumn 排序字段
	 * @sequence 正序或逆序 asc 或  desc
	 * @fiters 检索条件
	 * 
	 * @return 实体List集合
	 * */
	List<T> get(Integer start, Integer count, String orderColumn, String sequence, Object[]... filters); 
	
	
	
	
	
	/** 统计 */
	Long count();
	
	/** 统计 */
	Long conditionedCount(String columnName,Object queryValue);
	
	/** 得到分页内容 */
	PagedContent<T> getPagedContent(PageInfo pageInfo);
	
	/** 得到条件搜素的分页内容 */
	PagedContent<T> getConditionPagedContent(PageInfo pageInfo,String queryColumn,Object queryValue,String orderColumn,String sequence);
}
