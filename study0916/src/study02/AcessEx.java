package study02;

public class AcessEx {

	public static void main(String[] args) {

		Sample s = new Sample();
		
		s.a = 10;
		s.get_b(); // private�̱⶧���� �ҷ����� �Ұ���
		s.c = 30;
		System.out.println("a : " + s.a);
		System.out.println("b : " + s.get_b());
		System.out.println("c : " + s.c);
	}

}
