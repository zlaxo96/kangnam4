package ch03;

public class Exam05 {

	public static void main(String[] args) {
		
		final double ST1 = 1.10;
		final int ST2 = 128;
		final int ST3 = 100;
		
		int weight = 75;
		double height = 1.75;
		//int ww = weight * weight;
		double hh = height * height;
		//double x1 = ST1 * weight;
		double w1 = weight / hh;
		//double w2 = ST2 * w1;
		
		//ǥ��ü�� ���ϴ� ����
		System.out.println("ǥ��ü�� :" + w1);
		
		//ǥ�� ü���淮 ���
		//����ǥ�� =  (1.10  * ü��kg ) - ( 128 * ( ü��kg / Űcm^2 ) )
		//double result = (x1) - (int)(ST2 * w1);
		//���� ��� �̻��ϰ� ���ͼ� �Ʒ� �޼ҵ�� ����
		
		//ü���淮 �����
		//ü����� / 100 * ����ü��
		double result = w1 / ST3 *weight;
		
		
		System.out.println("ü���淮 :" + result);
		
		//ǥ�� ü����� ���
		//�������% = (ü���淮kg * 100 ) / ü��kg
		int df = (int)(((result) * ST3) / (weight));
		
		
		System.out.println("ü����� :"+df+"%");
		
	}
}
