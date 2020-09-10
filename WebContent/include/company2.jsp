<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
<style>
table, th, td {
	border-radius: 8%;
	border: 3px solid #73AD21;
	font: #38B6E8;
}
div { text-align: center; }

</style>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%@ include file="/include/nav.jsp"%>
	<p style="font-size: 24px;">
		<b><h1>求人情報の検索結果一覧</h1></b>
	</p>

<h4>計 <span style="color: blue">${fn:length(dodaKaisha)}件</span>の会社が発見されました</h4>
	<c:choose>
	<c:when test="${!empty dodaKaisha}">

	<c:forEach var="dodaKaisha" items="${dodaKaisha}">
<table>
<tr>
<td>
	<b>会社名:</b>${dodaKaisha.kaishaname}
	<br/>
	<img style="border-radius: 20px" src="${dodaKaisha.img}" width="40px" height="40px" />
	<b>勤務タイプ:</b>${dodaKaisha.time}<br/>
	<b>志望学歴:</b>${dodaKaisha.school}<br/>
	<b>会社規模:</b>${dodaKaisha.company}<br/>
	<b> 登録日:</b>${dodaKaisha.createdate}<br/>
	<br/>

	</td>
	<td>
	<br /><b>年給:</b> ${dodaKaisha.pay}
	<br /><b>在職員:</b>${dodaKaisha.peoples}
	<br /> <b>設立年度:</b>${dodaKaisha.since}
	<br /><b>職務:</b> ${dodaKaisha.job}
	<br /> <b>会社位置:</b>${dodaKaisha.area}
	<br /><b>募集人数:</b> ${dodaKaisha.people}<b>人</b>
	</td>
</tr>
<tr>
	<td colspan="2">
	<br /> <b>会社紹介:</b>${dodaKaisha.introduction}
	<br/>
	<br/>



</tr>
	</table>
	<br/>
	<br/>
	<br/>
</c:forEach>
</c:when>
<c:otherwise>
<div>
<img alt="" src="/doda/image/job.png" width="450" height="400">
<br/>
<br/>
<p style="font-size: 20px;"><b>条件に合う会社を探してみたが、</b></p><br/>
<p style="font-size: 20px;"><b>お客様のご希望の情報が見つかりませんでした。</b></p><br/>
<p style="font-size: 20px;"><b>早いうちにお客様のご希望の会社を</b></p><br/>
<p style="font-size: 20px;"><b>探せる<span style="color: blue; ">Doda</span>になるように頑張ります。</b></p><br/>
</div>
</c:otherwise>

	</c:choose>


</body>
<script src="${path}/js/juso.js"></script>
<script src="${path}/js/join.js"></script>
</html>