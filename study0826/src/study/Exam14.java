package study;

import java.util.Scanner;

public class Exam14 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("�� ���� ������ ���ұ��?");
		
		int n = sc.nextInt();
		int sum = 0;
		int c = 0;
		double avg;
		for(int i=0;i<n;i++) {
			System.out.print("���� �Է��ϼ���:");
			int numb = sc.nextInt();
			if(numb<0) {
				System.out.println("�Էµ� ���� ������. ���� ������ �ʴ´�.");
				continue;
			}
			sum += numb;
			c++;
		}
		avg=(double)sum/c;
		System.out.println("��" +sum);
		System.out.println("���"+avg);
	}

}
