import java.util.Scanner;

public class SignPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 0;
		String numCh;
		Scanner sc = new Scanner(System.in);
		
		num = sc.nextInt();
		
		numCh = (num > 0) ? "���" : ((num < 0) ? "����": "0");
		
		System.out.println(numCh);
	}
	
}
