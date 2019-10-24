<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
	<!-- 페이지 head 삽입 -->
	<jsp:include page="head.jsp" flush="true" />
	<title>지니북 메인 페이지</title>
	</head>
	<script>
	
	function kajachat() {
		
		var popupX = (window.screen.width/2) - (400/2);
		var popupY = (window.screen.height/2) - (550/2);
		
		url = "kajachat.do";
		
		open(url, "chatmain",
				"toolbar=no,location=no,resizable=no,status=no,scrollbars=no,ewsozable=no,width=400,height=550 ,left="+popupX+", top="+ popupY);
		
	}
	
	</script> 

	<body>
		<!-- 페이지 상단 헤더 삽입 -->
		<jsp:include page="header.jsp" flush="true" />
	
		<a href="javascript:kajachat()"  >채팅하기</a>



	</body>
</html>