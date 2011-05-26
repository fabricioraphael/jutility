
function validateEmail(frm){
	if(frm.email.value.indexOf("@") == -1 || frm.email.value.indexOf(".") == -1 || frm.email.value == "" || frm.email.value == null) {
		alert("E-mail invalido, favor informe-nos um e-mail valido.");
		frm.email.focus();
		return false;
	}else
		return true;
}