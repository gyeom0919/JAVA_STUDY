package study;

import java.util.Scanner;

public class Exam05 {

	public static void main(String[] args) {

		Scanner taemin = new Scanner(System.in);
		System.out.print("�Է¹��� ���� : ");
		int ten = taemin.nextInt();
		
		
		
		if(ten % 10 ==0) {
			System.out.println("�Է¹��� ���� " +ten+"�� 10�� ��� �Դϴ�.");
		}
		else {
			System.out.println("�Է¹��� ����" +ten+"�� 10�� ����� �ƴմϴ�.");
		}
	}

}
