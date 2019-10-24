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
		
	<!-- 기존 내용 영역 -->	
	<div>
		<hr>
				
		<c:choose>
	
			<c:when test="${ sessionScope.sid == null }">
		
				<a href="login.do">로그인</a>
		
			</c:when>
		
			<c:otherwise>
		
				${ sessionScope.sid } 님이 로그인 중입니다.
		
				<a href="logout.do">로그아웃</a> <br>
		
			</c:otherwise>
	
		</c:choose>
			
		<a href="board.do">자유 게시판</a>
		
		<a href="management.do">회원관리</a>
		
		<a href="bookManagement.do">책 관리</a>
		
		<hr>
		
	</div>
	
	<!-- 기존 내용 영역 -->
		
	<!-- 메인 영역 -->	
	<!-- Main Container Starts -->
		<div id="main-container-home" class="container">
		
		<!-- Nested Row Starts -->
		<div class="row">
			
			<!-- 좌측 네비게이션 메뉴  -->
				<jsp:include page="imsi_body_leftNavi.jsp" flush="true" />
			<!-- 좌측 네비게이션 메뉴  -->
						
				
			<!-- 메인 바디 내용  -->
				<jsp:include page="imsi_body_main.jsp" flush="true" />
			<!-- 메인 바디 내용  -->
				
		</div>
		<!-- Nested Row Ends -->
		
	</div>
	<!-- Main Container Ends -->
		
	<!-- footer Start -->	
		<jsp:include page="imsi_footer.jsp" flush="true" />
	<!-- footer End -->	
	
		<!-- Template JS Files -->
		<script src="js/jquery-3.3.1.min.js"></script>
		<script src="js/popper.min.js"></script>
		<script src="js/bootstrap.min.js"></script>
		<script src="js/jquery.magnific-popup.min.js"></script>
		<script src="js/owl.carousel.min.js"></script>
		<script src="js/custom.js"></script>	
	</body>
</html>