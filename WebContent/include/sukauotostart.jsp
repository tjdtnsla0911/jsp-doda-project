<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<style>
body{
background-image: url('/doda/image/doda.png');
font-size: 13px;

}
div {
	text-align: center;
}
</style>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@ include file="nav.jsp" %>
<br/>
<br/>
<div>
<form action="/doda/doda?cmd=sukautotenso" method="post">
<b>お名前:<input type="text"><br/><br/>
年齢:<input type="text" id="age" name="age"><br/><br/>
性別:<input type="text" id="sex" name="sex"><br/><br/>
希望年給:<input type="text" id="wantpay" name="wantpay" value="万円"><br/><br/>
現在職業:<input type="text" id="nowjob" name="nowjob"><br/><br/>
現在年給:<input type="text" id="nowpay" name="nowpay" value="万円"><br/><br/>
経歴:<input type="text" id="keireki" name="keireki" value="年目"><br/><br/>
会社エリア:<input type="text" id="area" name="area" ><br/><br/></b>
<input type="hidden" id ="id" name="id" value="${prinsipal.id}">
<input type="hidden" id="username" name="username" value="${prinsipal.name}">

  <button type="submit" class="btn btn-primary">転送</button>
</form>
</div>

</body>
</html>