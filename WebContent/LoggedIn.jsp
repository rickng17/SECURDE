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
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<title>Logged In</title>
<style type="text/css">
	
	.main .container{
		text-align: center;
		font-size: 30px;
		padding: 20px;
		padding-top: 60px;
	}
	
	.main h1{
		font-weight: bold;
		font-size: 50px;
	}
	
	#Logout{
		font-size: 30px;
		float: right;
	}
	
	#Save{
		font-size: 30px;
	}	
</style>
</head>
<body>
	<form action="LogoutServlet" method="post">
				<input type="submit" name="submit" value="Logout" id="Logout" class="btn btn-success">
	</form>
	<div class="main">
		<div class="container">
			<%UserBean currentUser = (UserBean)session.getAttribute("currentSessionUser");%>
			<h1>Hi <%=currentUser.getUsername() %>!</h1>
			
			</br>
			<form action="ChangeDataServlet" method="post">
				Username: <input type="text" name="un" value="<%=currentUser.getUsername()%>">
				</br></br>
				Password: <input type="text" name="pw" value="<%=currentUser.getPassword()%>">
				</br></br>
				<input type="submit" name="submit" value="Save" id="Save" class="btn btn-success">
			</form>
			
		</div>
	</div>
	
	
</body>
</html>
<% }%>