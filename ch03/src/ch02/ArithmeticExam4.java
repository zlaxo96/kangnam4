package ch02;

import java.util.Scanner;

public class ArithmeticExam4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("두자리이상의 정수를 입력하세요 :");
		int input = 69;
		input = sc.nextInt();
		// 2자리 정수를 입력받아서 출력
		System.out.println("십의자리수:"+(input /10));//몫
		System.out.println("1의자리수:"+(input % 10)); //나머지
		
		
		
	}
}
