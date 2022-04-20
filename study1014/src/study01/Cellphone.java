package study01;

public class Cellphone {
	
	String color;
	String model;
	
	void P1() {
		System.out.println("핸드폰 전원이 켜집니다.");
	}
	
	void P0() {
		System.out.println("핸드폰 전원이 꺼집니다.");
	}
		
	void bell() {
		System.out.println("벨이 울립니다.");
	}
		
	void sendvoice(String me) {
		System.out.println("나 :" + me);
	}
	
	void receivevoice(String you) {
		System.out.println("상대방 :" + you);
	}
	
	void hangup() {
		System.out.println("전화를 끊습니다.");
	}
	
}
