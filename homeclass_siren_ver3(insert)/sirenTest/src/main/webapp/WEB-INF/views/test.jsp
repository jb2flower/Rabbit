<<<<<<< HEAD
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
	<c:forEach items="${list}" var="user_db">
	id = ${user_db.userid }<br>
	name = ${user_db.name}<br>
	tel = ${user_db.tel }<br>
	addr = ${user_db.addr }<br>
	</c:forEach>
</body>
=======
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
	<c:forEach items="${list}" var="user_db">
	id = ${user_db.userid }<br>
	name = ${user_db.name}<br>
	tel = ${user_db.tel }<br>
	addr = ${user_db.addr }<br>
	</c:forEach>
</body>
>>>>>>> 3d7f0d00237b3cbfd5e754bbf7676b2b0da9e90c
</html>