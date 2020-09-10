<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<!DOCTYPE html>
<html>
<head>
<style type="text/css">

body, html{
	font-family: arial, verdana;
}

header{
	text-align: center;
	padding: 10px;
	background-color:#000;
	color: white;
	margin-bottom: 20px;
}

.page{
	postion: absolute;
	border: solid 1px #000;
	padding: 10px;
	width: 600px;
	height: 400px;
	position: absolute;
	background-color: white;
	display: none;
	-webkit-box-shadow: 1px 3px 2px 0px rgba(50, 50, 50, 0.41);
	-moz-box-shadow:    1px 3px 2px 0px rgba(50, 50, 50, 0.41);
	box-shadow:         1px 3px 2px 0px rgba(50, 50, 50, 0.41);

}
.page:target h1{
	position: relative;
	animation: h1Animation 0.6s;
	-webkit-animation: h1Animation 0.6s;
}

@-webkit-keyframes h1Animation
{
from {
	opacity: 0;
	margin-left: 300px;
}
to {
	opacity: 1;
	margin-left: 0px;
}
}

/* Standard syntax */
@keyframes h1Animation
{
from {
	opacity: 0;
	margin-left: 300px;
}
to {
	opacity: 1;
	margin-left: 0px;
}
}


#page1{
	display: block;
}
#page2:target, #page3:target, #page4:target{
	display: block;
	-webkit-box-shadow: none;
	-moz-box-shadow:    none;
	box-shadow:         none;
}

/*Insert White lines and offset them*/
#page1:before{
	content:"";
	background-color:white;
	display: block;
	width: 110px;
	height: 2px;
	margin-top: -12px;
	position: absolute;
	margin-left: -2px;
}

#page2:before{
	content:"";
	background-color:white;
	display: block;
	width: 110px;
	height: 2px;
	margin-top: -12px;
	position: absolute;
	margin-left: 106px;
}

#page3:before{
	content:"";
	background-color:white;
	display: block;
	width: 110px;
	height: 2px;
	margin-top: -12px;
	position: absolute;
	margin-left: 222px;
}
#page4:before{
	content:"";
	background-color:white;
	display: block;
	width: 110px;
	height: 2px;
	margin-top: -12px;
	position: absolute;
	margin-left: 338px;
}
/*End white lines*/

#tabs{
	margin: 0px;
	padding: 0px;
	list-style:none;
}
#tabs li{
	border-left: solid 1px #000;
	border-right: solid 1px #000;
	border-top: solid 1px #000;
	padding: 5px;
	display: inline-block;
	width: 100px;
}
#tabs a{
	text-decoration: none;
	display: block;
}


h1{
	font-size: 1.5em;
}
</style>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


	<header>
    <h1>관리자 전용 </h1>
    <h4>No javascript</h4>
</header>

<c:set var="suka" value="${fn:length(sukauto)}"></c:set>
<c:choose>

<c:when test="${suka==1}">

<button type="button" onclick="user()">1번 매칭</button>
<input type="hidden" id="username" name="username" value="${sukauto[0].name}">
<input type="hidden" id="age" name="age" value="${sukauto[0].age}">
<input type="hidden" id="sex" name="sex" value="${sukauto[0].sex}">
<input type="hidden" id="wantpay" name="wantpay" value="${sukauto[0].wantpay}">
<input type="hidden" id="nowjob" name="nowjob" value="${sukauto[0].nowjob}">
<input type="hidden" id="nowpay" name="nowpay" value="${sukauto[0].nowpay}">
<input type="hidden" id="userkeireki" name="keireki" value="${sukauto[0].keireki}">
<input type="hidden" id="area" name="area" value="${sukauto[0].area}">
<input type="hidden" id="createdate" name="createdate" value="${sukauto[0].createdate}">
<input type="hidden" id="userid" name="userid" value="${sukauto[0].id}">

</c:when>


<c:when test="${suka==2}">
<button type="button" onclick="user()">1번 매칭</button>
	&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;

	<input type="hidden" id="username" name="username" value="${sukauto[0].name}">
