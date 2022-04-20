package study01;

public class CarTest1 {

	public static void main(String[] args) {
		
		Car myCar = new Car();
		
		myCar.company = "Tesla";
		myCar.color = "검정색";
		myCar.owner = "Gyeom";
		myCar.max_sp = 300; 
		myCar.current_sp = 150;

		System.out.println("모델 : " +myCar.company);
		System.out.println("색: " +myCar.color);
		System.out.println("주인 : " +myCar.owner);
		System.out.println("최고 속도: "+myCar.max_sp);
		System.out.println("현재 속도: " +myCar.current_sp);
	}

}
