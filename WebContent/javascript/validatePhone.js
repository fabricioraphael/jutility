function validatePhone(frm){
	var phone = frm.phone.value;
	var ddd = phone.substring(0,2);
	var num = phone.substring(3,11);
	
	if(ddd == null || ddd == "" || ddd < 0 || ddd > 99){
		frm.phone.focus();
		alert("DDD invalido, favor insira um Telefone valido!");
		return false;
	}
	if(num == null || num == "" || num.length != 8){
		frm.phone.focus();
		alert("Numero invalido, favor insira um Telefone valido!");
		return false;
	}
}

function maskPhone(campPhone){
	var pho = campPhone.value;
	
	if (pho.length == 2){
		pho = pho + '-';
		document.frm.phone.value = pho;
		return true;
	}
}
