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

	List<T> getEntitiesService(String columnName, Object queryObject); // 返回实体
	
	/**
	 * 获取所有实体
	 * 
	 * 说明：未定义排序，默认排序
	 * 
	 * @return 实体List
	 * */
	List<T> getService(); 
	
	
	/**
	 * 获取所有 满足条件语句的 实体集合
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
	
	/** 获取分页 */
    PagedContent<T> getPagedContentService(PageInfo pageInfo);
    
	/** 获取条件查询分页内容 */
    PagedContent<T> getConditionPagedContentService(PageInfo pageInfo,String queryColumn, Object queryValue,String orderColumn,String sequence);
}
