package dec_1;

import java.util.Scanner;

public class Won2Dollar extends Converter{
	
	Scanner scan = new Scanner(System.in);

	
	@Override
	protected double convert(double src) {
		// TODO Auto-generated method stub
		return src/ratio;
	}

	@Override
	protected String getInString() {
		// TODO Auto-generated method stub
		return "��";
	}

	@Override
	protected String getOutString() {
		// TODO Auto-generated method stub
		return "�޷�";
	}
	

	//Won2Dollar(int ratio){
	//	this.ratio = ratio;
	//}

	@Override
	protected void setratio() {
		System.out.print("������ �Է��� >>");
		ratio = scan.nextDouble();
	}
}
