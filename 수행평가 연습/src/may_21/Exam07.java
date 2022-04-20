package may_21;

import java.util.Scanner;

public class Exam07 {

	public static void main(String[] args) {

		
		boolean run = true;
		int don = 0; 
		Scanner scan = new Scanner(System.in);
		
		while(run) { 
			System.out.println("--------------------------------");
			System.out.println("1.예금  | 2.출금  | 3.잔고  | 4.종료");
			System.out.println("--------------------------------");
			System.out.print("선택>");
			int num = scan.nextInt();
			switch(num) { 
			
				case 1:
					System.out.print("예금액 >>");
					don += scan.nextInt();
					break;
				case 2:
					System.out.print("출금액>>");
					don -= scan.nextInt();
					break;
				case 3:
					System.out.println("잔고 >" + don );
					break;
				default:
					run = false;
					System.out.println("프로그램 종료");
			}
			
		}
		
		
	}

}
