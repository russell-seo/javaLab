package sec04.exam01_objects;

import java.util.Comparator;
import java.util.Objects;

public class CompareExample {

		public static void main(String[] args) {
			Student stu1 = new Student(1);
			Student stu2 = new Student(1);
			Student stu3 = new Student(2);
			
			int result = Objects.compare(stu1, stu2, new StudentComparator());
			System.out.println(result);
			result = Objects.compare(stu1, stu3, new StudentComparator());
			System.out.println(result);
		}
		
	//정적 멤버 클래스
	static class Student{
		int sno;
		Student(int sno){
			this.sno = sno;
		}
	}
	
	static class StudentComparator implements Comparator<Student>{

		@Override
		public int compare(Student a, Student b) {
			return Integer.compare(a.sno, b.sno);
		}
		
	}
}
