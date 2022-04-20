package study;

import java.util.Scanner;

public class exam07 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String munja;
		munja = sc.next();
		
		switch(munja){
		
		case "a":	
		case "A":
			System.out.println("우수회원입니다.");
			break;
		case "b":
		case "B":
			System.out.println("일반회원입니다.");
			break;
		default: 
			System.out.println("비회원입니다.");
		}
	}

}
