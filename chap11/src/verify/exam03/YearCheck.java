package verify.exam03;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class YearCheck {
	
		public static void main(String[] args) {
			System.out.println("������ �Է� �ϼ���?");
			Scanner sc = new Scanner(System.in);
			int year = sc.nextInt();
			
			//�ۼ���ġ
			GregorianCalendar cl = new GregorianCalendar();
			
			if(cl.isLeapYear(cl.get(Calendar.YEAR))) {
				System.out.println("����");
			}else {
				System.out.println("���");
			}
			/*
			if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
				System.out.println(year + "�� ����");
				} else {
				System.out.println(year + "�� ���");
				}*/
			
		}
}
