package sec12.exam01_Wrapper;

public class ValueCompareExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("[~128~127�ʰ����� ���]");
		Integer obj1 = 300;
		Integer obj2 = 300;
		System.out.println("==���: "+(obj1==obj2));
		System.out.println("��ڽ��� == ���:" +(obj1.intValue() == obj2.intValue()));
		System.out.println("equals()���:" + obj1.equals(obj2));
		
		Integer obj3 = 10;
		Integer obj4 = 10;
		System.out.println("==���:" + (obj3 == obj4));
	}

}
