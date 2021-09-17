package ch02;

public class CompareExample {
	public static void main(String[] args) {
		
		System.out.print(3<5);//T
		System.out.print(3>5);//F
		System.out.print(1<=0);//F
		System.out.print(10>=10);//T
		System.out.print(1==3);//F
		System.out.print(1!=3);//T
		
		System.out.print(!(3<5));//F
		System.out.print((3<5)^(1==1)); //T ^ T = F
		System.out.print((3>5)||(1==1));//F or T = T
		System.out.print((3<5)&&(1==1));// T and T = T
	}
}
