package study;

import java.util.Scanner;

public class Exam08 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int cnum;
		
		do {
			System.out.print("���� �Է�:");
			cnum = s.nextInt();
			}while(cnum<100 || cnum>999);
				System.out.println("�Էµ� ������ "+cnum+"�Դϴ�.");
		}
	}

