package sec03_exam01_equals;

public class MemberExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member member1 = new Member("blue");
		Member member2= new Member("blue");
		Member member3 = new Member("yellow");
		
		
		if(member1.equals(member2)) {
			System.out.println("1이랑2랑 동등");
		} else {
			System.out.println("동등하지 않음");
		}
	}	

}
