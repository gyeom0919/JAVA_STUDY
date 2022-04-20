package study;

public class Exam05 {

	public static void main(String[] args) {

		int i=1;
		int sum = 0;
		while(i<=100) {
			sum = i+sum;
			i++;
		}
		System.out.println("1~100까지의 합 :" + sum);
	}

}
