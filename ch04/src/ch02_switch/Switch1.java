package ch02_switch;

import java.util.Scanner;

public class Switch1 {

	public static void main(String[] args) {
		
		  Scanner scanner = new Scanner(System.in);
	 System.out.println("���ڸ� �Է��ϼ���");
		int num = scanner.nextInt();
		switch(num) {
		case 1: System.out.println("L"); break;
		case 2: System.out.println("O"); break;
		case 3: System.out.println("V"); break;
		case 4: System.out.println("E"); break;
		default:System.out.println("����"); 
		
		}
		
	}
}
