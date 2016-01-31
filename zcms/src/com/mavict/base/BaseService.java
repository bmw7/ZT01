package com.mavict.base;

import java.io.Serializable;
import java.util.List;

import com.mavict.PageInfo;
import com.mavict.PagedContent;

/**
 * 
 * 
 * @author 沧海软件(北京)有限公司
 * @date   2015年5月29日 下午8:21:40
 */

public interface BaseService<T,ID extends Serializable> {
	/** 增 */
	void saveService(T entity);
	
	/** 删 */
	void deleteService(ID id);
	void deleteService(T entity);
	
	/** 改 */
	void updateService(T entity);
	
	/** 查 */
	T getService(ID id);     // 返回实体
	T getService(String columnName, Object queryObject);
	T getLoadService(ID id); // 返回代理 懒加载
	List<T> getEntitiesService(String columnName, Object queryObject); // 返回实体
	List<T> getAllService(); // 返回所有实体
	
	/**
	 * 获取满足查询语句的所有实体
	 * 
	 * @param queryClause 查询语句
	 * 
	 * @return 所有符合查询条件的实体List
	 * */
	List<T> getContentService(String queryClause); 
	
	/** 获取分页 */
    PagedContent<T> getPagedContentService(PageInfo pageInfo);
    
	/** 获取条件查询分页内容 */
    PagedContent<T> getConditionPagedContentService(PageInfo pageInfo,String queryColumn, Object queryValue,String orderColumn,String sequence);
}
