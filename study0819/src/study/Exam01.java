package study;

import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		System.out.println("입력된 정수 :" + num);
		
		if(num>0) {
			System.out.println("양수입니다.");
		}
		else if(num<0) {
			System.out.println("음수 입니다.");
		}
		else{
			System.out.println(" 0 입니다.");
		}
	}
}
