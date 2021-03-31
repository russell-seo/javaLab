package verify.exam03;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class YearCheck {
	
		public static void main(String[] args) {
			System.out.println("연도를 입력 하세요?");
			Scanner sc = new Scanner(System.in);
			int year = sc.nextInt();
			
			//작성위치
			GregorianCalendar cl = new GregorianCalendar();
			
			if(cl.isLeapYear(cl.get(Calendar.YEAR))) {
				System.out.println("윤년");
			}else {
				System.out.println("평년");
			}
			/*
			if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
				System.out.println(year + "은 윤년");
				} else {
				System.out.println(year + "은 평년");
				}*/
			
		}
}
