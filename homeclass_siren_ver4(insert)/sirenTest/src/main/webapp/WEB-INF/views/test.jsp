<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>   

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>test</title>
</head>
<body>
	<table>
		<tr>
			<td>아이디</td>
			<td>비밀번호</td>
			<td>이름:</td>
			<td>생일:</td>
			<td>몸무게:</td>
			<td>이메일:</td>
			<td>휴대전화:</td>
			<td>주소:</td>
			<td>혈액형:</td>
			<td>자주가는병원:</td>
			<td>질병명:</td>
			<td>약이름:</td>
		</tr>
		<c:forEach items="${list}" var="user_db">
		<tr>
			<td>${user_db.userid }</td>
			<td>${user_db.user_password }</td>
			<td>${user_db.name }</td>
			<td>${user_db.date_of_birth }</td>
			<td>${user_db.user_weight }</td>
			<td>${user_db.user_email }</td>
			<td>${user_db.tel }</td>
			<td>${user_db.addr }</td>
			<td>${user_db.blood_type }</td>
			<td>${user_db.oft_hospital }</td>
			<td>${user_db.disease_name }</td>
			<td>${user_db.medicament }</td>
		</tr>
		
		</c:forEach>
	</table>
</body>
</html>