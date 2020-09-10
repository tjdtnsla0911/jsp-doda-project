<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>Bootstrap Example</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
<style>
ul li {
	outline: 1px white;
	margin-left: 50px;
}
</style>
</head>
<body>

	<nav class="navbar navbar-expand-sm bg-danger navbar-dark">
		<!-- Brand -->

		<a class="navbar-brand" href="/doda/index.jsp">DODA</a>

		<!-- Links -->
		<ul class="navbar-nav">
			<li class="nav-item dropdown"><a class="nav-link dropdown-toggle" href="#" data-toggle="dropdown"><b>採用検索</b></a>
				<div class="dropdown-menu">
					<a class="dropdown-item" href="/doda/doda?cmd=condition">
					<b>詳細条件から探す</b></a> <a class="dropdown-item" href="#"><b>新着求人から探す</b></a> <a class="dropdown-item"
						href="#"><b>求人特集から探す</b></a>
				</div></li>
			<li class="nav-item dropdown"><a class="nav-link dropdown-toggle" href="#" data-toggle="dropdown"><b>求人を紹介してもらう</b></a>
				<div class="dropdown-menu">
					<a class="dropdown-item" href="/doda/doda?cmd=ajact"><b>エージェントサービス</b></a> <a class="dropdown-item" href="/doda/doda?cmd=skauto&id=${prinsipal.id}"><b>スカウトサービス</b></a>
				</div></li>

			<li class="nav-item dropdown"><a class="nav-link dropdown-toggle" href="#" data-toggle="dropdown"><b>知りたい, 聞きたい</b></b></a>
				<div class="dropdown-menu">
					<a class="dropdown-item" href="/doda/doda?cmd=QA"><b>転職Q&A</b></a>
				</div></li>

			<!-- Dropdown -->
			<li class="nav-item dropdown"><a class="nav-link dropdown-toggle" href="#" id="navbardrop" data-toggle="dropdown">
					<b>イベント</b></a>
				<div class="dropdown-menu">
					<a class="dropdown-item" href="/doda/doda?cmd=event"><b>イベント一覧</b></a> <a class="dropdown-item" href="#"><b>転職フェア</b></a>
				</div></li>
		</ul>
	</nav>
	<br>



</body>
</html>
