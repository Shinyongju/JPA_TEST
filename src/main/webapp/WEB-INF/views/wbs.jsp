<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page session="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<title>KIMSCHOOL || WBS</title>
</head>
<body>

	<h1>근태확인</h1>

	<fieldset style="width: 300px;">
		<legend> KIMSCHOOL 勤怠管理 </legend>

		<table border=1>
			<tr>
				<th style="background-color: lightblue;">社員名</th>
				<td>${wbsinfo.name}</td>
			</tr>
			<tr>
				<th style="background-color: lightblue;">社員番号</th>
				<td>${wbsinfo.no}</td>
			</tr>
		</table>

		<br>
		<table border=1>
			<tr>
				<th style="background-color: lightblue;">勤務日合計</th>
				<td>${wbsinfo.resultlist.size()}日</td>
			</tr>
			<tr>
				<c:set var="sum" value="0" />
				<c:set var="all_time" value="0" />
				<c:forEach var="wbsinfoList" items="${wbsinfo.resultlist}">
					<c:set var="all_time"
						value="${(wbsinfoList.end_time - wbsinfoList.start_time - wbsinfoList.rest_time)/100}" />
					<c:set var="sum" value="${sum + all_time}" />
				</c:forEach>
				<th style="background-color: lightblue;">勤務時間合計</th>
				<td><c:out value="${sum}" />時間</td>
			</tr>
		</table>
		<br>
		<table border=1>
			<tr>
				<th style="background-color: lightblue;">最低勤務時間</th>
				<td>${wbsinfo.min_time}時間</td>
			</tr>
			<tr>
				<th style="background-color: lightblue;">最大勤務時間</th>
				<td>${wbsinfo.max_time}時間</td>
			</tr>
		</table>
	</fieldset>
	<br>

	<table border=1>
		<tr style="background-color: lightblue">
			<th>日付
			<th>開始時間</th>
			<th>終了時間</th>
			<th>合計時間</th>
			<th>休日区分</th>
			<th>メモ</th>
		</tr>
		<c:forEach items="${wbsinfo.resultlist}" var="wbsinfoList">
			<tr>
				<td>${wbsinfoList.date}</td>
				<td>${wbsinfoList.start_time}</td>
				<td>${wbsinfoList.end_time}</td>
				<td>${(wbsinfoList.end_time - wbsinfoList.start_time - wbsinfoList.rest_time)/100}</td>
				<td>${wbsinfoList.vacation_type}</td>
				<td>${wbsinfoList.memo}</td>
			</tr>
		</c:forEach>
	</table>
	<!-- <input type = "button" value = "등록"> -->
	<br>
	<a href="/manage">홈으로</a>

</body>
</html>