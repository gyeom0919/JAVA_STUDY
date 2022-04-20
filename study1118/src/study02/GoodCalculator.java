package study02;

public class GoodCalculator extends Calculator{
	
	@Override
	public int add(int x, int y) {
		return x + y;
	}
	
	@Override
	public double average(int[] a) {
	int sum = 0;
	for(int i = 0;i < a.length; i++) {
		sum = a[i] + sum;
	}
	return (double)sum/a.length;
	}

	@Override
	public int substract(int x, int y) {
		return x - y;
	}

	public static void main(String[] args) {

			GoodCalculator gc = new GoodCalculator();
			
			int[] a = {1,2,3,4};
			
		System.out.println("두 수의 합 = "+ gc.add(2,3));
		System.out.println("두 수의 차 = "+ gc.substract(2,3));
		System.out.println("배열 항목 값의 평균 = " + gc.average(a));			
}

}


