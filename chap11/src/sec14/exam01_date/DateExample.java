package sec14.exam01_date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date = new Date();
		String strNow1 = date.toString();
		System.out.println(strNow1);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy�� MM�� dd�� hh�� mm�� ss��");
		String strNow2 = sdf.format(date);
		System.out.println(strNow2);
	}

}
