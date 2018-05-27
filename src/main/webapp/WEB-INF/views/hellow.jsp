<%@ page language="java" pageEncoding="UTF-8"
	contentType="text/html; charset=UTF-8" session="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE HTML>
<html lang="en">
<head>
      <title>${title}</title>
    
    <c:url var="faviconUrl" value="/resources/img/favicon.ico"/>
    <link rel="icon" type="image/x-icon" href="${faviconUrl}"/>
    
    <c:url var="bootstrapUrl" value="/resources/css/bootstrap.min.css"/>
    <link href="${bootstrapUrl}" rel="stylesheet"></link>
    
    <c:url var="bootstrapResponsiveUrl" value="/resources/css/bootstrap-theme.min.css"/>
    <link href="${bootstrapResponsiveUrl}" rel="stylesheet"></link>
    
    <c:url var="globalCss" value="/resources/css/global.css"/>
    <link href="${globalCss}" rel="stylesheet"></link>

     
    <!-- HTML5 shim, for IE6-8 support of HTML5 elements -->
    <!--[if lt IE 9]>
      <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
    <![endif]-->
    
    <script>
    	var GLOBAL={
    			CSRF_NAME:"${VariableTOJava}", // ${_csrf.parameterName}
    			CSRF_TOKEN:"${_csrf.token}",
    			CONTEXT_PATH:"${pageContext.request.contextPath}"
    	}
    
    </script>
  </head>

<body>


	<div class="container">
		<div class="jumbotron">
			<h1>${title}</h1>
			 <p> Hello</p>
			<h1>${message}</h1>
	 	</div>
	</div>











    <c:url var="JqueryJs" value="/resources/js/jquery.min.js"/>
    <script src="${JqueryJs}"></script>
    
     <c:url var="bootstrapJsUrl" value="/resources/js/bootstrap.min.js"/>
     <script src="${bootstrapJsUrl}"></script>
     
     <c:url var="global" value="/resources/js/global.js"/>
     <script src="${global}"></script>
     
         <script>
			/* 		   
			$( document ).ready(function() {
					      
					    	$("#Logout").click(function(){
					    	    $form=$("<form>").attr({"action":"${pageContext.request.contextPath}"+"/mylogout","method":"post"})
					    	    .append($("<input>").attr({"type":"hidden","name":"${_csrf.parameterName}","value":"${_csrf.token}"}))
					    	    $(this).append($form);
					    	    $form.submit();
					    	});
					    	
					    }); 
			*/
					 
		    $( window ).on( "load", function() {
		        console.log( GLOBAL.CSRF_NAME);
		    });
    </script>
</body>
</html>
