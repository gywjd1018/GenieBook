<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>jQuery 회원가입</title>
<style type="text/css">
    #jointable table{width:600px;}
    #jointable th{text-align: right; background-color:orange;}
    #jointable td input {border:1px solid seagreen;}
</style>
<link rel="stylesheet" href="http://code.jquery.com/ui/1.9.2/themes/base/jquery-ui.css" />
<script type="text/javascript" src="http://code.jquery.com/jquery-1.9.1.min.js"></script>
<script type="text/javascript" src="http://code.jquery.com/ui/1.9.2/jquery-ui.js"></script>
<script type="text/javascript" src="jquery.ui.datepicker-ko.js"></script>
<script src="http://dmaps.daum.net/map_js_init/postcode.v2.js"></script>
<script type="text/javascript">
    $(document).ready(function() {
 
    $("#btn_join").click(function() {
       
            var tel1_pattern = /(^01[016789]$)/; //정규식
 
            //alert("ok");
            if ($("#id").val() == "") {
                alert("아이디를 꼭 입력하세요!");
                $("#id").focus();
            } else if ($("#pwd").val() == "") {
                alert("비밀번호를 꼭 입력하세요!");
                $("#pwd").focus();
 
            } else if ($("#pwd2").val() == "") {
                alert("비밀번호확인 을 꼭 입력하세요!");
                $("#pwd2").focus();
 
            } else if ($("#pwd").val() != $("#pwd2").val()) {
                alert("비밀번호와 비밀번호 확인이 일치하지않습니다.");
                $("#pwd").val("");
                $("#pwd2").val("");
                $("#pwd1").focus();
 
            } else if ($("#name").val() == "") {
                alert("이름을 꼭 입력하세요!");
                $("#name").focus();
 
            } else if ($("#tel1").val() == "") {
                alert("전화번호 첫번째자리 입력하세요!");
                $("#tel1").focus();
 
            } else if ($("#tel1").val().length != 3) {
 
                alert("전화1을 3개의 숫자로 꼭 입력하세요!");
                $("#tel1").val("");
                $("#tel1").focus();
 
            } else if (isNaN($("#tel1").val())) {
                alert("전화1을 3개의 숫자로 꼭 입력하세요!");
                $("#tel1").val("");
                $("#tel1").focus();
 
            } else if (!tel1_pattern.test($("#tel1").val())) {
                alert("010, 011, 016, 017, 018, 019,o19만 가능합니다.")
                $("#tel1").val("")
                $("#tel1").focus();
            }
            /*
            if($("#tel1").val() != "" & $("#tel1").val().length ==3 & !isNaN($("#tel1").val()) ){
            alert("okkkkkkk");
            var pattern = /(^01[016789]$)/; //정규식 슬래쉬(/)로 시작해서, 슬래쉬(/)로 끝났다.
            var tel1=$("#tel1").val();
            if(! pattern.test(tel1)){
            //틀리면
            alert("010, 011, 016, 017, 018, 019,o19만 가능합니다.")  
            $("#tel").val("")
            $("#tel").focus();
                   
                }
            }*/
 
            else if ($("#tel2").val() == "") {
                alert("전화번호 두번째자리를 입력하세요!");
                $("#tel2").focus();
 
            } else if ($("#tel1").val().length != 3) {
 
                alert("전화1을 3개의 숫자로 꼭 입력하세요!");
                $("#tel2").val("");
                $("#tel2").focus();
 
            } else if (isNaN($("#tel2").val())) {
                alert("전화2을 3~4개의 숫자로 꼭 입력하세요!");
                $("#tel2").val("");
                $("#tel2").focus();
 
            } else if ($("#tel2").val() != "" & $("#tel2").val().length > 4 & isNaN($("#tel2").val())) {
                alert("okkkkkkk");
                var pattern = /(^01[016789]$)/; //정규식 슬래쉬(/)로 시작해서, 슬래쉬(/)로 끝났다.
                var tel1 = $("#tel2").val();
                if (!pattern.test(tel1)) {
                    //틀리면
                    alert("010, 011, 016, 017, 018, 019,o19만 가능합니다.")
                    $("#te2").val("")
                    $("#te2").focus();
 
                }
            }
 
            else if ($("#tel3").val() == "") {
                alert("전화번호 세번째자리를 입력하세요!");
                $("#tel3").focus();
 
            } else if ($("#addr").val() == "") {
                alert("주소를 꼭 입력하세요!");
                $("#addr").focus();
 
            } else if ($("#birth").val() == "") {
                alert("생일을  꼭 입력하세요!");
                $("#birth").focus();
 
            } else if ($("#job").val() == "") {
                alert("직업을  꼭 선택하세요!");
                $("#job").focus();
 
            } else if ($("#man").is(':checked') == false && $("#woman").is(':checked') == false) {
                alert("남자또는 여자를  꼭 선택하세요!");
            } else if ($("#email").val() == "") {
                alert("이메일을 꼭 입력하세요!");
                $("#email").focus();
            } else if ($("#intro").val() == "") {
                alert("자기소개를 꼭 입력하세요!");
                $("#intro").focus();
            } else {
                alert("ok");
            }
 
 
        });
 
        //$("#birth").datepicker();
        //$.datepicker.setDefaults( $.datepicker.regional[ "" ] );
        //$("#birth").datepicker($.datepicker.regional["ko"]);
        $("#birth").datepicker(); 
 
    });
   
