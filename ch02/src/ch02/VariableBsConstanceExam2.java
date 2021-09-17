package ch02;

public class VariableBsConstanceExam2 {

	public static void main(String[] args) {
		int x = 10;
		int y;
		
		y = 20;
		x = 20;
		System.out.println(x+y);
		
		//상수 선언
		//final 타입 변수명 = 값; (상수)
		//상수는  일반적으로 대문자로 표시함 (변수와 구분하기 위함)
		final double PI = 3.141592;
		//반지름 r=5 인 원의 넓이
		//PI*r*r
		//신수타입 변수를 선언하고 실수변수 PI의 값과 정수 5를 제곱한 결과값을 저장
		double area = PI*5*5; //3.141592 * 5.0 * 5.0
		
		//출력
		System.out.println(area);
		
		//final 제거시 다른 값 출력
		//상수로 선언된 변수의 값은 초기화 후 변경시 오류발생
		//PI = 3.14;
		//area = PI*5*5;
		// 출력
		//System.out.println(area);
		

	}

}
