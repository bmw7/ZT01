package com.mavict.guestbook;

import javax.servlet.http.HttpServletRequest;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import com.mavict.base.BaseDaoImpl;

/**
 * 
 * 
 * @author 沧海软件(北京)有限公司
 * @date 2015年10月31日 下午8:40:24
 */

@Repository
public class GuestbookDaoImpl extends BaseDaoImpl<Guestbook, Integer> implements GuestbookDao {

	/** 回复留言 */
	@Override
	public void reply(Integer id,HttpServletRequest request) {
		String reply = request.getParameter("reply");
		String hql = "update Guestbook set reply='"+reply+"'"+" where id="+id;
		Query query = getSession().createQuery(hql);
		query.executeUpdate();
	}

}
