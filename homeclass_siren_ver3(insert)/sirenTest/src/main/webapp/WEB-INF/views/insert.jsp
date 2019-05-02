<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page session="false" %>
<html>
<head>
    <title>유저 정보 입력</title>
</head>
<body>
<h1>
    유저 정보 입력
</h1>
    <form role="form" method="POST">
        <div class="createForm">
            <label>ID</label>
            <input type="text" name="userid" class="createForm" placeholder = "아이디">
        </div>
        <div class="createForm">
            <label>이름</label>
            <input type="text" name="name" class="createForm" placeholder = "이름">
        </div>
        <div class="createForm">
            <label>핸드폰</label>
            <input type="text" name="tel" class="createForm" placeholder = "핸드폰 번호">
        </div>
        <div class="createForm">
            <label>주소</label>
            <input type="text" name="addr" class="createForm" placeholder = "주소">
        </div>
        
        <div class="Formfooter">
           	<button type="submit" class="btn_button">작성하기</button>
        </div>   
    </form>
 
    
</body>
</html>

