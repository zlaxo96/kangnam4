package ch07_continue;

public class Continue2 {

	public static void main(String[] args) {
		
		//¦���� ���
		for(int i=1; i<=10; i++) {
			if(i%2 !=0) {//Ȧ���� ��� ���� �ʱ� - ¦���� ���
				continue;// for���̸� i++������ �ٷ� �̵�, �Ʒ� println(i)������ �������� ����
			}
			System.out.println(i);
		}
		
		
	}
}
