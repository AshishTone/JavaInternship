<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="../css/styles.css" />

</head>
<body>
	<div class= "mainBody">
		<h1>New Student Registration</h1>
		<br>
		<br>
		<form action="registrationCatch.jsp" method= "post">
		Name: <input type="text" name= "name" >
		<br><br>
		Email: <input type ="email" name="email">
		<br><br>
		Password:  <input type="password" name="password">
		<br><br>	
		<input type="submit" value = "Sumbit">	
		</form>
	</div>
</body>
</html>