package study;

public class Exam09 {

	public static void main(String[] args) {
		// 이겸 // 

		Scanner scan = new Scanner(System.in);
	      System.out.print("값 입력:");
	      int num = scan.nextInt();
	      do {
	         System.out.println("카운트 다운=>>"+num);
	         num--;
	      }while(num>=0);
	      System.out.println("카운트 종료");
	}

}
