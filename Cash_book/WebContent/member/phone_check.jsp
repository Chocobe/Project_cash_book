<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Phone 중복 체크</title>
<style type="text/css">
	body{
		background-color: #FFFFD7; 
	}
	#wrap{margin: 0 20px;}
	h1 {
		font-family: "Times New Roman", Times, serif;
		font-size: 25px;
		color: #ccc;
		font-weight: normal;
	}
	input[type-button], input[type-submit]{
		flaot: right;
	}
</style>
<script>
function phoneok(){
 	opener.formm.phone.value="${phone}";  /*opener = open()메소드를 사용한 문서*/
	opener.formm.rephone.value="${phone}"; 
	self.close();
}
</script>
</head>
<body>
<div id="wrap">
	<h1>Check phone Redundancy</h1>
	<form action="CashBook?command=phone_check_form" method="post" name="formm">
		User Phone 
		<input type = "text" name="phone" value="">
		<input type="submit" value="search" class="submit"><br>
		<div style="margin-top:20px">
			<c:if test="${message==1}">
				<script>
					opener.document.formm.phone.value="";
				</script>
				${phone }은 이미 사용중 입니다.
			</c:if>
			<c:if test="${message==-1 }">
				${phone }는 사용 가능합니다.
				<input type="button" value="Use" class="cancel" onclick="phoneok()">
			</c:if>
		</div>
	</form>
</div>
</body>
</html>