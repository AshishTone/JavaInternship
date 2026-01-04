<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="../css/styles.css" />
</head>
<body>
	<div class="mainBody">
		<form action="CreateQuizCatch.jsp" method = "post">
			Enter Quiz Title: <input type = "text" name = "quizTitle">	
			<br><br>
			Enter path to .txt File <input type = "text" name = "path">
			<br><br>
			<input type = "submit" value = "Submit">
		</form>
	</div>
	
</body>
</html>