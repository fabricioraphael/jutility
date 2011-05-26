package br.com.jutility.util;

public class PhoneUtil{

	public boolean validatePhone(String phone){
		Long phoneInt;
		String[] phoneS;
		
		try {
			phoneS = phone.split("-");
			phoneInt = Long.parseLong(phoneS[0] + phoneS[1]);
			if(phoneS[0].length() == 2 && phoneS[1].length() == 8){
				return true;
			}else
				return false;
		} catch (Exception e) {
			return false;
		}
	}
}
