function go_outcome(){
	if(document.formm.date.value==""){
		alert("날짜를 입력하세요.");
		document.formm.date.focus();
		
	}else if(document.formm.name.value==""){
		alert("항목명을 입력하세요.");
		document.formm.name.focus();
		
	}else if(document.formm.amount.value==""){
		alert("금액을 입력하세요.");
		document.formm.amount.focus();
	}else{
		document.formm.action="CashBook?command=input";
		document.formm.submit();
	
	}
//	return true;
}