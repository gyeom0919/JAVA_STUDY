package study03;

import study02.Sample;

public class Acess02 {

	public static void main(String[] args) {
		
		Sample s = new Sample();
		
		s.a = 10; // public ���� ���� O 
		// s.b = 20; // private �Ұ��� only public
		//s.c = 30; // public���� ����� �͸� ����
		System.out.println("a : " + s.a);
		//System.out.println("b : " + s.b);
		//System.out.println("c : " + s.c);

	}

}
