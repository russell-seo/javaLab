package Verify;

public class FindAndReplaceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "모든 프로그램은 자바 언어로 개발 될 수 있다";
			int index = str.indexOf("");
			if(index == -1) {
				System.out.println("자바 문자열이 포함되어 있지 않다");
			}else {
				System.out.println("자바 문자열이 포함");
				str = str.replace("자바", "java");
				System.out.println("-->"+str);
			
			}
		
	}

}
