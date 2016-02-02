$(document).ready(function(){
						   
$('tr:odd').addClass('odd');

$('tr').hover(
function(){ $(this).css('background-color','#ecf7fb');},
function(){ $(this).css('background-color',''); $('tr:odd').addClass('odd'); });

var h_text = $('#text').height();
if(h_text>990){
$('#main_center').css('height',h_text+250);
$('#main_right').css('height',h_text+247);
}
					   
});