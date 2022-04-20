package dec2;

public class CalTest {

	public static void main(String[] args) {

		GoodCalculator Gc = new GoodCalculator();
	
		Gc.setxy();
		int[] a = {2,4};
		
			System.out.println("Add : " + Gc.add());
			System.out.println("Sub : " + Gc.subtract());
			System.out.println("Mul : " + Gc.mul());
			System.out.println("Avg : " + Gc.average(a));
	}

}
