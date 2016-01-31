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
	
	/** 查 */
	T get(ID id);      // 获取实体
	T get(String columnName,Object query);
	T load(ID id);     // 获取代理对象 懒加载
	List<T> getEntities(String columnName,Object queryValue);
	List<T> getAll(); // 获取所有实体
	
	/**
	 * 获取满足查询语句的所有实体
	 * 
	 * @param queryClause 查询语句
	 * 
	 * @return 所有符合查询条件的实体List
	 * */
	List<T> getContent(String queryClause); 
	
	/** 统计 */
	Long count();
	
	/** 统计 */
	Long conditionedCount(String columnName,Object queryValue);
	
	/** 得到分页内容 */
	PagedContent<T> getPagedContent(PageInfo pageInfo);
	
	/** 得到条件搜素的分页内容 */
	PagedContent<T> getConditionPagedContent(PageInfo pageInfo,String queryColumn,Object queryValue,String orderColumn,String sequence);
}
