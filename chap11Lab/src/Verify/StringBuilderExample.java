package Verify;

public class StringBuilderExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "";
		for(int i =1; i<100; i++) {
			str += i;
		
		}
		
		
		StringBuilder sb = new StringBuilder();
		for(int i= 1; i<100; i++) {
			sb.append(i);
			System.out.println(sb.toString());
		}
		
	}
	

}
