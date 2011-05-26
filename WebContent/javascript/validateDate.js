function validateDate(){
	var data = document.frm.date.value;
	
	var dia = data.substring(0,2);
	var mes = data.substring(3,5);
	var ano = data.substring(6,10);

	if(data != "" || data != null){
		if((dia.length != 2) || (dia <= 0 || dia > 31) ){
			alert("Dia invalida!");
			return false;
		}

		if( (mes.length != 2) || (mes <= 0 || mes > 12)  || ( (mes == 4 || mes == 6 || mes == 9 || mes == 11 ) && dia > 30) ){
			alert("Mes invalido!");
			return false;
		}
		//altere o 'ano < 1000' para melhor te atender.
		if((ano.length != 4) || (ano < 1000 || ano > 3011)){
			alert("Ano invalido!!!!!!!");
			return false;
		}

		if( ((ano % 4) != 0 && mes == 2 && dia > 28) ){
			alert("Dia invalido!");
			return false;
		}else if( (ano % 4) == 0 && mes == 2 && dia > 29 ){
			alert("Dia invalido!");
			return false;
		}
		return true;
	}else{
		alert("Preencha o campo Data!");
		return false;
	}

	//alert(" Data Valida! \ndia: " + dia + " mes: " + mes + " ano: " + ano);
}

/*
 * Mascara o campo Data formato "19/05/2011"
 * */

function maskDate(campoData){
	var data = campoData.value;
	if (data.length == 2){
		data = data + '/';
		document.frm.date.value = data;
		return true;              
	}
	if (data.length == 5){
		data = data + '/';
		document.frm.date.value = data;
		return true;
	}
}