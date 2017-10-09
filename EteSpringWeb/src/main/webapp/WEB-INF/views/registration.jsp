<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action = "newUser" method="post">
	<input type = "text" name = "firstName" title="First name">
	<p>
	<input type = "text" name = "lastName">
	<p>
	<input type ="email" name = "email">
	<p>
	<input type = "password" name = "password"> 
	<p>
<button>Save user</button>
</form>


<div>
<a href="allUsers">Show users</a>
<p>
<a href = "">GO HOME</a>
</div>

</body>
</html>