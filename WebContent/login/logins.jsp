<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
</head>
<body>
<div style="width:188px; height:225px; margin:0 auto; border:3px solid red; float:right; background:#EEEEEE; border-radius: 8%">
	 <b><span style="color:blue; font-size: 16pt;" >${sessionScope.prinsipal.userid}</span>様がログインしました</b>
    <form action="/doda/doda?cmd=login" method="post">
    </form>
    <form action="/doda/doda?cmd=logout" method="post">
    <button class="btn btn-primary" style="width:136pt"><b>ログアウト</b></button>
    </form>
    <c:choose>
    <c:when test="${sessionScope.prinsipal.style eq '管理者'}">
    <form action="/doda/doda?cmd=sodan&id=${sessionScope.prinsipal.id}" method="post">
    <button class="btn btn-success" style="width:136pt"><b>相談管理</b></button>
    </form>
     <form action="/doda/doda?cmd=usersodenhensin&id=${sessionScope.prinsipal.id}" method="post">
    <button class="btn btn-danger" style="width:136pt"><b>相談返信</b></button>
    </form>
    <form action="/doda/doda?cmd=kaishasuisen" method="post">
    <button class="btn btn-warning" style="width:136pt"><b>会社推薦</b></button>
    </form>

    </c:when>
     <c:when test="${sessionScope.prinsipal.style eq '法人社員'}">
  <form action="/doda/doda?cmd=rirekishou&style=${sessionScope.prinsipal.style}" method="post">
    <button class="btn btn-success" style="width:136pt"><b>履 歴 書 作 成</b></button>
    </form>
     <form action="/doda/doda?cmd=kaishatoroku&style=${sessionScope.prinsipal.style}" method="post">
    <button class="btn btn-danger" style="width:136pt"><b>会社登録</b></button>
    </form>
    <form action="/doda/doda?cmd=kaitokanri&id=${sessionScope.prinsipal.id}" method="post">
    <button class="btn btn-warning" style="width:136pt"><b>相 談 返 事</b></button>

    </form>
    </c:when>
    <c:otherwise>
        <form action="/doda/doda?cmd=rirekishou&id=${sessionScope.prinsipal.id}" method="post">
    <button class="btn btn-success" style="width:136pt"><b>履 歴 書 作 成</b></button>
    </form>
     <form action="/doda/doda?cmd=myrirekishou&id=${sessionScope.prinsipal.id}" method="post">
    <button class="btn btn-danger" style="width:136pt"><b>My履歴書</b></button>
    </form>
    <form action="/doda/doda?cmd=kaitokanri&id=${sessionScope.prinsipal.id}" method="post">
    <button class="btn btn-warning" style="width:136pt"><b>相 談 返 事</b></button>

    </form>
    </c:otherwise>
    </c:choose>

    <br>
</div>

</body>
</html>