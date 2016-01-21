package com.mavict.article;

import java.util.List;

import com.mavict.PageInfo;
import com.mavict.PagedContent;
import com.mavict.base.BaseService;

/**
 * 
 * 
 * @author 沧海软件(北京)有限公司
 * @date   2015年6月13日 下午6:53:33
 */

public interface ArticleService extends BaseService<Article, Integer> {
	/** 移动临时文件夹内的文件到相应的文章id目录下 */
	void moveToArticleIdDir(String tempDir,String idDir);
	
	List<Article> getAbbreviationService(Integer categoryId,Integer limitNumber);
	
	PagedContent<Article> getPagedContentByCategoryIdService(Integer categoryId,PageInfo pageInfo);
}
