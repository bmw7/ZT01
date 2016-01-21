package com.mavict.base;

import java.io.Serializable;
import java.util.List;

import com.mavict.PageInfo;
import com.mavict.PagedContent;


/**
 * 
 * 
 * @author 沧海软件(北京)有限公司
 * @date   2015年5月29日 下午8:28:01
 */

public class BaseServiceImpl<T,ID extends Serializable> implements BaseService<T, ID> {

	/** baseDao */
	public BaseDao<T, ID> baseDao;
	
	/**
	 * 1、实体类要继承本类，必须在 实体类ServiceImpl 中手动注入 实体类DaoImpl，才能做下面的事情
	 * 2、baseDaoImpl无法注入
	 * */
	public void setBaseDao(BaseDao<T, ID> baseDao) {
		this.baseDao = baseDao;
	}
	
	@Override
	public void saveService(T entity) {
		baseDao.save(entity);
	}

	@Override
	public void deleteService(ID id) {
		baseDao.delete(id);	
	}

	@Override
	public void deleteService(T entity) {
		baseDao.delete(entity);
	}

	@Override
	public void updateService(T entity) {
		baseDao.update(entity);	
	}

	@Override
	public T getService(ID id) {
		return baseDao.get(id);
	}
	
	@Override
	public T getService(String columnName, Object queryObject) {
		return baseDao.get(columnName, queryObject);
	}
	
	@Override
	public T getLoadService(ID id) {
		return baseDao.load(id);
	}
	
	@Override
	public List<T> getEntitiesService(String columnName, Object queryValue) {
		return baseDao.getEntities(columnName, queryValue);
	}
	
	@Override
	public List<T> getAllService() {
		return baseDao.getAll();
	}

	@Override
	public PagedContent<T> getPagedContentService(PageInfo pageInfo) {
		return baseDao.getPagedContent(pageInfo);
	}

	@Override
	public PagedContent<T> getConditionPagedContentService(PageInfo pageInfo,String queryColumn, Object queryValue,String orderColumn,String sequence) {
		return baseDao.getConditionPagedContent(pageInfo, queryColumn, queryValue,orderColumn,sequence);
	}

}
