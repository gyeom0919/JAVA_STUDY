package study;

import java.util.Scanner;

public class Exam03 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int x = scan.nextInt();
		int y = scan.nextInt();
		
		System.out.println("x�� �Է� :" + x);
		System.out.println("y�� �Է� :" + y);
		
		if(y%x==0) {
			System.out.println(x + "��" + y + "�� ����Դϴ�.");
		}
		else {
			System.out.println(x + "��" + y + "�� ����� �ƴմϴ�.");
		}
		
		
	}

}
