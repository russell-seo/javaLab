package sec03_exam01_equals;

import java.util.HashMap;

public class KeyExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//���α׷� = �ڷᱸ�� + �˰���
		//Map �ڷᱸ�� = {key, value}
		HashMap<Key, String>hashMap = new HashMap<Key, String>();
		//ȫ�浿 ��ü�� ����
		hashMap.put(new Key(1), "ȫ�浿");
		
		//�ĺ�Ű "new Key(1)"�� ȫ�浿�� �о��
		String value = hashMap.get(new Key(1));
		System.out.println(value);
		// key = new Key(20);
	}

}
