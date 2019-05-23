<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>로그인창</title>
</head>
<body>
 
	<form role="form" method="POST">
		<table style="with:50%">
			<tr>
				<td>User ID</td>
				<td><input type="text" name="id"></td>
			</tr>
			
			<tr>
				<td>Password</td>
				<td><input type="password" name="password" /></td>
			</tr>
		</table>
		<button type="submit" class="btn_button">로그인 하기</button>
	</form>
 	
</body>
</html>