<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<p>�Է����� �Է��ϱ�</p>
	<form action ="http://localhost:8080/project00005/myinfo_pro4.jsp" accept-charset="utf-8" name = "myinfo" method = "get">
		�̸�: <input type="text" name="name"><br><br>
		��й�ȣ: <input type="password" name="pass"><br><br>
		����: <select name="age">
   				 	<option value="10's">10��</option>
   					<option value="20's">20��</option>
    				<option value="30's">30��</option>
    				<option value="more than 40">40�� �̻�</option>
			</select><br><br>
		����: <input type="radio" name="sex" value="male">����<input type="radio" name="sex" value="female">����<br><br>
		���ɺо�: <select name="interest">
   				 	<option value="com">��ǻ��</option>
   					<option value="sports">�ڵ���</option>
    				<option value="other">��Ÿ</option>
			</select><br><br>
		��Ÿ�ǰ�: <input type="text" name="opinion"><br><br>
		<button type="submit">������ ����</button>
	</form>
</body>
</html>