package study03;
public class PassengerShip  extends Ship{
	
	String shipName;
	int maxPassenger;
	int maxLuggage;
	int passenger;
	
	public PassengerShip(String string, int i, int j) {
		this.shipName = string;
		this.maxPassenger = i;
		this.maxLuggage = j;
	}
	@Override
	public int passenger(int passenger) {
		System.out.println("�¼� ��� �ο� : " + passenger + " ��");
		System.out.println("�ִ� �¼� �ο� : " + maxPassenger + "��");
		System.out.println("=======================================");
		
		if(passenger > maxPassenger) {
			System.out.println("�¼� ���� �ο�" + (passenger - maxPassenger)+"�� �ʰ� !!! �¼� ���� �ο� " + maxPassenger + "������ �����մϴ�.");
		}else {
			return passenger;
		}
		return maxPassenger;
	}
	@Override
	public int luggage() {
		
		return maxLuggage;
	}
}
