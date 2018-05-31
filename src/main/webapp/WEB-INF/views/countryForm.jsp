<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
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


			<spring:url value="/country/add" var="formsubmit" />
			<form:form method="post" modelAttribute="country"
				action="${formsubmit}">
				<table>
					<tr>
						<th colspan="2">Add Country</th>
					</tr>
					<tr>
						<form:hidden path="id" />
						<td><form:label path="countryName">Country Name:</form:label></td>
						<td><form:input path="countryName" size="30" maxlength="30"></form:input></td>
					</tr>
					<tr>
						<td><form:label path="population">Population:</form:label></td>
						<td><form:input path="population" size="30" maxlength="30"></form:input></td>
					</tr>
					<tr>
						<td colspan="2"><input type="submit" class="blue-button" /></td>
					</tr>
				</table>
			</form:form>



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