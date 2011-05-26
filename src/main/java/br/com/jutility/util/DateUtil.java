package br.com.jutility.util;

public class DateUtil {
	
	@SuppressWarnings("unused")
	public boolean validateDate(String date){
		String date2[];
		Integer day, month, year;

		date2 = date.split("/");
		day = Integer.parseInt(date2[0]);
		month = Integer.parseInt(date2[1]);
		year = Integer.parseInt(date2[2]);

		System.out.println("Da: " + day + " Month: " + month + " Year: " + year);

		if(date != "" || date != null){
			if((date2[0].length() != 2) || (day <= 0 || day > 31) ){
				return false;
			}
			if( (date2[1].length() != 2) || (month <= 0 || month > 12)  || ( (month == 4 || month == 6 || month == 9 || month == 11 ) && month > 30) ){
				return false;
			}
			//altere o 'ano < 1000' para melhor te atender.
			if((date2[2].length() != 4) || (year < 1000 || year > 3011)){
				return false;
			}
			if( ((year % 4) != 0 && year == 2 && year > 28) ){
				return false;
			}else if( (year % 4) == 0 && month == 2 && day > 29 ){
				return false;
			}
			return true;
		}else{
			return false;
		}
	}
}
