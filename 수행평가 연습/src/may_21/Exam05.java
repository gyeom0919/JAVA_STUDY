package may_21;

import java.util.Scanner;

public class Exam05 {

	public static void main(String[] args) {
		
		Scanner star = new Scanner(System.in);

		System.out.println("��(*)�� ����� �� ���� �Է��ϼ��� >> ");
		
		int hang = star.nextInt();
		
		for(int i=0; i<hang; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("*");

			}System.out.println("");
		}
		
		
		
		
	}

}
