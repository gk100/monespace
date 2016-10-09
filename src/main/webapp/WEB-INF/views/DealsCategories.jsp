<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page isELIgnored="false"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script
	src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
table, th, td {
	border: 1px solid black;
}
</style>
</head>

<body>
	<h2>Customer Information</h2>

	<form:form method="POST" action="add/dealscategories"
		commandName="dealsCategories" modelAttribute="dealsCategories">
		<table>
			<tr>
				<td><form:label path="dealsCategoryname">Type of Deal</form:label></td>
				<td><form:input path="dealsCategoryname" /></td>
			</tr>
			<tr>
				<td><form:label path="dealsCategoryDescription">Category Description</form:label></td>
				<td><form:input path="dealsCategoryDescription" /></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="Submit" /></td>
			</tr>
		</table>
	</form:form>
	<div ng-app="getDealsCategory" ng-controller="DealsCategoryController">
		<table>
			<tbody>
				<tr>
					<th>DEALSCATEGORYID</th>
					<th>DEALSCATEGORYDESCRIPTION</th>
					<th>DEALSCATEGORYNAME</th>
				</tr>
				<%-- <c:forEach items="${listDealsCategories}" var="DealsCategory">
					<tr>
						<td><c:out value="${DealsCategory.dealsCategoryId}"></c:out></td>
						<td><c:out value="${DealsCategory.dealsCategoryname}"></c:out></td>
						<td><c:out value="${DealsCategory.dealsCategoryDescription}"></c:out></td>
					</tr>
				</c:forEach> --%>
				<tr ng-repeat="d in deals">
					<td>{{d.dealsCategoryId}}</td>
					<td>{{d.dealsCategoryname}}</td>
					<td>{{d.dealsCategoryDescription}}</td>
				</tr>
			</tbody>
		</table>
		<br> <br>
	</div>
	<script>
						angular.module('getDealsCategory', []).controller(
								'DealsCategoryController', function($scope) {
									$scope.deals = ${ListDealsCategories}
								});
					</script>
</body>
</html>