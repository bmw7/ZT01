<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link rel="stylesheet" href="${base}/resource/client/css/page_inner.css" type="text/css" />
<link rel="stylesheet" href="${base}/resource/client/css/bootstrap.min.css" type="text/css" />
<script language="javascript" src="${base}/resource/client/js/jquery.min.js" ></script>
<script language="javascript" src="${base}/resource/client/js/dyn.js" ></script>
<title>温州刑事辩护律师网</title>
</head>

<body>

<div id="all">
<div id="main">
<div id="main_top_left"></div><div id="main_top_right"></div>
<div id="main_top"></div>

<div id="main_menu"><#include "/client/include/menu.ftl"></div>
<div id="main_busi"><#include "/client/include/busi.ftl"></div>

<div id="main_center">

<div id="main_left">


<div id="main_left_view">
<div id="view_gap"><a href="">更多>></a></div>
<#list article_17 as article>
<div class="view">
<div class="view_title"><@subTitle title=article.title start=0 end=12>${title}</@subTitle></div>
<div class="view_content"><a href="${base}/articles/${article.id}.html">${article.content}</a></div>
</div>
</#list>
</div>



<div id="main_left_list">
<div id="main_left_list_gap"><a href="">更多>></a></div>
<#list article_20 as article>
<div class="unit_expert">
<a href="${base}/shows/${article.id}.html"><img src="<@articleFirstThumbnail article=article>${imageUrl}</@articleFirstThumbnail>" border="0"></a>
<div class="name">${article.title}</div>
<div class="content"><a href="${base}/shows/${article.id}.html">${article.content}</a></div>
</div>		
</#list>
</div>


</div>

<div id="main_right">
<div id="main_right_title">${articleCategoryName}</div>

<#list pagedContent.content as article>
<div class="unit_expert_inner">
<a href="${base}/shows/${article.id}.html"><img src="<@articleFirstThumbnail article=article>${imageUrl}</@articleFirstThumbnail>" border="0"></a>
<div class="name"></div>
<div class="content"><a href="${base}/shows/${article.id}.html">${article.content}</a></div>
</div>		
</#list>



        <@page pageNumber=pagedContent.pageNumber totalPages=pagedContent.totalPages pageUrl="${base}${pageUrl}">
	        	<#include "/client/include/pagination.ftl">
	    </@page>
</div>



</div>

<div id="main_link">
	<div id="main_link_gap"></div>
	<#list links as link>
	<div class="ulink"><a href="${link.url}">${link.name}</a></div>
	</#list>
</div>
<div id="main_line"></div>
<div id="main_foot"><#include "/client/include/footer.ftl"></div>
</div>
</div>
<script src="${base}/resource/admin/js/pagination.js"></script>
</body>
</html>
