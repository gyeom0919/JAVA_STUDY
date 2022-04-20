package study01;

public class Car {
	
	String color;
	String owner;
	String model;
	String company = "hyundai";
	int max_sp;
	int current_sp;
	
	public void car(String model, int current_sp) {
		//this.color  = color;
		//this.owner = owner;
		this.model = model;
		//this.max_sp = max_sp;
		this.current_sp = current_sp;
	}
	void md(String model) {
		this.model = model;
		System.out.println("현재 모델은 "+this.model+"입니다.");
	}
	public void run( int current_sp) {
		
		while(true) {
			if(current_sp<60) {
			current_sp += 10;
			System.out.println("현재속도는" + current_sp +"입니다.");
			}
			if(current_sp >= 60) {
				System.out.println("현재 최고속도 입니다.");
				break;
			}
		}
	}
	
	
	
	


}
