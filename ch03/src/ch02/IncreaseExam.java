package ch02;

public class IncreaseExam {
	public static void main(String[] args) {
		int x= -1;
		//x++;//0
		
		//������ x���� ���꿡 ���
		if((5/x++)==5) {//
			System.out.println("true");
		}else {
			System.out.println("false");	
		}
		
		//������ x�� �� ���
		System.out.println(x);
	}
}
