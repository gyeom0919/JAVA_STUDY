package study;

import java.util.Scanner;

public class exam08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String yes;
		yes = sc.next();
		
		switch(yes) {
		
		case "����": 
			System.out.println("�󿩱� 700���� ����");
			break;
		case "����":
			System.out.println("�󿩱� 500���� ����");
			break;
		default:
			System.out.println("�󿩱� 300���� ����");
		}

	}

}
