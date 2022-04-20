package study0409;

import java.util.Scanner;

public class ScannerExam03 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("첫번째 숫자 입력:");
		int first = scan.nextInt();
		
		System.out.print("두번째 숫자 입력:");
		int second = scan.nextInt();
		
		System.out.println(first + second);
	}

}
