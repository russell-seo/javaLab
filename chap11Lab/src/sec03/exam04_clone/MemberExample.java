package sec03.exam04_clone;

public class MemberExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member original = new Member("blue", "ȫ�浿", "12345", 25, true);
		
		//
		Member cloned = original.getMember();
		cloned.password = "67890";
	}

}
