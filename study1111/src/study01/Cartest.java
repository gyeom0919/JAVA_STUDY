package study01;

public class Cartest {

	public static void main(String[] args) {
		
		Car mycar = new Car();
		
		
		for(int i=0; i<5;i++) {
		int event = mycar.run();
		
		switch(event) {
		case 1:
			System.out.println("앞 왼 타이어를 한국타이어 교체");
			mycar.fl = new HankookTire("앞 왼족", 12);
			break;
			
		case 2:
			System.out.println("앞 오 타이어를 한국타이어 교체");
			mycar.fr = new HankookTire("앞 오른족", 12);
			break;
			
		case 3:
			System.out.println("뒤 왼 타이어를 한국타이어 교체");
			mycar.bl = new KumhoTire("뒤 왼족", 12);
			break;
			
		case 4:
			System.out.println("뒤 오 타이어를 한국타이어 교체");
			mycar.br = new KumhoTire("뒤 오른족", 12);
			break;
		}
		
		System.out.println("-------------------------------");
		}

	}

}
