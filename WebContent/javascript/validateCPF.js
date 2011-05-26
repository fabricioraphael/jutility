function validateCPF(frm){
	var num, digits, plus, i, result, digitEequals;
	var cpf = frm.cpf.value.replace(/\D+/g ,"");

	digitEequals = 1;

	if (cpf.length < 11){
		frm.cpf.focus();
		alert("CPF Inv‡lido!!!");
		return false;
	}
	for (i = 0; i < cpf.length - 1; i++){
		if (cpf.charAt(i) != cpf.charAt(i + 1)){
			digitEequals = 0;
			break;
		}
	}
	if (!digitEequals){
		num = cpf.substring(0,9);
		digits = cpf.substring(9);
		plus = 0;
		for (i = 10; i > 1; i--)
			plus += num.charAt(10 - i) * i;
		result = plus % 11 < 2 ? 0 : 11 - plus % 11;
		if (result != digits.charAt(0)){
			frm.cpf.focus();
			alert("CPF Inv‡lido!!!");
			return false;
		}
		num = cpf.substring(0,10);
		plus = 0;
		for (i = 11; i > 1; i--){
			plus += num.charAt(11 - i) * i;
			result = plus % 11 < 2 ? 0 : 11 - plus % 11;
		}
		if (result != digits.charAt(1)){
			frm.cpf.focus();
			alert("CPF Inv‡lido!!!");
			return false;
		}
//		alert("CPF V‡lido!");
		return true;
	}else{
		frm.cpf.focus();
		alert("CPF Inv‡lido!!!");
		return false;
	}
}
//xxx.xxx.xxx-xx
function maskCPF(campCPF){
	var cpf = campCPF.value;

	if(cpf.length == 3){
		cpf = cpf + ".";
		document.frm.cpf.value = cpf;
		return true;
	}
	if(cpf.length == 7){
		cpf = cpf + ".";
		document.frm.cpf.value = cpf;
		return true;
	}
	if(cpf.length == 11){
		cpf = cpf + "-";
		document.frm.cpf.value = cpf;
		return true;
	}
}




