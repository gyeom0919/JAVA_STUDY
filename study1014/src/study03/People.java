package study03;

public class People {
	protected String name;
	protected String ssn;
	
	People(String n, String s){
		this.name = n;
		this.ssn = s;
	}
	
	void Showp() {
		System.out.println("name : " + name);
		System.out.println("ssm :" + ssn);
	}
}
