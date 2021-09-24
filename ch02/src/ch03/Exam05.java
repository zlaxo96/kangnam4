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
		
		//표준체중 구하는 공식
		System.out.println("표준체중 :" + w1);
		
		//표준 체지방량 계산
		//남성표준 =  (1.10  * 체중kg ) - ( 128 * ( 체중kg / 키cm^2 ) )
		//double result = (x1) - (int)(ST2 * w1);
		//답이 계속 이상하게 나와서 아래 메소드로 변경
		
		//체지방량 산출법
		//체지방률 / 100 * 현재체중
		double result = w1 / ST3 *weight;
		
		
		System.out.println("체지방량 :" + result);
		
		//표준 체지방률 계산
		//제지방률% = (체지방량kg * 100 ) / 체중kg
		int df = (int)(((result) * ST3) / (weight));
		
		
		System.out.println("체지방률 :"+df+"%");
		
	}
}
