
$( document ).ready( function(){
	
	$(".Logout").click(function(){
	    $form=$("<form>").attr({"action":GLOBAL.CONTEXT_PATH+"/mylogout","method":"post"})
	    .append($("<input>").attr({"type":"hidden","name":GLOBAL.CSRF_NAME,"value":GLOBAL.CSRF_TOKEN}))
	    $(this).append($form);
	    $form.submit();
	});
	
});

