package study01;

public class CarTest2 {

	public static void main(String[] args) {
		
		Car myCar = new Car();
		Car yourCar = new Car();
		
		myCar.car("Navy", "Gyeom", "S", 220, 110);

		System.out.println("ȸ�� : " +myCar.company);
		System.out.println("��: " +myCar.color);
		System.out.println("���� : " +myCar.owner);
		System.out.println("�� : " + myCar.model);
		System.out.println("�ְ� �ӵ�: "+myCar.max_sp);
		System.out.println("���� �ӵ�: " +myCar.current_sp);
		
		System.out.println("----------------------------------------");
		
		yourCar.car("White","Taemin", "morning", 120, 60);
		
		System.out.println("ȸ�� : " +yourCar.company);
		System.out.println("��: " +yourCar.color);
		System.out.println("���� : " +yourCar.owner);
		System.out.println("�� : " + yourCar.model);
		System.out.println("�ְ� �ӵ�: "+yourCar.max_sp);
		System.out.println("���� �ӵ�: " +yourCar.current_sp);
	}

}
