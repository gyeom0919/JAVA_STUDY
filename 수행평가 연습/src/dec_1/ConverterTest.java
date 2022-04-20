package dec_1;

public class ConverterTest {

	public static void main(String[] args) {

		Won2Dollar toDollar = new Won2Dollar();
		
		toDollar.setratio();
		toDollar.run();
		
		System.out.println("\n-------------------------");
		Km2Mile toMile = new Km2Mile();
		toMile.setratio();
		toMile.run();
	}

}
