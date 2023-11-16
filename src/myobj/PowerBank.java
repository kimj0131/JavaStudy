package myobj;

public class PowerBank {
	public double maxCharge;
	public double currentCharge;
	public boolean needRecharge;
	
	// 기본생성자
	public PowerBank() {}
	
	// 생성자 오버로딩(값을 입력받음)
	public PowerBank(double maxCharge, double currentCharge) {
		this.maxCharge = maxCharge;
		this.currentCharge = currentCharge;
	}
	
	
	public void reCharge() {
		if (this.maxCharge > this.currentCharge) {
			this.currentCharge += 0.01 * (maxCharge / 100);
		} else {
			System.out.println("이미 충전이 완료되었습니다.");
		}
	}
	
	public void charging() {
		if (this.currentCharge > 0 && this.currentCharge != 0) {
			this.currentCharge -= 0.01 * (maxCharge / 100);
		} else if(this.currentCharge < 0) {
			this.currentCharge = 0;
		} else {
			System.out.println("보조배터리의 남은 용량이 없습니다.");
		}
	}
	
	public void powerBankInfo() {
		if (currentCharge < (maxCharge / 100) * 40.0) {
			this.needRecharge = true;
		}else {
			this.needRecharge = false;
		}
		System.out.printf("현재 충전상태 : %5.2f/%-3.0f [%s]\n", this.currentCharge, this.maxCharge, this.needRecharge ? "충전 필요" : "");
	}
	
}