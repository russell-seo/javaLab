package sec07.exam02_method;

public class StringLenghExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ints = new int[3];
		System.out.println("ints.length="+ints.length); // 
		
		String ssn = "7306241230123";
		int length = ssn.length();//length �޼ҵ� ȣ���Ͽ� ���̤Ѥ� ���Ѵ�
		if(length==13) {
			System.out.println("�ֹι�ȣ �ڸ����� �½��ϴ�.");
		}else {
			System.out.println("Ʋ���ϴ�.");
		}
	}

}