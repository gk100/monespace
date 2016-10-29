<%@ include file = "header.jsp" %>

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
</head>
<body ng-app="getPropertyDealsSubCategory" ng-controller="PropertyDealsSubCategoryController">
	<h1>Property Deals Details</h1>

	<form:form method="POST" action="add/subCategories" modelAttribute="propertyDealsSubCategory">
		
			
				<label>SubCategory</label>
				<form:input path="propertyDealsSubCategoryId" hidden="true"/>
				<form:input path="propertyType"/>
				
				<label>CATEGORY</label>
<form:select path="dealsCategory.dealsCategoryName" items= "${listCategory}" itemValue="dealsCategoryName" itemLabel= "dealsCategoryName"></form:select>
				<td colspan="2"><input type="submit" value="Submit" /></td>
	</form:form>
	
	
	<%-- <c:forEach items="${listDealsCategories}" var="DealsCategory">
					<tr>
						<td><c:out value="${DealsCategory.dealsCategoryId}"></c:out></td>
						<td><c:out value="${DealsCategory.dealsCategoryname}"></c:out></td>
					</tr>
		</c:forEach> --%>
	<div>
		<table>
			<tbody>
				<tr>
					<th>Sub_Category_Id</th>
					<th>Category_Id</th>
					<th>Sub_Category_Name</th>
					<th>EDIT|DELETE</th>
				</tr>
				<tr ng-repeat="p in propertydeals">
					<td>{{p.propertyDealsSubCategoryId}}</td>
					<td>{{p.dealsCategoryId}}</td>
					<td>{{p.propertyType}}</td>
					<td><a href="editSubCategory-{{p.propertyDealsSubCategoryId}}">EDIT |</a><a href="deleteSubCategory-{{p.propertyDealsSubCategoryId}}">DELETE</a></td>
				</tr>
			</tbody>
		</table>
	</div>
	<script>
		angular.module('getPropertyDealsSubCategory', []).controller(
				'PropertyDealsSubCategoryController', function($scope) {
					$scope.propertydeals = ${listSubCategory}
				});
	</script>
</body>
</html>