import myobj.Apple;
import myobj.PowerBank;

public class C04_Constructor {
	
	/*
	 	# 클래스의 생성자 (Constructor)
	 	
	 	- 해당 클래스의 새 인스턴스를 생성할 때 new와 함께 호출하는 것
	 	- 해당 클래스 이름과 동일한 이름으로 사용하며 리턴 타입은 적지 않는다
	 	- 클래스 내부에 선선안 생성자가 하나도 없는 경우 자동으로 기본 생성자가 생성되어있다
	*/

	public static void main(String[] args) {
		
		myobj.Apple a1 = new myobj.Apple(300, 9, 10, "red");
		myobj.Apple a2 = new myobj.Apple(330, 7, 8, "green");
		
		Apple a3 = new Apple(400, 11, 8.8, "blue");
		Apple a4 = new Apple();
		
		a1.info();
		a2.info();
		a3.info();
		a4.info();
		
		//연습 : 각자 아까 만들었던 클래스를 myobj로 옮기고 생성자를 추가해 보세요
		PowerBank pb1 = new PowerBank(100.0, 36.64);
		PowerBank pb2 = new PowerBank(10.0, 4.66);
		
		PowerBank pb3 = new PowerBank();
		pb3.maxCharge = 100.0;
		pb3.currentCharge = 39.99;
		
		pb1.powerBankInfo();
		pb2.powerBankInfo();
		pb3.powerBankInfo();
	}
}

