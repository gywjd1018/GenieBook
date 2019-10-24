<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>


</head>

<script>

function roomkaja1() {
	
var aaa = document.roomroom.roomname.value;



}

function roomcheck() {
	
	
	
	
	if(document.roomroom.roomname.value) { 
	
		var aaa = document.roomroom.roomname.value;
		
	return true;
	
	}
	
	if(!document.roomroom.roomname.value){
		alert("방 제목을 입력하세요");
		return false;
	}
	
	
}

function cancle() {
	self.close();
}

</script>

<body>
<form action="roomkaja.do" name="roomroom" method="get" onsubmit="return roomcheck()"  align="center">
방 제목<input type="text" name="roomname"><br><br>
<input type="submit" value="만들기"  >
<input type="button" value="취소" onclick="cancle()">
</form>


</body>
</html>