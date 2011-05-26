package br.com.jutility.util;

public class CPFUtil {

	public boolean validateCPF(String strCpf){
		int d1, d2, digit1, digit2, result, digitoCPF;
		String nDigResult;
		
		strCpf = strCpf.replace('.', ' ');
		strCpf = strCpf.replace('-', ' ');
		strCpf = strCpf.replaceAll(" ", "");
		
		d1 = d2 = 0;
		digit1 = digit2 = result = 0;

		for (int nCount = 1; nCount < strCpf.length() -1; nCount++){
			digitoCPF = Integer.valueOf (strCpf.substring(nCount -1, nCount)).intValue();
			d1 = d1 + ( 11 - nCount ) * digitoCPF;
			d2 = d2 + ( 12 - nCount ) * digitoCPF;
		}
		result = (d1 % 11);
		if (result < 2)
			digit1 = 0;
		else
			digit1 = 11 - result;

		d2 += 2 * digit1;
		result = (d2 % 11);
		if (result < 2)
			digit2 = 0;
		else
			digit2 = 11 - result;

		String nDigVerific = strCpf.substring (strCpf.length()-2, strCpf.length());
		nDigResult = String.valueOf(digit1) + String.valueOf(digit2);
		return nDigVerific.equals(nDigResult);
	}
}





