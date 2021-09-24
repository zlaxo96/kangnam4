package ch03;

public class Exam03 {
	public static void main(String[] args) {
		
		final double ST1 = 1.10;
		final int ST2 = 128;
		
		int weight = 80;
		int height = 170;
		double x1 = ST1*weight;
		int ww = weight*weight;
		int hh = height*height;
		
		System.out.println("ww"+ww);
		System.out.println("hh"+hh);
		
		double w1 = (weight*weight)/(height*height);
		//정수/정수 -> 정수 0.1836734693877551 -> 0
		//128*0 -> 0 => 0.0
		
		double w2 = ST2*w1;
		
		System.out.println("x1:"+x1);
		System.out.println("w1:"+w1);
		System.out.println("w2:"+w2);
		
		//정수 / (실수)정수 -> 정수/실수 -> 실수
		double result = ST1*weight - (ST2*((weight*weight)/(double)(height*height)));
		System.out.println(result);
		
		
	}
}
