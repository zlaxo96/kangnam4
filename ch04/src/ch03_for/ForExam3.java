package ch03_for;

public class ForExam3 {
	public static void main(String[] args) {
		
		//1~100까지의 합 구하기
		int sum=0;
		for(int i=1;i<=10; i++) {
			System.out.println(i);
			sum +=i;
		}
		System.out.println(sum);
	}
}
