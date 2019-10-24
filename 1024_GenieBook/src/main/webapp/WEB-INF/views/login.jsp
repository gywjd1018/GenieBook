<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib prefix="c"   uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>

	<!-- 페이지 head 삽입 -->
	<jsp:include page="head.jsp" flush="true" />
		
	<title>지니북 메인 페이지</title>
		
</head>
<body>

	<!-- 페이지 상단 헤더 삽입 -->
	<jsp:include page="header.jsp" flush="true" />
		
	<h1>로그인</h1>
		
	<form action="loginCheck.do" method="post">
		
		<table border="0">
			
			<tr>
				<th>아이디</th>
				<td> <input type="text" name="id"> </td>
			</tr>
				
			<tr>
				<th>비밀번호</th>
				<td> <input type="password" name="pw"> </td>
			</tr>
				
			<tr>
				<th colspan="2"> <input type="submit" value="로그인">	</th>
			</tr>		
				
			<c:if test="${ msg == 'login fail' }">
				
				<script> alert('아이디 또는 비밀번호가 일치하지 않습니다.'); </script>
				
			</c:if>
				
			<c:if test="${ msg == 'logout' }">
				
				<script> alert('로그아웃되었습니다.'); </script>
					
			</c:if>
			
		</table>
		
	</form>

	<div id="naverLogin" style="text-align:center"><a href="${ url }">
	
		<img width="223" src="https://developers.naver.com/doc/review_201802/CK_bEFnWMeEBjXpQ5o8N_20180202_7aot50.png"/> </a>
	
	</div>
	
	<div id="kakaoLogin" style="text-align:center">
	
		<a href="https://kauth.kakao.com/oauth/authorize?client_id=b389bd06293b458defe886b957316009&redirect_uri=http://localhost:8081/main/kakaoLogin.do&response_type=code">
	
		<img width="223" src="images/kakao_account_login_btn_medium_narrow.png"/> </a>
	
	</div>

</body>	
</html>