<%@ include file="header.jsp"%>
<html>
<head>
<title>Confirm Form 3</title>
</head>
<body>
	<h5>Voila! C'est un confirmForm3...</h5>
	<form:form commandName="userBillingAddress"
		modelAttribute="userBillingAddress">

		<label for="houseNumber">First Name:</label>${userBillingAddress.houseNumber}
		<br>
		<label for="houseName">House Name:</label>${userBillingAddress.houseName}
		<br>
		<label for="streetName">Street Name:</label>${userBillingAddress.streetName}
		<br>
		<label for="locality">Locality:</label>${userBillingAddress.locality}
		<br>
		<label for="city">City:</label>${userBillingAddress.city}
		<br>
		<label for="state">State:</label>${userBillingAddress.state}
		<br>
		<label for="pincode">Pincode:</label>${userBillingAddress.pincode}
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