package sec07.exam02_method;

public class StringCharAtExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ssn = "010624-1230123";
				Char sex = ssn.charAt(7);
				switch(sex) {
				case'1':
				case'3':
					System.out.println("남자");
					break;
				case'2':
				case'4':
					System.out.println("여자");
					break;
					
				}
	}

}
