package may_21;

import java.util.Scanner;

public class Exam06 {

	public static void main(String[] args) {

		System.out.println("��(*)�� ����� ���� ���� �Է��Ͻÿ� >> ");
		
		Scanner star = new Scanner(System.in);
		
		int hang = star.nextInt();
		
		for(int i=1; i<=hang;i++) {
			for(int j=1; j<=hang-i; j++) {
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

}
