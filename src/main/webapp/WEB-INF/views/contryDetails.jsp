<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE HTML>
<html lang="en">
<head>
<title>Country Module - ${title}</title>


<!-- let's add static resources css,js,img using srping:url -->
<spring:url value="/resources/img/favicon.ico" var="faviconUrl" />
<spring:url value="/resources/css/bootstrap.min.css" var="bootstrapUrl" />
<spring:url value="/resources/css/bootstrap-theme.min.css"
	var="bootstrapResponsiveUrl" />
<spring:url value="/resources/css/global.css" var="globalCss" />

<link rel="icon" type="image/x-icon" href="${faviconUrl}" />
<link href="${bootstrapUrl}" rel="stylesheet"></link>
<link href="${bootstrapResponsiveUrl}" rel="stylesheet"></link>
<link href="${globalCss}" rel="stylesheet"></link>


<!-- HTML5 shim, for IE6-8 support of HTML5 elements -->
<!--[if lt IE 9]>
      <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
    <![endif]-->


</head>

<body>

	<div class="container">


		<div class="jumbotron">
			<h1>${message}</h1>


			<h3>Country List</h3>
			<c:if test="${!empty listOfCountries}">
				<table class="tg">
					<tr>
						<th width="80">Id</th>
						<th width="120">Country Name</th>
						<th width="120">Population</th>
						<th width="60">Edit</th>
						<th width="60">Delete</th>
					</tr>
					<c:forEach items="${listOfCountries}" var="country">
						<tr>
							<td>${country.id}</td>
							<td>${country.countryName}</td>
							<td>${country.population}</td>
							<td><a href="<c:url value='/country/update/${country.id}' />">Edit</a></td>
							<td><a href="<c:url value='/country/delete/${country.id}' />">Delete</a></td>
						</tr>
					</c:forEach>
				</table>
				</c:if>
		</div>

	</div>
	<!-- /container -->






	<spring:url value="/resources/js/jquery.min.js" var="JqueryJs" />
	<spring:url value="/resources/js/bootstrap.min.js" var="bootstrapJsUrl" />
	<spring:url value="/resources/js/global.js" var="global" />

	<script src="${JqueryJs}"></script>
	<script src="${bootstrapJsUrl}"></script>
	<script src="${global}"></script>
</body>
</html>