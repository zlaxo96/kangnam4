package ch09;

public class ByteOverflowExam {

	public static void main(String[] args) {
		
		//byte�� ǥ�����Ǵ� -128~127 ���̸� ����Ŭ����
		for(int i = -128;i<=228;i++) {
			System.out.println(i+":"+(byte)i);
		}
		
	}

}
