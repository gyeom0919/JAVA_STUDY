package study0409;

import java.util.Scanner;

public class ScannerExam02 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("이름을 입력해 주세요.>>");
		String name = scan.nextLine();
		
		System.out.print("몸무게를 입력해 주세요.");
		int 몸무게 = scan.nextInt();
		
		System.out.println("name = " + name);
		System.out.println("몸무게 = " + 몸무게);
	}

}
