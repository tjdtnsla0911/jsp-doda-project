function deleteById(comid){
var id=$('#idid').val();
	$.ajax({
		type: "POST",
		url: `/doda/doda?cmd=delete&comid=${comid}`,
		dataType: "text"
	}).done(function(result){
		console.log(result);
		if(result == 1){



			$("#comid").remove();//여기서지우고
			location.href=`/doda/doda?cmd=sodan&id=${id}`;
		}else{
			alert("삭제 실패");
		}
	}).fail(function(error){
		console.log(error);
		console.log(error.responseText);
		console.log(error.status);
		alert("서버 오류");
	});
}
function hensinByid(id){
//hensinById(${dodaUserSodans.id})
	$.ajax({
		type: "POST",
		url: `/doda/doda?cmd=hensinByid&id=${id}`,
		dataType: "text"
	}).done(function(result){
		console.log(result);
		if(result == 1){



			$("#comid").remove();//여기서지우고
			location.href="/doda/doda?cmd=sodan";
		}else{
			alert("삭제 실패");
		}
	}).fail(function(error){
		console.log(error);
		console.log(error.responseText);
		console.log(error.status);
		alert("서버 오류");
	});
}

