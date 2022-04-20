package study02;

public class Km2Mile extends Converter {
	
	Km2Mile(double ratio){
		this.ratio = ratio;
	}

	@Override
	protected double convert(double src) {
		
		return src/ratio;
	}

	@Override
	protected String getInString() {
		
		return "km";
	}

	@Override
	protected String getOutString() {
		
		return "mile";
	}

}
