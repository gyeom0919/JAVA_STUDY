package study02;

public class Won2Dollar extends Converter {


	Won2Dollar(double ratio){
		this.ratio = ratio;
	}
	
	@Override
	protected double convert(double src) {
		
		return src/ratio;
	}

	@Override
	protected String getInString() {
		
		return "¿ø";
	}

	@Override
	protected String getOutString() {
		
		return "´Þ·¯";
	}
	
}
