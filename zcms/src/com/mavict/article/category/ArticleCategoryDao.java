package com.mavict.article.category;

import java.util.List;

import com.mavict.base.BaseDao;

/**
 * 
 * 
 * @author 沧海软件(北京)有限公司
 * @date   2015年6月13日 下午6:56:07
 */

public interface ArticleCategoryDao extends BaseDao<ArticleCategory, Integer> {
	/**  获取所有分类  */
	List<ArticleCategory> getAll();
}
