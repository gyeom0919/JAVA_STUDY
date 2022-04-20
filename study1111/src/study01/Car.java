package study01;

public class Car {
	
	Tire fl = new Tire("앞 왼쪽", 4);
	Tire fr = new Tire("앞 오른쪽", 3);
	Tire bl = new Tire("뒤 왼쪽", 6);
	Tire br = new Tire("뒤 오른쩍",2);
	
	int run() { 
		System.out.println("자동차가 주행합니다.");
		if(fl.roll() == false) {
			stop();
			return 1;
		}
		if(fr.roll() == false) {
			stop();
			return 2;
		}
		if(bl.roll() == false) {
			stop();
			return 3;
		}
		if(br.roll() == false) {
			stop();
			return 4;
		}
		
		return 0;
		
	}
	
	void stop() {
		System.out.println("자동차를 멈춥니다.");
	}

}
