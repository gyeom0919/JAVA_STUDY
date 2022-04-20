package dec_1;

import java.util.Scanner;

public abstract class Converter {
	
	protected abstract double convert(double src);
	protected abstract String getInString ();
	protected abstract String getOutString();
	protected double ratio; 
	protected abstract void setratio();
		

	
	public void run() {
		Scanner scanner = new Scanner(System.in);
		System.out.println(getInString() + "��" + getOutString() + "�� �ٲߴϴ�.");
		System.out.print(getInString() + "�� �Է��ϼ��� >>> ");
		double val = scanner.nextDouble();
		double result = convert(val);
		System.out.println("��ȯ ��� :" + result + getOutString() + "�Դϴ�.");
	}

}
