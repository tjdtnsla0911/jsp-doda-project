<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ include file="/include/nav.jsp"%>


<!DOCTYPE html>
<html>

<head>
<style>
div { text-align: center; }
h1 {
	margin: 0 0 0.25em;

}
/* Reset Select */
.one{
margin:0 auto; display:flex; justify-content:center;
}
select {
	-webkit-appearance: none;
	-moz-appearance: none;
	-ms-appearance: none;
	appearance: none;
	outline: 0;
	box-shadow: none;
	border: 0 !important;
	background: #2c3e50;
	background-image: none;

}
/* Remove IE arrow */
select::-ms-expand {
	display: none;
	text-align: center;
}
/* Custom Select */
.select {
	position: relative;
	display: flex;
	width: 20em;
	height: 3em;
	line-height: 3;
	background: #2c3e50;
	overflow: hidden;
	border-radius: .25em;

}

select {
	flex: 1;
	padding: 0 .5em;
	color: #fff;
	cursor: pointer;

}
.select::after {
	content: '\25BC';
	position: absolute;
	top: 0;
	right: 0;
	padding: 0 1em;
	background: #34495e;
	cursor: pointer;
	pointer-events: none;
	-webkit-transition: .25s all ease;
	-o-transition: .25s all ease;
	transition: .25s all ease;
}
/* Transition */
.select:hover::after {
	color: #f39c12;
}
</style>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div class="one">
<form action="/doda/doda?cmd=realyserch" method="post">
	<h1>勤務時間</h1>
	<div class="select">
		<select name="time" id="time">
			<option selected disabled>勤務条件</option>
			<option value="1">8時間以下勤務</option>
			<option value="2">8時間勤務</option>
			<option value="3">8~10時間勤務</option>
			<option value="4">10~12時間勤務</option>
			<option value="5">12時間勤務</option>
			<option value="6">24時間勤務</option>
		</select>
	</div>
	<br />

	<div class="select">

		<select name="day" id="day">
			<option selected disabled>休日</option>
			<option value="7">週1日</option>
			<option value="8">週2日</option>
			<option value="9">週3日以上</option>
			<option value="10">休日なし</option>
		</select>
	</div>
	<br />

	<div class="select">

		<select name="school" id="school">
			<option selected disabled>最終学歴</option>
			<option value="11">小学校卒業</option>
			<option value="12">中学校卒業</option>
			<option value="13">高等学校卒業</option>
			<option value="14">大学卒業</option>
			<option value="15">大学院卒業</option>
			<option value="16">学校に行ったことなし</option>
		</select>
	</div>
	<br />
	<div class="select">
		<h1></h1>
		<select name="company" id="slct">
			<option selected disabled>会社規模</option>
			<option value="17">小企業</option>
			<option value="18">中小企業</option>
			<option value="19">大手企業</option>
			<option value="20">スーパー凄い大手企業</option>
		</select>
	</div>
	<br />
	<div class="select">
		<select name="sigoto" id="sigoto">
			<option selected disabled>職種</option>
			<option value="21">営業職</option>
			<option value="22">企画、管理</option>
			<option value="23">事務</option>
			<option value="24">販売、サービス</option>
			<option value="25">専門職</option>
			<option value="26">技術(IT,Web)</option>
			<option value="27">奴隷</option>

		</select>
	</div>
	<br />
	<div class="select">
		<select name="area" id="area">
			<option selected disabled>地域</option>
			<option value="28">北海道</option>
			<option value="29">大阪府</option>
			<option value="30">東京都</option>
			<option value="31">九州</option>
			<option value="32">岩手県</option>
			<option value="33">新潟県</option>
			<option value="34">群馬県</option>
			<option value="35">三重県</option>
			<option value="36">沖縄県</option>
			<option value="37">北朝鮮</option>
		</select>
	</div>
	<br />
	<div class="select">
		<select name="money" id="money">
			<option selected disabled>年給</option>
			<option value="38">200万円から~</option>
			<option value="39">250万円から~</option>
			<option value="40">300万円から~</option>
			<option value="41">350万円から~</option>
			<option value="42">400万円から~</option>
			<option value="43">450万円から~</option>
			<option value="44">500万円から~</option>
			<option value="45">550万円から~</option>
			<option value="46">600万円以上</option>
			<option value="47">年給なし</option>
		</select>
	</div>
	<br />

	<button class="btn btn-primary" width="80" height="40" style="margin-bottom: 3px;"><b>この条件で探してみます</b></button>
	</form>

</div>
</body>
</html>