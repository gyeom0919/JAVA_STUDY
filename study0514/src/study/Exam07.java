package study;

import java.util.Scanner;

public class Exam07 {

	public static void main(String[] args) {

		boolean run = true;
		int don = 0;
		Scanner sc= new Scanner(System.in);
		
		while(run ) { 
			System.out.println("------------------------");
			System.out.println("1.����    2.���    3.�ܰ�    4.����");
			System.out.println("------------------------");
			System.out.println("����>> ");
			int num = sc.nextInt();
			
			switch(num) {
			case 1:
				System.out.print("���ݾ�>>");
				don += sc.nextInt();
				break;
			case 2:
				System.out.print("��ݾ�>>");
				don -= sc.nextInt();
				break;
			case 3:
				System.out.print("�ܰ�>>");
				System.out.print(don);
				break;
					
			default :
				run = false;
			}
			
		}
		System.out.println("���α׷��� �����մϴ�.");
	}

}
