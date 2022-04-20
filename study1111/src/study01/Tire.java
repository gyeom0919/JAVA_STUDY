package study01;

public class Tire {
	
	int maxRotation;
	String location;
	int accumRot;
	
	Tire(String location , int maxRotation){
		this.location = location;
		this.maxRotation = maxRotation;
	}
	
	boolean roll() {
		++accumRot;
		
		if(accumRot < maxRotation) {
			System.out.println(location + "Tire 남은 회전수 : " + (maxRotation - accumRot));
			return true;
		}else {
			System.out.println(location + "Tire 타이어 펑크 >>>>>");
			return false;
		}
	}

}
