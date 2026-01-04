<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div class="mainBody">
		<jsp:useBean id="dq" class="com.app.admin.beans.DeleteQuizBean"></jsp:useBean>
		<jsp:setProperty property="*" name="dq" />
		<p>
			Quiz ID: <%=request.getParameter("delId")  %>

		</p>

		${dq.deleteById()}
		<h2>Deleted quiz with id ${dq.delId}</h2>
		<c:redirect url = "DeleteQuiz.jsp"></c:redirect>
	</div>
</body>
</html>