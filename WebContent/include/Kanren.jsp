<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<style>
div {
	text-align: center;
}
</style>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<div>
	<%@ include file="/include/nav.jsp"%>
<br/>
<br/>
<a href="https://mainichi.doda.jp/?sid=relation_mainichi&_ga=2.164987135.1160067427.1593402718-1283172228.1588741727"><img alt="" src="/doda/image/mainichidoda.png"></a><br/><br/>
<a href="https://www.si-ght.jp/?sid=relation_sight"><img alt="" src="/doda/image/sight.png"></a><br/><br/>
<a href="https://mypote.jp/?utm_source=doda&utm_medium=referral&utm_campaign=dodabanner190110"><img alt="" src="/doda/image/mpmaipoint.png"></a><br/><br/>
<a href="https://i-common.jp/i-common.tech.entry/"><img alt="" src="/doda/image/icomm.png"></a><br/><br/>
</div>
<br/>
   <button type="button" class="btn btn-warning float-right" onclick="user()">重複確認</button>
<!-- ----------------------------------여긴 클릭후 어디로 이동하는곳--- -->
<script type="text/javascript">


function user(){
	alert('등장');
	setTimeout(function() {
		  location.href="/doda/gogo2.jsp"
		}, 3000);

}


</script>
</body>
</html>