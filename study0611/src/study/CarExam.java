package study;

public class CarExam {

	public static void main(String[] args) {

		Car myCar = new Car();
		
		System.out.println("제작회사 = " + myCar.company);
		System.out.println("모델 = " + myCar.model);
		myCar.model = "모닝";
		System.out.println("모델 = " + myCar.model);
		System.out.println("현재 속도 = " + myCar.currentSpeed);
		myCar.currentSpeed = 100;
		System.out.println("현재 속도 = " + myCar.currentSpeed);
	}

}
