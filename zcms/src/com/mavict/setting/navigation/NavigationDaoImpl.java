package com.mavict.setting.navigation;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import com.mavict.base.BaseDaoImpl;

/**
 * 
 * 
 * @author 沧海软件(北京)有限公司
 * @date   2015年8月2日 上午10:11:43
 */
@Repository
public class NavigationDaoImpl extends BaseDaoImpl<Navigation, Integer> implements NavigationDao {
	@Override
	public List<Navigation> getAll() {
		return getSession().createQuery("from Navigation order by orders asc").list();
	}

	@Override
	public boolean hasChild(Integer parentId) {
		String hql = "from Navigation where parentId =:parentId";
		Query query = getSession().createQuery(hql);
		query.setLong("parentId", parentId);
		List<Navigation> navigations = query.list();
		return navigations.size() == 0 ? false : true;
	}


}
