<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set value="${pageContext.request.contextPath}"  var="rootPath" />

<form method="POST">
<h1>USER INSERT</h1>
	<div><input placeholder="* 회원코드" name="u_code" ></div>
	<div><input placeholder="* 회원명" name="u_name" ></div>
	<div><input placeholder="전화번호" name="u_tel"></div>
	<div><input placeholder="주소" name="u_addr"></div>
	<div><button>등록하기</button></div>
</form>