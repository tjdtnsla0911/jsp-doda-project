<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
		<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
</head>
<body>


<div style="width:188px; height:225px; margin:0 auto; border:3px solid red; float:right; background: #87CE00; border-radius: 8%">

    <form action="/doda/doda?cmd=login" method="post">
    <br>
    <input type="text" id="userid" name="userid" style="width:181px" placeholder="ログインしてください">
    <input type="password" id="password" name="password" style="width:181px">
    <br>
    <div align="right">
    <button class="btn btn-primary">ログインする</button>
    </div>
    </form>
    <br>
    <form action="/doda/doda?cmd=join" method="post">
    <input type="submit" value="会員登録はこれら" style="width:181px; height:35px; font-family:돋움; background-color:#eff7f9; border:1 solid #A0DBE4">

    </form>


</div>


</body>
</html>