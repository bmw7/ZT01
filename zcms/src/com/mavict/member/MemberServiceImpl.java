package com.mavict.member;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.mavict.base.BaseDao;
import com.mavict.base.BaseServiceImpl;

/**
 * 
 * 
 * @author 沧海软件(北京)有限公司
 * @date 2016年2月6日 下午10:11:55
 */
@Service
public class MemberServiceImpl extends BaseServiceImpl<Member, Integer> implements MemberService {

	@Resource(name = "memberDaoImpl")
	private MemberDao memberDao;
	
	@Override
	@Resource(name = "memberDaoImpl")
	public void setBaseDao(BaseDao<Member, Integer> baseDao) {
		super.setBaseDao(baseDao);
	}
}