</script>
</head>
<body>
      <h1  align="center">회원가입</h1>
<form role="form" action="register.do" method="post" autocomplete="off">

<table width="410" height="300" border =1 align="center">


<tr>
<td align="center">ID</td>
<td style=padding-left:10px;><input type="text" id = "id" name="id"size=20 maxlength =50 placeholder="ID 입력">&nbsp;
<input type="button" value="중복확인"></td>
</tr>

<tr>
<td align="center">비밀번호</td>
<td style=padding-left:10px;><input type="password" id="pw" name="pw"size=20 maxlength =16 placeholder="6~16 숫자/숫자"required ></td>
</tr>

<tr>
<td align="center">비밀번호 확인</td>
<td style=padding-left:10px;><input type="password" id="pw" name="pw2" size=20 maxlength =16 placeholder="6~16 숫자/숫자"required></td>
</tr>

<tr>
<td align="center">이름</td>
<td style=padding-left:10px;><input  type="text" id = "memName"name="memName" size=20 maxlength =50 placeholder="이 름 입 력" ></td>
</tr>

  <tr>
        <th>생일</th>
        <td>
       
        <input type="text" id="birth" size="8" maxlength="8" />
           
       
        </td>
    </tr>

<tr>
<td align="center">이메일</td>
<td style=padding-left:10px;><input type="text" id = "email" name="email" size=20 placeholder="aa@naver.com" required ></td>
</tr>

<tr>
<td align="center">전화번호</td>
<td style=padding-left:10px;><input type="text" id = "phone" name="phone" size=20 maxlength=20 placeholder="010-1111-2222" required></td>
</tr>

<tr>
<td align="center">성별</td>
<td><input type="radio" id = "gender" name="gender" value="남" checked>남
    <input type="radio" id = "gender" name="gender" value="여">여</td>
</tr>



<tr>
<td align="center">주소</td>


<td style=padding-left:10px;><input class="form-control" style="width: 40%; display: inline;" placeholder="우편번호" 
   id="addrCode" name="addrCode" type="text" readonly="readonly" >   
   
<button type="button" class="btn btn-default" onclick="execPostCode();"><i class=fa fa-search"></i>우편번호 찾기</button>

<input class="form-control" placeholder="도로명 주소" id="addr" name="addr"  type="text" size=40 readonly="readonly" />
<input class="form-control" placeholder="상세주소" id="addrDetail" name="addrDetail"  type="text" size=40   />
</td>
</tr>

<tr>
<td colspan=2 align="center"><input type="submit" id = "submit" value ="가입하기">
           <input type="reset" value ="취소">
</td>
</tr>
</table><br>
</form>

</body>
</html>