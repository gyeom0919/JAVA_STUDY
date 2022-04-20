package dec_1;

import java.util.Scanner;

public class Km2Mile extends Converter {
	
	Scanner scan = new Scanner(System.in);

	//Km2Mile(double ratio) {
	//	this.ratio = ratio;
	//	return;
	//}

	@Override
	protected double convert(double src) {
		// TODO Auto-generated method stub
		return src/ratio;
	}

	@Override
	protected String getInString() {
		// TODO Auto-generated method stub
		return "Km";
	}

	@Override
	protected String getOutString() {
		// TODO Auto-generated method stub
		return "Mile";
	}

	@Override
	protected void setratio() {
		System.out.print("비율을 입력해 >>");
		ratio = scan.nextDouble();
	}

}
