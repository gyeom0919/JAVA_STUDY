package study01;

public class CardTest {

	public static void main(String[] args) {
		
		Card C1 = new Card();
		C1.num = 7;
		C1.kind = "��";
		Card C2 = new Card();
		C2.num = 10;
		C2.kind = "��";
		
		Card.h = 80;
		Card.w = 40;
		
		//C1.h = 120; //static ���� ����Ȱ� ���� ���� �� 
		//C1.w = 60; // h , w �� ��������̱� ������ Ŭ������ ����.
		
		System.out.println("ī���� ���̴� " + C2.h + "mm �Դϴ�.");
		System.out.println("ī���� ���̴� " + C2.w + "mm �Դϴ�.");
	}

}
