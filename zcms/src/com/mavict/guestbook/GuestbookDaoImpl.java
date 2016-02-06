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

}
