package may_21;

public class Exam02 {

	public static void main(String[] args) {
		
		System.out.println("#### 3의 배수의 합을 구하는 프로그램 ####");
		int sum = 0;

		for(int i=1; i<=100; i++) {
			
			if(i%3==0) {
				sum += i;	
			}
		
		}
		System.out.println("1~100까지 3의 배수의 총합 : " + sum);
	}

}
