package ch07_continue;

public class Continue2 {

	public static void main(String[] args) {
		
		//짝수만 출력
		for(int i=1; i<=10; i++) {
			if(i%2 !=0) {//홀수면 출력 하지 않기 - 짝수만 출력
				continue;// for문이면 i++문으로 바로 이동, 아래 println(i)문으로 실행하지 않음
			}
			System.out.println(i);
		}
		
		
	}
}
