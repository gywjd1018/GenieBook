<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<script>

function exit() {
	self.close()
}

</script>

</head>
<%String name = request.getParameter("roomname"); %>
<body onresize="parent.resizeTo(400,550)" onload="parent.resizeTo(400,550)">
<%= name%> 채팅방
<input type="text"><input type="button" value="전송">
<input type="button" value="나가기" onclick="exit()">

</body>
</html>