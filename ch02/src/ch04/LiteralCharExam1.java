package ch04;

public class LiteralCharExam1 {

	public static void main(String[] args) {
		
		char c1 = 'w';
		char c2 = 'A';
		char c3 = '가';
		char c4 = '*';
		char c5 = '3';
		char c6 = '글';
		//유니코드는 127번까지는 ASCII코드 값과 같다
		char c7 = '\u0041';//유니코드 문자
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
