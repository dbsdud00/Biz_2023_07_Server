<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set value="${pageContext.request.contextPath}"  var="rootPath" />

<h1>BOOK INSERT</h1>
<form method="POST">
	<div><input placeholder="* 도서코드" name="b_code" ></div>
	<div><input placeholder="* 도서명" name="b_name" ></div>
	<div><input placeholder="* 저자" name="b_auther"></div>
	<div><input placeholder="출판사" name="b_comp"></div>
	<div><input placeholder="*구입연도" name="b_year"></div>
	<div><input placeholder="구입가격" name="b_iprice"></div>
	<div><input placeholder="* 대여가격" name="b_rprice"></div>
	<div><button>등록하기</button></div>
</form>