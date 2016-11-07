<%@ include file="header.jsp"%>
<html>
<head>
<title>Registration Form 1</title>
</head>
<body>
	<h5>Voila! C'est un Registration Form 1...</h5>
	<form:form commandName="userDetail" modelAttribute="userDetail">

		<br>
		<label for="firstName">First Name:</label>
		<form:input path="firstName" />
		<br>
		<label for="lastName">Last Name:</label>
		<form:input path="lastName" />
		<br>
		<label for="phoneNumber">Phone Number:</label>
		<form:input path="phoneNumber" />
		<br>
		<label for="mobileNumber">Mobile Number:</label>
		<form:input path="mobileNumber" />
		<br>
		<label for="emailId">EmailId:</label>
		<form:input path="emailId" />
		<br>
		<label for="username">UserName:</label>
		<form:input path="username" />
		<br>
		<label for="password">Password:</label>
		<form:password path="password" />
		<br>
		<button name="_eventId_submit" type="submit" class="btn btn-warning"
			value="Submit">Submit</button>
		<!-- 			<button name= "_eventId_edit"type="submit" class="btn btn-warning">Edit</button> -->
		<button name="_eventId_cancel" type="submit" class="btn btn-warning"
			value="Cancel">Cancel</button>
	</form:form>
</body>
</html>