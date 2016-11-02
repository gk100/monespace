<%@ include file="header.jsp"%>
<html>
<head>
<title>Category Page</title>
</head>
<body ng-app="getDealsCategory" ng-controller="DealsCategoryController">
	<h2>Customer Information</h2>

	<form:form method="POST" action="add/category"
		modelAttribute="dealsCategory">
		<!--  -->
		<div class="container">
			<div class="row">
				<div class="col-lg-12">
					<div class="input-group custom-search-form">
						<input id="search" type="text" placeholder="Search"> <input
							id="submit" type="submit" value="GO">

					</div>
					<!-- /input-group -->
				</div>
			</div>
		</div>
		<br>
		<!--  -->
		<form:input path="dealsCategoryId" hidden="true" />
		<table>
			<tr>
				<td><form:label path="dealsCategoryName">Type of Deal</form:label></td>
				<td><form:input path="dealsCategoryName" /></td>
				<td><form:label path="dealsCategoryDescription">Category Description</form:label></td>
				<td><form:input path="dealsCategoryDescription" /></td>
				<td colspan="2"><input type="submit" value="Submit" /></td>
			</tr>
		</table>
	</form:form>
	<!-- 	<div> -->
	<!-- 		<table> -->
	<!-- 			<tbody> -->
	<!-- 				<tr> -->
	<!-- 					<th>DEALSCATEGORYID</th> -->
	<!-- 					<th>DEALSCATEGORYDESCRIPTION</th> -->
	<!-- 					<th>DEALSCATEGORYNAME</th> -->
	<!-- 				</tr> -->
	<%-- 				<c:forEach items="${listDealsCategories}" var="DealsCategory"> --%>
	<!-- 					<tr> -->
	<%-- 						<td><c:out value="${DealsCategory.dealsCategoryId}"></c:out></td> --%>
	<%-- 						<td><c:out value="${DealsCategory.dealsCategoryname}"></c:out></td> --%>
	<%-- 						<td><c:out value="${DealsCategory.dealsCategoryDescription}"></c:out></td> --%>
	<!-- 					</tr> -->
	<%-- 				</c:forEach> --%>
	<!-- 				</tbody> -->
	<!-- 		</table> -->
	<!-- 		<br> <br> -->
	<!-- 	</div> -->
	<div>
		<table>
			<tbody>
				<tr>
					<th>DEALSCATEGORYID</th>
					<th>DEALSCATEGORYDESCRIPTION</th>
					<th>DEALSCATEGORYNAME</th>
					<th>EDIT|DELETE</th>
				</tr>
				<tr ng-repeat="d in deals">
					<td>{{d.dealsCategoryId}}</td>
					<td>{{d.dealsCategoryName}}</td>
					<td>{{d.dealsCategoryDescription}}</td>
					<td><a href="editCategory-{{d.dealsCategoryId}}">EDIT |</a><a
						href="deleteCategory-{{d.dealsCategoryId}}">DELETE</a></td>
				</tr>
			</tbody>
		</table>
		<br> <br>
	</div>
	<script>
						angular.module('getDealsCategory', []).controller(
								'DealsCategoryController', function($scope) {
									$scope.deals = ${listDealsCategory}
								});
					</script>

<%@ include file="footer.jsp"%>

</body>
</html>