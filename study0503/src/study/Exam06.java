package study;

public class Exam06 {

	public static void main(String[] args) {
		int num;
		while(true) {
			num=(int)(Math.random()*6)+1;
			System.out.println("뽑힌 주사위 번호 " +num);
			if(num==6) {
				break;
			}
			
		}System.out.println("준비한 프로그램을 종료한다 씹년아.");
	}

}
