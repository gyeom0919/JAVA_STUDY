package may_21;

import java.util.Scanner;

public class Exam08_09 {

	public static void main(String[] args) {

		Scanner a = new Scanner(System.in);
		Scanner b = new Scanner(System.in);
		Scanner num = new Scanner(System.in);
		
		while(true) {
			System.out.println("#### 가위 바위 보 게임입니다.####");
			System.out.println("1.게임시작     2.게임종료");
			System.out.print("번호를 입력하세요 >>");
			int numb = num.nextInt();
			
			if(numb == 1) {
				System.out.print("철수>>");
				String chul = a.nextLine();
				System.out.print("영희>>");
				String young = a.nextLine();
				
				if(chul.equals("바위")) {
					if(young.equals("보"))
						System.out.println("영희가 이겼습니다.");
					else if(young.equals("가위"))
						System.out.println("철수가 이겼습니다.");
					else
						System.out.println("비겼습니다");
				}
				
				else if(chul.equals("가위")) {
					if(young.equals("바위"))
						System.out.println("영희가 이겼습니다.");
					else if(young.equals("보"))
						System.out.println("철수가 이겼습니다.");
					else
						System.out.println("비겼습니다");
				}
				
					else {
					if(young.equals("가위"))
						System.out.println("영희가 이겼습니다.");
					else if(young.equals("바위"))
						System.out.println("철수가 이겼습니다.");
					else
						System.out.println("비겼습니다");
				}
				
				}else {
					System.out.println("#### 가위 바위 보 게임을 종료합니다. ####");
					break;
			}
			
		}
		
	}

}
