<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
	<title></title>
	<link rel="stylesheet" type="text/css" href="${base}/resource/plugin/webuploader/dist/webuploader.css"> 
    <link rel="stylesheet" type="text/css" href="${base}/resource/plugin/webuploader/image-upload/style.css"> 
	<link rel="stylesheet" type="text/css" href="${base}/resource/admin/assets/skin/default_skin/css/theme_inner.css">
	<link rel="stylesheet" type="text/css" href="${base}/resource/admin/css/custom.css">
    <link rel="stylesheet" type="text/css" href="${base}/resource/admin/assets/admin-tools/admin-forms/css/admin-forms.css">

</head>
<body>
<#assign uptime = article.createDate?string("yyyy")>                        
<div class="custom_main">

	<div class="custom_title">
		<span class="custom_title_word">文章编辑</span>
	    
	    <span class="pull-right">
        <label class="pull-right">&nbsp;&nbsp;设置置顶</label>
		<div class="switch switch-primary switch-inline switch-xs pull-right">
            <input id="isTop" name="isTop" type="checkbox" value="true">
            <label for="isTop"></label>
        </div>
    	</span> 
    	
	    <span class="pull-right">
    	<label class="pull-right">&nbsp;&nbsp;搜索优化&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</label>  
        <div class="switch switch-primary switch-inline switch-xs pull-right">
            <input id="seo" type="checkbox">
            <label for="seo"></label>
        </div>
        </span>
        
    	<span class="pull-right">
        <label class="pull-right">&nbsp;&nbsp;图片上传&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</label>
		<div class="switch switch-primary switch-inline switch-xs pull-right">
            <input id="isImage" name="isImage" type="checkbox" value="true">
            <label for="isImage"></label>
        </div>
    	</span>   
    	
    	<span class="pull-right">
        <label class="pull-right">&nbsp;&nbsp;图片管理&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</label>
		<div class="switch switch-primary switch-inline switch-xs pull-right">
            <input id="manageImage" name="manageImage" type="checkbox" value="true">
            <label for="manageImage"></label>
        </div>
    	</span>
    	
    	<label class="pull-right">  
	    	<span class="glyphicons glyphicons-rewind"></span>&nbsp;&nbsp;<a href="javascript:;" class="custom_href" onclick="window.history.back()">返回分类</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	    </label>  
	</div>
    
	<form class="form-horizontal" action="${base}/admin/article/update" id="inputForm" method="post" role="form">

	<div class="custom_body">                        
		<input type="hidden" name="id" value="${article.id}" >
		
	    <div class="form-group">
	
	        <label for="inputStandard" class="col-md-1 col-sm-1  control-label">文章标题</label>
	        <div class="col-md-5 col-sm-5">
	            <input type="text" name="title" id="inputStandard" class="form-control" value="${article.title}">
	        </div>
	        
	        
	        <div class="col-md-2 col-sm-2  admin-form">   
	            <label class="field select">
	                <select name="articleCategoryIdAndType" id="articleCategoryIdAndType">
	                    <option value="">请选择</option>
	                    <#list articleCategoryTree as articleCategory>
	                    	<option value="${articleCategory.id}and${articleCategory.type}" <#if articleCategory.id == article.articleCategory.id> selected="selected"</#if>>
							<#if articleCategory.grade != 0>
								<#list 1..articleCategory.grade as i>&nbsp;&nbsp;</#list>
							</#if>
							${articleCategory.name}
							</option>
	                    </#list>
	                </select>
	                <i class="arrow"></i>
	            </label>	
	        </div>
	            
        	<!--注意，此处name不能为createDate，因为实体中该属性是Date类型，而表单中如果使用name="createDate"，则这里是String类型。类型不匹配-->
            <div class="col-md-2 col-sm-2 ">
                <input type="text" name="newDate" id="newDate" class="form-control" value="<#if (uptime?number > 3000)>${uptime?number-1000}${article.createDate?string("-MM-dd hh:mm:ss")}<#else>${article.createDate}</#if>">
            </div>    
	            
        	<div class="col-md-2 col-sm-2 ">
                <input type="text" class="form-control" name="source" value="${article.source}" placeholder="未设置文章来源">
            </div>    
	           
		</div>

	        
	       
	        <div class="form-group custom_seo">	
	            <label class="col-md-1 col-sm-1  control-label">关键词语</label>
	            <div class="col-md-11 col-sm-11">
	                <input type="text" name="seoKeywords" id="seoKeywords" class="form-control" value="${(article.seoKeywords)?default("123")}">
	            </div>	             
	        </div>
	
	        <div class="form-group custom_seo">
	            <label class="col-md-1 col-sm-1  control-label">页面描述</label>
	            <div class="col-md-11 col-sm-11">
	                <input type="text" name="seoDescription" class="form-control" value="${(article.seoDescription)?default("123")}">
	            </div>  
	        </div>
	        
	        
	        <div class="custom_images">
		        <div class="form-group">
		        	<label class="col-md-1 col-sm-1 control-label">图片上传</label>
		            <div class="col-md-11 col-sm-11">
	
						<div id="wrapper">
					        <div id="container">
					            <!--头部，相册选择和格式选择-->
					            <div id="uploader">
					                <div class="queueList">
					                    <div id="dndArea" class="placeholder">
					                        <div id="filePicker"></div>
					                    </div>
					                </div>
					                <div class="statusBar" style="display:none;">
					                    <div class="progress">
					                        <span class="text">0%</span>
					                        <span class="percentage"></span>
					                    </div>
					                    <div class="info"></div>
					                    <div class="btns">
					                        <div id="filePicker2"></div><div class="uploadBtn">开始上传</div>
					                    </div>
					                </div>
					            </div>
					        </div>
					    </div>
	         	
		            </div>     
		        </div>
        	</div>
	        
	
	        <div class="form-group">
	            <label class="col-md-1 col-sm-1  control-label">文章内容</label>
	            <div class="col-md-11 col-sm-11">
	                <script id="editor" name="content" type="text/plain">${article.content}</script>
	            </div>
	        </div>
	
	        <div class="form-group">
	            <label class="col-md-1 col-sm-1  control-label" for="textArea2"></label>
	            <div class="admin-form col-md-11 col-sm-11">
	                <button type="submit" class="button btn-primary mr10">发 布</button>
	            </div>
	        </div>
	        
	    
	</div>
	</form>
	
	<!-- 图片管理区域 -->
	<div id="manageImageArea">
		
	</div>
