package ch02;

public class VariableBsConstanceExam2 {

	public static void main(String[] args) {
		int x = 10;
		int y;
		
		y = 20;
		x = 20;
		System.out.println(x+y);
		
		//��� ����
		//final Ÿ�� ������ = ��; (���)
		//�����  �Ϲ������� �빮�ڷ� ǥ���� (������ �����ϱ� ����)
		final double PI = 3.141592;
		//������ r=5 �� ���� ����
		//PI*r*r
		//�ż�Ÿ�� ������ �����ϰ� �Ǽ����� PI�� ���� ���� 5�� ������ ������� ����
		double area = PI*5*5; //3.141592 * 5.0 * 5.0
		
		//���
		System.out.println(area);
		
		//final ���Ž� �ٸ� �� ���
		//����� ����� ������ ���� �ʱ�ȭ �� ����� �����߻�
		//PI = 3.14;
		//area = PI*5*5;
		// ���
		//System.out.println(area);
		

	}

}
