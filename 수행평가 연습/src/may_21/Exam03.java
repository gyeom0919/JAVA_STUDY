package may_21;

public class Exam03 {

	public static void main(String[] args) {

		System.out.println("#### 두개의 주사위를 던져 나온 수의 합이  5가 되면 종료 ####");
		
		
		while(true) {
			
			int eye1 = (int)(Math.random()*6+1);
			int eye2 = (int)(Math.random()*6+1);
			
			System.out.printf("(%d,%d)\n", eye1,eye2);
			
			if(eye1+eye2 == 5) {
				break;
				
			}
		}
		System.out.printf("### 주사위 게임을 종료합니다. ###");
	}

}
