package verify;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class lottoSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int n;
			Set<Integer> s = new HashSet();
			
			Random rd = new Random();
			
			
			while(s.size()!=6) {
			n = rd.nextInt(45)+1;
			s.add(n);
			}
			System.out.println(s);
		}

}
