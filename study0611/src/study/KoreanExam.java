package study;

public class KoreanExam {

	public static void main(String[] args) {

		Korean kor1 = new Korean("�Ѱܿ�" , "1234-5678");
		Korean kor2 = new Korean("���޷�" , "3456-7890");
		
		System.out.println("���� = " + kor1.nation);
		System.out.println("�̸� = " + kor1.name);
		System.out.println("�ֹι�ȣ = " + kor1.ssn);
		
		System.out.println("���� = " + kor2.nation);
		System.out.println("�̸� = " + kor2.name);
		System.out.println("�ֹι�ȣ = " + kor2.ssn);
	}

}
