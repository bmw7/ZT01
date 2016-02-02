<div id="menu_pos">
<div class="list_menu"><a href="/">网站首页</a></div>

<#list navigations as navigation>
<div class="list_menu"><a href="${navigation.url}">${navigation.name}</a></div>
</#list>

</div>