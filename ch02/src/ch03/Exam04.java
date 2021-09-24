package ch03;

public class Exam04 {

	public static void main(String[] args) {
		
		final double ST1 = 1.10;
		final int ST2 = 128;
		final int ST3 = 100;
		
		int weight = 75;
		int height = 175;
		double x1 = ST1*weight;
		int ww = weight*weight;
		int hh = height*height;
		
		
		double w1 = (weight*weight)/(height*height);
		double w2 = ST2*w1;
		
		//double result = ST1*weight - (ST2*((weight*weight)/(double)(height*height)));
		double result1 = x1 - w2;
		
		int bf = (int)result1 * ST3 / weight;
		
		System.out.println(result1);
		System.out.println(bf+"%");
		
	}
}
