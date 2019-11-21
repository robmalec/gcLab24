<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Grand Circus Coffee</title>
<link rel="stylesheet" type="text/css" href="style.css">
<script src="validator.js"></script>
</head>
<body>
	<h1>Thanks for registering! Please enter your contact and account
		info below:</h1>
	<form action="confirmation" method="POST"
		onsubmit="return validate(first, last, email, phone, password, cPassword)">
		<!-- Make sure all of these things are right -->
		First Name: <input type="text" name="first" id="txtFirst" required><br>
		Last Name: <input type="text" name="last" id="txtLast" required><br>

		<div id="emailDiv">
			Email: <input type="text" name="email" id="txtEmail" required>
			<br>
		</div>


		<div id="phoneNumDiv">
			Phone number: <input type="text" name="phone" id="txtPhone" required>
			<br>
		</div>

		Password: <input type="password" name="password" id="txtPassword"
			required> <br>

		<div id="cPswdDiv">
			Confirm password: <input type="password" name="cPassword"
				id="txtCPassword" required><br>
		</div>


		<!-- Submit button needs to be inside the form tag -->
		<button type="submit">Submit registration</button>
	</form>
</body>
</html>