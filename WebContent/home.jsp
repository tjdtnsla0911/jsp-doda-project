<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
select {
	width: 160px; /* 원하는 너비설정 */
	padding: .10em .10em; /* 여백으로 높이 설정 */
	font-family: inherit; /* 폰트 상속 */
	background:
		url(https://farm1.staticflickr.com/379/19928272501_4ef877c265_t.jpg)
		no-repeat 95% 50%; /* 네이티브 화살표 대체 */
	border: 1px solid #999;
	border-radius: 0px; /* iOS 둥근모서리 제거 */
	-webkit-appearance: none; /* 네이티브 외형 감추기 */
	-moz-appearance: none;
	appearance: none;
}

table, th, td {
	border-radius: 8%;
	border: 3px solid #73AD21;
	font: #38B6E8;
}

table {
	width: 914px;
}
</style>
</head>
<body>
	<%@ include file="/include/nav.jsp"%>

	<a href="/doda/doda?cmd=home"> <img src="dodaHome.png" width="931" height="320">
	</a>
	<br>
	<!--  <div style="text-align: center;">-->
	&nbsp;&nbsp;&nbsp;

	<c:choose>
		<c:when test="${empty sessionScope.prinsipal}">
			<%@ include file="/login/login.jsp"%>
		</c:when>
		<c:otherwise>
	<%@ include file="/login/logins.jsp"%>
		</c:otherwise>
	</c:choose>


	&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;
	<form action="/doda/doda?cmd=company" method="post">
		&nbsp;&nbsp;&nbsp;<select id="se1" name="se1">
			<option value="1">職業</option>
			<option value="2">営業職</option>
			<option value="3">企画、管理</option>
			<option value="4">事務</option>
			<option value="5">販売、サービス</option>
			<option value="6">専門職</option>
			<option value="7">技術(IT,Web)</option>
			<option value="28">奴隷</option>
		</select> &nbsp;&nbsp;&nbsp; <b>X</b>&nbsp;&nbsp;&nbsp; <select id="se2" name="se2">
			<option value="8">勤務地</option>
			<option value="9">北海道</option>
			<option value="10">大阪府</option>
			<option value="11">東京都</option>
			<option value="12">九州</option>
			<option value="13">岩手県</option>
			<option value="14">新潟県</option>
			<option value="15">群馬県</option>
			<option value="16">三重県</option>
			<option value="17">沖縄県</option>
			<option value="29">北朝鮮</option>
		</select> &nbsp;&nbsp;&nbsp; <b>X</b>&nbsp;&nbsp;&nbsp; <select id="se3" name="se3">
			<option value="18" >年給</option>
			<option value="19">200万円から~</option>
			<option value="20">250万円から~</option>
			<option value="21">300万円から~</option>
			<option value="22">350万円から~</option>
			<option value="23">400万円から~</option>
			<option value="24">450万円から~</option>
			<option value="25">500万円から~</option>
			<option value="26">550万円から~</option>
			<option value="27">600万円以上</option>
			<option value="30">年給なし</option>

		</select> &nbsp;&nbsp;

		<button class="btn btn-primary" width="40" height="32" style="margin-bottom: 3px;">
			<b>転送</b>
		</button>
		<a href="/doda/doda?cmd=pr"><img alt="" src="/doda/image/pr.png" width="238" height="100"></a>
		<input type="hidden" id="useridss" name="useridss" value="${sessionScope.prinsipal.id}">
	</form>

	<br>
	<br>

	<table height="200">
		<tr>
			<td><b><span style="color: #73AD21"><a href="/doda/doda?cmd=maching">希望条件にマッチした求人</a></span></b></td>
			<td><b><span style="color: #73AD21"><a href="/doda/doda?cmd=random">会社ランダムマッチ</a></span></b></td>
		</tr>
		<tr>
			<td><b><span style="color: #73AD21"><a href="/doda/doda?cmd=kanren">関連サイト</a></span></b></td>
			<td><b><span style="color: #73AD21"><a href="/doda/doda?cmd=hozon&id=${sessionScope.prinsipal.id}">保存した検索条件</a></span></b></td>
		</tr>
	</table>
	<c:choose>
	<c:when test="${sessionScope.prinsipal.style eq '管理者'}">
	<a href="/doda/doda?cmd=hoan"><img alt="" src="/doda/image/hoan.png" width="170"  border="5" height="180" align="right"></a>
	</c:when>
	</c:choose>

	<br />
	<p style="font-size: 20px;">
		<b>東京都</b>
	</p>




	<!--  </div>-->



</body>
</html>