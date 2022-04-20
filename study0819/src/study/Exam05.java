package study;

import java.util.Scanner;

public class Exam05 {

	public static void main(String[] args) {

		Scanner taemin = new Scanner(System.in);
		System.out.print("입력받은 숫자 : ");
		int ten = taemin.nextInt();
		
		
		
		if(ten % 10 ==0) {
			System.out.println("입력받은 숫자 " +ten+"은 10의 배수 입니다.");
		}
		else {
			System.out.println("입력받은 숫자" +ten+"은 10의 배수가 아닙니다.");
		}
	}

}
