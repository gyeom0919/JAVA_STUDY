package study01;

import java.util.Scanner;

public class CarTest3 {

	public static void main(String[] args) {

		Car myCar = new Car();
		
		Scanner scan = new Scanner(System.in);
		System.out.printf("���� �ӵ���");
		int speed = scan.nextInt();
		
	
		
		myCar.md("���");
		myCar.run(speed);
		
	}
		}

		
