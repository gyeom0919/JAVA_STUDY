package dec2;
import java.util.Scanner;
public class GoodCalculator extends Calculator{

	Scanner scan = new Scanner(System.in);
	@Override
	public int add() {
		return x+y;
	}
	
	@Override
	public int subtract() {
		return x-y;
	}

	@Override
	public double average(int[] a) {
		int sum = 0;
		for(int i = 0; i < a.length; i++) {
			sum += a [i];
		}
		return (double)sum/a.length;
	}

	@Override
	public int mul() {
		return x*y;
	}

	@Override
	public void setxy() {
		x = scan.nextInt();
		y = scan.nextInt();
	}
}
