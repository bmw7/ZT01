<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>欢迎访问 - 温州胜诉律师网</title>
    <link rel="stylesheet" href="${base}/resource/client/css/bootstrap.min.css">
    <link rel="stylesheet" href="${base}/resource/client/css/inner.css">
</head>
<body>
<div class="container-fluid">
    
    <#include "/client/include/header.ftl" >

    <!--大图banner-->
    <div class="row" id="banner">

    </div>

    <!-- 正文内容 -->
    <div class="row content">
        <div id="right"></div>
        <div class="container">
            <div class="col-md-4 scrollspy" >
                <div id="nav" data-spy="affix"></div>
            </div>
            <div class="col-md-8 main">
                <div class="title">${articleCategoryName}</div>
                <div class="line"></div>
            	<div style="width:120%;overflow:hidden;margin-top:22px">
		            <#list pagedContent.content as member>
		            <a href="${base}/shows/${member.id}.html">
			            <div class="thumbnail" style="width:185px;float:left;margin-right:20px;">
			                <img src="${base}/<@articleFirstThumbnail article=member>${imageUrl}</@articleFirstThumbnail>">
			                <h4 style="text-align:center">${member.title}</h4>
			            </div>
		            </a>
		            </#list>
                </div>            
                <@page pageNumber=pagedContent.pageNumber totalPages=pagedContent.totalPages pageUrl="${base}${pageUrl}">
			        <#include "/client/include/pagination.ftl">
			    </@page>
            </div>


        </div>
    </div>


    <!-- 落款部分 -->
    <div class="row" id="footer">
          <#include "/client/include/footer.ftl" >
    </div>
</div>

<script src="${base}/resource/client/js/jquery.min.js"></script>
<script src="${base}/resource/client/js/bootstrap.min.js"></script>
<script src="${base}/resource/admin/js/pagination.js"></script>
<script>
    $('#nav').affix({
        offset: {
            top: $('#nav').offset().top
        }
    });
</script>
</body>
</html>