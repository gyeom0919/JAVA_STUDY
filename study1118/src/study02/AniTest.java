package study02;

public class AniTest {

	public static void main(String[] args) {

		
		Dog dog = new Dog("포유류");
		Cat cat = new Cat();
		
		// Animal an = new Animal(); // 추상 클래스 객체 생성안됨.
		
		dog.sound();
		cat.sound();
		
		Animal an = dog;
		an.sound();
		
		an = cat;
		an.sound();
	}

}
