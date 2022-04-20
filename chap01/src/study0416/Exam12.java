package study0416;

import java.util.Scanner;

public class Exam12 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("점수를 입력해 주세요>>");
		
		int jumsu = scan.nextInt();
		
		if(jumsu>=90) {
			System.out.println("점수는 90보다 큰 거 같습니다. ");
			System.out.println("A등급 입니다. ");
		}
		if(jumsu < 90) {
			System.out.println("점수는 90점보다 작습니다. ");
			System.out.println("점수는 B등급 입니다. ");
		}
	}

}
