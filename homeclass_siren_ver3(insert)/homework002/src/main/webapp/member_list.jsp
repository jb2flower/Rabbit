<%@page import="kr.ac.dealim.homework002.DBConnection"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ page import="java.sql.*"%>
<%@ page import="kr.ac.dealim.homework002.*"%>
<%
	Connection conn = null;
	Statement stmt = null;
	ResultSet rs = null;
	String query = "INSERT INTO MEMBERS (SEQ_MEMBERS,ID, PASSWORD,NAME,GENDER,BIRTHYY,BIRTHMM,BIRTHDD,EMAIL,PHONE,ADDRESS) VALUES (seq_members.NEXTVAL,'"+request.getParameter("id")+"','"+request.getParameter("pass_ok")+"','"+request.getParameter("name")+"','"+request.getParameter("sex")+"','"+request.getParameter("birth_year")+"','"+request.getParameter("birth_month")+"','"+request.getParameter("birth_day")+"','"+request.getParameter("email_id")+"@"+request.getParameter("email")+"','"+request.getParameter("phone")+"','"+request.getParameter("addrs")+"')";
	try{
		conn = DBConnection.getDBConn();
		stmt = conn.createStatement();
		rs = stmt.executeQuery(query);
		rs = stmt.executeQuery("SELECT seq_members,id,name,gender,email,phone,address FROM members");
		
		%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>회원정보</title>
</head>
<body>
	<%String birth=request.getParameter("birth_year")+request.getParameter("birth_month")+request.getParameter("birth_day");%>
	<br>
	<b><font size="6" color="gray">입력된 회원정보</font></b>
	<br>
	<table>
		<tr>
			<td>아이디:</td>
			<td><%=request.getParameter("id") %></td>
		</tr>
		<tr>
			<td>비밀번호:</td>
			<td><%=request.getParameter("pass_ok") %></td>
		</tr>
		<tr>
			<td>이름:</td>
			<td><%=request.getParameter("name") %></td>
		</tr>
		<tr>
			<td>나이:</td>
			<td><%=request.getParameter("age") %></td>
		</tr>
		<tr>
			<td>성별:</td>
			<td><%=request.getParameter("sex") %></td>
		</tr>
		<tr>
			<td>생일:</td>
			<td><%=birth%></td>
		</tr>
		<tr>
			<td>이메일:</td>
			<td><%=request.getParameter("email_id") %>@<%=request.getParameter("email") %></td>
		</tr>
		<tr>
			<td>휴대전화:</td>
			<td><%=request.getParameter("phone") %></td>
		</tr>
		<tr>
			<td>주소:</td>
			<td><%=request.getParameter("addrs") %></td>
		</tr>

	</table>
	<b><font size="6" color="gray">가입된 회원정보 (LIST)</font></b>
	<table>
		<thead>
			<tr>
				<th scope="col">순번</th>
				<th scope="col">아이디</th>
				<th scope="col">이름</th>
				<th scope="col">성별</th>
				<th scope="col">이메일</th>
				<th scope="col">휴대폰</th>
				<th scope="col">주소</th>
			</tr>
		</thead>
		<tbody>
			<%
				while(rs.next()){
			%>
			<tr>
				<td><%=rs.getString(1)%></td>
				<td><%=rs.getString(2)%></td>
				<td><%=rs.getString(3)%></td>
				<td><%=rs.getString(4)%></td>
				<td><%=rs.getString(5)%></td>
				<td><%=rs.getString(6)%></td>
				<td><%=rs.getString(7)%></td>
			</tr>
			<%} %>
		</tbody>
	</table>
</body>
</html>
<%}catch (Exception e){
	e.printStackTrace();
	} finally{
		try{
			rs.close();
			stmt.close();
			conn.close();
		}catch(Exception e){
		}
	} %>