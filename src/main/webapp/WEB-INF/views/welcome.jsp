<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE HTML>
<html lang="en">
<head>
      <title>${title}</title>
    
       
<!-- let's add static resources css,js,img using srping:url -->
<spring:url value="/resources/img/favicon.ico" var="faviconUrl" />
<spring:url value="/resources/css/bootstrap.min.css" var="bootstrapUrl" />
<spring:url value="/resources/css/bootstrap-theme.min.css" var="bootstrapResponsiveUrl" />
<spring:url value="/resources/css/global.css" var="globalCss" />

    <link rel="icon" type="image/x-icon" href="${faviconUrl}"/>
    <link href="${bootstrapUrl}" rel="stylesheet"></link>
    <link href="${bootstrapResponsiveUrl}" rel="stylesheet"></link>
    <link href="${globalCss}" rel="stylesheet"></link>

     
    <!-- HTML5 shim, for IE6-8 support of HTML5 elements -->
    <!--[if lt IE 9]>
      <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
    <![endif]-->
    

  </head>

<body>
    

<h1>${greeting}</h1>


<spring:url value="/resources/js/jquery.min.js" var="JqueryJs" />
<spring:url value="/resources/js/bootstrap.min.js" var="bootstrapJsUrl" />
<spring:url value="/resources/js/global.js" var="global" />

  <script src="${JqueryJs}"></script>
  <script src="${bootstrapJsUrl}"></script>
  <script src="${global}"></script>
</body>
</html>