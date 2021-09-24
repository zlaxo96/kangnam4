package ch01_If_02;

public class RandomExample {

	public static void main(String[] args) {
		
		//난수를 이용하여
		// 61~70사이의 무작위의 값 출력, 61, 62, 63, ..., 70
		//61 +0, 61+1, 61+2 ..., 61+9
		int num = (int)(Math.random()*10);
		System.out.println(61+num);
		
	}
}
