package com.mavict.member.account;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.mavict.base.BaseDao;
import com.mavict.base.BaseService;
import com.mavict.base.BaseServiceImpl;

/**
 * 
 * 
 * @author 沧海软件(北京)有限公司
 * @date 2016年2月6日 下午10:17:20
 */
@Service
public class MemberAccountServiceImpl extends BaseServiceImpl<MemberAccount, Integer> implements MemberAccountService {

	@Resource(name = "memberAccountDaoImpl")
	private MemberAccountDao memberAccountDao;
	
	@Override
	@Resource(name = "memberAccountDaoImpl")
	public void setBaseDao(BaseDao<MemberAccount, Integer> baseDao) {
		super.setBaseDao(baseDao);
	}
}
