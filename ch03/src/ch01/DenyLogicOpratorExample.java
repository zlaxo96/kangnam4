package ch01;

public class DenyLogicOpratorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean play = true;
		
		System.out.println(play);
		
		play = !play; // !ture -> not true ->false
		System.out.println(play);
		
		play = !play; // !false -> not false ->true
		System.out.println(play);
		
		int i=0;
		while(play) { // true -> false
			i++;
			System.out.println("hello");
			if(i==5) play = !play; // �ݺ��� ���������� �������� ���
			
		}
		System.out.println("����");
	}

}
