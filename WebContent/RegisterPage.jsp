<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<title>Register</title>
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
	
	#Login{
		font-size: 30px;
	}
</style>
</head>
<body>
	<div class="main">
		<div class="container">
			<H1>REGISTER</H1>
			</br>
			<form action="RegisterServlet" method="post">
				Username: <input type="text" name="un">
				</br></br>
				Password: <input type="password" name="pw">
				</br></br>
				<input type="submit" name="submit" value="Register" id="Login" class="btn btn-success">
				<a href="LoginPage.jsp">Back to Login</a>
			</form>
		</div>
	</div>
	
</body>
</html>