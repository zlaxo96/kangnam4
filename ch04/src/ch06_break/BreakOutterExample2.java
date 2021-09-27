package ch06_break;

public class BreakOutterExample2 {

	public static void main(String[] args) {
		
		//char타입 Label: for , break Label;
		a: for(char upper= 'A'; upper<='Z';upper++) {
			for(char lower='a';lower<='z'; lower++) {
				System.out.println(upper+"-"+lower);
				if(lower=='g')
					break a;
			}
		}
		System.out.println("프로그램 실행 종료");
		
	}
}
