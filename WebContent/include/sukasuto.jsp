<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
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
		<%@ include file="nav.jsp"%>
		<img alt="" src="/doda/image/sukauto1.png"> <img alt="" src="/doda/image/sukauto2.png"> <a
			href="/doda/doda?cmd=sukautostory&style=${sessionScope.prinsipal.style}&id=${sessionScope.prinsipal.id}"><img alt="" src="/doda/image/sukautobutton.png"></a>
	</div>
</body>
</html>