<input type="hidden" id="age" name="age" value="${sukauto[0].age}">
<input type="hidden" id="sex" name="sex" value="${sukauto[0].sex}">
<input type="hidden" id="wantpay" name="wantpay" value="${sukauto[0].wantpay}">
<input type="hidden" id="nowjob" name="nowjob" value="${sukauto[0].nowjob}">
<input type="hidden" id="nowpay" name="nowpay" value="${sukauto[0].nowpay}">
<input type="hidden" id="userkeireki" name="keireki" value="${sukauto[0].keireki}">
<input type="hidden" id="area" name="area" value="${sukauto[0].area}">
<input type="hidden" id="createdate" name="createdate" value="${sukauto[0].createdate}">
<input type="hidden" id="userid" name="userid" value="${sukauto[0].id}">

	<button type="button" onclick="user()">2번 매칭</button>

	<input type="hidden" id="username2" name="username" value="${sukauto[1].name}">
<input type="hidden" id="age2" name="age" value="${sukauto[1].age}">
<input type="hidden" id="sex2" name="sex" value="${sukauto[1].sex}">
<input type="hidden" id="wantpay2" name="wantpay" value="${sukauto[1].wantpay}">
<input type="hidden" id="nowjob2" name="nowjob" value="${sukauto[1].nowjob}">
<input type="hidden" id="nowpay2" name="nowpay" value="${sukauto[1].nowpay}">
<input type="hidden" id="userkeireki2" name="keireki" value="${sukauto[1].keireki}">
<input type="hidden" id="area2" name="area" value="${sukauto[1].area}">
<input type="hidden" id="createdate2" name="createdate" value="${sukauto[1].createdate}">
<input type="hidden" id="userid2" name="userid" value="${sukauto[1].id}">

</c:when>
<c:when test="${suka==3}">
<button type="button" onclick="user()">1번 매칭</button>
	&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;

		<input type="hidden" id="username" name="username" value="${sukauto[0].name}">
<input type="hidden" id="age" name="age" value="${sukauto[0].age}">
<input type="hidden" id="sex" name="sex" value="${sukauto[0].sex}">
<input type="hidden" id="wantpay" name="wantpay" value="${sukauto[0].wantpay}">
<input type="hidden" id="nowjob" name="nowjob" value="${sukauto[0].nowjob}">
<input type="hidden" id="nowpay" name="nowpay" value="${sukauto[0].nowpay}">
<input type="hidden" id="userkeireki" name="keireki" value="${sukauto[0].keireki}">
<input type="hidden" id="area" name="area" value="${sukauto[0].area}">
<input type="hidden" id="createdate" name="createdate" value="${sukauto[0].createdate}">
<input type="hidden" id="userid" name="userid" value="${sukauto[0].id}">



	<button type="button" onclick="user()">2번 매칭</button>
		&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;

			<input type="hidden" id="username2" name="username" value="${sukauto[1].name}">
<input type="hidden" id="age2" name="age" value="${sukauto[1].age}">
<input type="hidden" id="sex2" name="sex" value="${sukauto[1].sex}">
<input type="hidden" id="wantpay2" name="wantpay" value="${sukauto[1].wantpay}">
<input type="hidden" id="nowjob2" name="nowjob" value="${sukauto[1].nowjob}">
<input type="hidden" id="nowpay2" name="nowpay" value="${sukauto[1].nowpay}">
<input type="hidden" id="userkeireki2" name="keireki" value="${sukauto[1].keireki}">
<input type="hidden" id="area2" name="area" value="${sukauto[1].area}">
<input type="hidden" id="createdate2" name="createdate" value="${sukauto[1].createdate}">
<input type="hidden" id="userid2" name="userid" value="${sukauto[1].id}">


		<button type="button" onclick="user()">3번 매칭</button>


	<input type="hidden" id="username3" name="username" value="${sukauto[2].name}">
<input type="hidden" id="age3" name="age" value="${sukauto[2].age}">
<input type="hidden" id="sex3" name="sex" value="${sukauto[2].sex}">
<input type="hidden" id="wantpay3" name="wantpay" value="${sukauto[2].wantpay}">
<input type="hidden" id="nowjob3" name="nowjob" value="${sukauto[2].nowjob}">
<input type="hidden" id="nowpay3" name="nowpay" value="${sukauto[2].nowpay}">
<input type="hidden" id="userkeireki3" name="keireki" value="${sukauto[2].keireki}">
<input type="hidden" id="area3" name="area" value="${sukauto[2].area}">
<input type="hidden" id="createdate3" name="createdate" value="${sukauto[2].createdate}">
<input type="hidden" id="userid3" name="userid" value="${sukauto[2].id}">

</c:when>
<c:when test="${suka==4}">

<button type="button" onclick="user()">1번 매칭</button>
	&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;

			<input type="hidden" id="username" name="username" value="${sukauto[0].name}">
