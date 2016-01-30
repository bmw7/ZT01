package com.mavict.friendlinks;

import java.util.List;

import com.mavict.base.BaseService;

/**
 * 
 * 
 * @author 沧海软件(北京)有限公司
 * @date 2015年10月31日 下午8:48:19
 */
public interface FriendlinksService extends BaseService<Friendlinks, Long> {
	/** 获取links实体  按orders排列*/
	List<Friendlinks> getLinksService();
}
