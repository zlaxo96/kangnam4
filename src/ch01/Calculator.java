package ch01;

public class Calculator {

	public/* 접근지정자 */ static void main(String[] args) {
		// 한줄 주석
		/*
		 * 범위 주석(주석은 여러줄 가능합니다)
		 */
		int result = 10 + 20/* 범위 주석 */;// 한줄 주석
		// Alt + 위/아래 화살표 = 줄바꿈
		System.out.println(result);
		System.out.println("hello");
		// sysout에서 ctrl + space bar = System.out.println()
	}

}
