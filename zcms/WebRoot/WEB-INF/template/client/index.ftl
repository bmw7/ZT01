<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>欢迎访问 - 温州胜诉律师网</title>
    <link rel="stylesheet" href="${base}/resource/client/css/bootstrap.min.css">
    <link rel="stylesheet" href="${base}/resource/client/css/swiper-3.2.7.min.css">
    <link rel="stylesheet" href="${base}/resource/client/css/index.css">
    <style>
        .my-map { margin: 0 auto; width: 517px; height: 178px; }
        .my-map .icon { background: url(http://lbs.amap.com/console/public/show/marker.png) no-repeat; }
        .my-map .icon-cir { height: 31px; width: 28px; }
        .my-map .icon-cir-red { background-position: -11px -5px; }
        #wrap{margin-top:-119px;margin-left:6px;}
    </style>
    
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
                <a href="${base}/shows/${member.id}.html"><div class="more"></div></a>
            </div>
            </#list>
       
        </div>
        <div class="row">
            <a href="${base}/lists/1.html"><div id="group_more"></div></a>
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
								私人律师，公司企业法律顾问；民商事、经济纠纷，公司、合伙企业经营纠纷；刑事辩护、行政诉讼、国家赔偿；婚姻、抚养、继承、房地产法律事务，购房律师法律服务； 
								合同起草、修订，出具法律意见书；重大合同纠纷、知识产权、网络侵权纠纷； 其它法律服务项目。
                            </p>
                        <a href="${base}/list/2.html"><img src="${base}/resource/client/images/bg_area_more.png" border="0"></a>
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
            
            
            
            
            
            
		    <div id="wrap" class="my-map">
		        <div id="mapContainer"></div>
		    </div>
		    <script src="http://webapi.amap.com/maps?v=1.2&key=8325164e247e15eea68b59e89200988b"></script>
		    <script>
		    !function(){
		        var infoWindow, map, level = 18,
		            center = {lng: 120.687556, lat: 27.992611},
		            features = [{type: "Marker", name: "温州胜诉律师网", desc: "地址：温州市市府路598号新益大厦A幢4层<br>网址：http://www.wenzhoulvshi.cn", color: "red", icon: "cir", offset: {x: -9, y: -31}, lnglat: {lng: 120.687491, lat: 27.992402}}];
		 
		        function loadFeatures(){
		            for(var feature, data, i = 0, len = features.length, j, jl, path; i < len; i++){
		                data = features[i];
		                switch(data.type){
		                    case "Marker":
		                        feature = new AMap.Marker({ map: map, position: new AMap.LngLat(data.lnglat.lng, data.lnglat.lat),
		                            zIndex: 3, extData: data, offset: new AMap.Pixel(data.offset.x, data.offset.y), title: data.name,
		                            content: '<div class="icon icon-' + data.icon + ' icon-'+ data.icon +'-' + data.color +'"></div>' });
		                        break;
		                    case "Polyline":
		                        for(j = 0, jl = data.lnglat.length, path = []; j < jl; j++){
		                            path.push(new AMap.LngLat(data.lnglat[j].lng, data.lnglat[j].lat));
		                        }
		                        feature = new AMap.Polyline({ map: map, path: path, extData: data, zIndex: 2,
		                            strokeWeight: data.strokeWeight, strokeColor: data.strokeColor, strokeOpacity: data.strokeOpacity });
		                        break;
		                    case "Polygon":
		                        for(j = 0, jl = data.lnglat.length, path = []; j < jl; j++){
		                            path.push(new AMap.LngLat(data.lnglat[j].lng, data.lnglat[j].lat));
		                        }
		                        feature = new AMap.Polygon({ map: map, path: path, extData: data, zIndex: 1,
		                            strokeWeight: data.strokeWeight, strokeColor: data.strokeColor, strokeOpacity: data.strokeOpacity,
		                            fillColor: data.fillColor, fillOpacity: data.fillOpacity });
		                        break;
		                    default: feature = null;
		                }
		                if(feature){ AMap.event.addListener(feature, "click", mapFeatureClick); }
		            }
		        }
		 
		        function mapFeatureClick(e){
		            if(!infoWindow){ infoWindow = new AMap.InfoWindow({autoMove: true}); }
		            var extData = e.target.getExtData();
		            infoWindow.setContent("<h5>" + extData.name + "</h5><div>" + extData.desc + "</div>");
		            infoWindow.open(map, e.lnglat);
		        }
		 
		        map = new AMap.Map("mapContainer", {center: new AMap.LngLat(center.lng, center.lat), level: level});
		         
		        loadFeatures();
		        map.plugin(["AMap.ToolBar", "AMap.OverView", "AMap.Scale"], function(){
		            map.addControl(new AMap.ToolBar({ruler: false, direction: false, locate: false}));
		            map.addControl(new AMap.OverView({isOpen: true}));
		            map.addControl(new AMap.Scale);
		        });
		    }();
		    </script>            
            
            
            
            
            
            
            
            
            
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