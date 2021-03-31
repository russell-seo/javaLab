package sec11.exam01_arrays;

import java.util.Arrays;

public class EqualsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int[][] original= {{1,2},{3,4}};
		
		int[][] cloned1 = Arrays.copyOf(original, original.length);
		
		System.out.println("배열 번지 비교" + original.equals(cloned1));
		System.out.println(Arrays.equals(original, cloned1));
		
		System.out.println("중첩 비교" + Arrays.deepEquals(original, cloned1));
	}

}

