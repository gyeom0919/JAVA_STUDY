package study02;

public class DownC {

	public static void main(String[] args) {
		
		Person p = new Student("���ϴ�");
		System.out.println("�л� �̸� : " + p.name);
		
		if( p instanceof Student) {
			System.out.println("���� p�� �����ϰ� �ִ� ��ü�� Student ��ü�Դϴ�.");
			System.out.println("p�� StudentŸ������ ���� Ÿ�� ��ȯ ����");
			
			Student s = (Student)p;
			s.department = "������Ű�";
			s.grade = "2�г�";
			s.classroom = "2��";
					
			System.out.println("�а� :" + s.department);
			System.out.println("�г� :" + s.grade);
			System.out.println("�� :" + s.classroom);
		}

	}

}
