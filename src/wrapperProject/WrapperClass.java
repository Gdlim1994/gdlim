package wrapperProject;

public class WrapperClass {

	public static void main(String[] args) {
		// Wrapper Class : �⺻���� ���������� ����ȯ(�ڽ�, ��ڽ� //��Ī ����ڽ�)
		//�ڽ� : �⺻�� -> ������ 
		//��ڽ� :  ������ -> �⺻��

		int i = 10;
		Integer intg = i; // �ڽ�  // Integer intg = new Interger(i); // Integer intg = (Integer)i;
		Integer intg2 = new Integer(10);
		int i2 = intg2; // ��ڽ�
		
		System.out.println(intg2 + i2);
		
		Object obj = (Object)i; //object�� �ڽ��� ����
		//int i3 = obj; // object�� ��ڽ��� �Ұ�
		
		String str = "50"; // ���ڸ� �ְԵǸ� int������ Ÿ�Ժ�ȭ�� ��Ų ���̱� ������ ������ ����.
		int i4 = Integer.parseInt(str);
		
		System.out.println(i4);
	}

}
