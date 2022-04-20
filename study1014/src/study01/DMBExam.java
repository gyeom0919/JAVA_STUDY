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
		dcp.sendvoice("��������? ���¹��Դϴ�.");
		dcp.receivevoice("�ȳ礷�ϼ���. ���� �̰��Դϴ�.");
		dcp.sendvoice("��, �ȳ��ϼ���. �ݰ����ϴ�.");
		dcp.hangup();
		System.out.println("");
		dcp.turnOn();
		dcp.changeChannel(20);
		dcp.turnOff();
		System.out.println("");
		dcp.P0();

	}

}
