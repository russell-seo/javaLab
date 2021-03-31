package sec11.exam01_arrays;

import java.util.Arrays;

public class ArraySortExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] scores = {99, 97, 98};
		Arrays.sort(scores);
		for(int i = 0; i<scores.length; i++) {
			System.out.println(scores[i]);
		}
		
		String[] names = {"È«±æµ¿", "¼­»ó¿ø", "±è¾ðÁß"};
		
		Arrays.sort(names);
		
		for(int i = 0; i<names.length; i++) {
			System.out.println(names[i]);
		}
		
		Member member1 = new Member("È«±æµ¿");
		Member member2 = new Member("¼­»ó¿ø");
		Member member3 = new Member("±è¾ðÁß");
		
		Member[] members = {member1,member2,member3};
		Arrays.sort(members);
		
		
		for(int i = 0; i<members.length; i++) {
			System.out.println(members[i].name);
		}
	}

}
