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
	<b><font size="6" color="gray">그룹 데이터 입력 완료</font></b>
	<%
	Connection conn = null;
	Statement stmt = null;
	ResultSet rs = null;
	String query = "INSERT INTO GROUPS (SEQ_GROUPS,NAME,DESCR) VALUES (seq_groups.NEXTVAL,UPPER('"+request.getParameter("group_name")+"'),'"+request.getParameter("group_desc")+"')";
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
