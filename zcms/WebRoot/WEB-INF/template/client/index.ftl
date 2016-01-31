<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>欢迎访问 - 温州胜诉律师网</title>
    <link rel="stylesheet" href="${base}/resource/client/css/bootstrap.min.css">
    <link rel="stylesheet" href="${base}/resource/client/css/swiper-3.2.7.min.css">
    <link rel="stylesheet" href="${base}/resource/client/css/index.css">
</head>
<body>
<div class="container-fluid">

	<#include "/client/include/header.ftl" >
	
    <!--大图banner-->
    <div class="row" id="banner">

        <img src="${base}/resource/client/images/banner1.png">

    </div>

    <!-- 律师团队 -->
    <div class="container" id="group">
        <div class="row" id="group_title"></div>
        <div class="row" id="group_member">
            
            <#list members as member>
            <div class="group_member">
                <div class="photo"><img src="${base}/<@articleFirstThumbnail article=member>${imageUrl}</@articleFirstThumbnail>"></div>
                <div class="title">${member.title}</div>
                <div class="desc">${member.seoKeywords}}</div>
                <a href="${base}/show/${member.id}.html"><div class="more"></div></a>
            </div>
            </#list>
       
        </div>
        <div class="row">
            <div id="group_more"></div>
        </div>
    </div>

    <!-- 正文内容一 -->
    <div class="row content1">
        <div class="container">
            <div class="row row_extend">

                <div class="content_unit">
                    <div class="content_unit_title">
                       <span class="content_unit_title_left"><img src="${base}/resource/client/images/index_title_service.png"></span>
                    </div>
                    <div class="content_unit_main">
                        <img src="${base}/resource/client/images/index_areas.png">
                            <p>
                                中共中央总书记、国家主席、中央军委主席、中央财经领导小组根本目的是提高社会生产、去杠杆、
                                降成本、补短板，从生产领域加强优质供给，减少无效供给，扩大有效供给，提高供给结构适应性
                                和灵活性，提高全要素生产率，使供给体系更好适应需求结构变化。
                            </p>
                        <img src="${base}/resource/client/images/bg_area_more.png">
                    </div>
                </div>

                <div class="content_unit">
                    <div class="content_unit_title">
                        <div class="row">
                            <div class="col-md-8">
                                <span class="content_unit_title_left"><img src="${base}/resource/client/images/index_title_announce.png"></span>
                            </div>
                            <div class="col-md-4">
                                <a href="${base}/list/${more_23}.html"><span class="content_unit_title_more"></span></a>
                            </div>
                        </div>
                    </div>
                    <div class="content_unit_main">
                    <#list article_23 as article>
                        <div class="list"><div class="icon"><img src="${base}/resource/client/images/bg_item.png"></div><div class="title"><a href="${base}/articles/${article.id}.html"><@subTitle title="${article.title}" start=0 end=15>${title}</@subTitle></a></div><div class="time">${(article.createDate)?string("yyyy-MM-dd")}</div></div>
					</#list>
                    </div>
                </div>

                <div class="content_unit">
                    <div class="content_unit_title">
                        <div class="row">
                            <div class="col-md-8">
                                <span class="content_unit_title_left"><img src="${base}/resource/client/images/index_title_success.png"></span>
                            </div>
                            <div class="col-md-4">
                                <a href="${base}/list/${more_4}.html"><span class="content_unit_title_more"></span></a>
                            </div>
                        </div>
                    </div>
                    <div class="content_unit_main">
                    <#list article_4 as article>
                        <div class="list"><div class="icon"><img src="${base}/resource/client/images/bg_item.png"></div><div class="title"><a href="${base}/articles/${article.id}.html"><@subTitle title="${article.title}" start=0 end=15>${title}</@subTitle></a></div><div class="time">${(article.createDate)?string("yyyy-MM-dd")}</div></div>
					</#list>
                    </div>
                </div>

            </div>
        </div>
    </div>

    <!-- 正文内容二 -->
    <div class="row content2">
        <div class="container">
            <div class="row row_extend">

                <div class="content_unit">
                    <div class="content_unit_title">
                        <div class="row">
                            <div class="col-md-8">
                                <span class="content_unit_title_left"><img src="${base}/resource/client/images/index_title_consultant.png"></span>
                            </div>
                            <div class="col-md-4">
                                <a href="${base}/list/${more_11}.html"><span class="content_unit_title_more"></span></a>
                            </div>
                        </div>
                    </div>
                    <div class="content_unit_main">
                    <#list article_11 as article>
                        <div class="list"><div class="icon"><img src="${base}/resource/client/images/bg_item.png"></div><div class="title"><a href="${base}/articles/${article.id}.html"><@subTitle title="${article.title}" start=0 end=15>${title}</@subTitle></a></div><div class="time">${(article.createDate)?string("yyyy-MM-dd")}</div></div>
					</#list>
                    </div>
                </div>

                <div class="content_unit">
                    <div class="content_unit_title">
                        <div class="row">
                            <div class="col-md-8">
                                <span class="content_unit_title_left"><img src="${base}/resource/client/images/index_title_marriage.png"></span>
                            </div>
                            <div class="col-md-4">
                                <a href="${base}/list/${more_12}.html"><span class="content_unit_title_more"></span></a>
                            </div>
                        </div>
                    </div>
                    <div class="content_unit_main">
                    <#list article_12 as article>
                        <div class="list"><div class="icon"><img src="${base}/resource/client/images/bg_item.png"></div><div class="title"><a href="${base}/articles/${article.id}.html"><@subTitle title="${article.title}" start=0 end=15>${title}</@subTitle></a></div><div class="time">${(article.createDate)?string("yyyy-MM-dd")}</div></div>
					</#list>
                    </div>
                </div>

                <div class="content_unit">
                    <div class="content_unit_title">
                        <div class="row">
                            <div class="col-md-8">
                                <span class="content_unit_title_left"><img src="${base}/resource/client/images/index_title_contract.png"></span>
                            </div>
                            <div class="col-md-4">
                                <a href="${base}/list/${more_14}.html"><span class="content_unit_title_more"></span></a>
                            </div>
                        </div>
                    </div>
                    <div class="content_unit_main">
                    <#list article_14 as article>
                        <div class="list"><div class="icon"><img src="${base}/resource/client/images/bg_item.png"></div><div class="title"><a href="${base}/articles/${article.id}.html"><@subTitle title="${article.title}" start=0 end=15>${title}</@subTitle></a></div><div class="time">${(article.createDate)?string("yyyy-MM-dd")}</div></div>
					</#list>
                    </div>
                </div>

            </div>
        </div>
    </div>

    <!-- 正文内容三 -->
    <div class="row content1">
        <div class="container">
            <div class="row row_extend">

                <div class="content_unit">
                    <div class="content_unit_title">
                        <div class="row">
                            <div class="col-md-8">
                                <span class="content_unit_title_left"><img src="${base}/resource/client/images/index_title_debt.png"></span>
                            </div>
                            <div class="col-md-4">
                                <a href="${base}/list/${more_15}.html"><span class="content_unit_title_more"></span></a>
                            </div>
                        </div>
                    </div>
                    <div class="content_unit_main">
                    <#list article_15 as article>
                        <div class="list"><div class="icon"><img src="${base}/resource/client/images/bg_item.png"></div><div class="title"><a href="${base}/articles/${article.id}.html"><@subTitle title="${article.title}" start=0 end=15>${title}</@subTitle></a></div><div class="time">${(article.createDate)?string("yyyy-MM-dd")}</div></div>
					</#list>
                    </div>
                </div>

                <div class="content_unit">
                    <div class="content_unit_title">
                        <div class="row">
                            <div class="col-md-8">
                                <span class="content_unit_title_left"><img src="${base}/resource/client/images/index_title_labor.png"></span>
                            </div>
                            <div class="col-md-4">
                                <a href="${base}/list/${more_16}.html"><span class="content_unit_title_more"></span></a>
                            </div>
                        </div>
                    </div>
                    <div class="content_unit_main">
                    <#list article_16 as article>
                        <div class="list"><div class="icon"><img src="${base}/resource/client/images/bg_item.png"></div><div class="title"><a href="${base}/articles/${article.id}.html"><@subTitle title="${article.title}" start=0 end=15>${title}</@subTitle></a></div><div class="time">${(article.createDate)?string("yyyy-MM-dd")}</div></div>
					</#list>
                    </div>
                </div>

                <div class="content_unit">
                    <div class="content_unit_title">
                        <div class="row">
                            <div class="col-md-8">
                                <span class="content_unit_title_left"><img src="${base}/resource/client/images/index_title_traffic.png"></span>
                            </div>
                            <div class="col-md-4">
                                <a href="${base}/list/${more_17}.html"><span class="content_unit_title_more"></span></a>
                            </div>
                        </div>
                    </div>
                    <div class="content_unit_main">
                    <#list article_17 as article>
                        <div class="list"><div class="icon"><img src="${base}/resource/client/images/bg_item.png"></div><div class="title"><a href="${base}/articles/${article.id}.html"><@subTitle title="${article.title}" start=0 end=15>${title}</@subTitle></a></div><div class="time">${(article.createDate)?string("yyyy-MM-dd")}</div></div>
					</#list>
                    </div>
                </div>

            </div>
        </div>
    </div>

    <!-- 正文内容四 -->
    <div class="row content2">
        <div class="container">
            <div class="row row_extend">

                <div class="content_unit">
                    <div class="content_unit_title">
                        <div class="row">
                            <div class="col-md-8">
                                <span class="content_unit_title_left"><img src="${base}/resource/client/images/index_title_injury.png"></span>
                            </div>
                            <div class="col-md-4">
                                <a href="${base}/list/${more_18}.html"><span class="content_unit_title_more"></span></a>
                            </div>
                        </div>
                    </div>
                    <div class="content_unit_main">
                    <#list article_18 as article>
                        <div class="list"><div class="icon"><img src="${base}/resource/client/images/bg_item.png"></div><div class="title"><a href="${base}/articles/${article.id}.html"><@subTitle title="${article.title}" start=0 end=15>${title}</@subTitle></a></div><div class="time">${(article.createDate)?string("yyyy-MM-dd")}</div></div>
					</#list>
                    </div>
                </div>

                <div class="content_unit">
                    <div class="content_unit_title">
                        <div class="row">
                            <div class="col-md-8">
                                <span class="content_unit_title_left"><img src="${base}/resource/client/images/index_title_real.png"></span>
                            </div>
                            <div class="col-md-4">
                                <a href="${base}/list/${more_19}.html"><span class="content_unit_title_more"></span></a>
                            </div>
                        </div>
                    </div>
                    <div class="content_unit_main">
                    <#list article_19 as article>
                        <div class="list"><div class="icon"><img src="${base}/resource/client/images/bg_item.png"></div><div class="title"><a href="${base}/articles/${article.id}.html"><@subTitle title="${article.title}" start=0 end=15>${title}</@subTitle></a></div><div class="time">${(article.createDate)?string("yyyy-MM-dd")}</div></div>
					</#list>
                    </div>
                </div>

                <div class="content_unit">
                    <div class="content_unit_title">
                        <div class="row">
                            <div class="col-md-8">
                                <span class="content_unit_title_left"><img src="${base}/resource/client/images/index_title_defence.png"></span>
                            </div>
                            <div class="col-md-4">
                                <a href="${base}/list/${more_21}.html"><span class="content_unit_title_more"></span></a>
                            </div>
                        </div>
                    </div>
                    <div class="content_unit_main">
                    <#list article_21 as article>
                        <div class="list"><div class="icon"><img src="${base}/resource/client/images/bg_item.png"></div><div class="title"><a href="${base}/articles/${article.id}.html"><@subTitle title="${article.title}" start=0 end=15>${title}</@subTitle></a></div><div class="time">${(article.createDate)?string("yyyy-MM-dd")}</div></div>
					</#list>
                    </div>
                </div>

            </div>
        </div>
    </div>

    <!-- 联系及链接 -->
    <div class="row" id="contact">
        <div class="container">
            <form action="" method="post">
                <input type="text" name="phone" id="phone" placeholder="请输入手机号码">
                <input type="text" name="email" id="email" placeholder="请输入电子邮件">
                <textarea name="message" id="message" placeholder="请输入案件描述"></textarea>
            </form>
        </div>
    </div>

    <!-- 落款部分 -->
    <div class="row" id="footer">
  		<#include "/client/include/footer.ftl" >
    </div>
</div>

<script src="${base}/resource/client/js/jquery.min.js"></script>
<script src="${base}/resource/client/js/swiper-3.2.7.jquery.min.js"></script>
<script>
    var mySwiper = new Swiper ('.swiper-container', {
        loop: true,
        autoplay: 3000,
        paginationClickable :true,
        effect : 'fade',
        fade: {
            crossFade: false,
        },
        // 如果需要分页器
        pagination: '.swiper-pagination',
    })


    $(document).ready(function(){
        // 律师团队
        $('.group_member').hover(
            function(){
                $(this).find('.photo').find('img').animate({
                    'width':'186px',
                    'height':'186px',
                    'margin-top':'14px',
                    'margin-left':'14px'
                },500);
            },
            function(){
                $(this).find('.photo').find('img').animate({
                    'width':'214px',
                    'height':'214px',
                    'margin-top':'0px',
                    'margin-left':'0px'
                },500);
            }
        );
    });
</script>
</body>
</html>