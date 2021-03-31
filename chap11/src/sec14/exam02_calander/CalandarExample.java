package sec14.exam02_calander;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalandarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar now = Calendar.getInstance();
		Calendar now1 = new GregorianCalendar();
		
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH)+1;
		int day = now.get(Calendar.DAY_OF_MONTH);
		int week = now.get(Calendar.DAY_OF_WEEK);
		
		String strWeek = null;
		switch(week) {
		case Calendar.MONDAY :
			strWeek = "월";
			break;
		case Calendar.TUESDAY :
			strWeek = "화";
			break;
		case Calendar.WEDNESDAY :
			strWeek = "수";
			break;
		case Calendar.THURSDAY :
			strWeek = "목";
			break;
		case Calendar.SATURDAY :
			strWeek = "토";
			break;
		default :
			strWeek = "일" ;
			
			
		}
		
		int amPm = now.get(Calendar.AM_PM);
		String strAmPm = null;
		if(amPm == Calendar.AM) {
			strAmPm = "오전";
		}else {
			strAmPm = "오후";
		}
		
		int hour = now.get(Calendar.HOUR);
		int minute = now.get(Calendar.MINUTE);
		int second = now.get(Calendar.SECOND);
		
		System.out.print(year+"년");
		System.out.print(month+"월");
		System.out.print(day+"일");
		System.out.print(strWeek+"요일");
		System.out.print(hour+"시");
		System.out.print(minute+"분");
		System.out.print(second+"초");
		
	}

}
