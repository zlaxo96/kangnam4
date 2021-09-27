package ch04_while;

public class While1 {

	public static void main(String[] args) {
		
		int i=0;
		while(i<10) {
			System.out.println("Hello !!");
			System.out.println(i);
			i++;//while문은 조건이 false가 될 수 있도록 명령문이 블럭내에 추가되야함
			
			
		}
		
	}
}
