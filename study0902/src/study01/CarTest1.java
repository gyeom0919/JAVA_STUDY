package study01;

public class CarTest1 {

	public static void main(String[] args) {
		
		Car myCar = new Car();
		
		myCar.company = "Tesla";
		myCar.color = "������";
		myCar.owner = "Gyeom";
		myCar.max_sp = 300; 
		myCar.current_sp = 150;

		System.out.println("�� : " +myCar.company);
		System.out.println("��: " +myCar.color);
		System.out.println("���� : " +myCar.owner);
		System.out.println("�ְ� �ӵ�: "+myCar.max_sp);
		System.out.println("���� �ӵ�: " +myCar.current_sp);
	}

}
