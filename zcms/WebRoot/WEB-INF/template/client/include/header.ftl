<!--顶部区域-->
<div class="container" id="top">
    <div class="row">
        <div class="col-md-8" id="top_left">
            <a href="index.html"><img src="${base}/resource/client/images/logo.png" border="0"></a>
        </div>
        <div class="col-md-4" id="top_right">
            <form action="#" method="post">
                <input type="submit" id="submit" value="">
                <input type="text" name="search" id="search" placeholder="搜索">
            </form>
        </div>
    </div>
</div>

<!--菜单导航-->
<div class="row" id="menu">
    <div class="container" id="menu_extend">
        <div class="menu_item active"><a href="/">网站首页</a></div>
        <#list navigations as nav>
        	<div class="menu_item"><a href="${nav.url}">${nav.name}</a></div>
        </#list>
    </div>
</div>