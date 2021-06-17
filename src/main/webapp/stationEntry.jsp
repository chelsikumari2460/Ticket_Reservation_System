<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Station entry</title>
</head>
<body>
	<form action="/sentry" method="POST">
	StnCode <input type="text" name="stn_code"><br>
	STName<input type="text" name="stationName"><br>
	City <input type="text" name="city"><br>
	State<input type="text" name="state"><br>
	Pincode <input type="text" name="pincode"><br>
	<input type="submit" ><br>
	</form>
</body>
</html>