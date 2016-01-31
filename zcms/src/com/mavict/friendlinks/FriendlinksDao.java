package com.mavict.friendlinks;

import java.util.List;

import com.mavict.base.BaseDao;

/**
 * 
 * 
 * @author 沧海软件(北京)有限公司
 * @date 2015年10月31日 下午8:47:42
 */
public interface FriendlinksDao extends BaseDao<Friendlinks, Long> {
	/** 获取links实体  按orders排列*/
	List<Friendlinks> getLinks();
}
