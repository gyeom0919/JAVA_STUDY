package study01;

public class Car {
	
	Tire fl = new Tire("�� ����", 4);
	Tire fr = new Tire("�� ������", 3);
	Tire bl = new Tire("�� ����", 6);
	Tire br = new Tire("�� ����½",2);
	
	int run() { 
		System.out.println("�ڵ����� �����մϴ�.");
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
		System.out.println("�ڵ����� ����ϴ�.");
	}

}
