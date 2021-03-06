package verify.exam03;

public class Student {
		private String studentNum;
		
		public Student(String studentNum) {
			this.studentNum = studentNum;
		}
		
		public String getstudentNum() {
			return studentNum;
		}

		@Override
		public int hashCode() {
			return studentNum.hashCode();
		}

		@Override
		public boolean equals(Object obj) {
			if(obj instanceof Student) {
			
				Student student= (Student) obj;// 강제형 변환, Student <- Object	
				if(studentNum.equals(student.getstudentNum())) {
						 return true;
					}
			}
				
			return false;
		}
		
		
}
