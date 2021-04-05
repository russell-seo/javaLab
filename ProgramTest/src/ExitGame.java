import java.util.Scanner;

public class ExitGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 0;
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		
	
		
		for(int i=0; i<5; i++) {
			a = sc.nextInt();
			sum += a;
			System.out.println(sum);
			if(100<=sum) {
				System.out.println("프로그램 종료!");
			}
			
		}
		
	}

}
