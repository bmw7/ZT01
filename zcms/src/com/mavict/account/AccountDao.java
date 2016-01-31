package com.mavict.account;

import com.mavict.base.BaseDao;

/**
 * 
 * 
 * @author 沧海软件(北京)有限公司
 * @date   2015年6月3日 下午7:26:45
 */

public interface AccountDao extends BaseDao<Account, Integer> {
	/** 根据 用户名 查找管理员实体 */
	Account getAccount(String username); 
	
	/** 根据 邮件 查找管理员实体 */
	Account getAccountFromMail(String mail);
}
