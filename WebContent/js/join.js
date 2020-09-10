// 중복체크 함수
function validate(){
	if(!isCheckedUsername){
		alert('username 중복체크를 해주세요');
	}
	return isCheckedUsername;
}
//usernameCheck()

// 데이터베이스에 ajax 요청을 해서 중복 유저네임이 있는지 확인
// 있으면 1을 리턴, 없으면 0을 리턴, 오류가 나면 -1을 리턴
function usernameCheck(){
	var tfUsername = $('#userid').val();
	console.log(tfUsername);
	$.ajax({

		type: 'get',
		url: `/doda/doda?cmd=usernameCheck&userid=${tfUsername}`

	}).done(function(result){
		console.log(result);
		if(result == 1){
			alert('아이디가 중복되었습니다');
		}else if(result == 0){
			alert('入力したIDは使えます!');
			isCheckedUsername = true;
		}else{
			console.log('develop : 서버 오류');
		}
	}).fail(function(error){
		console.log(error);
	});


}

function ok(){
	var emailsk = $('#emailsk').val();

	$.ajax({

		type: 'get',
		url: `/doda/doda?cmd=emailok&emailok=${emailsk}`


	}).done(function(result){

		if(result != null){//이건 ㅅㅂ 무조껀작동됨 못고치겟음 안적고 눌러도 전송완료뜸 니가고쳐
			console.log(result);

			$('#okok').children().remove();
			$('#okok').val(result);
			console.log(result)
			if($('#okok').val(result)==null||$('#okok').val(result)==""){
				alert('메세지전송실패');
			}else{
				alert('이메일이전송되었습니다.');
			}
		}else if(result == null || result==""){
			alert('존재하지않는 이메일입니다!!');
		}else{
			alert('서버오류');
		}
	}).fail(function(error){
		console.log(error);
	});
	//location.reload();
}


function ok2(){
	var emailok2 = $('#emailok2').val();
	var okok=$('#okok').val();
	if(emailok2==""||okok==""){
		alert('인증번호를 적어주세요.');
	}	else if(emailok2==okok&&okok!=null&&emailok2!=null){
		alert('인증번호가 일치합니다.');

	}else{
		alert("인증번호가 일치하지않습니다");
	}

}
//saveKaisha
function saveKaisha(){
	var saveKaishas = $('#saveKaishas').val();
	var dodauserid = $('#dodauserid').val();
	console.log(saveKaishas);
	console.log(dodauserid);
	$.ajax({

		type: 'get',
		url: `/doda/doda?cmd=myKaisha&saveKaishas=${saveKaishas}&dodauserid=${dodauserid}`


	}).done(function(result){

		if(result != null){//이건 ㅅㅂ 무조껀작동됨 못고치겟음 안적고 눌러도 전송완료뜸 니가고쳐
			alert('성공')
			console.log(result)

		}else if(result == null || result==""){
			alert('존재하지않는 이메일입니다!!');
		}else{
			alert('서버오류');
		}
	}).fail(function(error){
		console.log(error);
	});
	//location.reload();
}

