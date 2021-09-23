package ch01_IF;

import java.util.Scanner;

public class SuccessOrFail {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("점수를 입력하세요(정수로): ");
		
		int score = scanner.nextInt();
		//dangling상태(조건이 1개인 경우 {}대괄호 생략 가능)
		//if(score>=80) 
		//	System.out.println("귀하에 합격 여부는\n 축하합니다. 합격입니다.");
		
		//조건이 참이면 블럭{}실행
		/*if(score>=80) { 
			System.out.println("귀하에 합격 여부는\n 축하합니다. 합격입니다.");
		}else { //score < 80
			System.out.println("귀하에 합격 여부는\n 아쉽습니다. 불합격입니다.");
		}
		*/
		if(score>=80)  
			System.out.println("귀하에 합격 여부는\n 축하합니다. 합격입니다.");
		else //score < 80
			System.out.println("귀하에 합격 여부는\n 아쉽습니다. 불합격입니다.");
		
		//삼항연산식으로
		System.out.println(score>=80? "축하합니다. 합격입니다." : "아쉽습니다. 불합격입니다.");
		
		//자원해제
		scanner.close();
		
		
	}
}
