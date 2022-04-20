package study01;

public class SmartTv implements RemoteControl, Searchable{

int volume;

	@Override
	public void turnOn() {
		System.out.println("SmartTV ������ �մϴ�.");
	}

	@Override
	public void turnOff() {
		System.out.println("SmartTV ������ ���ϴ�.");
	}

	@Override
	public void setvolume(int volume) {
			if(volume > RemoteControl.MAX_VOLUME) {
				this.volume = RemoteControl.MAX_VOLUME;
			}else if(volume < RemoteControl.MIN_VOLUME) {
				this.volume = RemoteControl.MIN_VOLUME;
			}else {
				this.volume = volume;
			}
			System.out.println("���� SmartTV ���� ũ�� : " + this.volume);
		}
	
	
	@Override
	public void search(String url) {
		System.out.println(url +"�� �˻��մϴ�.");
	}
}
