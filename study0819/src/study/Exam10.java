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
	         System.out.print("�߻��� ����? ");
	         s = scan.nextInt();
	         System.out.println(s>r? "�� ���� ���� �Է��ϼ���.":"�� ū ���� �Է��ϼ���.");
	      } while (s!=r);
	      
	      System.out.println("�����Դϴ�");
	   }
	}

