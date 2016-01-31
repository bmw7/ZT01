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
        <div id="bottom"></div>
        <div class="container">
            <div class="col-md-4 scrollspy" >
                <div id="nav" data-spy="affix"></div>
            </div>
            <div class="col-md-8 main">
                <div class="title">${articleCategoryName}</div>
                <div class="line"></div>
                <table class="table-striped">
                    
                    <#list pagedContent.content as article>
                    <tr>
                        <td class="item_icon"><img src="${base}/resource/client/images/bg_item.png"></td>
                        <td class="item_title"><a href="${base}/articles/${article.id}.html">${article.title}</a></td>
                        <td class="item_time">${(article.createDate)?string("yyyy-MM-dd")}</td>
                    </tr>
                    </#list>
                      
                </table>
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
<script>
    $('#nav').affix({
        offset: {
            top: $('#nav').offset().top
        }
    });
</script>
</body>
</html>