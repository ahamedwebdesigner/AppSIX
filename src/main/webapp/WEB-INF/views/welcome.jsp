<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
    

  </head>

<body>
    

<h1>Hellow all form ${message}</h1>






    <c:url var="JqueryJs" value="/resources/js/jquery.min.js"/>
    <script src="${JqueryJs}"></script>
    
     <c:url var="bootstrapJsUrl" value="/resources/js/bootstrap.min.js"/>
     <script src="${bootstrapJsUrl}"></script>
     
     <c:url var="global" value="/resources/js/global.js"/>
     <script src="${global}"></script>
</body>
</html>