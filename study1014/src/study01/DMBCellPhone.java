package study01;

public class DMBCellPhone extends Cellphone{

	int channel;
	DMBCellPhone(String model,String color, int channel){
		this.model = model;
		this.color = color;
		this.channel = channel;
	}
	
	void turnOn() {
		System.out.println("ä��" + channel + "�� DMB ��� ������ �����մϴ�.");
	}
	void changeChannel(int ch) {
		System.out.println("ä��" + ch + "������ �ٲߴϴ�.");
	}
	
	void turnOff() {
		System.out.println("DMB ����� �����մϴ�.");
	}
}
