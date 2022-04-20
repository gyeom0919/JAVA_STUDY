package study04;

public class SampleTest {

	public static void main(String[] args) {
		
		Sample sam = new Sample();
		
		sam.x = 5;
		
		Sample.set_y(10);
		System.out.println("y의 값 : " + Sample.get_y());
		System.out.println("x의 값 : " + sam.x);

	}

}
