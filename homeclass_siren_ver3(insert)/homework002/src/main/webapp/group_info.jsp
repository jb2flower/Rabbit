<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ page import="java.sql.*"%>
<%@ page import="kr.ac.dealim.homework002.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd"><html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<br>
	<b><font size ="6" color="gray">�׷쵥���� �Է�</font></b>
	<br>
	<form action ="http://localhost:9090/homework002/group_pro.jsp" accept-charset="utf-8" name = "group_info" method = "get">
		�̸�: <input type="text" name="group_name"><br><br>
		����: <input type="text" name="group_desc"><br><br>
		<button type="submit">����</button>
	</form>
	
	<br><br><br>
	<b><font size ="6" color="gray">���ѵ����� �Է�</font></b>
	<br>
	<form action ="http://localhost:9090/homework002/permission_pro.jsp" accept-charset="utf-8" name = "permission_info" method = "get">
		�̸�: <input type="text" name="permission_name"><br><br>
		����: <input type="text" name="permission_desc"><br><br>
		<button type="submit">����</button>
	</form>
	
</body>
</html>