<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
	<head>
		<!-- 페이지 head 삽입 -->
		<jsp:include page="../head.jsp" flush="true" />
		
		<title>지니북 책 목록</title>
		
	</head>
	
	<body>
	
		<!-- 페이지 상단 헤더 삽입 -->
		<jsp:include page="../header.jsp" flush="true" />
	
		<table border="1">
				<tr>
					<th>번호</th>
					<th>제목</th>
					<th>저자 및 역자</th>
					<th>출판사</th>
					<th>카테고리</th>
					<th>출판일</th>
					<th>재고량</th>
					<th>정가</th>
					<th>판매가</th>
					<th>책 유형</th>
				</tr>

				<c:forEach items="${ bookList }" var="list">
				
					<tr>
						<td> ${ list.bookNo } </td>
						<td> ${ list.bookName } </td>
						<td> ${ list.author } </td>
						<td> ${ list.publisher } </td>
						<td> ${ list.category } </td>
						<td> ${ list.bookDate } </td>
						<td> ${ list.stock } </td>
						<td> ${ list.price } </td>
						<td> ${ list.bookType } </td>
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