<input type="hidden" id="age" name="age" value="${sukauto[0].age}">
<input type="hidden" id="sex" name="sex" value="${sukauto[0].sex}">
<input type="hidden" id="wantpay" name="wantpay" value="${sukauto[0].wantpay}">
<input type="hidden" id="nowjob" name="nowjob" value="${sukauto[0].nowjob}">
<input type="hidden" id="nowpay" name="nowpay" value="${sukauto[0].nowpay}">
<input type="hidden" id="userkeireki" name="keireki" value="${sukauto[0].keireki}">
<input type="hidden" id="area" name="area" value="${sukauto[0].area}">
<input type="hidden" id="createdate" name="createdate" value="${sukauto[0].createdate}">
<input type="hidden" id="userid" name="userid" value="${sukauto[0].id}">


	<button type="button" onclick="user2()">2번 매칭</button>
		&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;


<input type="hidden" id="username2" name="username" value="${sukauto[1].name}">
<input type="hidden" id="age2" name="age" value="${sukauto[1].age}">
<input type="hidden" id="sex2" name="sex" value="${sukauto[1].sex}">
<input type="hidden" id="wantpay2" name="wantpay" value="${sukauto[1].wantpay}">
<input type="hidden" id="nowjob2" name="nowjob" value="${sukauto[1].nowjob}">
<input type="hidden" id="nowpay2" name="nowpay" value="${sukauto[1].nowpay}">
<input type="hidden" id="userkeireki2" name="keireki" value="${sukauto[1].keireki}">
<input type="hidden" id="area2" name="area" value="${sukauto[1].area}">
<input type="hidden" id="createdate2" name="createdate" value="${sukauto[1].createdate}">
<input type="hidden" id="userid2" name="userid" value="${sukauto[1].id}">


	<button type="button" onclick="user3()">3번 매칭</button>
			&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;

								<input type="hidden" id="username3" name="username" value="${sukauto[2].name}">
<input type="hidden" id="age3" name="age" value="${sukauto[2].age}">
<input type="hidden" id="sex3" name="sex" value="${sukauto[2].sex}">
<input type="hidden" id="wantpay3" name="wantpay" value="${sukauto[2].wantpay}">
<input type="hidden" id="nowjob3" name="nowjob" value="${sukauto[2].nowjob}">
<input type="hidden" id="nowpay3" name="nowpay" value="${sukauto[2].nowpay}">
<input type="hidden" id="userkeireki3" name="keireki" value="${sukauto[2].keireki}">
<input type="hidden" id="area3" name="area" value="${sukauto[2].area}">
<input type="hidden" id="createdate3" name="createdate" value="${sukauto[2].createdate}">
<input type="hidden" id="userid3" name="userid" value="${sukauto[2].id}">

		<button type="button" onclick="user4()">4번 매칭</button>

								<input type="hidden" id="username4" name="username4" value="${sukauto[3].name}">
<input type="hidden" id="age4" name="age" value="${sukauto[3].age}">
<input type="hidden" id="sex4" name="sex" value="${sukauto[3].sex}">
<input type="hidden" id="wantpay4" name="wantpay" value="${sukauto[3].wantpay}">
<input type="hidden" id="nowjob4" name="nowjob" value="${sukauto[3].nowjob}">
<input type="hidden" id="nowpay4" name="nowpay" value="${sukauto[3].nowpay}">
<input type="hidden" id="userkeireki4" name="keireki" value="${sukauto[3].keireki}">
<input type="hidden" id="area4" name="area" value="${sukauto[2].area}">
<input type="hidden" id="createdate4" name="createdate" value="${sukauto[3].createdate}">
<input type="hidden" id="userid4" name="userid" value="${sukauto[3].id}">

</c:when>

<c:when test="${suka==5}">
<button type="button" onclick="user()">1번 매칭</button>
	&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;

	<button type="button" onclick="user()">2번 매칭</button>
		&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		<button type="button" onclick="user()">3번 매칭</button>
			&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		<button type="button" onclick="user()">4번 매칭</button>
			&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		<button type="button" onclick="user()">5번 매칭</button>

</c:when>

</c:choose>
<c:choose>
<c:when test="${suka==0}">
<h1>スカウト申込がございません。</h1>
</c:when>
<c:when test="${suka == 1}">
<ul id="tabs">
    <li><a href="#page1">상담내용1</a></li>
    </ul>
</c:when>

<c:when test="${suka ==2}">
<ul id="tabs">
       <li><a href="#page1">상담내용1</a></li>
    <li><a href="#page2">상담내용2</a></li>
    </ul>
