package sec05.exam03_systemtime;

public class SystemTimeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//���� �޼ҵ�� ��ü �������� Ŭ�����̸�. �޼ҵ�()�� ���� ȣ���� �� �ִ�.
		long time1 = System.nanoTime();
		
		int sum = 0;
		for(int i=1; i<=1000000; i++) {
			sum += i;
		}
		
		long time2 = System.nanoTime();
		System.out.println("sum");
		System.out.println(time2-time1);
	}
		
}
