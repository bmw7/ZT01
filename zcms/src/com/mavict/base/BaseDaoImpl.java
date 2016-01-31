package com.mavict.base;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.util.Assert;

import com.mavict.PageInfo;
import com.mavict.PagedContent;

/**
 * 
 * 
 * @author 沧海软件(北京)有限公司
 * @date   2015年5月29日 下午8:23:55
 */

public class BaseDaoImpl<T,ID extends Serializable> implements BaseDao<T, ID>{
	
	public Class<T> entityClass; // 实体类类型
	
	@Resource
	public SessionFactory sessionFactory;
	
	/** 获取session */
	public Session getSession(){
		return sessionFactory.getCurrentSession();
	}

	/** 构造函数获取实体类类名称 */
	public BaseDaoImpl() {
		Type type = getClass().getGenericSuperclass();
		Type[] parameterizedType = ((ParameterizedType) type).getActualTypeArguments();
		entityClass = (Class<T>) parameterizedType[0];		
	}
	
	@Override
	public void save(T entity) {
		Assert.notNull(entity);
		getSession().save(entity);
	}

	@Override
	public void delete(ID id) {
		delete(get(id));
	}

	@Override
	public void delete(T entity) {
		getSession().delete(entity);
	}

	@Override
	public void update(T entity) {
		getSession().update(entity);
	}

	@Override
	public T get(ID id) {
		return (T) getSession().get(entityClass, id);
	}
	
	@Override
	public T load(ID id) {
		return  (T) getSession().load(entityClass, id);
	}
	
	
	@Override
	public T get(String columnName, Object queryObject) {
		String hql = "from "+entityClass.getSimpleName()+" where "+columnName+" =:queryObject";
		Query query = getSession().createQuery(hql);
		query.setParameter("queryObject", queryObject);
		T entity = (T) query.uniqueResult();
		if (entity == null) {  return null;  }
		return entity;
	}
	
	@Override
	public List<T> getEntities(String columnName, Object queryValue) {
		String hql = "from "+entityClass.getSimpleName()+" where "+columnName+" =:queryValue";
		Query query = getSession().createQuery(hql);
		query.setParameter("queryValue", queryValue);
		return query.list();
	}
	
	@Override
	public List<T> getAll() {
		String hql = "from "+entityClass.getSimpleName();
		return getSession().createQuery(hql).list();
	}
	
	@Override
	public List<T> getContent(String queryClause) {
		String hql = "from "+entityClass.getSimpleName() + " " + queryClause;
		Query query = getSession().createQuery(hql);
		return query.list();
	}

	@Override
	public Long count() {
		String hql = "select count(*) from "+entityClass.getSimpleName();
		Query query = getSession().createQuery(hql);	
		return  (Long) query.uniqueResult();
	}

	@Override
	public Long conditionedCount(String columnName, Object queryValue) {
		String hql = "select count(*) from "+entityClass.getSimpleName() +" where "+columnName+" =:queryValue";
		Query query = getSession().createQuery(hql);
		query.setParameter("queryValue", queryValue);	
		return  (Long) query.uniqueResult();
	}

	@Override
	public PagedContent<T> getPagedContent(PageInfo pageInfo) {
		String hql = "from "+ entityClass.getSimpleName()+" order by id desc";
		Query query = getSession().createQuery(hql);
		query.setFirstResult((pageInfo.getPageNumber()-1)*pageInfo.getPageSize());
		query.setMaxResults(pageInfo.getPageSize());
		List<T> content = query.list();
		return new PagedContent(content,count(),pageInfo);
	}

	@Override
	public PagedContent<T> getConditionPagedContent(PageInfo pageInfo,String queryColumn,Object queryValue,String orderColumn,String sequence) {
		String hql = "from "+ entityClass.getSimpleName() +" where "+queryColumn+" =:queryValue order by "+orderColumn+" "+sequence;
		Query query = getSession().createQuery(hql);
		query.setParameter("queryValue", queryValue);
		query.setFirstResult((pageInfo.getPageNumber()-1)*pageInfo.getPageSize());
		query.setMaxResults(pageInfo.getPageSize());
		List<T> content = query.list();
		return new PagedContent(content,conditionedCount(queryColumn,queryValue),pageInfo);
	}


}
