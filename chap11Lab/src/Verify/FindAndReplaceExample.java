package Verify;

public class FindAndReplaceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "��� ���α׷��� �ڹ� ���� ���� �� �� �ִ�";
			int index = str.indexOf("");
			if(index == -1) {
				System.out.println("�ڹ� ���ڿ��� ���ԵǾ� ���� �ʴ�");
			}else {
				System.out.println("�ڹ� ���ڿ��� ����");
				str = str.replace("�ڹ�", "java");
				System.out.println("-->"+str);
			
			}
		
	}

}
