package study01;

import java.util.Scanner;

public class CarTest3 {

	public static void main(String[] args) {

		Car myCar = new Car();
		
		Scanner scan = new Scanner(System.in);
		System.out.printf("현재 속도는");
		int speed = scan.nextInt();
		
	
		
		myCar.md("모닝");
		myCar.run(speed);
		
	}
		}

		
