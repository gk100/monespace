<%@ include file="header.jsp"%>
<html>
<head>
<title>Registration Form 2</title>
</head>
<body>
	<h5>Voila! C'est un Registration Form 2...</h5>
	<form:form commandName="userPermanentAddress"
		modelAttribute="userPermanentAddress">

		<br>
		<label for="houseNumber">First Name:</label>
		<form:input path="houseNumber" />
		<br>
		<label for="houseName">House Name:</label>
		<form:input path="houseName" />
		<br>
		<label for="streetName">Street Name:</label>
		<form:input path="streetName" />
		<br>
		<label for="area">Area:</label>
		<form:input path="area" />
		<br>
		<label for="city">City:</label>
		<form:input path="city" />
		<br>
		<label for="state">State:</label>
		<label:input path="state" />
		<br>
		<label for="pincode">Pincode:</label>
		<label:input path="pincode" />
		<br>
		<button name="_eventId_edit" type="submit" class="btn btn-warning"
			value="Edit">Edit</button>
		<button name="_eventId_submit" type="submit" class="btn btn-warning"
			value="Submit">Submit</button>
		<button name="_eventId_cancel" type="submit" class="btn btn-warning"
			value="Cancel">Cancel</button>
	</form:form>
</body>
</html>