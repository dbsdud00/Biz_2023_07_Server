<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set value="${pageContext.request.contextPath}"  var="rootPath" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="${rootPath}/static/css/home.css" rel="stylesheet">
<link href="${rootPath}/static/css/table.css" rel="stylesheet">
<script>
	// JS 파일에서 rootPath 정보를 사용할 수 있도록 전역(global) 변수로 선언
	var rootPath = "${rootPath}"
</script>
<script src="${rootPath}/static/js/book_detail.js"></script>
<script src="${rootPath}/static/js/user_detail.js"></script>
<script src="${rootPath}/static/js/error.js"></script>
</head>
<body>
	<header>빛고을 Book Rent Management System 2023</header>
	<nav>
		<ul>
			<li><a href="${rootPath}/">도서관리</a></li>
			<li><a href="${rootPath}/user">회원관리</a></li>
			<li><a href="${rootPath}/rent">대출하기</a></li>
		</ul>
	</nav>
	<article>
		<c:if test="${empty BODY}">
			<%@ include file="/WEB-INF/views/book/bookList.jsp"%>
		</c:if>
		<c:if test="${BODY == 'BINSERT'}">
			<%@ include file="/WEB-INF/views/book/bookInsert.jsp"%>
		</c:if>
		<c:if test="${BODY == 'BUPDATE'}">
			<%@ include file="/WEB-INF/views/book/bookDetail.jsp"%>
		</c:if>
		<c:if test="${BODY == 'USERLIST'}">
			<%@ include file="/WEB-INF/views/user/userList.jsp"%>
		</c:if>
		<c:if test="${BODY == 'UINSERT'}">
			<%@ include file="/WEB-INF/views/user/userInsert.jsp"%>
		</c:if>
		<c:if test="${BODY == 'UUPDATE'}">
			<%@ include file="/WEB-INF/views/user/userDetail.jsp"%>
		</c:if>
	</article>
</body>
</html>