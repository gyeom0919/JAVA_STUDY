package study;

import java.util.Scanner;

public class Exam05 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("별(*)의 행수를 입력해주세요>>");
		
		int num = scan.nextInt();
		
		for(int i=1;i<=num;i++) {
			for(int j=1; j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
