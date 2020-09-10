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

<c:forEach var="dodaUserSodans" items="${dodaUserSodans}">
<table id="reply__list" class="media-list">
<tr>
<td>

	<b>作成者:</b>${dodaUserSodans.name}
	<br/>
	<br/>
	</td>
	<td>
	<br /><b>作成者ID:</b> ${dodaUserSodans.name}
	<br /><b>住所:</b>${dodaUserSodans.userid}
	<br /> <b>電話番号:</b>${dodaUserSodans.email}

	<br /> <b>タイトル:</b>${dodaUserSodans.title}
	<br /> <b>作成日:</b>${dodaUserSodans.createdate}
	<br/>
	<br/>${dodaUserSodans.comid}

<br/>


	</td>
</tr>

<tr>
	<td colspan="2">
	<br /><b>相談内容:</b> ${dodaUserSodans.content}<b></b>
	<div style="float: right">
	<button class="btn btn-danger" id="comid" onclick="deleteById(${dodaUserSodans.comid})">削除</button>
	<input type="hidden" id="idid" name="idid" value="${dodausersonasnumber.id}">
	<form action="/doda/doda?cmd=hensinByid&id=${dodaUserSodans.id}&kanriid=${dodausersonasnumber.id}" method="post">
		<button class="btn btn-primary" >返信</button>
		</form>
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