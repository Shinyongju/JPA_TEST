<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<html>
<head>
<title>KIM SCHOOL || WBS</title>
</head>
<body>
	<h1>사원 로그인</h1>

	<form action="wbsLoginCheck">
		사원번호 : <br> <input type="text" name="u_no"><br>
		PASSWORD : <br> <input type="password" name="u_password"><br>
		<br> <input type="submit" value="로그인">
	</form>

</body>
</html>