package study01;

public class Car {
	
	String Company = "Hyundai";
	String Model;
	int m_s;
	int c_s;
	int gas;

	
	Car(String m , int c){
		this.Model = m;
		this.c_s = c;
	}
	
	void setGas(int setGas) {
		gas = setGas;
	}
	
	boolean isEmptyGas() {
		if(gas == 0) {
			System.out.println("No Gas");
			return true;
		}else {
			System.out.println("Enough Gas");
			return false;
		}
	}
	
	void setCurrentSpeed(int setC_S) {
		c_s = setC_S;
	}
	
	void run() {
		while(true) {
			if(gas > 0 ) {
				System.out.printf("차가 %dkm/h의 속도로 주행합니다. gas 잔량 : %d리터\n", this.c_s, this.gas);
				gas--;
			if(this.c_s < 60) {
				this.c_s = this.c_s + 10;
				}
			else if (gas == 0){
				System.out.printf(" \n ===== 가스가 없습니다. 감속합니다 gas 잔량 %d ====", this.gas);
				return;
				}
			}
		}
	}
	void rundown() { 
		while(c_s > 0) {
			c_s -= 10;
			System.out.printf("\n 감속합니다. 현재 속도는 %dkm/s입니다", this.c_s);
		}
			System.out.println("\n 운헹을 시작하려면 가스를 주입하십시오.");
		}
	}
	
	
