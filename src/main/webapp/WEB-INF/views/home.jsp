<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	JPA + Spring 연동
</h1>

<form action="logincheck">
	ID : <br>
	<input type="text" name="id"><br>
	PASSWORD : <br>
	<input type="password" name="password"><br><br>
	<input type="submit" value="로그인">
</form>

<a href ="movereguser">회원가입</a><br>
<a href ="movefindpassword">비밀번호 찾기</a>



</body>
</html>