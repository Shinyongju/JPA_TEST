<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<html>
<head>
<title>비밀번호 찾기</title>
</head>
<body>
	<h1>비밀번호 찾기</h1>

	<form action="findpassword">
		ID : <br> <input type="text" name="id" required="required"><br>
		NAME : <br> <input type="text" name="name" required="required"><br>
		<br> <input type="submit" value="비밀번호 찾기">
	</form>

	<a href="/manage">홈으로</a>

</body>
</html>