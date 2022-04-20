package study01;

public class Myclass {
	
	RemoteControl rc = new Television();
	
	MyClass(){	}
	
	MyClass(RemoteControl rc){
		this.rc =rc;
		rc.turnOn();
		rc.setvolume(5);
	}
	
	void methodA() {
		System.out.println("methodA()호출");
		RemoteControl rec = new Audio();
		rec.turnOn();
		rec.setvolume(3);
	}
	
	void methodB(RemoteControl rc) {
		System.out.println("methodB(RemoteControl rc) 호출");
		rc.turnOn();
		rc.setvolume(7);
	}

}
