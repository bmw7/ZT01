<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>${article.title} - 温州胜诉律师网</title>
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
                <div class="detail_title">${article.title}</div>
                <div class="detail_line">发布时间：${(article.createDate)?string("yyyy-MM-dd")} <span class="pull-right">字号:<span id="zoomout"></span> <span id="zoomin"></span><span id="print"></span>打印本页</span> </div>
                <div class="detail">${article.content}</div>

                <div id="share">
                    <div class="bshare-custom icon-medium"><a title="分享到" class="bshare-more" id="bshare-shareto" href="http://www.bShare.cn/">分享到</a><a title="分享到QQ空间" class="bshare-qzone"></a><a title="分享到新浪微博" class="bshare-sinaminiblog"></a><a title="分享到人人网" class="bshare-renren"></a><a title="分享到腾讯微博" class="bshare-qqmb"></a><a title="分享到网易微博" class="bshare-neteasemb"></a><a title="更多平台" class="bshare-more bshare-more-icon more-style-addthis"></a><span class="BSHARE_COUNT bshare-share-count">0</span></div><script src="http://static.bshare.cn/b/buttonLite.js#style=-1&amp;uuid=&amp;pophcol=2&amp;lang=zh" type="text/javascript" charset="utf-8"></script><script src="http://static.bshare.cn/b/bshareC0.js" type="text/javascript" charset="utf-8"></script>
                </div>
				
                <div class="duoshuo">
                    <!-- 多说评论框 start -->
                    <div class="ds-thread" data-thread-key="${article.id}" data-title="${article.title}" data-url="${base}/articles/${article.id}.html"></div>
                    <!-- 多说评论框 end -->
                    <!-- 多说公共JS代码 start (一个网页只需插入一次) -->
                    <script type="text/javascript">
                        var duoshuoQuery = {short_name:"wenzhoulvshi"};
                        (function() {
                            var ds = document.createElement('script');
                            ds.type = 'text/javascript';ds.async = true;
                            ds.src = (document.location.protocol == 'https:' ? 'https:' : 'http:') + '//static.duoshuo.com/embed.js';
                            ds.charset = 'UTF-8';
                            (document.getElementsByTagName('head')[0]
                            || document.getElementsByTagName('body')[0]).appendChild(ds);
                        })();
                    </script>
                    <!-- 多说公共JS代码 end -->
                </div>



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