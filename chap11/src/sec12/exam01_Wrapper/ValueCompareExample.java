package sec12.exam01_Wrapper;

public class ValueCompareExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("[~128~127초과값일 경우]");
		Integer obj1 = 300;
		Integer obj2 = 300;
		System.out.println("==결과: "+(obj1==obj2));
		System.out.println("언박싱후 == 결과:" +(obj1.intValue() == obj2.intValue()));
		System.out.println("equals()결과:" + obj1.equals(obj2));
		
		Integer obj3 = 10;
		Integer obj4 = 10;
		System.out.println("==결과:" + (obj3 == obj4));
	}

}
