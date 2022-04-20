package study01;

public class CardTest {

	public static void main(String[] args) {
		
		Card C1 = new Card();
		C1.num = 7;
		C1.kind = "♥";
		Card C2 = new Card();
		C2.num = 10;
		C2.kind = "♣";
		
		Card.h = 80;
		Card.w = 40;
		
		//C1.h = 120; //static 으로 선언된건 따로 선언 ㄴ 
		//C1.w = 60; // h , w 가 정적멤버이기 때문에 클래스로 접근.
		
		System.out.println("카드의 높이는 " + C2.h + "mm 입니다.");
		System.out.println("카드의 길이는 " + C2.w + "mm 입니다.");
	}

}
