package ch06_break;

public class Break3 {

	public static void main(String[] args) {
		//�� �� �ݺ����� ��ü ������������ �ٱ��� for���̳� while�� �տ� Label:�� ǥ���ϰ�, break�� �ڿ� Label; ǥ��
		//Label�� �̸� ���� ����(ex: A, a, z...) : for or while��
		Label: for(int i=0;i<=9;i++) {
			System.out.print("i= "+i+ "\t");
			for(int j=0; j<=9;j++) {
				System.out.print("j= "+j+"\t");
				if(j>3) break Label;//Label�� ǥ�õ� �ٱ��� for���� ���
			}
			System.out.println();//�� �� �Ʒ��� ������
		}
		
		
	}
}