</c:when>

<c:when test="${suka == 3}">
<ul id="tabs">
        <li><a href="#page1">상담내용1</a></li>
    <li><a href="#page2">상담내용2</a></li>
    <li><a href="#page3">상담내용3</a></li>
    </ul>
</c:when>

<c:when test="${suka ==4}">
<ul id="tabs">
    <li><a href="#page1">상담내용1</a></li>
    <li><a href="#page2">상담내용2</a></li>
    <li><a href="#page3">상담내용3</a></li>
    <li><a href="#page4">상담내용4</a></li>
    </ul>
</c:when >
<c:otherwise>
<ul id="tabs">
    <li><a href="#page1">상담내용1</a></li>
    <li><a href="#page2">상담내용2</a></li>
    <li><a href="#page3">상담내용3</a></li>
    <li><a href="#page4">상담내용4</a></li>
    <li><a href="#page5">상담내용5</a></li>
    </ul>

</c:otherwise>

</c:choose>

<c:if test="${suka >= 1}">


    <div id="page1" class="page">
    <h1>${sukauto[0].name}</h1>
  <br /><b>年齢:</b>${sukauto[0].age}
	<br /> <b>性別:</b>${sukauto[0].sex}
	<br /><b>希望年給:</b> ${sukauto[0].wantpay}
	<br /> <b>タイトル:</b>${sukauto[0].nowjob}
	<br /> <b>現在年給:</b>${sukauto[0].nowpay}
	<br /> <b>経歴:</b>${sukauto[0].keireki}
	<br /> <b>地域:</b>${sukauto[0].area}
	<br /> <b>作成日:</b>${sukauto[0].createdate}
	<br /> <b>社員番号:</b>${sukauto[0].id}

</div>
</c:if>


<c:if test="${suka >= 2}">



    <div id="page2" class="page">
    <h1>${sukauto[1].name}</h1>
  <br /><b>年齢:</b>${sukauto[1].age}
	<br /> <b>性別:</b>${sukauto[1].sex}
	<br /><b>希望年給:</b> ${sukauto[1].wantpay}
	<br /> <b>タイトル:</b>${sukauto[1].nowjob}
	<br /> <b>現在年給:</b>${sukauto[1].nowpay}
	<br /> <b>経歴:</b>${sukauto[1].keireki}
	<br /> <b>地域:</b>${sukauto[1].area}
	<br /> <b>作成日:</b>${sukauto[1].createdate}
	<br /> <b>社員番号:</b>${sukauto[1].id}

</div>





</c:if>
<c:if test="${suka >= 3}">


    <div id="page3" class="page">
    <h1>${sukauto[2].name}</h1>
  <br /><b>年齢:</b>${sukauto[2].age}
	<br /> <b>性別:</b>${sukauto[2].sex}
	<br /><b>希望年給:</b> ${sukauto[2].wantpay}
	<br /> <b>タイトル:</b>${sukauto[2].nowjob}
	<br /> <b>現在年給:</b>${sukauto[2].nowpay}
	<br /> <b>経歴:</b>${sukauto[2].keireki}
	<br /> <b>地域:</b>${sukauto[2].area}
	<br /> <b>作成日:</b>${sukauto[2].createdate}
	<br /> <b>社員番号:</b>${sukauto[2].id}
</div>



</c:if>

<c:if test="${suka >= 4}">



    <div id="page4" class="page">
    <h1>${sukauto[3].name}</h1>
  <br /><b>年齢:</b>${sukauto[3].age}
	<br /> <b>性別:</b>${sukauto[3].sex}
	<br /><b>希望年給:</b> ${sukauto[3].wantpay}
	<br /> <b>タイトル:</b>${sukauto[3].nowjob}
	<br /> <b>現在年給:</b>${sukauto[3].nowpay}
	<br /> <b>経歴:</b>${sukauto[3].keireki}
	<br /> <b>地域:</b>${sukauto[3].area}
	<br /> <b>作成日:</b>${sukauto[3].createdate}
	<br /> <b>社員番号:</b>${sukauto[3].id}


</div>

</c:if>

