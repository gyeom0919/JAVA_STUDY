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
				System.out.printf("���� %dkm/h�� �ӵ��� �����մϴ�. gas �ܷ� : %d����\n", this.c_s, this.gas);
				gas--;
			if(this.c_s < 60) {
				this.c_s = this.c_s + 10;
				}
			else if (gas == 0){
				System.out.printf(" \n ===== ������ �����ϴ�. �����մϴ� gas �ܷ� %d ====", this.gas);
				return;
				}
			}
		}
	}
	void rundown() { 
		while(c_s > 0) {
			c_s -= 10;
			System.out.printf("\n �����մϴ�. ���� �ӵ��� %dkm/s�Դϴ�", this.c_s);
		}
			System.out.println("\n ������ �����Ϸ��� ������ �����Ͻʽÿ�.");
		}
	}
	
	
