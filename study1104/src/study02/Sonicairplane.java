package study02;

public class Sonicairplane extends Airplane{
	
	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;
	public int flymode = NORMAL;
	
	@Override
	void fly() {
		if(flymode == SUPERSONIC) {
			System.out.println("���Ӻ����� �����մϴ�.");
		}else {
			super.fly();
		}
	}
}
