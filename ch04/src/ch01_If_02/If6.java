package ch01_If_02;

import java.util.Scanner;

public class If6 {

	public static void main(String[] args) {
		
	Scanner scanner = new Scanner(System.in);
	int num = scanner.nextInt();
	String str = "";
	if(num<10) str = "10�̸�";
	else if(num <100) str = "10�̻� 100�̸�";
	else if(num <1000) str = "100�̻� 10000�̸�";
	else str = "1000�̻�";
	
	System.out.println(str + "�� ���Դϴ�.");
	
	
	}
}
