<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<style>
table {
text-align: center;
}
</style>
</head>
<script>

function kajaroom() {
		
	var popupXx = (window.screen.width/2) - (540/2);
	var popupYy = (window.screen.height/2) - (140/2);
		
	url = "maderoom.do";
		
	open(url, "kajaroom1",
			"toolbar=no,location=no,status=no,scrollbars=no,ewsozable=no,resizable=no,width=540,height=140 ,left="+popupXx+", top="+ popupYy);
		
	}


function chatclose() {
	self.close();
}
</script>
<body>
<h3>지니 채팅</h3>
<input type="button" value="방만들기" onclick="kajaroom()">
<input type="button" value="나가기" onclick="chatclose()"><br>
<table border="1">
	<tr>
		<td>방제목</td>
	</tr>
</table>


</body>
</html>