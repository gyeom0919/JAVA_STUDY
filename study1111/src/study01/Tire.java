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
			System.out.println(location + "Tire ���� ȸ���� : " + (maxRotation - accumRot));
			return true;
		}else {
			System.out.println(location + "Tire Ÿ�̾� ��ũ >>>>>");
			return false;
		}
	}

}
