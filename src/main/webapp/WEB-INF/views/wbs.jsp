<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<html>

<head>
	<title>KIM SCHOOL || WBS</title>
</head>
<body>

<h3>사원번호 : ${resultA.get(0).u_no}</h3>
<h3>이름 : ${resultA.get(0).name}</h3>
<h3>근무일수 : ${resultB.size()}</h3>
<h3>근무시간 : ${((resultB.get(0).end_time-resultB.get(0).start_time-resultB.get(0).rest_time)+(resultB.get(1).end_time-resultB.get(1).start_time-resultB.get(1).rest_time))/100}</h3>

<table border="1">
	<tr>
		<td colspan="3">근무처 : ${resultC.get(0).wp_name}</td>
		<td>최소 : ${resultC.get(0).min_time}시간 </td>
		<td>최대 : ${resultC.get(0).max_time}시간 </td>
		<td colspan="2"></td>
	</tr>
   <tr style="background-color: lightblue">
      <th>일자</th><th>근무형태</th><th>출근시간</th><th>퇴근시간</th><th>휴계시간</th><th>총합시간</th><th>비고</th>
   </tr>
   
   <tr>
      <td>${resultB.get(0).date}</td>
      <td>
      	<c:if test="${resultB.get(0).vacation_type == 0 }">
	      	출근
   	  	</c:if>
      	<c:if test="${resultB.get(0).vacation_type == 1 }">
	      	휴무
   	  	</c:if>
      </td>
      <td>${resultB.get(0).start_time}</td>
      <td>${resultB.get(0).end_time}</td>
      <td>${resultB.get(0).rest_time}</td>
      <td>
	      <c:if test="${resultB.get(0).end_time != 0 }">
	      	${(resultB.get(0).end_time-resultB.get(0).start_time-resultB.get(0).rest_time)/100}
	   	  </c:if>
      </td>
      <td>${resultB.get(0).memo}</td>
   </tr>
   <tr>
      <td>${resultB.get(1).date}</td>
      <td>
      	<c:if test="${resultB.get(1).vacation_type == 0 }">
	      	출근
   	  	</c:if>
      	<c:if test="${resultB.get(1).vacation_type == 1 }">
	      	휴무
   	  	</c:if>
      </td>
      <td>${resultB.get(1).start_time}</td>
      <td>${resultB.get(1).end_time}</td>
      <td>${resultB.get(1).rest_time}</td>
      <td>
	      <c:if test="${resultB.get(1).end_time != 0 }">
	      	${(resultB.get(1).end_time-resultB.get(1).start_time-resultB.get(1).rest_time)/100}
	   	  </c:if>
      </td>
      <td>${resultB.get(1).memo}</td>
   </tr>
</table>

<br><br><a href ="/manage">홈으로</a>

</body>
</html>