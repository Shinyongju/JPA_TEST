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
				<td>${wbsinfo.u_name}</td>
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
				<td>${wbsinfo.dayCount}日</td>
			</tr>
			<tr>
				<th style="background-color: lightblue;">勤務時間合計</th>
				<td>${wbsinfo.totalTime}時間</td>
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

		<c:forEach var="wbs" items="${wbsinfo.wbslist}">
			<tr>
				<td>${wbs.date}</td>
				<td>${wbs.start_h}時${wbs.start_m}分</td>
				<td>${wbs.end_h}時${wbs.end_m}分</td>
				<td>${wbs.total_h}</td>
				<td>${wbs.vacation_type}</td>
				<td>${wbs.memo}</td>
			</tr>
		</c:forEach>

	</table>
	<!-- <input type = "button" value = "등록"> -->
	<br>
	<a href="/manage">홈으로</a>

</body>
</html>

<%-- 		<tr>
			<c:set var="sum" value="0" />
			<c:set var="all_time" value="0" />
			<c:forEach var="wbsinfoList" items="${wbsinfo.resultlist}">
				<c:set var="all_time"
					value="${(wbsinfoList.end_time - wbsinfoList.start_time - wbsinfoList.rest_time)/100}" />
				<c:set var="sum" value="${sum + all_time}" />
			</c:forEach>
			<th style="background-color: lightblue;">勤務時間合計</th>
			<td><c:out value="${String.format('%.2f',sum)}" />時間</td>
		</tr> --%>

<%-- <c:forEach var="wbs" items="${wbsinfo.resultlist}" varStatus="status">
			<tr>
				<td>
				${wbs.date}
				<c:if test="${status.count == 1 }">
			      	(金)
		   	  	</c:if> 
				<c:if test="${status.count == 2 }">
			      	(土)
		   	  	</c:if> 
				<c:if test="${status.count == 3 }">
			      	(日)
		   	  	</c:if> 
				<c:if test="${status.count == 4 }">
			      	(月)
		   	  	</c:if> 
				<c:if test="${status.count == 5 }">
			      	(火)
		   	  	</c:if> 
				<c:if test="${status.count == 6 }">
			      	(水)
		   	  	</c:if> 
				<c:if test="${status.count == 7 }">
			      	(木)
		   	  	</c:if> 
				</td>
				<td>${wbs.start_time.substring(0,2)}時${wbs.start_time.substring(2,4)}分 </td>
				<td>${wbs.end_time.substring(0,2)}時${wbs.end_time.substring(2,4)}分 </td>
				<td>${String.format("%.2f",(wbs.end_time - wbs.start_time - wbs.rest_time)/100)}</td>
				<td>
				<c:if test="${wbs.vacation_type == 0 }">
			      	
		   	  	</c:if> 
		   	  	<c:if test="${wbs.vacation_type == 1 }">
			      	오전휴가
		   	  	</c:if>
				<c:if test="${wbs.vacation_type == 2 }">
			      	오휴휴가
		   	  	</c:if>
		   	  	<c:if test="${wbs.vacation_type == 3 }">
			      	종일휴가
		   	  	</c:if>
		   	  	<c:if test="${wbs.vacation_type == 4 }">
			      	조퇴
		   	  	</c:if>
				</td>
				<td>${wbs.memo}</td>
			</tr>
		</c:forEach> --%>
