package study01;

public class Cartest {

	public static void main(String[] args) {
		
		Car mycar = new Car();
		
		
		for(int i=0; i<5;i++) {
		int event = mycar.run();
		
		switch(event) {
		case 1:
			System.out.println("�� �� Ÿ�̾ �ѱ�Ÿ�̾� ��ü");
			mycar.fl = new HankookTire("�� ����", 12);
			break;
			
		case 2:
			System.out.println("�� �� Ÿ�̾ �ѱ�Ÿ�̾� ��ü");
			mycar.fr = new HankookTire("�� ������", 12);
			break;
			
		case 3:
			System.out.println("�� �� Ÿ�̾ �ѱ�Ÿ�̾� ��ü");
			mycar.bl = new KumhoTire("�� ����", 12);
			break;
			
		case 4:
			System.out.println("�� �� Ÿ�̾ �ѱ�Ÿ�̾� ��ü");
			mycar.br = new KumhoTire("�� ������", 12);
			break;
		}
		
		System.out.println("-------------------------------");
		}

	}

}
