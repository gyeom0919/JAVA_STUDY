package study02;

public class AniTest {

	public static void main(String[] args) {

		
		Dog dog = new Dog("������");
		Cat cat = new Cat();
		
		// Animal an = new Animal(); // �߻� Ŭ���� ��ü �����ȵ�.
		
		dog.sound();
		cat.sound();
		
		Animal an = dog;
		an.sound();
		
		an = cat;
		an.sound();
	}

}
