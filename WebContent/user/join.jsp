<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%@ include file="/include/nav.jsp"%>

	<div class="container">
	<form action="/doda/doda?cmd=joinProc" method="POST" class="was-validated" onsubmit="return validate()">
	   <div class="form-group">
	    <label for="text">お名前:</label>
	    <input type="text" class="form-control" id="name" placeholder="Enter Email" name="name" required>
	    <div class="valid-feedback">ちゃんと作成しました.</div>
	    <div class="invalid-feedback">こちらは作成しなくてはいけません.</div>
	  </div>

	  <div class="form-group">
	    <label for="userid">ユーザーID:</label>
	    <button type="button" class="btn btn-warning float-right" onclick="usernameCheck()">重複確認</button>
	    <input type="text" class="form-control" id="userid" placeholder="Enter username" name="userid" required>
	    <div class="valid-feedback">こちらは作成しなくてはいけません.</div>
	    <div class="invalid-feedback">Please fill out this field.</div>
	  </div>
	  <div class="form-group">
	    <label for="pwd">パスワード:</label>
	    <input type="password" class="form-control" id="password" placeholder="Enter password" name="password" required>
	    <div class="valid-feedback">ちゃんと作成しました.</div>
	    <div class="invalid-feedback">こちらは作成しなくてはいけません.</div>
	  </div>

	  <div class="form-group">
	    <label for="email">イーメール:</label>
	    <input type="email" class="form-control" id="emailsk" placeholder="Enter Email" name="emailsk" required>
	     <button type="button" class="btn btn-warning float-right" onclick="ok()">인증번호발송</button>
	     인증번호: <input type="text" name="emailok2" id="emailok2"><button type="button" class="btn btn-warning float-right" onclick="ok2()">인증번호확인</button>
	     <div id="bodyContents">
	      <input type="hidden" id="okok" name="okok" value="${emailok}">
	    </div>
	    </div>

	  <div class="form-group">
   		<label for="address">ご住所:</label>
   		<button type="button" class="btn btn-warning float-right" onclick="goPopup()">주소검색</button>
	    <input type="text" class="form-control" id="address" placeholder="Enter Address" name="address" required readonly>
	    <div class="valid-feedback">ちゃんと作成しました.</div>
	    <div class="invalid-feedback">こちらは作成しなくてはいけません.</div>
	  </div>
	     <div class="form-group">
	    <label for="text">電話番号:</label>
	    <input type="text" class="form-control" id="tell" placeholder="tell" name="tell" required>
	    <div class="valid-feedback">ちゃんと作成しました.</div>
	    <div class="invalid-feedback">こちらは作成しなくてはいけません.</div>
	  </div>
		<select id="style" name="style">
			<option value="1">個人会員登録</option>
			<option value="2">法人会員登録</option>
			<option value="3">管理者登録</option>
			</select>
			<br/>
			<br/>
			<br/>
			管理者暗号番号<input type="text" id="pass" name="pass">

<div align="right">
	  <button type="submit" class="btn btn-primary">
	  社員登録完了</button>
	  </div>
	</form>

</div>
</body>
<script src="${path}/js/juso.js"></script>
<script src="${path}/js/join.js"></script>
</html>