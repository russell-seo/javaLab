package sec07.exam02_method;

public class StringindexOfExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String subject = "�ڹ� ���α׷���";
		
		int location = subject.indexOf("���α׷���");
		
		System.out.println(location);
		
		if(subject.indexOf("�ٴ�")!=-1) {
			System.out.println("�ڹٿ� ���õ� å");
		}else {
			System.out.println("���� ���� å");
		}
	}

}
