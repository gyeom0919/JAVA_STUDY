package study;

import java.util.Scanner;

public class Exam06 {

	public static void main(String[] args) {

		Scanner taemin = new Scanner(System.in);
		
		System.out.print("x값 입력 :");
		int x = taemin.nextInt();
		System.out.print("y값 입력 :");
		int y = taemin.nextInt();
		
		int result = x - y;
		if(result<0) {
			result = result * -1;
	}
		if(result>10) {
			System.out.println("두 값의 차는 10 이상입니다");
		}
		else {
			System.out.println("두 값의 차는 10 이상이 아닙니다.");
		}

	}
}
