<%@page import="kr.ac.dealim.homework002.DBConnection"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ page import="java.sql.*"%>
<%@ page import="kr.ac.dealim.homework002.*"%>


		
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<b><font size="6" color="gray">권한 데이터 입력 완료</font></b>
	<%
	Connection conn = null;
	Statement stmt = null;
	ResultSet rs = null;
	String query = "INSERT INTO PERMISSIONS (SEQ_PERMISSIONS,NAME,DESCR) VALUES (SEQ_PERMISSIONS.NEXTVAL,UPPER('"+request.getParameter("permission_name")+"'),'"+request.getParameter("permission_desc")+"')";
	try{
		conn = DBConnection.getDBConn();
		stmt = conn.createStatement();
		rs = stmt.executeQuery(query);
		}catch (Exception e){
	e.printStackTrace();
	} finally{
		try{
			rs.close();
			stmt.close();
			conn.close();
		}catch(Exception e){
		}
	} %>
</body>
</html>
