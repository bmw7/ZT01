package com.mavict.guestbook;

import javax.servlet.http.HttpServletRequest;

import com.mavict.base.BaseService;

/**
 * 
 * 
 * @author 沧海软件(北京)有限公司
 * @date 2015年10月31日 下午8:37:35
 */
public interface GuestbookService extends BaseService<Guestbook, Integer> {
	void updateReplyService(Integer id,HttpServletRequest request);
}
