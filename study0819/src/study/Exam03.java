package study;

import java.util.Scanner;

public class Exam03 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int x = scan.nextInt();
		int y = scan.nextInt();
		
		System.out.println("x값 입력 :" + x);
		System.out.println("y값 입력 :" + y);
		
		if(y%x==0) {
			System.out.println(x + "는" + y + "의 약수입니다.");
		}
		else {
			System.out.println(x + "는" + y + "의 약수가 아닙니다.");
		}
		
		
	}

}
