package study;

import java.util.Scanner;

public class Exam11 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �Է��Ͻÿ� >>");
		int scan = sc.nextInt();
		int sum = 0;
		
		for(int i=1;i<=scan;i++) {
			if(scan%i==0) {
				System.out.print(i + " ");
				sum++;
			}
		}
		System.out.println("����� ���� : " +sum);
	}

}
