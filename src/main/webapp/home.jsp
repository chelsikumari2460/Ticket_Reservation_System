<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration</title>
</head>
<body>
	<form action="/register" method="POST">
	FirstName <input type="text" name="firstName"><br>
	LastName<input type="text" name="lastName"><br>
	Email<input type="email" name="email"><br>
	Password<input type="password" name="password"><br>
	<input type="submit" ><br>
	</form>
</body>
</html>