package may_21;

import java.util.Scanner;

public class Exam07 {

	public static void main(String[] args) {

		
		boolean run = true;
		int don = 0; 
		Scanner scan = new Scanner(System.in);
		
		while(run) { 
			System.out.println("--------------------------------");
			System.out.println("1.����  | 2.���  | 3.�ܰ�  | 4.����");
			System.out.println("--------------------------------");
			System.out.print("����>");
			int num = scan.nextInt();
			switch(num) { 
			
				case 1:
					System.out.print("���ݾ� >>");
					don += scan.nextInt();
					break;
				case 2:
					System.out.print("��ݾ�>>");
					don -= scan.nextInt();
					break;
				case 3:
					System.out.println("�ܰ� >" + don );
					break;
				default:
					run = false;
					System.out.println("���α׷� ����");
			}
			
		}
		
		
	}

}
