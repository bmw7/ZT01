package com.mavict.setting.navigation;

import java.util.List;

import com.mavict.base.BaseDao;

/**
 * 
 * 
 * @author 沧海软件(北京)有限公司
 * @date   2015年8月2日 上午10:10:59
 */

public interface NavigationDao extends BaseDao<Navigation, Long> {
	/** 获取所有分类  */
	List<Navigation> getAll();
	
	/** 判断是否有下级栏目*/
	boolean hasChild(Long parentId);
	

}
