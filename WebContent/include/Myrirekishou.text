<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
	<%@ include file="/include/nav.jsp"%>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
.img_wrap {
	width: 300px;
	margin-top: 50px;
}

.img_wrap img {
	max-width: 100%;
}

.ok {
	border: none;
	border-right: 0px;
	border-top: 0px;
	boder-left: 0px;
	boder-bottom: 0px;
}
</style>
<meta charset="UTF-8">
<title>이력서</title>
</head>
<body>
<c:forEach var="rirekishou" items="${rirekishou}">
<div>
	<form action="/doda/doda?cmd=rirekishouProc" method="post" enctype="multipart/form-data">

		<table border="1" width="1106">
			<tr>
				<td rowspan="5" width="130" height="113">

					<div class="img_wrap">
								<img src="${rirekishou.img}">
					</div> <br />
				</td>
				<th colspan="9" height="50"><font size="5">이 력 서</font></th>
			</tr>
			<tr>
				<th rowspan="3" width="65" height="70" bgcolor="D5D5D5">성 명</th>
			</tr>
			<tr>
				<th colspan="2" bgcolor="D5D5D5">한글</th>
				<td width="90">${rirekishou.koreaname}</td>
				<th bgcolor="D5D5D5">생년월일</th>
				<th colspan="2" width="80" bgcolor="D5D5D5">이메일</th>
			</tr>
			<tr>
				<th colspan="2" bgcolor="D5D5D5">한 문</th>
				<td>${rirekishou.kanjiname}</td>
				<td>${rirekishou.birthday}</td>
				<td colspan="2">${rirekishou.email}</td>
			</tr>
			<tr>
				<th colspan="2" width="40" id=bgcolor="D5D5D5">연 락 처</th>
				<td colspan="2">${rirekishou.tell}</td>
				<th colspan="2" width="40" bgcolor="D5D5D5">긴급 연락처(핸드폰)</th>
				<td colspan="2">${rirekishou.tell2}</td>
			</tr>
			<tr>
				<th bgcolor="D5D5D5">현 주 소</th>
				<td colspan="8">${rirekishou.address}</td>
			</tr>
		</table>
		<table border="1" width="1106">
			<tr>
				<th colspan="6" width="790" bgcolor="D5D5D5">학 력 사 항</th>
			</tr>
			<tr>
				<th bgcolor="D5D5D5">학위과정</th>
				<th bgcolor="D5D5D5">기 간</th>
				<th bgcolor="D5D5D5">학 교 명</th>
				<th bgcolor="D5D5D5">전 공</th>
				<th bgcolor="D5D5D5">수료</th>
				<th bgcolor="D5D5D5">졸업</th>
			</tr>
			<tr>
				<td>${rirekishou.kauki1}</td>
				<td align="center">${rirekishou.kigen1}</td>
				<td align="right">${rirekishou.gatko1}</td>
				<td>${rirekishou.senko1}</td>
				<td>${rirekishou.sotugyou1}</td>
				<td>${rirekishou.bigo1}</td>
			</tr>
			<tr>
			<td>${rirekishou.kauki1}</td>
				<td align="center">${rirekishou.kigen2}</td>
				<td align="right">${rirekishou.gatko2}</td>
				<td>${rirekishou.senko2}</td>
				<td>${rirekishou.sotugyou2}</td>
				<td>${rirekishou.bigo2}</td>
			</tr>
			<tr>
				<td>${rirekishou.kauki3}</td>
				<td align="center">${rirekishou.kigen3}</td>
				<td align="right">${rirekishou.gatko3}</td>
				<td>${rirekishou.senko3}</td>
				<td>${rirekishou.sotugyou3}</td>
				<td>${rirekishou.bigo3}</td>
			</tr>
			<tr>
				<th colspan="6" bgcolor="D5D5D5">전 공 경 력 사 항</th>
			</tr>


			<tr>
				<th width="180" bgcolor="D5D5D5">근무년월</th>
				<th width="200" bgcolor="D5D5D5">기 간</th>
				<th width="100" bgcolor="D5D5D5">근 무 처</th>
				<th width="100" bgcolor="D5D5D5">직 위</th>
				<th colspan="2" width="70" bgcolor="D5D5D5">자 격 증</th>
			</tr>


			<tr>
				<td align="center">${rirekishou.keireki1}</td>
				<td align="center">${rirekishou.keirekikigen1}</td>
				<td>${rirekishou.kinmu1}</td>
				<td>${rirekishou.level1}</td>
				<td colspan="2">${rirekishou.sikaku1}</td>
			</tr>


			<tr>
			<td align="center">${rirekishou.keireki2}</td>
				<td align="center">${rirekishou.keirekikigen2}</td>
				<td>${rirekishou.kinmu2}</td>
				<td>${rirekishou.level2}</td>
				<td colspan="2">${rirekishou.sikaku2}</td>
			</tr>

			<tr>
			<td align="center">${rirekishou.keireki3}</td>
				<td align="center">${rirekishou.keirekikigen3}</td>
				<td>${rirekishou.kinmu3}</td>
				<td>${rirekishou.level3}</td>
				<td colspan="2">${rirekishou.sikaku3}</td>
			</tr>
			<tr>
				<th bgcolor="D5D5D5">참 고 사 항</th>
				<td colspan="5"><input type="text" class="ok" id="sanko" name="sanko" value="참고사항"></td>
			</tr>
			<tr>
				<td colspan="6">
					<p style="text-align: center">위 기재 사항은 사실과 틀림이 없습니다.</p> <br /> <br />
					<p style="text-align: center">
					${rirekishou.day}
					</p> <br /> <br />
					<p style="text-align: right">(인)&nbsp;&nbsp;&nbsp;</p>
				</td>
			</tr>
		</table>



</div>



	</form>
</c:forEach>
</body>
</html>