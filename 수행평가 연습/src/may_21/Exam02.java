package may_21;

public class Exam02 {

	public static void main(String[] args) {
		
		System.out.println("#### 3�� ����� ���� ���ϴ� ���α׷� ####");
		int sum = 0;

		for(int i=1; i<=100; i++) {
			
			if(i%3==0) {
				sum += i;	
			}
		
		}
		System.out.println("1~100���� 3�� ����� ���� : " + sum);
	}

}
