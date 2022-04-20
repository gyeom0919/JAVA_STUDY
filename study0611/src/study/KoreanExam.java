package study;

public class KoreanExam {

	public static void main(String[] args) {

		Korean kor1 = new Korean("한겨울" , "1234-5678");
		Korean kor2 = new Korean("진달래" , "3456-7890");
		
		System.out.println("국가 = " + kor1.nation);
		System.out.println("이름 = " + kor1.name);
		System.out.println("주민번호 = " + kor1.ssn);
		
		System.out.println("국가 = " + kor2.nation);
		System.out.println("이름 = " + kor2.name);
		System.out.println("주민번호 = " + kor2.ssn);
	}

}
