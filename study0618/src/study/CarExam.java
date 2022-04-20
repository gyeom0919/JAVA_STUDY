package study;

public class CarExam {

	public static void main(String[] args) {

		Car myCar = new Car("소나타", 300);
		Car yourCar = new Car("모닝");
		Car ourCar = new Car(200);
		
		//myCar.company = "현대자동차";
		myCar.color = "검정색";
		
		System.out.println(myCar.company);
		System.out.println(myCar.model);
		System.out.println(myCar.color);
		System.out.println(myCar.maxSpeed);
		
		//yourCar.company = "현대자동차";
		yourCar.color = "흰색";
		
		System.out.println(yourCar.company);
		System.out.println(yourCar.model);
		System.out.println(yourCar.color);
		System.out.println(yourCar.maxSpeed);
		
		
	}

}
