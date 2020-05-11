<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<html>
<head>
	<title>회원등록</title>
</head>
<body>
<h1>
	회원가입
</h1>

<form action="reguser">
	ID : <br>
	<input type="text" name="id" required="required"><br>
	PASSWORD : <br>
	<input type="password" name="password" required="required"><br>
	<input type="submit" value="회원가입">
</form>

<a href ="/manage">홈으로</a>

</body>
</html>