package study;

import java.util.Scanner;

public class exam13 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int dan;
		dan = sc.nextInt();
		
		System.out.println("**** "+ dan + "�� ****");
		
		for(int i=dan; i<=dan;i++) {
			for(int j=1;j<10;j++) {
				System.out.println(i+"x"+j+"="+ (i*j));
			}
		}
		
		
	}

}
