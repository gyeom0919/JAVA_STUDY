package study;

public class Calculator {
	
	int plus(int x, int y) {
		int result = x+y;
		return result;
		
	}
		
	double average(int x, int y) {
		double sum = plus(x,y);
		double result = sum/2;
		return result;
		}
	void resultPrint(String message) {
		System.out.println(message);
	}
	
	void execute() {
		double result = average(7,10);
		resultPrint("실행결과 : " + result);
	}
	}


