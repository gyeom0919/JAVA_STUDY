package study;

import java.util.Scanner;

public class Exam07 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		System.out.print("x�� �Է� :");
		int x = s.nextInt();
		
		System.out.print("y�� �Է� :");
		int y = s.nextInt();
		
		System.out.print("z�� �Է� :");
		int z = s.nextInt();
		
		System.out.println("x<=y<=z ������ ������ ��");
		
		int temp;
		
	
		if(x>y) {
			temp = x;
			x = y;
			y = temp;
		}
		if(y>z) {
			temp = z;
			y = z;
			z = temp;
			}
		if(x>y) {
			temp = x;
			y = x;
			x = temp;
			}
		
		System.out.println("x =" + x);
		System.out.println("y =" + y);
		System.out.println("z =" + z);
		
	}
}

