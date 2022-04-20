package June_25;

public class CarExam {

	public static void main(String[] args) {

		Car myCar = new Car("º¥Ã÷", 300);
		
		Car yourCar = new Car("¼Ò³ªÅ¸", 250);
		
		
		
		myCar.color = "Èò»ö";
		
		yourCar.print();
		
		myCar.print();
		
		myCar.keyOn();
		
		myCar.addgas(60);
		
		yourCar.addgas(50);
		
		myCar.run();
		
		myCar.speedUp(50);
		
		myCar.speedDown(50);
		
		myCar.keyOff();
		
		
		
		
		
		
		
		
		
	}

}
