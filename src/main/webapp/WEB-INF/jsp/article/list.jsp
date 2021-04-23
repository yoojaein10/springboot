<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
 <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
 <%@ page import = "java.util.*" %>
 <%@ page import = "com.example.boardex.dto.Article" %>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>게시물 리스트</title>
</head>
<body>
	<h1>게시물 리스트 입니다.</h1>
		
	<h2>v2</h2>
	
	<c:forEach items = "${list}" var="article">
		<section>
			번호 : ${article.id}
			, 제목 : ${article.subject}	
		</section>
		<hr>
	</c:forEach>
	
</body>
</html>