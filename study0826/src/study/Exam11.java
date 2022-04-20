package study;

import java.util.Scanner;

public class Exam11 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하시오 >>");
		int scan = sc.nextInt();
		int sum = 0;
		
		for(int i=1;i<=scan;i++) {
			if(scan%i==0) {
				System.out.print(i + " ");
				sum++;
			}
		}
		System.out.println("약수의 갯수 : " +sum);
	}

}
