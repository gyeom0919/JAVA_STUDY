package study01;

public interface RemoteControl {
	
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	void turnOn();
	void turnOff();
	void setvolume(int volume);

}


