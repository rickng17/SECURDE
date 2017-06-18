<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
</head>
<body>
	<H1>Login</H1>
	<form action="LoginServlet" method="post">
		Username: <input type="text" name="un">
		</br></br>
		Password: <input type="password" name="pw">
		</br>
		<input type="submit" name="submit" value="Login">
	</form>
	<%if((Boolean)getServletContext().getAttribute("wrong") != null && (Boolean)getServletContext().getAttribute("wrong") == true){
		out.println("</br>Wrong username or password</br>");
		getServletContext().setAttribute("wrong", false);
	}%>
	
	<a href="RegisterPage.jsp">Register</a>
</body>
</html>