package sec06.exam01_class;

public class ClassExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Car();
		Class clazz1 = car.getClass();
		System.out.println(clazz1.getName());
		System.out.println(clazz1.getSimpleName());
		System.out.println(clazz1.getPackage().getName());
	
	}

	
	try {
		//Class.forName()�� �ش� ��ü�� Class ��ü�� ��´�.
		Class clazz2 = Class.forName("sec06.exam01_class.Car");
	}catch(ClassNotFoundException e) {
		e.printStackTrace();
	}
}

