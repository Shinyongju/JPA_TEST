<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<html>

${result }

<head>
<title>KIM SCHOOL || WBS</title>
</head>
<body>

	<h1>${name }</h1>

	<table border="1">
		<tr>
			<td colspan="3"></td>
			<td>최소 : {mintime}시간</td>
			<td>최대 : {maxtime}시간</td>
		</tr>
		<tr style="background-color: lightblue">
			<th>일자</th>
			<th>출근시간</th>
			<th>퇴근시간</th>
			<th>부재사유</th>
			<th>총합시간</th>
			<th>기타</th>
		</tr>
		<tr>
			<td>2020/04/01</td>
			<td><select><option>08</option>
					<option>09</option>
					<option>10</option></select>시 <select><option>00</option>
					<option>15</option>
					<option>30</option>
					<option>45</option></select>분</td>
			<td><select><option>17</option>
					<option>18</option>
					<option>19</option></select>시 <select><option>00</option>
					<option>15</option>
					<option>30</option>
					<option>45</option></select>분</td>
			<td><select><option></option>
					<option>오전반차</option>
					<option>오후반차</option>
					<option>휴가</option>
					<option>기타</option></select></td>
			<td>${time}</td>
			<td>${etc}</td>
		</tr>
		<tr>
			<td>2020/04/02</td>
			<td><select><option>08</option>
					<option>09</option>
					<option>10</option></select>시 <select><option>00</option>
					<option>15</option>
					<option>30</option>
					<option>45</option></select>분</td>
			<td><select><option>17</option>
					<option>18</option>
					<option>19</option></select>시 <select><option>00</option>
					<option>15</option>
					<option>30</option>
					<option>45</option></select>분</td>
			<td><select><option></option>
					<option>오전반차</option>
					<option>오후반차</option>
					<option>휴가</option>
					<option>기타</option></select></td>
			<td>${time}</td>
			<td>${etc}</td>
		</tr>
		<tr>
			<td>2020/04/03</td>
			<td><select><option>08</option>
					<option>09</option>
					<option>10</option></select>시 <select><option>00</option>
					<option>15</option>
					<option>30</option>
					<option>45</option></select>분</td>
			<td><select><option>17</option>
					<option>18</option>
					<option>19</option></select>시 <select><option>00</option>
					<option>15</option>
					<option>30</option>
					<option>45</option></select>분</td>
			<td><select><option></option>
					<option>오전반차</option>
					<option>오후반차</option>
					<option>휴가</option>
					<option>기타</option></select></td>
			<td>${time}</td>
			<td>${etc}</td>
		</tr>
		<!-- 마지막줄처리  -->
		<tr>
			<td colspan="3"></td>
			<td>${leavedays}일</td>
			<td colspan="2">${totaltime}</td>
		</tr>
	</table>
	<input type="button" value="등록">


	<br>
	<br>
	<a href="/manage">홈으로</a>

</body>
</html>