<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%@ include file="/include/nav.jsp"%>
	<img alt="" src="/doda/image/ajactpeople.png">

<br>
<br>

<div class="container">
	<form action="/doda/doda?cmd=writeProc" method="POST">
  <input type="hidden" id="name" name="name" value="${sessionScope.prinsipal.name}">
  <input type="hidden" id="userid" name="userid"value="${sessionScope.prinsipal.userid}">
  <input type="hidden" id="email" name="email" value="${sessionScope.prinsipal.email}">
  <input type="hidden" id="tell" name="tell" value="${sessionScope.prinsipal.tell}">
  <input type="hidden" id="id" name="id" value="${sessionScope.prinsipal.id}">
  <input type="hidden" id="comid" name="comid" value=0>
		<div class="form-group">
			<label for="title">Title:</label>
			<input type="text" class="form-control" placeholder="title" id="title" name="title">
		</div>

		<div class="form-group">
			<label for="content">Content:</label>
			<textarea class="form-control" rows="20" id="content" name="content"></textarea>
		</div>


		<button type="submit" class="btn btn-primary">書き込み登録</button>
	</form>
</div>
</body>
</html>