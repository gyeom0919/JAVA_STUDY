package may_21;

public class Exam03 {

	public static void main(String[] args) {

		System.out.println("#### �ΰ��� �ֻ����� ���� ���� ���� ����  5�� �Ǹ� ���� ####");
		
		
		while(true) {
			
			int eye1 = (int)(Math.random()*6+1);
			int eye2 = (int)(Math.random()*6+1);
			
			System.out.printf("(%d,%d)\n", eye1,eye2);
			
			if(eye1+eye2 == 5) {
				break;
				
			}
		}
		System.out.printf("### �ֻ��� ������ �����մϴ�. ###");
	}

}
