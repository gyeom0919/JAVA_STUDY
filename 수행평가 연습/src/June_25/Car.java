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
		System.out.println("���� �õ��� �������ϴ�.");
	}
	
	void keyOff() {
		System.out.println("���� �õ��� �������ϴ�.");
	}
	
	void run() {
		System.out.println("���� �������Դϴ�.");
	}
	
	void speedUp(int speed) {
		this.currentspeed += speed;
		System.out.println("���� �ӵ��� " + this.currentspeed );
	}
	void speedDown(int speed) {
		this.currentspeed -= speed;
		System.out.println("���� �ӵ��� "+ this.currentspeed);
	}
	int addgas(int gas) {
		System.out.println("���� = " + gas + "����");
		return gas;
	}
	
	void print() {
		System.out.println("���� ���� = " + model);
		System.out.println("���� �ְ�ӷ��� = " + max_speed);
		System.out.println("���� ���� = " + color);
	}
}
