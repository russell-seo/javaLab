package sec05.exam03_systemtime;

public class SystemTimeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//정적 메소드는 객체 생성없이 클래스이름. 메소드()로 직접 호출할 수 있다.
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
