package study01;

public class Car {
	
	String company = "Hyundai";
	String model;
	int max_spd; //최고속도
	int cur_spd; //현제속도
	int gas;
	
	Car(String m, int m_s){
		this.model = m;
		this.max_spd = m_s;
	}
	
	void set_cs(int scan){ //현재속도 스캔 ( int scan ) << 입력받기
		cur_spd = scan ;
	}
	
	void set_gas(int gas_s) {
		gas = gas_s;
	}
	
	boolean isEmptyGas() {
		if(this.gas == 0) {
			System.out.println("가스가 없습니다.");
			return true; // ★ 강제로 종료하고 싶을 때 return 사용 가능 ★
		}else {
			System.out.println("가스가 남아있습니다");
			return false; // 리턴문 다음 줄에 실행된 실행문은 실행되지 않는다.
		}
	}
	
	void run() {
		while(true) {
			if(gas>0) {
				System.out.printf("차가 주행을 시작합니다. 현재 속도는 %d km/s , 가스 잔량은 %d 리터입니다", cur_spd , gas );
				if(cur_spd < 60) {
					cur_spd += 10;
				}
				return;
			}else {
				System.out.println("차가 주행을 멈춥니다. 가스 잔량 %d 리터", gas);
			}
		}
	}
	
	
 	

}
