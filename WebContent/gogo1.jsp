<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<input type="hidden" id="pay" name="pay" value="${dodaKaisha[0].pay}">
<input type="hidden" id="job" name="job" value="${dodaKaisha[0].job}">
<input type="hidden" id="area" name="area" value="${dodaKaisha[0].area}">


<script type="text/javascript">


function user(){

	var pay = document.getElementById("pay").value;
	var job = document.getElementById("job").value;
	var area = document.getElementById("area").value;

	setTimeout(function() {
		 location.href="/doda/gogo2.jsp"
		}, 1300);

}
user()
</script>
<table border="3"  bordercolor="blue;"width="1000" height="300">
<tr>
<td style="background-color: yellow;">

</td>
<td>

</td>
<td>

</td>
</tr>
</table>
<br/>

<h1>検索しておりますので、少々お待ちください。<span style="color:blue">DODA</span></h1>
</body>
</html>
