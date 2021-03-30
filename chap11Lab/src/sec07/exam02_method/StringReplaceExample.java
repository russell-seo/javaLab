package sec07.exam02_method;

public class StringReplaceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ssn = "940309-1853413";
		String firstnum = ssn.substring(0,6);
		String secnum = ssn.substring(7);
		
		System.out.println(firstnum);
		System.out.println(secnum);
	}

}
