package study;

import java.util.Scanner;

public class Exam06 {

	public static void main(String[] args) {

		Scanner taemin = new Scanner(System.in);
		
		System.out.print("x�� �Է� :");
		int x = taemin.nextInt();
		System.out.print("y�� �Է� :");
		int y = taemin.nextInt();
		
		int result = x - y;
		if(result<0) {
			result = result * -1;
	}
		if(result>10) {
			System.out.println("�� ���� ���� 10 �̻��Դϴ�");
		}
		else {
			System.out.println("�� ���� ���� 10 �̻��� �ƴմϴ�.");
		}

	}
}
