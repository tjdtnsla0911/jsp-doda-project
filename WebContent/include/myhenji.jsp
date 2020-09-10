<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
    <%@ include file="/include/nav.jsp"%>

<!DOCTYPE html>
<html>
<head>

<style>
@import url(https://fonts.googleapis.com/css?family=Amatic+SC:700);

body{
    text-align: center;
}
h1{
    font-family: 'Amatic SC', cursive;
    font-weight: normal;
    color: #8ac640;
    font-size: 2.5em;
}
div {
	text-align: center;
}

#sprite{
    width: 257px;
    height: 186px;
    background: url('http://www.studiogj.nl/codepen/sprite/sprite.jpg') left center;
    margin: 0 auto;
    margin-top: 50px;
    animation: sprite 1s steps(8) infinite;
    -webkit-animation: sprite 1s steps(8) infinite;
}
@keyframes sprite {
    100% { background-position: -2056px; }
}
@-webkit-keyframes sprite {
    100% {background-position: -2056px; }
}
#test {

    float: right;

    position: relative;

    left: -46%;

}


</style>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div>
<h4>計 <span style="color: blue">${fn:length(dodaKaitou)}件</span>の返信が発見されました</h4>
<h1>管理者の回答です</h1>
<div id="sprite"></div>
<c:set var="plus" value="0" />
<c:forEach var="dodaKaitou" items="${sessionScope.dodaKaitou}">

<div class="sentaku" id="${sessionScope.dodaKaitou[plus].kaitounumber}">

<textarea rows="13" cols="40">

作成管理者  : ${sessionScope.dodaKaitou[plus].name}
タイトル : ${sessionScope.dodaKaitou[plus].title}
返信:${sessionScope.dodaKaitou[plus].createdate}


${sessionScope.dodaKaitou[plus].hensin}



<c:set var="plus" value="${plus+ 1}"/>

</textarea>
<center>
<input type="hidden" id="number2" name="number2" value="${sessionScope.dodaKaitou[plus].id}">
<input type="hidden" id="number" name="number" value="${sessionScope.dodaKaitou[plus].kaitounumber}">
 <a href="javascript:popupOpen(${sessionScope.dodaKaitou[plus].kaitounumber},${sessionScope.dodaKaitou[plus].kanrinumber});">
 <button type="button" class="btn btn-warning float-right"  id="test">답장하기</button></a>
 <button type="button" class="btn btn-warning" id="ok" onclick="okok()" id="test">삭제하기</button>
     </center>

     </div>
<br/>
<br/>


</c:forEach>
</div>

</body>
<script src="${path}/js/juso.js"></script>
<script src="${path}/js/join.js"></script>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script>

function okok(){
	var number=$('#number').val();
alert(number);
var number2=$('#number2').val();
	$.ajax({
		type: "POST",
		url: "/doda/doda?cmd=deletetegami&number="+number,
		dataType: "text"
	}).done(function(result){
		console.log(result);
		if(result == 1){
			alert("삭제 성공");
			$("#ok").remove();//여기서지우고

			location.href="/doda/doda?cmd=kaitokanri&id="+number2;
		}else{
			alert("삭제 실패");
		}
	}).fail(function(error){
		console.log(error);
		console.log(error.responseText);
		console.log(error.status);
		alert("서버 오류");
	});
}

function popupOpen(id,id2){
//81//203


	var popUrl = "/doda/doda?cmd=tegami&number="+id+"&number2="+id2;
			//팝업창에 출력될 페이지 URL

	var popOption = "width=370, height=360, resizable=no, scrollbars=no, status=no;";    //팝업창 옵션(optoin)

		window.open(popUrl,"",popOption);

	}


</script>
</html>