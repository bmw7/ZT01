<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
	<title></title>
	<link rel="stylesheet" type="text/css" href="${base}/resource/admin/assets/skin/default_skin/css/theme_inner.css">
    <link rel="stylesheet" type="text/css" href="${base}/resource/admin/css/custom.css">
    <link rel="stylesheet" type="text/css" href="${base}/resource/admin/assets/admin-tools/admin-forms/css/admin-forms.css">
</head>
<body>

<div class="custom_main">
<div class="custom_title"><span class="custom_title_word">文章管理</span></div>
<div class="custom_body">

<table class="table table-hover" cellspacing="0" width="100%">
	
	<thead>
	    <tr>
	        <th><span class="glyphicons glyphicons-expand"></span></th>
	        <th width="55%">分类名称</th>
	        <th width="15%">栏目类型</th>
	        <th width="15%">生成片段</th>
	        <th width="15%">进入管理</th>    
	    </tr>
	</thead>
	
	<tbody>                      
		<#list articleCategoryTree as articleCategory>
		<tr>
		<td><span class="glyphicons glyphicons-unchecked"></span></td>
		<td><span style="margin-left: ${articleCategory.grade * 20}px">${articleCategory.name}</span></td>	
		<td><#if articleCategory.type == 0><span class="glyphicons glyphicons-text_underline">&nbsp;标题</span>
		<#elseif articleCategory.type == 1><span class="glyphicons glyphicons-unchecked">&nbsp;单篇</span>
		<#elseif articleCategory.type == 2><span class="glyphicons glyphicons-more_windows">&nbsp;多篇</span>
		</#if>
		 </td>
		<td>
		<#if articleCategory.type == 2>
		<div class="custom_control_height"><div class="switch switch-primary switch-inline switch-xs">
		    <input id="${articleCategory.id}" name="${articleCategory.name}" class="generate" type="checkbox" <@abbr categoryId="${articleCategory.id}"><#if isExist>checked</#if></@abbr> >
		    <label for="${articleCategory.id}"></label>
		</div></div>
		</#if>
		</td>
		
		<td>
		<#if articleCategory.type != 0><a href="${base}/admin/article/manage/${articleCategory.id}">进入管理</a></#if>
		</td>
		</tr>
		</#list>
    </tbody>
    <tr class="row-label"><td colspan="5">&nbsp;</td></tr>
</table>
                         
</div>
</div>

<script type="text/javascript" src="${base}/resource/admin/vendor/jquery/jquery-1.11.1.min.js"></script>
<script type="text/javascript">
// 生成静态片段
$(document).ready(function(){
	$('.generate').click(function(){
		var categoryId = $(this).attr('id');
		var categoryName = $(this).attr('name');
		// 生成
		if($(this).is(':checked')){
			$.ajax({
				type: 'POST',
				url:  '${base}/admin/article/abbreviate', 
				data: {'categoryId':categoryId,'categoryName':categoryName},
				success: function(data){ parent.bootAlert(data); }
			});
		// 删除	
		}else{
			$.ajax({
				type: 'POST',
				url:  '${base}/admin/article/abbreviateDel', 
				data: {'categoryId':categoryId},
				success: function(data){ parent.bootAlert(data); }
			});
		}
		
	});
});
</script>
</body>
</html>

