package ch01_IF;

import java.util.Scanner;

public class SuccessOrFail {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("������ �Է��ϼ���(������): ");
		
		int score = scanner.nextInt();
		//dangling����(������ 1���� ��� {}���ȣ ���� ����)
		//if(score>=80) 
		//	System.out.println("���Ͽ� �հ� ���δ�\n �����մϴ�. �հ��Դϴ�.");
		
		//������ ���̸� ��{}����
		/*if(score>=80) { 
			System.out.println("���Ͽ� �հ� ���δ�\n �����մϴ�. �հ��Դϴ�.");
		}else { //score < 80
			System.out.println("���Ͽ� �հ� ���δ�\n �ƽ����ϴ�. ���հ��Դϴ�.");
		}
		*/
		if(score>=80)  
			System.out.println("���Ͽ� �հ� ���δ�\n �����մϴ�. �հ��Դϴ�.");
		else //score < 80
			System.out.println("���Ͽ� �հ� ���δ�\n �ƽ����ϴ�. ���հ��Դϴ�.");
		
		//���׿��������
		System.out.println(score>=80? "�����մϴ�. �հ��Դϴ�." : "�ƽ����ϴ�. ���հ��Դϴ�.");
		
		//�ڿ�����
		scanner.close();
		
		
	}
}
