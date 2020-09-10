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
body{
background-image: url("/doda/image/random.jpg");
}
</style>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%@ include file="/include/nav.jsp"%>
	<p style="font-size: 24px;">
		<b><h1>求人情報の検索結果一覧</h1></b>
	</p>


	<c:choose>
	<c:when test="${!empty dodaKaisha}">


<audio autoplay loop  id="playAudio">
      <source src="/doda/image/youtube.mp3" type="audio/mp3">
      </audio>


<table>
<tr>
<td>
	<b>会社名:</b>${dodaKaisha.kaishaname}<br/>


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
	<button class="btn btn-primary" width="80" height="40" style="margin-bottom: 3px; float: right;">この会社に志望します</button>
	</td>
</tr>
	</table>
	<br/>
	<br/>
	<br/>

</c:when>
<c:otherwise>
<div>

<br/>
<br/>
<p style="font-size: 20px;"><b>ランダムで会社を探してみましたが、</b></p><br/>
<p style="font-size: 20px;"><b>今回はランダムで会社を見つけられませんでした。</b></p><br/>
<p style="font-size: 20px;"><b>お客様の運をもう一度試してみるのはどうですか?</b></p><br/>
<p style="font-size: 20px;"><b><span style="color: blue; "><a href="/doda/doda?cmd=random">ランダムでもう一度探す</a></span></b></p><br/>
</div>
</c:otherwise>

	</c:choose>


</body>
</html>