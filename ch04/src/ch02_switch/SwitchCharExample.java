package ch02_switch;
/* �ڹ� 6���� siwtch(��) �ȿ� - byte, char, short, int, long ������ �������� �����ϴ� ����ĸ� �� �� �ִ�*/
public class SwitchCharExample {
	public static void main(String[] args) {
		char grade = 'B';
		
		switch(grade) {
		case 'A':
		case 'a':
			System.out.println("��� ȸ���Դϴ�.");
			break;
		case 'B':
		case 'b':
			System.out.println("�Ϲ� ȸ���Դϴ�.");
			break;
		default:
			System.out.println("�մ��Դϴ�.");
		}
		
	}
}
