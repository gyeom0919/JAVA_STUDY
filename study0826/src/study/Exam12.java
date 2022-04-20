package study;

import java.util.Scanner;

public class Exam12 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		
		System.out.print("합을 구할 숫자 : ");
		int first = sc.nextInt();
		
		for(int i=1;i<=first;i++) {
			System.out.print(i);
			if(i<first) {
			System.out.print("+");
		}
			sum = sum + i;
		}
		System.out.println("의합은 : "+ sum);
	}
}
