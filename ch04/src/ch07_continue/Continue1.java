package ch07_continue;

public class Continue1 {

	public static void main(String[] args) {
		
		//Ȧ���� ���
		for(int i=1; i<=10; i++) {
			if(i%2==0) {//%2¦���� ��� ���� �ʱ� - Ȧ���� ���
				continue;// for���̸� i++������ �ٷ� �̵�, �Ʒ� println(i)������ �������� ����
			}
			System.out.println(i);
		}
		
		
	}
}
