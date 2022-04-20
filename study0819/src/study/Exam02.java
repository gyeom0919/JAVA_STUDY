package study;

import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		
		System.out.println("숫자 입력 = " + num);
		
		if(num<0) {
			num = num*-1;
			System.out.println("절댓값 = " + num);
		}
		else{
			System.out.println("절댓값="+ num);
				}
			}
	}

