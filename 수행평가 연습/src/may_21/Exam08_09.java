package may_21;

import java.util.Scanner;

public class Exam08_09 {

	public static void main(String[] args) {

		Scanner a = new Scanner(System.in);
		Scanner b = new Scanner(System.in);
		Scanner num = new Scanner(System.in);
		
		while(true) {
			System.out.println("#### ���� ���� �� �����Դϴ�.####");
			System.out.println("1.���ӽ���     2.��������");
			System.out.print("��ȣ�� �Է��ϼ��� >>");
			int numb = num.nextInt();
			
			if(numb == 1) {
				System.out.print("ö��>>");
				String chul = a.nextLine();
				System.out.print("����>>");
				String young = a.nextLine();
				
				if(chul.equals("����")) {
					if(young.equals("��"))
						System.out.println("���� �̰���ϴ�.");
					else if(young.equals("����"))
						System.out.println("ö���� �̰���ϴ�.");
					else
						System.out.println("�����ϴ�");
				}
				
				else if(chul.equals("����")) {
					if(young.equals("����"))
						System.out.println("���� �̰���ϴ�.");
					else if(young.equals("��"))
						System.out.println("ö���� �̰���ϴ�.");
					else
						System.out.println("�����ϴ�");
				}
				
					else {
					if(young.equals("����"))
						System.out.println("���� �̰���ϴ�.");
					else if(young.equals("����"))
						System.out.println("ö���� �̰���ϴ�.");
					else
						System.out.println("�����ϴ�");
				}
				
				}else {
					System.out.println("#### ���� ���� �� ������ �����մϴ�. ####");
					break;
			}
			
		}
		
	}

}
