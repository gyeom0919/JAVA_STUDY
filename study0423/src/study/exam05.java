package study;

public class exam05 {

	public static void main(String[] args) {

		int a= (int) (Math.random()*4)+8;
		
		System.out.println("[����ð�"+a+"��]");
		
		switch(a) {
		
		case(8):
			System.out.println("����մϴ�.");
		break;
		case(9):
			System.out.println("ȸ�Ǹ� �մϴ�.");

		case(10):
			System.out.println("������ ���ϴ�.");

		default:
			System.out.println("�ܱ��� �����ϴ�.");
		}
			
	}

}
