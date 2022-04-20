package study02;

public class PlaneTest {

	public static void main(String[] args) {
		
		Sonicairplane sa = new Sonicairplane();
		
		sa.takesOff();
		sa.fly();
		sa.flymode = Sonicairplane.SUPERSONIC;
		sa.fly();
		sa.flymode = Sonicairplane.NORMAL;
		sa.fly();
		sa.land();

	}

}
