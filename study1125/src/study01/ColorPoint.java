package study01;

public class ColorPoint extends Point {
	
String color;

	public ColorPoint(int x, int y, String s) {
		super(x, y);
		
	}


	void setPoint(int x, int y) {
		move(x,y);
	}
	
	void setColor(String s) {
		this.color = s;
	}
	
	void show() {
		System.out.printf("%s 색으로 (%d,%d)", color,getX(),getY());
		return;
	}

	public static void main(String[] args) {

		ColorPoint cp = new ColorPoint(5,3, "Yellow");
		cp.setPoint(10,20);
		cp.setColor("Green");
		cp.show();
	}

}

											//	Green 색으로 (10,20)