package study01;
//�̰�
public class ColorTV extends TV {

	int color;

	public ColorTV(int size, int color) {
		super(size);
		this.color = color;
	}
	
	void printProperty() {
		System.out.println(getSize() + "inch" + color + "  colors");
	}

}
