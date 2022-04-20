package study03;

public class Student extends People{
	
	int number;
	Student(String n, String s, int numb){
		super(n,s);
		this.number = numb;
	}
	
	void stinfo() {
		System.out.println("=====학생 정보=====");
		Showp();
		System.out.println("number: "+ number );
	}

	
}
