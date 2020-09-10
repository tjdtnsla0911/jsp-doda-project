r<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<%@ include file="/include/nav.jsp"%>
<title>Insert title here</title>
<style type="text/css">
table, th, td {
	border-radius: 8%;
	border: 3px solid blue;
	font: #38B6E8;
}

table {
	width: 914px;
}
></style>
</head>
<body>

<c:forEach var="dodasavemykaishas" items="${dodasavemykaishas}">
<table id="reply__list" class="media-list">
<tr>
<td>

	<b>作成者:</b>${dodasavemykaishas.kaishaname}
	<br/>
	<br/>
	</td>
	<td>
	<br /><b>作成者ID:</b> ${dodasavemykaishas.job}
	<br /><b>作成者ID:</b> ${dodasavemykaishas.userid}
	<br /><b>住所:</b>${dodasavemykaishas.pay}
	<br /> <b>電話番号:</b>${dodasavemykaishas.area}
	<br /><b>サーブした時間:</b> ${dodasavemykaishas.time}
	<br /> <b>タイトル:</b>${dodasavemykaishas.createdate}
	<br /> <b>作成日:</b>${dodasavemykaishas.img}
<form action="/doda/doda?cmd=powercompany" method="post">
<input type="hidden" id="job" name ="job" value="${dodasavemykaishas.job}">
<input type="hidden" id="area" name ="area" value="${dodasavemykaishas.area}">
<input type="hidden" id="pay" name ="pay" value="${dodasavemykaishas.pay}">
<input type="hidden" id="id" name="id" value="${dodasavemykaishas.userid }">
		<button class="btn btn-primary" width="80" height="40" style="margin-bottom: 3px; float: right;">この会社に志望します</button>
</form>
	</td>
	</tr>
	</table>
	</c:forEach>

</body>
</html>