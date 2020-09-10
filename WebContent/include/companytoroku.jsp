<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
	<%@ include file="/include/nav.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
div { text-align: center; }
body{
background-image: url('/doda/image/dodakaki.png');
}
</style>
</head>
<body>
<div>

	<a href="/doda/doda?cmd=home"> <img src="/doda/image/dodasaiyou.png" width="1150" height="320"></a>
	<br/>
		<form action="/doda/doda?cmd=companytoroku" method="post" enctype="multipart/form-data">

	<br/>

	<b>会社名: <input type="text" id="kaishaname" name="kaishaname" ><br/><br/>
	<!-- --------------------------------------------------- -->
	給料: <input type="radio" name="pay" value="200万円から~" >200万円から~
	<input type="radio" name="pay" value="250万円から~" >250万円から~<br/>
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	<input type="radio" name="pay" value="300万円から~" >300万円から~
	<input type="radio" name="pay" value="350万円から~" >350万円から~<br/>
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	<input type="radio" name="pay" value="400万円から~" >400万円から~
	<input type="radio" name="pay" value="450万円から~" >450万円から~<br/>
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	<input type="radio" name="pay" value="500万円から~" >500万円から~
	<input type="radio" name="pay" value="550万円から~" >550万円から~<br/>
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	<input type="radio" name="pay" value="600万円以上" >600万円以上
	<input type="radio" name="pay" value="年給なし" >年給なし
	<!-- --------------------------------------------------- -->

	<br/><br/>
	設立年度: <input type="text" id="since" name="since"  value="年　　月　　日"><br/><br/>

		<!-- --------------------------------------------------- -->
	在職員:<input type="text" id="peoples" name="peoples" value="人"><br/><br/>
		<!-- --------------------------------------------------- -->
	職務: <input type="radio" name="job" value="営業職" >営業職
	<input type="radio" name="job" value="企画、管理" >企画、管理<br/>
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	<input type="radio" name="job" value="事務" >事務
	<input type="radio" name="job" value="販売、サービス" >販売、サービス<br/>
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	<input type="radio" name="job" value="専門職" >専門職
	<input type="radio" name="job" value="技術(IT,Web)" >技術(IT,Web)
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		<input type="radio" name="job" value="奴隷" >奴隷
	<!-- --------------------------------------------------- -->
	<br/>
	募集人数: <input type="text" id="people" name="people" value="人" ><br/><br/>
		<!-- --------------------------------------------------- -->
	エリア: <input type="radio" name="area" value="北海道" >北海道
	<input type="radio" name="area" value="大阪府" >大阪府<br/>
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	<input type="radio" name="area" value="東京都" >東京都
	<input type="radio" name="area" value="九州" >九州<br/>
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	<input type="radio" name="area" value="岩手県" >岩手県
	<input type="radio" name="area" value="新潟県" >新潟県<br/>
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	<input type="radio" name="area" value="群馬県" >群馬県
	<input type="radio" name="area" value="三重県" >三重県<br/>
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		<input type="radio" name="area" value="北朝鮮" >北朝鮮<br/>
	<input type="radio" name="area" value="沖縄県" >沖縄県<br/><br/>
	<!-- ---------------------------------------------- -->
	勤務条件:<input type="radio" name="time" value="8時間以下勤務" >8時間以下勤務<br/>
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	<input type="radio" name="time" value="8時間以下勤務" >8時間以下勤務"
	<input type="radio" name="time" value="8時間勤務" >8時間勤務<br/>
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	<input type="radio" name="time" value="8~10時間勤務" >8~10時間勤務
	<input type="radio" name="time" value="10~12時間勤務" >10~12時間勤務<br/>
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	<input type="radio" name="time" value="12時間勤務" >12時間勤務
	<input type="radio" name="time" value="24時間勤務" >24時間勤務<br/><br/>
		<!-- ---------------------------------------------- -->


	休日:<input type="radio" name="day" value="週1日" >週1日<br/>
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	<input type="radio" name="day" value="週2日" >週2日
	<input type="radio" name="day" value="週3日以上" >週3日以上<br/>
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	<input type="radio" name="day" value="休日なし" >休日なし<br/><br/>
		<!-- ---------------------------------------------- -->

	最終学歴:<input type="radio" name="school" value="小学校卒業" >小学校卒業<br/>
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	<input type="radio" name="school" value="中学校卒業" >中学校卒業
	<input type="radio" name="school" value="高等学校卒業" >高等学校卒業<br/>
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	<input type="radio" name="school" value="大学卒業" >大学卒業
	<input type="radio" name="school" value="大学院卒業" >大学院卒業<br/>
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	<input type="radio" name="school" value="学校に行ったことなし" >学校に行ったことなし<br/><br/>

	<!-- ---------------------------------------------- -->
	会社規模:<input type="radio" name="company" value="小企業" >小企業<br/>
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	<input type="radio" name="company" value="中小企業" >中小企業
	<input type="radio" name="company" value="大手企業" >大手企業<br/>
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	<input type="radio" name="company" value="スーパー凄い大手企業" >スーパー凄い大手企業<br/><br/>
	<!-- ---------------------------------------------- -->
	<input type="file" id="userProfile" name="img">写真登録<br/><br/>
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	<textarea rows="10" cols="50" id="introduction" name="introduction" placeholder="ここに貴社の紹介したい事とお書きになりたい事をお書きください"></textarea>
	<br/><br/>
	&nbsp;&nbsp;&nbsp;<button>上記のすべてを転送します。</button></b>
	</form>

</div>
</body>
</html>