package study02;

public class DownC {

	public static void main(String[] args) {
		
		Person p = new Student("강하늘");
		System.out.println("학생 이름 : " + p.name);
		
		if( p instanceof Student) {
			System.out.println("현재 p가 참조하고 있는 객체는 Student 객체입니다.");
			System.out.println("p는 Student타입으로 강제 타입 변환 가능");
			
			Student s = (Student)p;
			s.department = "정보통신과";
			s.grade = "2학년";
			s.classroom = "2반";
					
			System.out.println("학과 :" + s.department);
			System.out.println("학년 :" + s.grade);
			System.out.println("반 :" + s.classroom);
		}

	}

}
