<%@ include file = "header.jsp" %>
<head>
<title>Login</title>
</head>
<body>
<form:form method="POST" action="perform_login" modelAttribute="login">
			<label for="username">UserName:</label>
			<form:input path="username" />
			<label for="password">Password:</label>
			<form:password path="password" />
			<input type="submit">
		</form:form>
</body>