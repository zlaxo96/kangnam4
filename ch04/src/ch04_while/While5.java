package ch04_while;

public class While5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1, j=2;
		
		System.out.println("������");
		while(i<=9) {
			while(j<=9) {// for(int j=2;j<=9;j++){}
				System.out.printf("%d * %d = %d \t",j,i,(i*j));//digit
				j++;
			}
			j=2;//j�� �� �ʱ�ȭ, vs for���� ���� �����ҋ� ���� �ʱ�ȭ ������, while���� �ʱ�ȭ�� ������ ���־����
			i++;
			System.out.println();
		}
		
	}
}
