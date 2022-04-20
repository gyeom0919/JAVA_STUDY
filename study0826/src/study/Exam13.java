package study;

import java.util.Scanner;

public class Exam13 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int season;
		int retry;
		
		do {
			
				System.out.println("1 ~ 12 사이의 숫자를 입력하세요.");
				season = sc.nextInt();
			
	
			switch(season)  {
			case 3: case 4: case 5:
				System.out.println("계절 = 봄");
				break;
			case 6: case 7: case 8:
				System.out.println("계절 = 여름");
				break;
			case 9: case 10: case 11:
				System.out.println("계절 = 가을");
				break;
			default:
				System.out.println("계절 = 겨울");
		}
			System.out.println("\n=========================");
			System.out.print("다시 하려면\"1\", 종료하려면 \"0\"을 입력하세요. >>");
			retry = sc.nextInt();
		}while(retry ==1);	
		System.out.println("프로그램 종료");
		}
	}

