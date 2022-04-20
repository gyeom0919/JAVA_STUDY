package study02;

public class ColorPoint extends Point {

	String color;
	
	void setco(String co) {
		this.color = co;
	}
	
	void showcolorpoint() {
		System.out.println("red"+"("+x+","+y+")");
	}
}
