package sec13.exam02_random;

import java.util.Random;

public class RandomExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] selectNumber = new int[6];
		Random random = new Random(5);// seed 값 = 5 
		System.out.println("선택번호");
		for(int i = 0; i<6; i++) {
			selectNumber[i] = random.nextInt(45) + 1;
			System.out.print(selectNumber[i] + " ");
		}
		System.out.println();
		
		//당첨 번호
		int[] winning = new int[6];
		random = new Random();
		System.out.println("당첨 번호:");
		for(int i = 0; i<6; i++) {
			winning[i] = random.nextInt(45) + 1; //1~45사이의 임의의 정수
			System.out.print(winning[i]+ " ");
			
		}
	}

}
