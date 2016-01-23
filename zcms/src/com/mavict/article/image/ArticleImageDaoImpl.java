package com.mavict.article.image;

import java.util.List;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import com.mavict.article.Article;
import com.mavict.base.BaseDaoImpl;

/**
 * 
 * 
 * @author 沧海软件(北京)有限公司
 * @date 2016年1月16日 上午11:07:43
 */
@Repository
public class ArticleImageDaoImpl extends BaseDaoImpl<ArticleImage, Long> implements ArticleImageDao {

	@Override
	public List<ArticleImage> getArticleImage(Article article) {
		String hql = "from ArticleImage where articleId=:articleId order by orders asc";
		Query query = getSession().createQuery(hql);
		query.setParameter("articleId", article.getId()); 
		return query.list();
	}

}
