<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
	var se1 = document.getElementById("job").value;


	var se2 = document.getElementById("area").value;
	var se3= document.getElementById("pay").value;

	setTimeout(function() {
		  location.href="/doda/doda?cmd=company2&se1="+se1+"&se2="+se2+"&se3="+se3
		}, 1300);

}
user()
</script>
<table border="3"  bordercolor="blue;"width="1000" height="300">
<tr>
<td style="background-color: yellow;">

</td>
<td style="background-color: yellow;">


</td>
<td style="background-color: yellow;">

</td>
</tr>
</table>
<br/>
<h1>検索しておりますので、少々お待ちください。<span style="color:blue">DODA</span></h1>
</body>
</html>