<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	단어: <input type="text" disabled value=${inWord }>
 	뜻:  <input type="text" disabled value=${inMeaning }>
 	<br>
	<a href="<%=request.getContextPath()%>/word">돌아가기</a>
</body>
</html>