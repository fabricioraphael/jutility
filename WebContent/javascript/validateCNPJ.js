//Ex CNPJ v‡lido 14.638.052/0001-00
function maskCNPJ(campCNPJ){
	var cnpj = campCNPJ.value;

	if(cnpj.length == 2){
		cnpj = cnpj + ".";
		document.frm.cnpj.value = cnpj;
		return true;
	}
	if(cnpj.length == 6){
		cnpj += ".";
		document.frm.cnpj.value = cnpj;
		return true;
	}
	if(cnpj.length == 10){
		cnpj += "/";
		document.frm.cnpj.value = cnpj;
		return true;
	}
	if(cnpj.length == 15){
		cnpj += "-";
		document.frm.cnpj.value = cnpj;
		return true;
	}
}

function validateCNPJ(frm) {
	var numeros, digitos, soma, i, resultado, pos, tamanho, digitos_iguais;
	var cnpj = frm.cnpj.value.replace(/\D+/g, '');

	digitos_iguais = 1;

	if (cnpj.length != 14){
		alert('CNPJ inv‡lido!');
		frm.cnpj.focus();
		return false;
	}

	for (i = 0; i < cnpj.length - 1; i++)
		if (cnpj.charAt(i) != cnpj.charAt(i + 1)){
			digitos_iguais = 0;
			break;
		}
	if (!digitos_iguais){
		tamanho = cnpj.length - 2;
		numeros = cnpj.substring(0,tamanho);
		digitos = cnpj.substring(tamanho);
		soma = 0;
		pos = tamanho - 7;

		for (i = tamanho; i >= 1; i--){
			soma += numeros.charAt(tamanho - i) * pos--;
			if (pos < 2)
				pos = 9;
		}

		resultado = soma % 11 < 2 ? 0 : 11 - soma % 11;

		if (resultado != digitos.charAt(0)){
			alert('CNPJ inv‡lido!');
			frm.cnpj.focus();
			return false;
		}

		tamanho = tamanho + 1;
		numeros = cnpj.substring(0,tamanho);
		soma = 0;
		pos = tamanho - 7;

		for (i = tamanho; i >= 1; i--){
			soma += numeros.charAt(tamanho - i) * pos--;
			if (pos < 2)
				pos = 9;
		}

		resultado = soma % 11 < 2 ? 0 : 11 - soma % 11;

		if (resultado != digitos.charAt(1)){
			alert('CNPJ inv‡lido!');
			frm.cnpj.focus();
			return false;
		}else {
//			alert('CNPJ  V‡lido!!!');
			return true;
		}
	}else{
		alert('CNPJ inv‡lido!');
		frm.cnpj.focus();
		return false;
	}
} 



