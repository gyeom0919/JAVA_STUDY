package June_25;

public class Car {
	
	String model;
	String color;
	int max_speed;
	int currentspeed;
	int gas;
	
	public Car(String m, int ms) {
		this.model = m;
		this.max_speed = ms;
	}
	
	void keyOn() {
		System.out.println("차가 시동이 켜졌습니다.");
	}
	
	void keyOff() {
		System.out.println("차가 시동이 꺼졌습니다.");
	}
	
	void run() {
		System.out.println("차가 주행중입니다.");
	}
	
	void speedUp(int speed) {
		this.currentspeed += speed;
		System.out.println("현재 속도는 " + this.currentspeed );
	}
	void speedDown(int speed) {
		this.currentspeed -= speed;
		System.out.println("현재 속도는 "+ this.currentspeed);
	}
	int addgas(int gas) {
		System.out.println("주유 = " + gas + "리터");
		return gas;
	}
	
	void print() {
		System.out.println("차의 모델은 = " + model);
		System.out.println("차의 최고속력은 = " + max_speed);
		System.out.println("차의 색은 = " + color);
	}
}
