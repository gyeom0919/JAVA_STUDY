package study01;

public class Cellphone {
	
	String color;
	String model;
	
	void P1() {
		System.out.println("�ڵ��� ������ �����ϴ�.");
	}
	
	void P0() {
		System.out.println("�ڵ��� ������ �����ϴ�.");
	}
		
	void bell() {
		System.out.println("���� �︳�ϴ�.");
	}
		
	void sendvoice(String me) {
		System.out.println("�� :" + me);
	}
	
	void receivevoice(String you) {
		System.out.println("���� :" + you);
	}
	
	void hangup() {
		System.out.println("��ȭ�� �����ϴ�.");
	}
	
}
