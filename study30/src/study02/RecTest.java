package study02;

public class RecTest {

	public static void main(String[] args) {

		
		Rectangle rec1 = new Rectangle(50,60);
		Rectangle rec2 = new Rectangle(50);
		Rectangle rec3 = new Rectangle();
		
		System.out.println("첫번째 사각형의 가로 세로 크기는 " + rec1.x + "," + rec1.y + "입니다.");
		System.out.println("첫번째 사각형의 가로 세로 크기는 " + rec2.x + "," + rec2.y + "입니다.");
		System.out.println("첫번째 사각형의 가로 세로 크기는 " + rec3.x + "," + rec3.y + "입니다.");
	}

}
