package sec13.exam02_random;

import java.util.Random;

public class RandomExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] selectNumber = new int[6];
		Random random = new Random(5);// seed �� = 5 
		System.out.println("���ù�ȣ");
		for(int i = 0; i<6; i++) {
			selectNumber[i] = random.nextInt(45) + 1;
			System.out.print(selectNumber[i] + " ");
		}
		System.out.println();
		
		//��÷ ��ȣ
		int[] winning = new int[6];
		random = new Random();
		System.out.println("��÷ ��ȣ:");
		for(int i = 0; i<6; i++) {
			winning[i] = random.nextInt(45) + 1; //1~45������ ������ ����
			System.out.print(winning[i]+ " ");
			
		}
	}

}
