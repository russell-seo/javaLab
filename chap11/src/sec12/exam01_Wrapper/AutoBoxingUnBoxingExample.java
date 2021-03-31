package sec12.exam01_Wrapper;

public class AutoBoxingUnBoxingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer obj = 100;
		System.out.println("value:" + obj.intValue());
		
		//
		int value = obj;
		System.out.println("value:"+value);
		
		//연산시 Auto-Unboxing
		int result = obj + 100;
		System.out.println(result );
		
		double v11 = Math.random();// 0.0<=Math.random()<1.0 사이의 실수
		System.out.println(v11);
		
		long v14 = Math.round(5.3);
		System.out.println(v14);
	}

}
