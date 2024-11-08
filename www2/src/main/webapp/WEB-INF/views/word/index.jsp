<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>단어장</h2>
	<br>
	<h3>단어추가</h3>
	<form action="input" method="get">
		<input type="text" name="inputWord" placeholder="단어를 입력">
		<input type="text" name="inputMeaning" placeholder="뜻을 입력">
		<input type="submit" value="입력">
	</form>
	<br><br>
	<h3>단어검색</h3>
	<form action="search" method="get">
		<input type="text" name="word" placeholder="검색어를 입력하세요">
		<input type="submit" value="검색"><br><br>
	</form>
	<br><br>
	<h3>단어삭제</h3>
	<form action="delete" method="get">
		<input type="text" name="delWord" placeholder="삭제할 단어를 입력하세요">
		<input type="submit" value="삭제">
	</form>
	<br><br>
	
	<form>
		
	</form>
</body>
</html>