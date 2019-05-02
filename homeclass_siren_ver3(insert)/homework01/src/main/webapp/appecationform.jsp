<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<p>입력정보 입력하기</p>
	<form action ="http://localhost:8080/project00005/myinfo_pro4.jsp" accept-charset="utf-8" name = "myinfo" method = "get">
		이름: <input type="text" name="name"><br><br>
		비밀번호: <input type="password" name="pass"><br><br>
		나이: <select name="age">
   				 	<option value="10's">10대</option>
   					<option value="20's">20대</option>
    				<option value="30's">30대</option>
    				<option value="more than 40">40대 이상</option>
			</select><br><br>
		성별: <input type="radio" name="sex" value="male">남자<input type="radio" name="sex" value="female">여자<br><br>
		관심분야: <select name="interest">
   				 	<option value="com">컴퓨터</option>
   					<option value="sports">핸드폰</option>
    				<option value="other">기타</option>
			</select><br><br>
		기타의견: <input type="text" name="opinion"><br><br>
		<button type="submit">데이터 전송</button>
	</form>
</body>
</html>