<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%@ include file="/include/nav.jsp"%>
	<div>

		<div style="position: absolute;">

			<img alt="" src="/doda/image/ajact.png" /></img>



		</div>

		<div style="position: absolute;">

			<div style="position: relative; top: 298px; left: 80px;">
				<a href="/doda/doda?cmd=ajactProc&userid=${sessionScope.prinsipal.userid}"><img src="/doda/image/ajactButton.png"></a></img>

			</div>

		</div>



	</div>
	<img alt="" src="/doda/image/ajact2.png" />
	<img alt="" src="/doda/image/ajact3.png" />





</body>
</html>