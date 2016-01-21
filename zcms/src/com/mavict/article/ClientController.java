package com.mavict.article;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mavict.PageInfo;

/**
 * Controller - 前台访问
 * 
 * @author 沧海软件(北京)有限公司
 * @date 2016年1月10日 下午2:51:00
 */

@Controller
public class ClientController {

	@Resource(name = "articleServiceImpl")
	private ArticleService articleService;
	
	@RequestMapping("/")
	public String index(ModelMap model){
		model.addAttribute("article17", articleService.getAbbreviationService(17, 3));
		model.addAttribute("cid17", 17);
		
		model.addAttribute("article5", articleService.getAbbreviationService(5, 8));
		model.addAttribute("cid5", 5);
		
		model.addAttribute("article7", articleService.getAbbreviationService(7, 7));
		model.addAttribute("cid7", 7);
		
		model.addAttribute("article6", articleService.getAbbreviationService(6, 6));
		model.addAttribute("cid6", 6);
		
		model.addAttribute("article4", articleService.getAbbreviationService(4, 6));
		model.addAttribute("cid4", 4);
		
		model.addAttribute("article1", articleService.getAbbreviationService(1, 8));
		model.addAttribute("cid1", 1);
		
		model.addAttribute("article2", articleService.getAbbreviationService(2, 8));
		model.addAttribute("cid2", 2);
		
		model.addAttribute("article3", articleService.getAbbreviationService(3, 8));
		model.addAttribute("cid3", 3);
		
		return "/client/article/index";
	}
	
	@RequestMapping("/articles/{id}")
	public String show(@PathVariable Integer id,ModelMap model){
		model.addAttribute("article", articleService.getService(id));
		return "/client/article/articles";
	}
	
	@RequestMapping("/lists/{cid}")
	public String list(@PathVariable Integer cid,ModelMap model,PageInfo pageInfo){
		pageInfo.setPageSize(30);
		model.addAttribute("pagedContent", articleService.getPagedContentByCategoryIdService(cid, pageInfo));
		model.addAttribute("pageUrl", "testurl");
		return "/client/article/list";
	}
}
