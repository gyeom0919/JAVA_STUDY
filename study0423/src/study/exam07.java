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
			System.out.println("���ȸ���Դϴ�.");
			break;
		case "b":
		case "B":
			System.out.println("�Ϲ�ȸ���Դϴ�.");
			break;
		default: 
			System.out.println("��ȸ���Դϴ�.");
		}
	}

}