<c:if test="${suka >= 5}">



    <div id="page5" class="page">
    <h1>${sukauto[4].name}</h1>
  <br /><b>年齢:</b>${sukauto[4].age}
	<br /> <b>性別:</b>${sukauto[4].sex}
	<br /><b>希望年給:</b> ${sukauto[4].wantpay}
	<br /> <b>タイトル:</b>${sukauto[4].nowjob}
	<br /> <b>現在年給:</b>${sukauto[4].nowpay}
	<br /> <b>経歴:</b>${sukauto[4].keireki}
	<br /> <b>地域:</b>${sukauto[4].area}
	<br /> <b>作成日:</b>${sukauto[4].createdate}
	<br /> <b>社員番号:</b>${sukauto[4].id}

</div>




</c:if>

<script src="/doda/js/detail.js"></script>
<script src="/doda/js/reply.js"></script>
<script type="text/javascript">


function user(){
	var username = document.getElementById("username").value;
	var age = document.getElementById("age").value;
	var sex = document.getElementById("sex").value;
	var wantpay = document.getElementById("wantpay").value;
	var nowjob = document.getElementById("nowjob").value;
	var nowpay = document.getElementById("nowpay").value;
	var userkeireki = document.getElementById("userkeireki").value;
	var area = document.getElementById("area").value;
	var createdate = document.getElementById("createdate").value;
	var userid = document.getElementById("userid").value;
	alert(username+age+sex+wantpay+nowjob+nowpay+userkeireki+area+createdate+userid)
	setTimeout(function() {
		  location.href="/doda/doda?cmd=gogostart&username="+username+"&age="
		+age+"&sex="+sex+"&wantpay="+wantpay+"&nowjob="+nowjob
		+"&nowpay="+nowpay+"&userkeireki="+userkeireki+"&area="+area
		+"&userid="+userid

		}, 1000);

}
function user2(){
	var username = document.getElementById("username2").value;
	var age = document.getElementById("age2").value;
	var sex = document.getElementById("sex2").value;
	var wantpay = document.getElementById("wantpay2").value;
	var nowjob = document.getElementById("nowjob2").value;
	var nowpay = document.getElementById("nowpay2").value;
	var userkeireki = document.getElementById("userkeireki2").value;
	var area = document.getElementById("area2").value;
	var createdate = document.getElementById("createdate2").value;
	var userid = document.getElementById("userid2").value;
	alert(username+age+sex+wantpay+nowjob+nowpay+userkeireki+area+createdate+userid)
	setTimeout(function() {
		  location.href="/doda/doda?cmd=gogostart&username="+username+"&age="
		+age+"&sex="+sex+"&wantpay="+wantpay+"&nowjob="+nowjob
		+"&nowpay="+nowpay+"&userkeireki="+userkeireki+"&area="+area
		+"&userid="+userid

		}, 1000);

}
function user3(){
	var username = document.getElementById("username3").value;
	var age = document.getElementById("age3").value;
	var sex = document.getElementById("sex3").value;
	var wantpay = document.getElementById("wantpay3").value;
	var nowjob = document.getElementById("nowjob3").value;
	var nowpay = document.getElementById("nowpay3").value;
	var userkeireki = document.getElementById("userkeireki3").value;
	var area = document.getElementById("area3").value;
	var createdate = document.getElementById("createdate3").value;
	var userid = document.getElementById("userid3").value;
	alert(username+age+sex+wantpay+nowjob+nowpay+userkeireki+area+createdate+userid)
	setTimeout(function() {
		  location.href="/doda/doda?cmd=gogostart&username="+username+"&age="
		+age+"&sex="+sex+"&wantpay="+wantpay+"&nowjob="+nowjob
		+"&nowpay="+nowpay+"&userkeireki="+userkeireki+"&area="+area
		+"&userid="+userid

		}, 1000);

}
function user4(){
	var username = document.getElementById("username4").value;
	var age = document.getElementById("age4").value;
	var sex = document.getElementById("sex4").value;
	var wantpay = document.getElementById("wantpay4").value;
	var nowjob = document.getElementById("nowjob4").value;
	var nowpay = document.getElementById("nowpay4").value;
	var userkeireki = document.getElementById("userkeireki4").value;
	var area = document.getElementById("area4").value;
	var userid = document.getElementById("userid4").value;
	alert(username+age+sex+wantpay+nowjob+nowpay+userkeireki+area+createdate+userid)
	setTimeout(function() {
		  location.href="/doda/doda?cmd=gogostart&username="+username+"&age="
		+age+"&sex="+sex+"&wantpay="+wantpay+"&nowjob="+nowjob
		+"&nowpay="+nowpay+"&userkeireki="+userkeireki+"&area="+area
		+"&userid="+userid

		}, 1000);

}


</script>

</body>
</html>