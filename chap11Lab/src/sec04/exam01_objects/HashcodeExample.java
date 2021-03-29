package sec04.exam01_objects;

import java.util.Objects;

public class HashcodeExample {
	public static void main(String[] args) {
		Student s1 = new Student(1,"ȫ�浿");
		Student s2 = new Student(1,"ȫ�浿");
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
		//ObjectŬ������ hashCode():��ü�� �ּҰ����� �ؽ��ڵ带 �����Ѵ�.
		public int hashCode() {
			//Objects.hash():�Ű������� �־��� ���� �̿��� �ؽ��ڵ� ����
			return Objects.hash(sno, name);
		}
	}
	
