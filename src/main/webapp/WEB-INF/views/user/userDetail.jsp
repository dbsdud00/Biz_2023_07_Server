<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set value="${pageContext.request.contextPath}"  var="rootPath" />

<h1>USER DETAIL</h1>
<form method="POST">
	<div><label>도서코드</label><input placeholder="* 도서코드" name="u_code" value = "${USER.u_code}" readonly></div>
	<div><label>도서명</label><input placeholder="* 도서명" name="u_name"  value = "${USER.u_name}" ></div>
	<div><label>저자</label><input placeholder="* 저자" name="u_tel" value = "${USER.u_tel}" ></div>
	<div><label>출판사</label><input placeholder="출판사" name="u_addr" value = "${USER.u_addr}" ></div>
	<div><button>등록하기</button></div>
</form>