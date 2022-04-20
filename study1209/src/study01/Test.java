package study01;

public class Test {

	public static void main(String[] args) {
		RemoteControl rc = new Audio();
		Searchable sr = new SmartTv();
		
		rc.turnOn();
		rc.setvolume(10);
		rc.setvolume(1);
		sr.search("");
		rc.turnOff();
		
	}

}
