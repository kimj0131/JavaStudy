
public class C12_InnerClass {
	
	/*
		# 클래스 내부에도 클래스를 만들 수 있다
		
		- 인스턴스가 생성되어야 실체가 있는 설계도가 된다
		- 클래스 내부의 클래스는 바깥 클래스의 인스턴스가 보유한 값에 따라 영향을 받아 달라지는 클래스를 설계할 수 있다는 장점이 있다
		
		# 클래스 내부의 스태틱 클래스
		
		- 인스턴스에 영향을 받지 않는 내부 클래스를 생성할 수 있다.
		- 스태틱 변수에는 영향을 받는다
	*/
	int a = 10;
	
	// instance class
	class Bus {
		int num;
		int fee;
	}
	// static class
	static class Subway{
		int num;
		int fee;
	}
	
	public static void main(String[] args) {
		// 내부의 static class는 인스턴스 없이도 사용할 수 있다.
		C12_InnerClass.Subway subway =  new C12_InnerClass.Subway();
		
		System.out.println("subway num:" + subway.num);
		System.out.println("subway fee:" + subway.fee);
		
		// 내부의 instance class는 인스턴스가 존재해야 사용할 수 있다/
		C12_InnerClass instance = new C12_InnerClass();
		System.out.println(instance.a);
		
		
		// inner class는 인스턴스가 있어야 사용할 수 있는 설계도이다
		//new C12_InnerClass.new Bus(); 				   << 인스턴스를 이용하지 않아 사용할 수 없음
		C12_InnerClass.Bus bus = instance.new Bus();	// << 인스턴스를 이용해 사용이 가능해짐
		
		
		// 사용 예
		TransportMaker maker = new TransportMaker(1500);
		
		// 바깥 클래스에 설정했던 기본요금으로 버스가 생성디ㅗㄴ
		System.out.println(maker.makeBus(500));
		
		maker.defaultFee = 2300;
		System.out.println(maker.makeBus(5544));
	}
	
}

class TransportMaker {
	int defaultFee;
	
	
	class Bus{
		int fee;
		int num;
		
		public Bus(int num) {
			fee = defaultFee;
		}
		
		@Override
		public String toString() {
			return String.format("이 버스의 요금은 %d원 입니다.\n", fee);
		}
	}
	
	public TransportMaker(int defaultFee) {
		this.defaultFee = defaultFee;
 	}
	
	public Bus makeBus(int num) {
		return new Bus(num);
	}
}


