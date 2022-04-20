package study;

public class CalcuExam {

	public static void main(String[] args) {

		Calculator cal = new Calculator();
		
		cal.powerON();
		int sum = cal.add(5, 2);		
		System.out.println(sum);
		
		//double result = cal.division(5, 2);
		System.out.println(cal.division(5, 2));
	}

}
