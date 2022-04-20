package study02;

public class AcessEx {

	public static void main(String[] args) {

		Sample s = new Sample();
		
		s.a = 10;
		s.get_b(); // private이기때문에 불러오기 불가능
		s.c = 30;
		System.out.println("a : " + s.a);
		System.out.println("b : " + s.get_b());
		System.out.println("c : " + s.c);
	}

}
