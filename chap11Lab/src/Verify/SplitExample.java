package Verify;

import java.util.StringTokenizer;

public class SplitExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "아이디,이름,패스워드";
		
		String[] id = str.split(",");
		for(String str1 : id) {
			System.out.println(str1);
		}
		
	System.out.println();	
	StringTokenizer st = new StringTokenizer(str,",");
	int countTokens = st.countTokens();
	for(int i=0; i<countTokens; i++) {
		String token = st.nextToken();
		System.out.println(token);
	}
	}
	
	
}
