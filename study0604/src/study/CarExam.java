package study;

public class CarExam {

	public static void main(String[] args) {

		Car mycar1 = new Car();
		Car mycar2 = new Car();
		
		mycar1.color= "�����";
		mycar1.model= "���";
		
		mycar2.color = "�����";
		mycar2.model = "�ҳ�Ÿ";
		

		System.out.println("mycar1 �� mycar2�� ���� ��ü�ΰ���?" + (mycar1 == mycar2));
		System.out.println("mycar1 �� mycar2�� ���� �����ΰ���?" + (mycar1.color.equals (mycar2.color)));
		
		System.out.println("mycar1�� ����?" + mycar1.model);
		System.out.println("mycar2�� ����?" + mycar2.model);
		
		
	}

}
