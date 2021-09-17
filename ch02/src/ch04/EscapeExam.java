package ch04;

public class EscapeExam {

	public static void main(String[] args) {
		
		//escape문자-
		//원래글자로 표시되지않고 \와 결합해서 특수 기능을 하는 문자들
		String message = "hello\n my \t name is \"홍길동\", \n my favorite \'toys\',  디렉토리 C:\\temp";
		System.out.println(message);
		
		String message2 ="hello n my t name it \"홍길동\", n my favorite 'toys', 디렉톨리 c:\temp";
		System.out.println(message2);
		
		
	}
}
