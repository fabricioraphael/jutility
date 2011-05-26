package br.com.jutility.util;

public class CNPJUtil {
	
	//ex: 14.638.052/0001-00   43.288.344/0001-15   67.127.541/0001-56   23.215.483/0001-47
	public boolean validatesCNPJ(String cnpj) {  
		if (!cnpj.substring(0, 1).equals("")) { 
			try {  
				cnpj = cnpj.replace('.', ' '); 
				cnpj = cnpj.replace('/', ' ');
				cnpj = cnpj.replace('-', ' '); 
				cnpj = cnpj.replaceAll(" ", ""); 
				int soma = 0, dig;  
				String cnpj_calc = cnpj.substring(0, 12);  

				if (cnpj.length() != 14) {  
					return false;  
				}  
				char[] chr_cnpj = cnpj.toCharArray();  

				for (int i = 0; i < 4; i++) {  
					if (chr_cnpj[i] - 48 >= 0 && chr_cnpj[i] - 48 <= 9) {  
						soma += (chr_cnpj[i] - 48) * (6 - (i + 1));  
					}  
				}  
				for (int i = 0; i < 8; i++) {  
					if (chr_cnpj[i + 4] - 48 >= 0 && chr_cnpj[i + 4] - 48 <= 9) {  
						soma += (chr_cnpj[i + 4] - 48) * (10 - (i + 1));  
					}  
				}  
				dig = 11 - (soma % 11);  
				cnpj_calc += (dig == 10 || dig == 11) ? "0" : Integer.toString(  
						dig);  

				soma = 0;  
				for (int i = 0; i < 5; i++) {  
					if (chr_cnpj[i] - 48 >= 0 && chr_cnpj[i] - 48 <= 9) {  
						soma += (chr_cnpj[i] - 48) * (7 - (i + 1));  
					}  
				}  
				for (int i = 0; i < 8; i++) {  
					if (chr_cnpj[i + 5] - 48 >= 0 && chr_cnpj[i + 5] - 48 <= 9) {  
						soma += (chr_cnpj[i + 5] - 48) * (10 - (i + 1));  
					}  
				}  
				dig = 11 - (soma % 11);  
				cnpj_calc += (dig == 10 || dig == 11) ? "0" : Integer.toString(  
						dig);  
				return cnpj.equals(cnpj_calc);  
			}catch (Exception e) {  
				return false;  
			}  
		}  
		else {  
			return false;  
		} 
	}
}
