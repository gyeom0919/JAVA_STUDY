package study01;

public class HankookTire extends Tire {
	
	HankookTire(String lo , int max){
		super(lo,max);
	}
	
	@Override
		boolean roll() {
		++accumRot;
		if(accumRot < maxRotation) {
			System.out.println(location + "G_Tire ���� ȸ���� : " + (maxRotation - accumRot));
			return true;
		}else {
			System.out.println(location + "G_Tire Ÿ�̾� ��ũ >>>>>");
			return false;
		}
		}
	

}
