package study0416;

import java.util.Scanner;

public class Exam12 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("������ �Է��� �ּ���>>");
		
		int jumsu = scan.nextInt();
		
		if(jumsu>=90) {
			System.out.println("������ 90���� ū �� �����ϴ�. ");
			System.out.println("A��� �Դϴ�. ");
		}
		if(jumsu < 90) {
			System.out.println("������ 90������ �۽��ϴ�. ");
			System.out.println("������ B��� �Դϴ�. ");
		}
	}

}
