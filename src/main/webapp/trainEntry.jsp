<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1> Train Details </h1><br>
	<form action="/addtrains" method="POST">
	Train_no <input type="text" name="train_no"><br>
	Train_name <input type="text" name="train_name"><br>
	SRC <input type="text" name="src"><br>
	DEST <input type="text" name="dest"><br>
	<input type="submit" ><br>

	</form>
	</body>
</html>