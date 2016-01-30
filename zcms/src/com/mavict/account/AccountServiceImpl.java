package com.mavict.account;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.mavict.base.BaseDao;
import com.mavict.base.BaseServiceImpl;


/**
 * 
 * 
 * @author 沧海软件(北京)有限公司
 * @date   2015年6月3日 下午9:31:09
 */

@Service
public class AccountServiceImpl extends BaseServiceImpl<Account, Long> implements AccountService  {

	@Resource(name = "accountDaoImpl")
	private AccountDao accountDao;
	
	@Override 
	@Resource(name = "accountDaoImpl")
	public void setBaseDao(BaseDao<Account, Long> baseDao) {
		super.setBaseDao(baseDao);
	}
	
}
