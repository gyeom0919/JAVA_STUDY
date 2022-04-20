package study03;

import study02.Sample;

public class Acess02 {

	public static void main(String[] args) {
		
		Sample s = new Sample();
		
		s.a = 10; // public 으로 선언 O 
		// s.b = 20; // private 불가능 only public
		//s.c = 30; // public으로 선언된 것만 가능
		System.out.println("a : " + s.a);
		//System.out.println("b : " + s.b);
		//System.out.println("c : " + s.c);

	}

}
