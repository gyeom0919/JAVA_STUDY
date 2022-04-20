package study01;

public class CarTest2 {

	public static void main(String[] args) {
		
		Car myCar = new Car();
		Car yourCar = new Car();
		
		myCar.car("Navy", "Gyeom", "S", 220, 110);

		System.out.println("회사 : " +myCar.company);
		System.out.println("색: " +myCar.color);
		System.out.println("주인 : " +myCar.owner);
		System.out.println("모델 : " + myCar.model);
		System.out.println("최고 속도: "+myCar.max_sp);
		System.out.println("현재 속도: " +myCar.current_sp);
		
		System.out.println("----------------------------------------");
		
		yourCar.car("White","Taemin", "morning", 120, 60);
		
		System.out.println("회사 : " +yourCar.company);
		System.out.println("색: " +yourCar.color);
		System.out.println("주인 : " +yourCar.owner);
		System.out.println("모델 : " + yourCar.model);
		System.out.println("최고 속도: "+yourCar.max_sp);
		System.out.println("현재 속도: " +yourCar.current_sp);
	}

}
