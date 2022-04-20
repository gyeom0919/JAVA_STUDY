package study;

import java.util.Scanner;

public class Exam03 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("구구단 입력:");
		int num = scan.nextInt();
		System.out.println("****"+num+"단 ****");
		
		for(int i = num; i<=num; i++) {
			for(int j =1 ; j<= 9; j++) {
				System.out.println( i+"x"+j+"="+i*j);
			}
		}
	}

}
