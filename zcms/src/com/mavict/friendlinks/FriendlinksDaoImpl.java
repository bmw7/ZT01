package com.mavict.friendlinks;

import java.util.List;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import com.mavict.base.BaseDaoImpl;

/**
 * 
 * 
 * @author 沧海软件(北京)有限公司
 * @date 2015年10月31日 下午8:49:06
 */
@Repository
public class FriendlinksDaoImpl extends BaseDaoImpl<Friendlinks, Integer> implements FriendlinksDao {

	/** 获取links实体  按orders排列*/
	@Override
	public List<Friendlinks> getLinks() {
		String hql = "from Friendlinks order by orders asc";
		return getSession().createQuery(hql).list();
	}

}
