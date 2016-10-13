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
	<h1>Property Deals Details</h1>
	
	<form:form method="POST" action="add/subCategories"
		commandName="subCategories" modelAttribute="subCategories">
		<table>
			<tr>
				<td><form:label path="propertyType">Type of Property</form:label></td>
				<td><form:input path="propertyType" /></td>
				<td colspan="2"><input type="submit" value="Submit" /></td></tr>
		</table>
	</form:form>
	<div ng-app="getPropertyDealsSubCategory" ng-controller="PropertyDealsSubCategoryController">
		<table>
			<tbody>
				<tr>
					<th>PROPERTY_DEALS_SUB_CATEGORY_ID</th>
					<th>PROPERTY_DEALS_SUB_CATEGORY_NAME</th>
					<!-- <th>PROPERTYDEALSSUBCATEGORYDESCRIPTION</th> -->
				</tr>
				<%-- <c:forEach items="${listDealsCategories}" var="DealsCategory">
					<tr>
						<td><c:out value="${DealsCategory.dealsCategoryId}"></c:out></td>
						<td><c:out value="${DealsCategory.dealsCategoryname}"></c:out></td>
						<td><c:out value="${DealsCategory.dealsCategoryDescription}"></c:out></td>
					</tr>
				</c:forEach> --%>
					<tr ng-repeat="p in propertydeals">
					<td>{{p.propertyDealsSubCategoryId}}</td>
					<td>{{p.propertyDealsSubCategoryName}}</td>
					<!-- <td>{{p.propertyDealsSubCategoryDescription}}</td> -->
				</tr>
			</tbody>
		</table>
		<br> <br>
	</div>
	<script>
						angular.module('getPropertyDealsSubCategory', []).controller(
								'PropertyDealsSubCategoryController', function($scope) {
									$scope.propertydeals = ${ListPropertyDealsCategories}
								});
					</script>
</body>
</html>