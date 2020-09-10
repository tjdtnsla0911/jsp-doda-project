<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<style>
table, th, td {
	border-radius: 8%;
	border: 3px solid #73AD21;
	font: #38B6E8;
	text-align: center;
	height: 130px;
	width: 600px;
	margin-left: auto;
	margin-right: auto;
}


</style>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@ include file="/include/nav.jsp"%>

<c:forEach var="henji" items="${henji}">
<table id="reply__list" class="media-list">
<tr>
<td>

	<br /><b>タイトル:</b> ${henji.title}
	<br /><b>内容:</b>${henji.hensin}
	<br /> <b>社員番号:</b>${henji.id}
	<br /><b>会員番号:</b> ${henji.kaitounumber}
	<br /> <b>タイトル:</b>${henji.kanrinumber}
	<br /> <b>作成日:</b>${henji.kanrititle}



	<div style="float: right">

	</div>
	</td>
</tr>
	</table>
	<br/>
	<br/>
	<br/>
	</c:forEach>

<script src="/doda/js/detail.js"></script>
<script src="/doda/js/reply.js"></script>
</body>
</html>