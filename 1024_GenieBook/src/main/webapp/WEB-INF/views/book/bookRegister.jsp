<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>

	<meta charset="UTF-8">

	<title>책 등록 페이지</title>
	
</head>
<body>
	
	<h1>책 등록</h1>

	<form action="bookRegister.do" method="post">

		<table width="410" height="300" border="1" align="center">

			<tr>
				<th>제목</th>
				<td> <input type="text" id="bookName"> </td>
			</tr>
			
			<tr>
				<th>저자 및 역자</th>
				<td> <input type="text" id="author"> </td>
			</tr>
			
			<tr>
				<th>출판사</th>
				<td> <input type="text" id="publisher"> </td>
			</tr>
			
			<tr>
				<th>카테고리</th>
				<td>
					
					<select name="category">
					
						<option value="children">어린이</option>
						<option value="teenager">청소년</option>
						<option value="reference">참고서</option>
						<option value="literature">문학</option>
						<option value="self-improvement">자기계발</option>
						<option value="humanities">인문학</option>
						<option value="socialScience">사회과학</option>
						<option value="it">IT</option>
					
					</select>
					
				</td>
			</tr>
			
			<tr>
				<th>책 소개</th>
				<td> <textarea id="bookInfo"></textarea> </td>
			</tr>
			
			<tr>
				<th>목차</th>
				<td> <textarea id="bookPlot"></textarea> </td>
			</tr>
			
			<tr>
				<th>재고량</th>
				<td> <input type="text" id="stock"> </td>
			</tr>
			
			<tr>
				<th>가격</th>
				<td> <input type="text" id="price"> </td>
			</tr>
			
			<tr>
				<th>할인율</th>
				<td> <input type="text" id="discount"> </td>
			</tr>
			
			<tr>
				<th>책 유형</th>
				<td>
				
					<input type="radio" name="bookType" value="kor" checked="checked">국내
					<input type="radio" name="bookType" value="for">외국
					
				</td>
			</tr>
			
			<tr>
				<th>커버 이미지</th>
				<td> <input type="file" name="coverImg"> </td>
			</tr>
			
			<tr>
				<td colspan=2 align="center">
					
					<input type="submit" id = "submit" value ="가입하기">
           			<input type="reset" value ="취소">
           		
           		</td>	
			</tr>		
			
		</table>		

	</form>
	
</body>
</html>