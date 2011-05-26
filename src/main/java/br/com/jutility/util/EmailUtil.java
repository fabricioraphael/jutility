package br.com.jutility.util;

public class EmailUtil {

	public boolean validateEmail(String email){

		if( !(email == null || email == "" || email.indexOf("@") == -1 || email.indexOf(".") == -1) ){
			return true;
		}else
			return false;
	}
}
