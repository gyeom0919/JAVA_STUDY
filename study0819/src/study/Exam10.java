package study;

import java.util.Random;
import java.util.Scanner;

public class Exam10 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	      Random random = new Random();
	      int r = random.nextInt(90)+10;
	   
	      int s;
	      do {
	         System.out.print("발생된 수는? ");
	         s = scan.nextInt();
	         System.out.println(s>r? "더 작은 수를 입력하세요.":"더 큰 수를 입력하세요.");
	      } while (s!=r);
	      
	      System.out.println("정답입니다");
	   }
	}

