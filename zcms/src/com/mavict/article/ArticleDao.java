package com.mavict.article;

import java.util.List;

import com.mavict.PageInfo;
import com.mavict.PagedContent;
import com.mavict.base.BaseDao;

/**
 * 
 * 
 * @author 沧海软件(北京)有限公司
 * @date   2015年6月13日 下午6:51:56
 */

public interface ArticleDao extends BaseDao<Article, Long> {
	List<Article> getAbbreviation(Integer categoryId,Integer limitNumber);
	PagedContent<Article> getPagedContentByCategoryId(Integer categoryId,PageInfo pageInfo);
	Long count(Integer categoryId);
}
