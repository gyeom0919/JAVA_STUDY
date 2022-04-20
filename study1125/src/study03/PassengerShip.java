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
		System.out.println("승선 희망 인원 : " + passenger + " 명");
		System.out.println("최대 승선 인원 : " + maxPassenger + "명");
		System.out.println("=======================================");
		
		if(passenger > maxPassenger) {
			System.out.println("승선 가능 인원" + (passenger - maxPassenger)+"명 초과 !!! 승선 가능 인원 " + maxPassenger + "명으로 제한합니다.");
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
