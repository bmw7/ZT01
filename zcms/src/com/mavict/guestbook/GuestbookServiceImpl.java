package com.mavict.guestbook;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Service;

import com.mavict.base.BaseDao;
import com.mavict.base.BaseServiceImpl;

/**
 * 
 * 
 * @author 沧海软件(北京)有限公司
 * @date 2015年10月31日 下午8:42:32
 */
@Service
public class GuestbookServiceImpl extends BaseServiceImpl<Guestbook, Long> implements GuestbookService {

	@Resource(name = "guestbookDaoImpl")
	private GuestbookDao guestbookDao;
	
	@Override
	@Resource(name = "guestbookDaoImpl")
	public void setBaseDao(BaseDao<Guestbook, Long> baseDao) {
		super.setBaseDao(baseDao);
	}

	@Override
	public void updateReplyService(Long id, HttpServletRequest request) {
		guestbookDao.reply(id, request);	
	}
	
	
}
