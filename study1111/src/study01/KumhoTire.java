package study01;

public class KumhoTire extends Tire{
	
	KumhoTire(String lo, int max){
		super(lo,max);
		}
	
	@Override
	boolean roll() {
		++accumRot;
		if(accumRot < maxRotation) {
			System.out.println(location + "K_Tire ���� ȸ���� : " + (maxRotation - accumRot));
			return true;
		}else {
			System.out.println(location + "K_Tire Ÿ�̾� ��ũ >>>>>");
			return false;
		}
	}

}
