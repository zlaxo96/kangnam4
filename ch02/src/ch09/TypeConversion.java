package ch09;

public class TypeConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b = 127;
		int i = 100;
		
		System.out.println(b+i); // 127(byte) + 100(int) + => 127(int) + 100(int) 227 ����� Ÿ����? int
		System.out.println(10/4); // ����/���� -> ����
		System.out.println(10.0/4); // ����/�Ǽ� -> �Ǽ�
		System.out.println((char)0x12340041); // 
		System.out.println((byte)(b+i)); //
		System.out.println((int)2.9 + 1.8);
		System.out.println((int)(2.9 + 1.8));
		System.out.println((int)2.9 + (int)1.8);
		
	}

}
