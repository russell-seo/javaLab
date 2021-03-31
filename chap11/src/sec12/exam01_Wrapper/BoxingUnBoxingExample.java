package sec12.exam01_Wrapper;

public class BoxingUnBoxingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Boxing : Stack >> Heap
		
		Integer obj1 = new Integer(100);
		Integer obj2 = new Integer("200");
		Integer obj3 = Integer.valueOf("300"); //
		
		int value1 = obj1.intValue();
		int value2 = obj2.intValue();
		
		System.out.println(value1);
		System.out.println(value2);
	}

}
