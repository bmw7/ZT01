package com.mavict.article.image;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.mavict.base.BaseDao;
import com.mavict.base.BaseServiceImpl;

/**
 * 
 * 
 * @author 沧海软件(北京)有限公司
 * @date 2016年1月16日 上午11:08:34
 */
@Service
public class ArticleImageServiceImpl extends BaseServiceImpl<ArticleImage, Long> implements ArticleImageService {

	@Resource(name = "articleImageDaoImpl")
	private ArticleImageDao articleImageDao;
	
	@Override
	@Resource(name = "articleImageDaoImpl")
	public void setBaseDao(BaseDao<ArticleImage, Long> baseDao) {
		super.setBaseDao(baseDao);
	}
	
}
