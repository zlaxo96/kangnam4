package ch01;

public class IncreaseDecreaseOperationExample2 {

	public static void main(String[] args) {
		
		/* 단항 연산자 - 증감, ++, -- */
		int x = 10;
		int y = 10;
		int z;
		
		System.out.println("-------------");
		x++;//후위연산
		System.out.println(x);
		++x;//전위연산
		System.out.println(x);
		System.out.println("-------------");
		y--;
		System.out.println(y);
		--y;
		System.out.print(y);
		System.out.print("-------------");
		
		
		
	}
}
