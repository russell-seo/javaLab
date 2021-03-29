package sec04.exam01_objects;

import java.util.Objects;

public class HashcodeExample {
	public static void main(String[] args) {
		Student s1 = new Student(1,"홍길동");
		Student s2 = new Student(1,"홍길동");
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
	}
	
	}

	class Student {
		int sno;
		String name;
		Student(int sno, String name){
			this.sno = sno;
			this.name = name;
	}
		//Object클래스의 hashCode():객체의 주소값으로 해시코드를 생성한다.
		public int hashCode() {
			//Objects.hash():매개값으로 주어진 값들 이용해 해시코드 생성
			return Objects.hash(sno, name);
		}
	}
	
