package study;

import java.util.Scanner;

public class Exam14 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("몇 개의 정수를 더할까요?");
		
		int n = sc.nextInt();
		int sum = 0;
		int c = 0;
		double avg;
		for(int i=0;i<n;i++) {
			System.out.print("수를 입력하세요:");
			int numb = sc.nextInt();
			if(numb<0) {
				System.out.println("입력된 수는 음수다. 음수 더하지 않는다.");
				continue;
			}
			sum += numb;
			c++;
		}
		avg=(double)sum/c;
		System.out.println("합" +sum);
		System.out.println("평균"+avg);
	}

}
