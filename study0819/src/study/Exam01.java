package study;

import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		System.out.println("�Էµ� ���� :" + num);
		
		if(num>0) {
			System.out.println("����Դϴ�.");
		}
		else if(num<0) {
			System.out.println("���� �Դϴ�.");
		}
		else{
			System.out.println(" 0 �Դϴ�.");
		}
	}
}
