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
			<h1>Customer details page </h1>


			<table class="table table-dark table-striped">
				<tr style="height: 20px">
					<td>First Name ::</td>
					<td>${employee.firstName}</td>
				</tr>
				<tr style="height: 20px">
					<td>ID hidden ::</td>
					<td>${employee.employeeId}</td>
				</tr>
				<tr style="height: 20px">
					<td>Last Name ::</td>
					<td>${employee.lastName}</td>
				</tr>
				<tr style="height: 20px">
					<td>Department ::</td>
					<td>${employee.department}</td>
				</tr>
				<tr style="height: 20px">
					<td>Additional notes ::</td>
					<td>${employee.additionalNotes}</td>
				</tr>


				<tr style="height: 75px">
					<td>is Visa Approved -</td>
					<td>${employee.visaApproved}</td>
				</tr>
				<tr style="height: 75px">
					<td>Selected Programming Languages -</td>
					<td><c:forEach var="languageKnown"
							items="${employee.languagesKnown}">
					${languageKnown} <br />
						</c:forEach></td>
				</tr>

				<tr style="height: 75px">
					<td>Selected qualification</td>
					<td><c:forEach var="qualification"
							items="${employee.qualifications}">
					${qualification} <br />
						</c:forEach></td>
				</tr>




				<tr style="height: 75px">
					<td>Hobbies -</td>
					<td><c:forEach var="hobby" items="${employee.hobbies}">
					${hobby} <br />
						</c:forEach></td>
				</tr>

				<tr style="height: 75px">
					<td>Selected Social Profiles -</td>
					<td><c:forEach var="socialProfile"
							items="${employee.socialProfiles}">
						${socialProfile} <br />
						</c:forEach></td>
				</tr>

				<tr style="height: 20px">
					<td>Gender ::</td>
					<td>${employee.gender}</td>
				</tr>
				<tr style="height: 20px">
					<td>Payment Mode ::</td>
					<td>${employee.paymentMode}</td>
				</tr>
			</table>

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