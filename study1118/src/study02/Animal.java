package study02;
 
public abstract class Animal { // 추상클래스
	
	String kind;
	
	public void breath() {
		System.out.println("숨을 쉰다.");
	}
	
	public abstract void sound(); // 추상메소드

}
