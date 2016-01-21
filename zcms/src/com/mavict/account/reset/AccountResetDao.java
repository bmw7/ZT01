package com.mavict.account.reset;

import javax.servlet.http.HttpServletRequest;

import com.mavict.account.Account;
import com.mavict.base.BaseDao;

/**
 * 
 * 
 * @author 沧海软件(北京)有限公司
 * @date   2015年6月9日 下午4:48:17
 */

public interface AccountResetDao extends BaseDao<AccountReset, Integer>{
	/** 创建邮箱找回（修改）密码 内容 */	
	String doCreateMailContent(HttpServletRequest request,Account account);
}
