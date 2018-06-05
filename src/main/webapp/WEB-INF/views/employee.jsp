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
		<h1>Hellow all </h1>
			<h1>${message}</h1>

	<form:form method="post" commandName="employee">
 
	<table class="table table-dark">
		
		<form:hidden path="employeeId" value="12345" />
		
		
			<tr>
				<td><form:label path="firstName">First Name :</form:label></td>
				<td><form:input path="firstName" disabled="" /></td>
			</tr>
			<tr>
				<td><form:label path="lastName">Last Name :</form:label></td>
				<td><form:input path="lastName" /></td>
			</tr>
			<tr>
				<td><form:label path="department">Department :</form:label></td>
				<td><form:input path="department" /></td>
			</tr>
			
			<tr>
				<td><form:label path="additionalNotes">Additional Notes :</form:label></td>
				<td><form:textarea path="additionalNotes" rows="10" cols="30" /></td>
			</tr>
			
			
			
			<tr>
				<td><form:label path="visaApproved">is Visa Approved - </form:label></td>
				<td><form:checkbox path="visaApproved" /></td>
			</tr>
			
			
			<tr>
			<td><form:label path="qualifications">select qualifications - </form:label></td>
			<td><form:select path="qualifications">
				<form:options items="${availablequalifications}" />
			</form:select>
			<td>
			</tr>
			
			<tr>
				<td><form:label path="gender">gender :</form:label></td>
				<td>
					<form:radiobutton path="gender" value="male"/>Male
					<form:radiobutton path="gender" value="female"/>Female
				</td>
			</tr>
			
			
			<tr>
				<td><form:label path="paymentMode">Payment Modes :</form:label></td>
				<td><form:radiobuttons path="paymentMode" items="${paymentModes}" /></td>
			</tr>
			

			<tr>
				<td><form:label path="languagesKnown">Programming Languages - </form:label></td>
				<td><form:checkbox path="languagesKnown" value="C++" label="C++" /> 
				<form:checkbox
						path="languagesKnown" value="JAVA" label ="JAVA" /> 
				<form:checkbox
						path="languagesKnown" value=".Net" label=".Net" />
			</td>
			</tr>
			<tr>
				<td><form:label path="hobbies">Hobbies - </form:label></td>
				<td><form:checkboxes path="hobbies" items="${availableHobbies}" /></td>
			</tr>

			<tr>
				<td><form:label path="socialProfiles">Social Profiles - </form:label></td>
				<td><form:checkboxes path="socialProfiles"
						items="${availableSocialProfiles}" value="${key}" label="${value}" /></td>
			</tr>
			
			
 
			<tr>
				<td colspan="2"><input type="submit" value="Submit" /></td>
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