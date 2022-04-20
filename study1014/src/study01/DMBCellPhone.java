package study01;

public class DMBCellPhone extends Cellphone{

	int channel;
	DMBCellPhone(String model,String color, int channel){
		this.model = model;
		this.color = color;
		this.channel = channel;
	}
	
	void turnOn() {
		System.out.println("채널" + channel + "번 DMB 방송 수신을 시작합니다.");
	}
	void changeChannel(int ch) {
		System.out.println("채널" + ch + "번으로 바꿉니다.");
	}
	
	void turnOff() {
		System.out.println("DMB 방송을 종료합니다.");
	}
}
