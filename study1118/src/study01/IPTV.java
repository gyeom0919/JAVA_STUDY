package study01;
//�̤ӤӤӤӰ�
public class IPTV extends ColorTV{

	String ip;

	public IPTV(String i, int size, int color) {
		super(size, color);
		this.ip = i;
	}
	
	@Override
	void printProperty() {
		System.out.printf("���� IPTV�� " + ip + " �ּ��� ");
		super.printProperty();
	}
	
	

}
