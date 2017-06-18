<%if (session.getAttribute("currentSessionUser") == null){
	response.sendRedirect("LoginPage.jsp"); 
	}else{
	%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    import="bean.UserBean"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Logged In</title>
</head>
<body>
	<%UserBean currentUser = (UserBean)session.getAttribute("currentSessionUser");%>
	Hi <%=currentUser.getUsername() %>!
	<form action="ChangeDataServlet" method="post">
		Username: <input type="text" name="un" value="<%=currentUser.getUsername()%>">
		</br></br>
		Password: <input type="text" name="pw" value="<%=currentUser.getPassword()%>">
		</br>
		<input type="submit" name="submit" value="Save">
	</form>
	</br>
	<form action="LogoutServlet" method="post">
		<input type="submit" name="submit" value="Logout">
	</form>
</body>
</html>
<% }%>