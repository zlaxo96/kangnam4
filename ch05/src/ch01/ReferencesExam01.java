package ch01;

public class ReferencesExam01 {
	public static void main(String[] args) {
		//리터럴로 문자열 생성 - 리터럴특성 따름
		String strA= ("홍길동");//리터럴
		String strB= ("홍길동");//리터럴
		if(strA==strB) System.out.println("같은 문자열을 참조한다.");
		else System.out.println("다른 문자열을 참조한다.");
		
		//new String() - 생성자로 문자열 생성 - 참조타입 특성 따름
		//참조타입은 생성시 new 클래서명();으로 생성
		String str1= new String("홍길동");//참조타입
		String str2= new String("홍길동");//참조타입
		if(str1==str2) System.out.println("같은 문자열을 참조한다.");
		else System.out.println("다른 문자열을 참조한다.");
		
		
	}
}
