package ch06;

/* �ڹ�7 ������ �������� ���ͷ� �ʱ�ȭ*/
public class LiteralEx7Exam {
	public static void main(String[] args) {
		
		//��� ��
		int price = 20_100;  // 20100�� ����
		long cardNumer = 1234_5678_1357_9998L; //1234567813579998L�� ����
		long controlBits = 0b10110100_01011011_10110011_11111000;
		long maxLong = 0x7fff_ffff_ffff_ffffL;
		int age = 2_______5;  // 25�� ����
		
		//������ �ʴ� 4���� ���
		//int x = 15; 			//����, ���ͷ� ���� ����� �� ����
		//double pi = 3_.14 	// ����, �Ҽ���(.) �յڿ� ����� �� ����
		//long idNum = 981231_1234567_L;	// _L(_F) �տ� ����� �� ����
		//int y = 0_x15;  		//����, 0x �߰��̳� ���� ����� �� ����
		
	}
}
