package ch02_switch;

import java.util.Scanner;

public class SwitchExample3 {

	public static void main(String[] args) {
		
		//������, ȭ����, ������, �����, �ݿ���, �����, �Ͽ���
		//��~����� : ������ �����սô�.
		//�ݿ��� : ������ �մϴ�.
		//�����, �Ͽ��� : ������ ���ϴ�.
		Scanner scanner = new Scanner(System.in);
		System.out.println("������ �Է����ּ���(ex:������): ");
		String weekDay = scanner.next();
		
		switch(weekDay) {
		case "������" : case "ȭ����": case "������" : case "�����" : System.out.println("������ �����սô�");break;
		case "�ݿ���" : System.out.println("������ �մϴ�.");break;
		case "�����" : case "�Ͽ���" : System.out.println("������ ���ϴ�.");break;
		default:System.out.println("�ٽ� �Է����ּ���.");
		}
	}

}
