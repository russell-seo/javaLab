package sec03_exam01_equals;

public class Member {
	public String id;
	
	public Member(String id) {
		this.id = id;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member ember =(Member) obj; //강제 타입 변환
			if(id.equals(ember.id)) {
				return true;
			}
		}
		return false;
	}
	
}
