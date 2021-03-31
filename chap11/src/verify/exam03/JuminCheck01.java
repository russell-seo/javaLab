package verify.exam03;

import java.io.InputStream;
import java.util.Scanner;

public class JuminCheck01 {
	
	//주민번호 타당성 검사 메소드
	public boolean juminCheck(String jumin) {
		//1.주민 번호 각 자리에 해당 숫자를 곱한다.
		//1번의 연산결과를 11로 나누어 나머지를 구한다
		//11에서 나머지를 뺀 후 체크용 번호와 비교해서 같으면
		int[]check  = {2,3,4,5,6,7,8,9,2,3,4,5};
		
		int total = 0;
		int total2;
		for(int i =0; i<12; i++) {
			
			total = check[i]*Integer.parseInt(jumin.substring(i,i+1));
			
					
		}
		total %= 11;
		
		total2 = 11- total;
		if(total2>=10) {
			total2 %= 10;
			
		}
		if(total2 != Integer.parseInt(jumin.substring(12,13))) {
			return true;
			
		}else {
			return false;
		}
		
	
	}
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JuminCheck01 jc = new JuminCheck01();
		
			//콘솔에서 데이터 입력할 수 있는 Scanner 생성
			InputStream is = System.in;
			Scanner sc = new Scanner(is);
			System.out.println("주민번호 앞자리를 입력 하세요?");
			String jumin1 = sc.next(); // 111111
			System.out.println("주민번호 뒷자리를 입력 하세요?");
			String jumin2 = sc.next(); // 1111011
					if (jumin1.length() != 6) {
							System.out.println("주민번호 앞자리는 6자리 입력");
							} else if (jumin2.length() != 7) {
							System.out.println("주민번호 뒷자리는 7자리 입력");
							} else if (!jc.juminCheck(jumin1 + jumin2)) {
							System.out.println("잘못된 주민번호 입니다.");
							} else {
							System.out.println("올바른 주민번호 입니다");
							}
		}
}
