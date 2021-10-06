package ch02_switch;
/* 자바 6까지 siwtch(문) 안에 - byte, char, short, int, long 변수나 정수값을 산출하는 연산식만 올 수 있다*/
public class SwitchCharExample {
	public static void main(String[] args) {
		char grade = 'B';
		
		switch(grade) {
		case 'A':
		case 'a':
			System.out.println("우수 회원입니다.");
			break;
		case 'B':
		case 'b':
			System.out.println("일반 회원입니다.");
			break;
		default:
			System.out.println("손님입니다.");
		}
		
	}
}
