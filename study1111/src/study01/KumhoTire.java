package study01;

public class KumhoTire extends Tire{
	
	KumhoTire(String lo, int max){
		super(lo,max);
		}
	
	@Override
	boolean roll() {
		++accumRot;
		if(accumRot < maxRotation) {
			System.out.println(location + "K_Tire 남은 회전수 : " + (maxRotation - accumRot));
			return true;
		}else {
			System.out.println(location + "K_Tire 타이어 펑크 >>>>>");
			return false;
		}
	}

}
