package study01;
//이ㅣㅣㅣㅣ겸
public class IPTV extends ColorTV{

	String ip;

	public IPTV(String i, int size, int color) {
		super(size, color);
		this.ip = i;
	}
	
	@Override
	void printProperty() {
		System.out.printf("나의 IPTV는 " + ip + " 주소의 ");
		super.printProperty();
	}
	
	

}
