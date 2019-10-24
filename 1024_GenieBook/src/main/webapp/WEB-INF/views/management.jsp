<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
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
	
		<table border="1">
			<thead>
				<tr>
					<td>번호</td>
					<td>아이디</td>
					<td>비밀번호</td>
					<td>이름</td>
					<td>가입유형</td>
					<td>생년월일</td>
					<td>이메일</td>
					<td>전화번호</td>
					<td>성별</td>
					<td>주소1</td>
					<td>주소2</td>
					<td>주소3</td>
					<td>날짜</td>
					<td>포인트</td>
					<td>씨팔거</td>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${ viewAll }" var="list">
				<tr>
					<td> ${ list.memNo } </td>
					<td> ${ list.id } </td>
					<td> ${ list.pw } </td>
					<td>${ list.memName }</td>
					<td>${ list.regType }
					<td> ${ list.birth } </td>
					<td> ${ list.email }</td>
					<td> ${ list.phone } </td>
					<td>${ list.gender } </td>
					<td> ${ list.addrCode }  </td>
					<td>${ list.addr } </td>
					<td> ${ list.addrDetail } </td>
					<td> ${ list.regDate } </td>
					<td>${ list.point } </td>
					<td><input type="button" value="X" onclick="test('${ list.id }')"></td><!-- 그럼 일단 저 test 라는 함수가있어야겠지 ㅇ 그럼 만들어줘야지   -->
<%-- 					<td><input type = "button" onclick="location.href='delete.do?id=${list.id }'" value="삭제"></input></td> --%>
				</tr>           
				</c:forEach>
			</tbody>
		</table>
	</body>
	
	<script>
	function test(val){ /* */
// 		alert("삭제하시겠습니까?");
		var xx = confirm("삭제하시겠습니까?")
		console.log(xx);   
		var url = "http://localhost:8081/main/delete.do?id="+val
		if(xx == true){             
			window.location.href = url;  
		}
	}
	</script>
</html>