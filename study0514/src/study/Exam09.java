package study;

import java.util.Scanner;

public class Exam09 {

	public static void main(String[] args) {

		Scanner chul = new Scanner(System.in);
		Scanner game = new Scanner(System.in);
		Scanner young = new Scanner(System.in);
		
		while(true) {
		
		System.out.println("#### ���� ���� �� �����Դϴ�. ####");
		System.out.println("1.���ӽ���          2.��������");
		System.out.println("��ȣ�� �Է��ϼ���>>");
		
		int number = game.nextInt();
		
		if(number == 1) {
				
			System.out.println("ö�� >> ");
			String chul1 = chul.nextLine();
			System.out.println("����>> ");
			String young1= young.nextLine();
			
			if(chul1.equals("����")) {
				if(young1.equals("��")) 
					System.out.println("���� �̰��.");
				else if(young1.equals("����")) {
					System.out.println("ö���� �̰��.");}
				else 
					System.out.println("����.");}
				
				else if(chul1.equals("��")) {
					if(young1.equals("����"))
						System.out.println("���� �̰��.");
					else if(young1.equals("����")) {
						System.out.println("ö���� �̰��.");
					}
					else
						System.out.println("����.");
					}
					
				else{
					if(young1.equals("����"))
							System.out.println("���� �̰��.");
					else if(young1.equals("��")) {
							System.out.println("ö���� �̰��.");}
					else {
							System.out.println("����.");
					}	
				}
			}
	
		else {
			System.out.println("#### ���� ���� �� ������ �����մϴ�. ####");
			break;
		}
			
		}
		
		
		}
		
		
		
	}

