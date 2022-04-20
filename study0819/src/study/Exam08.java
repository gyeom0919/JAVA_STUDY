package study;

import java.util.Scanner;

public class Exam08 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int cnum;
		
		do {
			System.out.print("정수 입력:");
			cnum = s.nextInt();
			}while(cnum<100 || cnum>999);
				System.out.println("입력된 정수는 "+cnum+"입니다.");
		}
	}

