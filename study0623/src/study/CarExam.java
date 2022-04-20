package study;

public class CarExam {

	public static void main(String[] args) {

		Car myCar = new Car("소나타", 350);
		
		myCar.color = "검정색";
		myCar.color = "흰색";
		System.out.println("내차의 모델은 = " + myCar.model);
		System.out.println("내차의 색깔 = " + myCar.color);
		System.out.println("내차의 최고 속도는 = " + myCar.max_speed);
		
		myCar.keyOn();
		
		myCar.run();
		
		myCar.speedUp(60);
		myCar.speedUp(40);
		
		myCar.speedDown(100);
		
		myCar.keyOff();
		myCar.addgas(20);
	}
	

}
