package study;

import java.util.Scanner;

public class Exam09 {

	public static void main(String[] args) {

		Scanner chul = new Scanner(System.in);
		Scanner game = new Scanner(System.in);
		Scanner young = new Scanner(System.in);
		
		while(true) {
		
		System.out.println("#### 가위 바위 보 게임입니다. ####");
		System.out.println("1.게임시작          2.게임종료");
		System.out.println("번호를 입력하세요>>");
		
		int number = game.nextInt();
		
		if(number == 1) {
				
			System.out.println("철수 >> ");
			String chul1 = chul.nextLine();
			System.out.println("영희>> ");
			String young1= young.nextLine();
			
			if(chul1.equals("바위")) {
				if(young1.equals("보")) 
					System.out.println("영희가 이겼다.");
				else if(young1.equals("가위")) {
					System.out.println("철수가 이겼다.");}
				else 
					System.out.println("비겼다.");}
				
				else if(chul1.equals("보")) {
					if(young1.equals("가위"))
						System.out.println("영희가 이겼다.");
					else if(young1.equals("바위")) {
						System.out.println("철수가 이겼다.");
					}
					else
						System.out.println("비겼다.");
					}
					
				else{
					if(young1.equals("바위"))
							System.out.println("영희가 이겼다.");
					else if(young1.equals("보")) {
							System.out.println("철수가 이겼다.");}
					else {
							System.out.println("비겼다.");
					}	
				}
			}
	
		else {
			System.out.println("#### 가위 바위 보 게임을 종료합니다. ####");
			break;
		}
			
		}
		
		
		}
		
		
		
	}

