package exc01.exam01;

import java.util.Scanner;

public class ScannerExam01 {

	public static void main(String[] args) {

	Scanner scan = new Scanner(System.in);
	System.out.print("이름을 입력하시오.>>");
	String v1 = scan.next();
	
	System.out.println("이름은 " + v1 + "입니다.");
	}

}
