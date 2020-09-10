<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="/doda/doda?cmd=kanrihensin" method="post">
<input type="text" id="title" name ="title" size=40><br/><br/>
<textarea rows="11" id="hensin" name="hensin" cols="37"></textarea><br/>

<input type="hidden" id="id" name="id" value="${kaitou.id}"><br/>
<input type="hidden" id="kaitounumber" name="kaitounumber" value="${kaitou.kaitounumber}">
<input type="hidden" id="kanrinumber" name="kanrinumber" value="${kaitou.kanrinumber}">
<input type="hidden" id="kanrititle" name="kanrititle" value="${kaitou.title}">
<input type="submit" value="転送します。">




${kaitou.title}<br/>
${kaitou.kaitounumber}<br/>
${kaitou.kanrinumber}<br/>
</form>
</body>
</html>