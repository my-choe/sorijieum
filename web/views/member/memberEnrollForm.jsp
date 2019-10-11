<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입 폼 페이지</title>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/semantic-ui/1.11.8/semantic.min.css"/>
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/semantic-ui/1.11.8/semantic.min.js"></script>
<link rel="stylesheet" type="text/css" href="/sori/resources/css/member.css">
<%@ include file="/inc/top.jsp" %>
<script type="text/javascript" src="/sori/resources/js/jquery-3.4.1.min.js"></script>

<script type="text/javascript">
function validation(){
	return true;	//전송함
}



$(function(){
	$("#checkid").click(function(){
		//jQuery.get() or jQuery.ajax() 두가지중 선택 사용
		//$.get() 사용시
	/* 	$.get("test2.do",{userid:$("#userid").val(), userpwd:$("#userpwd").val()},
				function(data){
					$("#p2").text(data);
		}); */
		
		//$.ajax()사용시
		$.ajax({
			url:"enroll",
			type:"post",
			data:{userid:$("#userid").val()},
			success: function(result){  // 만약 성공적으로 수행되었다면 result로 값반환

				if(result == 0)  // 중복되는 아이디가 없을 때
					alert("사용가능");
				else			// 이미 사용중인 아이디일 때
					alert("이미 있는 아이디");

			} 
		});	//$.ajax()
	});
});	//document ready
</script>

</head>
<body>
<section class="my-section">
<table border="0" cellspacing="0" cellpadding="10" align="center" width="800" height="60">
<tr><th width="50%" bgcolor="#F5DEB3"><h1>1.약관동의</h1></th><th bgcolor="#ECB93E"><h1>2.가입정보입력</h1></th></tr>
</table>
<br>

<form action="" method="post" >
<table align="center" width="800" height="500" cellspacing="0" cellpadding="30px" border="1">
<tr>
	<th>회원구분</th>
	<td><label>&nbsp;&nbsp;<input type="radio" name="typenumber" value="1" checked> 이용자</label> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		<label><input type="radio" name="typenumber" value="2" required> 제작자</label></td>
</tr>
<tr><th>이 름</th><td>&nbsp;&nbsp;<input type="text" name="username"></td></tr>	<!-- required : 필수 입력항목 -->
<tr><th>아이디</th><td>&nbsp;&nbsp;<input type="text" name="userid" id="userid" > &nbsp;
					<button id="checkid">중복체크</button></td></tr>
<tr><th>암 호</th><td>&nbsp;&nbsp;<input type="password" name="userpwd" id="userpwd" ></td></tr>
<tr><th>암호확인</th><td>&nbsp;&nbsp;<input type="password" id="userpwd2" ></td></tr>
<tr><th>전화번호</th><td>&nbsp;&nbsp;<input type="tel" name="phone" maxlength="11" placeholder="ex)01012345678" ></td></tr>
<tr><th>이메일</th><td>&nbsp;&nbsp;<input type="email" name="email" placeholder="ex)abc@example.com" ></td></tr>
<tr><th>성 별</th>
<td>&nbsp;&nbsp;<label><input type="radio" name="gender" value="M" > 남자</label> &nbsp;
				<label><input type="radio" name="gender" value="F" > 여자</label></td></tr>
<tr><th>생년월일</th><td>&nbsp;&nbsp;<input type="date" name="birth" ></td></tr>
<tr><th colspan="2">
<a href="/sori/views/member/memberLoginView.jsp"><input type="button" value="가입하기"></a> &nbsp;
<input type="reset" value="다시작성"> &nbsp;
</th></tr>
</table>
</form>
<br>
<center><a href="javascript:history.go(-1); return fals">약관동의 페이지로 이동</a></center>
</body>
</html>