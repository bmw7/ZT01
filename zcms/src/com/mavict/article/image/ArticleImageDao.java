package com.mavict.article.image;

import java.util.List;

import com.mavict.article.Article;
import com.mavict.base.BaseDao;

/**
 * 
 * 
 * @author 沧海软件(北京)有限公司
 * @date 2016年1月16日 上午10:55:21
 */
public interface ArticleImageDao extends BaseDao<ArticleImage, Integer> {

	/**
	 * 获取Article上传文章图片
	 * 
	 * @param article 某篇文章
	 * 
	 * @return 该篇文章上传的 
	 * */
	List<ArticleImage> getArticleImage(Article article);
}
