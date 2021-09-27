package ch04_while;

public class While5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1, j=2;
		
		System.out.println("구구단");
		while(i<=9) {
			while(j<=9) {// for(int j=2;j<=9;j++){}
				System.out.printf("%d * %d = %d \t",j,i,(i*j));//digit
				j++;
			}
			j=2;//j값 재 초기화, vs for문은 블럭을 시작할떄 마다 초기화 되지만, while문은 초기화를 별도로 해주어야함
			i++;
			System.out.println();
		}
		
	}
}
