package study03;

public class ShipTest {

	public static void main(String[] args) {

		PassengerShip ps = new PassengerShip("�¸�ȣ",10,100); // �¸�ȣ , �ִ� 10 , ȭ�� 10
		System.out.println("�� �̸� : " + ps.shipName);
		System.out.println(ps.shipName + "���� ž�� �ο� : " + ps.passenger(15) + "��");
		System.out.println(ps.shipName + "�ִ� ȭ�� ���緮 : " + ps.luggage() + "kg");
	}

}
