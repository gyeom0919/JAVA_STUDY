package study;

import java.util.Scanner;

public class Exam13 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int season;
		int retry;
		
		do {
			
				System.out.println("1 ~ 12 ������ ���ڸ� �Է��ϼ���.");
				season = sc.nextInt();
			
	
			switch(season)  {
			case 3: case 4: case 5:
				System.out.println("���� = ��");
				break;
			case 6: case 7: case 8:
				System.out.println("���� = ����");
				break;
			case 9: case 10: case 11:
				System.out.println("���� = ����");
				break;
			default:
				System.out.println("���� = �ܿ�");
		}
			System.out.println("\n=========================");
			System.out.print("�ٽ� �Ϸ���\"1\", �����Ϸ��� \"0\"�� �Է��ϼ���. >>");
			retry = sc.nextInt();
		}while(retry ==1);	
		System.out.println("���α׷� ����");
		}
	}

