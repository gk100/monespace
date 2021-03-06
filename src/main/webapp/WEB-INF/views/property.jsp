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
<body ng-app="myApp" ng-controller="myController">
<form:form method="POST" action="add/property" modelAttribute="property">

<form:input path="propertyId" hidden="true" />
<label>Property Name</label>
<form:input path="PropertyName"/>
<label>Property Description</label>
<form:input path="PropertyDescription"/>
<form:select path="dealsCategory.dealsCategoryName" items = "${listDealsCategories}" itemValue="dealsCategoryName" itemLabel= "dealsCategoryName"></form:select>
<form:select path="propertyDealsSubCategory.propertyType" items = "${listSubCategory}" itemValue="propertyType" itemLabel= "propertyType"></form:select>
<form:select path="dealer.dealerName" items = "${listDealer}" itemValue="dealerName" itemLabel= "dealerName"></form:select>
<input type="Submit" value="Submit"/>
</form:form>
<div>
<table>
<tbody>
<tr>
<th>propertyId</th>
<th>propertyName</th>
<th>propertyDescription</th>
<th>EDIT|DELETE</th>
</tr>
<tr ng-repeat="k in klm">
      <td>{{k.propertyId}}</td>
      <td>{{k.propertyName}}</td>
      <td>{{k.propertyDescription}}</td>
      <td><a href ="editProperty-{{k.propertyId}}">EDIT |</a><a href ="deleteProperty-{{k.propertyId}}">DELETE</a></td>
</tr>
</tbody>
</table>
</div>
<script>
angular.module('myApp', []).controller('myController', function($scope) {
    $scope.klm = ${stringProperty};
 });
</script>
</body>
</html>