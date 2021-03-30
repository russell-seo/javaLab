package Verify;

public class Student {
	private String studentNum;
	
	public Student(String studentNum) {
		this.studentNum = studentNum;
	}
	
	public String getStudentNum() {
		return studentNum;
	}

	@Override
	public int hashCode() {
		return studentNum.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student compareStudent = (Student)obj;
			return this.studentNum == compareStudent.getStudentNum();
			
			}
		else {
			return false;
		}
	}
	
	
	
	
	
}
