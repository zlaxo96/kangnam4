package ch04;

public class EscapeExam {

	public static void main(String[] args) {
		
		//escape����-
		//�������ڷ� ǥ�õ����ʰ� \�� �����ؼ� Ư�� ����� �ϴ� ���ڵ�
		String message = "hello\n my \t name is \"ȫ�浿\", \n my favorite \'toys\',  ���丮 C:\\temp";
		System.out.println(message);
		
		String message2 ="hello n my t name it \"ȫ�浿\", n my favorite 'toys', ���縮 c:\temp";
		System.out.println(message2);
		
		
	}
}
