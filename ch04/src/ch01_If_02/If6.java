package ch01_If_02;

import java.util.Scanner;

public class If6 {

	public static void main(String[] args) {
		
	Scanner scanner = new Scanner(System.in);
	int num = scanner.nextInt();
	String str = "";
	if(num<10) str = "10미만";
	else if(num <100) str = "10이상 100미만";
	else if(num <1000) str = "100이상 10000미만";
	else str = "1000이상";
	
	System.out.println(str + "의 값입니다.");
	
	
	}
}
