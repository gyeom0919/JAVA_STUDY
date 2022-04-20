package study;

public class exam12 {

	public static void main(String[] args) {

		int sum = 0;
		
		for(int i=1;i<101;i++) {
			sum = i+sum;
		}
		System.out.print("1~100까지의 합 = "+sum);
	}

}