</div>
                        
                        
<script type="text/javascript" src="${base}/resource/admin/vendor/jquery/jquery-1.11.1.min.js"></script>
<script type="text/javascript" src="${base}/resource/admin/vendor/jquery/jquery_ui/jquery-ui.min.js"></script>
<script type="text/javascript" src="${base}/resource/admin/js/jquery.validate.js"></script> 
<script type="text/javascript" src="${base}/resource/admin/assets/js/bootstrap/bootstrap.min.js"></script>
<script type="text/javascript" src="${base}/resource/plugin/webuploader/require.js" data-main="${base}/resource/admin/js/article.app.js"></script>


<!--Ueditor 编辑器-->
<script type="text/javascript" charset="utf-8" src="${base}/resource/plugin/ueditor/ueditor.config.js"></script>
<script type="text/javascript" charset="utf-8" src="${base}/resource/plugin/ueditor/ueditor.all.min.js"> </script>  
<script type="text/javascript" charset="utf-8" src="${base}/resource/plugin/ueditor/lang/zh-cn/zh-cn.js"></script>
<script type="text/javascript" charset="utf-8" src="${base}/resource/admin/js/article.js"></script>   
<script type="text/javascript">

if("${info}" != ""){
	parent.bootAlert("${info}");
}

$(document).ready(function() {
	// Ueditor 编辑器
    var ue = UE.getEditor('editor');
	var $inputForm = $("#inputForm");
	
	// 表单验证
	$inputForm.validate({
		rules: {
			title: "required",
			articleCategoryId: "required"
		}
	});
	
	// 若选择了 标题 类型，则取消提交
	$('#inputForm').submit(function(){
		var articleType = $('#articleCategoryIdAndType').val().split("and")[1];
		if(parseInt(articleType) == 0){
			alert("您选择了 标题 类型，无法提交数据。请重新选择文章类型。");
			return false;
		}
	});
	
	// seo 显示/隐藏
	$('#seo').click(function(){
		if($(this).prop('checked')){
			$('.custom_seo').show(300);
		}else{
		    $('.custom_seo').hide(300);
		}
	});
	
	
	// 图片上传 显示/隐藏
	$('#isImage').click(function(){
		if($(this).prop('checked')){   
			$('.custom_images').show(300);
			parent.setFrameHeight(300);
		}else{
		    $('.custom_images').hide(300);
		    parent.setFrameHeight(-300);
		}
	});
	
	
	// 图片管理
	$('#manageImage').click(function(){
		if($(this).prop('checked')){
		    var editorHeight = $("#editor").height();   
			$('#inputForm').hide();
			$('#manageImageArea').css('height',editorHeight);
			$('#manageImageArea').show(300);
			
		}else{
		    $('#manageImageArea').hide(300);
		    $('#inputForm').show();
		}
	});
	

});
	
</script>

</body>
</html>


