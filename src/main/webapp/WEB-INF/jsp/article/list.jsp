<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
 <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
 <%@ page import = "java.util.*" %>
 <%@ page import = "com.example.boardex.dto.Article" %>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>�Խù� ����Ʈ</title>
</head>
<body>
	<h1>�Խù� ����Ʈ �Դϴ�.</h1>
		
	<h2>v2</h2>
	
	<c:forEach items = "${list}" var="article">
		<section>
			��ȣ : ${article.id}
			, ���� : ${article.subject}	
		</section>
		<hr>
	</c:forEach>
	
</body>
</html>