package sec03_exam01_equals;

import java.util.HashMap;

public class KeyExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//프로그램 = 자료구조 + 알고리즘
		//Map 자료구조 = {key, value}
		HashMap<Key, String>hashMap = new HashMap<Key, String>();
		//홍길동 객체를 저장
		hashMap.put(new Key(1), "홍길동");
		
		//식별키 "new Key(1)"로 홍길동을 읽어옴
		String value = hashMap.get(new Key(1));
		System.out.println(value);
		// key = new Key(20);
	}

}
