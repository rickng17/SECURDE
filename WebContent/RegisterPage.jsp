<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register</title>
</head>
<body>
	<H1>Register</H1>
	<form action="RegisterServlet" method="post">
		Username: <input type="text" name="un">
		</br></br>
		Password: <input type="password" name="pw"></br>
		<input type="submit" name="submit" value="Register">
	</form>
	<a href="LoginPage.jsp">Back to Login</a>
</body>
</html>