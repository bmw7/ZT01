package com.mavict.account.authc;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.mavict.base.BaseDao;
import com.mavict.base.BaseServiceImpl;

/**
 * 
 * 
 * @author 沧海软件(北京)有限公司
 * @date   2015年8月13日 上午11:48:19
 */
@Service
public class AccountPermServiceImpl extends BaseServiceImpl<AccountPerm, Long> implements AccountPermService {

	@Resource(name = "accountPermDaoImpl")
	private AccountPermDao accountPermDao;
	
	@Override
	@Resource(name = "accountPermDaoImpl")
	public void setBaseDao(BaseDao<AccountPerm, Long> baseDao) {
		super.setBaseDao(baseDao);
	}

}
