<%@ include file = "header.jsp" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<body ng-app="getDealer" ng-controller="DealerController">
	<h2>Customer Information</h2>

	<form:form method="POST" action="add/dealer" modelAttribute="dealer">
		<form:input path="dealerId" hidden="true" />
		<table>
			<tr>
				<form:label path="dealerName">Name of Dealer</form:label>
				<form:input path="dealerName" />
				<form:label path="dealerOrganisation">Organization</form:label>
				<form:input path="dealerOrganisation" />
				<form:label path="dealerAddress1">AddressLine1</form:label>
				<form:input path="dealerAddress1" />
				<form:label path="dealerAddress2">AddressLine2</form:label>
				<form:input path="dealerAddress2" />
				<td><form:label path="dealerContactNumber">Contact Number</form:label></td>
				<td><form:input path="dealerContactNumber" /></td>
				<td><form:label path="dealerMobileNumber">Mobile Number</form:label></td>
				<td><form:input path="dealerMobileNumber" /></td>
				<td><form:label path="dealerEmailId">Email-Id</form:label></td>
				<td><form:input path="dealerEmailId" /></td><br><br>
				<td colspan="2"><input type="submit" value="Submit" /></td>
			</tr>
		</table>
	</form:form>
	<div>
		<table>
			<tbody>
				<tr>
					<th>Dealer Id</th>
					<th>Name of Dealer</th>
					<th>Organization</th>
					<th>AddressLine1</th>
					<th>AddressLine2</th>
					<th>Contact Number</th>
					<th>Mobile Number</th>
					<th>EmailId</th>
					<th>EDIT|DELETE</th>
				</tr>
				<tr ng-repeat="e in dealer">
					<td>{{e.dealerId}}</td>
					<td>{{e.dealerName}}</td>
					<td>{{e.dealerOrganisation}}</td>
					<td>{{e.dealerAddress1}}</td>
					<td>{{e.dealerAddress2}}</td>
					<td>{{e.dealerContactNumber}}</td>
					<td>{{e.dealerMobileNumber}}</td>
					<td>{{e.dealerEmailId}}</td>

					<td><a href="editDealer-{{e.dealerId}}">EDIT |</a><a
						href="deleteDealer-{{e.dealerId}}">DELETE</a></td>
				</tr>
			</tbody>
		</table>
		<br>
		<br>
	</div>
	<script>
		angular.module('getDealer',[]).controller(
				'DealerController', function($scope) {
					$scope.dealer = ${dealerListJson}
				});
	</script>
</body>
</html>