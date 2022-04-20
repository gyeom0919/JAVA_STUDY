package study01;

public class DMBExam {

	public static void main(String[] args) {
		
		DMBCellPhone dcp = new DMBCellPhone("Samsung","Gray", 19);
		
		System.out.println("Model: " + dcp.model);
		System.out.println("Color: " + dcp.color);
		System.out.println("DMB Channel: " + dcp.channel);
		
		System.out.println("");
		dcp.P1();
		dcp.bell();
		dcp.sendvoice("여보세요? 김태민입니다.");
		dcp.receivevoice("안녕ㅇ하세요. 저는 이겸입니다.");
		dcp.sendvoice("네, 안녕하세요. 반갑습니다.");
		dcp.hangup();
		System.out.println("");
		dcp.turnOn();
		dcp.changeChannel(20);
		dcp.turnOff();
		System.out.println("");
		dcp.P0();

	}

}
