package June_25;

public class CarExam {

	public static void main(String[] args) {

		Car myCar = new Car("����", 300);
		
		Car yourCar = new Car("�ҳ�Ÿ", 250);
		
		
		
		myCar.color = "���";
		
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
