package ch04;

public class LiteralCharExam1 {

	public static void main(String[] args) {
		
		char c1 = 'w';
		char c2 = 'A';
		char c3 = '��';
		char c4 = '*';
		char c5 = '3';
		char c6 = '��';
		//�����ڵ�� 127�������� ASCII�ڵ� ���� ����
		char c7 = '\u0041';//�����ڵ� ����
		char c8 = '\uae00';//
		
		char k = '\uAE40';
		char t = '\uD0DC';
		char g = '\uADFC';
		
		System.out.println(k); 
		System.out.println(t); 
		System.out.println(g);
		
		/*
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		System.out.println(c5);
		System.out.println(c6);
		System.out.println(c7);
		*/
		
	}
}
