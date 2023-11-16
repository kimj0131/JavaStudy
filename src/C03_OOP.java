import myobj.PowerBank;

public class C03_OOP {
	/*
		# 객체 지향 프로그래밍 (Object Oriented Programming)
		
		 - 변수와 함수들을 하나의 개념으로 묶어서 생각하는 프로그래밍 방식
		 - 변수와 함수들을 무분별하게 사용하다보면 여러 문제점들이 발생하기 때문에 
		   현실에 존재하는 하나의 개념(객체)으로 묶어서 생각하기 시작했다.
		   
		 - 변수는 주로 객체의 현재 상태를 나타낸다.  
		 - 함수는 주로 해당 객체의 여러 기능(행동)들을 나타낸다.
		 - 함수는 해당 객체의 현재 상태를 변화시킨다.
		 - 객체 내부에서 해당 객체의 상태를 변화시키는 함수를 메서드라고 부른다.
		 
		ex) 책(book)
		
		   - 책의 현재 상태 (변수) :
		   		현재 보고 있는 페이지, 전체 페이지, 발행일, 제목, 글쓴이, 
		   		각 페이지의 낙서들, 각 낙서들의 좌표, 가격
		   - 책의 기능 (메서드) : 
		   		책을 다음 페이지로 넘긴다, 여러 페이지 넘긴다, 앞으로 넘긴다,
		   		특정 페이지에 책갈피를 꽂는다, 새로운 메모를 추가한다 등 
		   		책의 현재 상태를 변화시킬 수 있는것들
		   
		# 클래스 (Class)
		
		 - 객체지향 프로그래밍에서 말하는 객체라는 존재를 프로그래밍 언어로 표현하는 문법
		 - 클래스는 해당 객체의 설계도 역할을 한다.
		 - 클래스를 정의한 시점에서는 실제 객체가 존재하지 않는다.
		 - 클래스를 통해 만들어내는 실제 객체를 인스턴스(Instance)라고 부른다
		 - 클래스를 통해 새로운 인스턴스를 생성할 때 new를 사용한다.
	*/
	public static void main(String[] args) {
		
		// Book클래스의 인스턴스를 3개 생성했다.
		Book b1 = new Book();
		Book b2 = new Book();
		Book b3 = new Book();
		
		// 잘못된 예1 (설계도에 현재상태를 변경하려는 행동)
		// Book.currentPage = 100;
		// 잘못된 예2 (실체를 만들지않고(인스턴스생성x) 현재상태를 변경하려는 행동)
		// b4.currentPage = 20;
		
		// 생성된 인스턴스에 .을 찍고 해당 클래스의 변수와 메서드를 사용할 수 있다.
		
		// 같은 클래스로 만들어진 책들마다 각자의 현재 상태를 다르게 설정할 수 있다.
		// 동일한 형태는 가지고있음(변수(현재 상태)값만 다름)
		b1.maxPage = 100;
		b1.currentPage = 37;
		
		b2.maxPage = 200;
		b2.currentPage = 3;
		
		b3.used = true;
		
		b1.printBookInfo();
		b2.printBookInfo();
		b3.printBookInfo();
		
		// 클래스에 정의한 메서드로 각 인스턴스를 변화시킬 수 있다.
		for (int i = 0; i < 10; i++) {
			b1.nextPage();
			b2.prevPage();
		}
		
		b1.printBookInfo();
		b2.printBookInfo();
		b3.printBookInfo();
		
		System.out.println("=================================");
		
		PowerBank pb1 = new PowerBank();
		PowerBank pb2 = new PowerBank();
		PowerBank pb3 = new PowerBank();
		
		pb1.maxCharge = 10.0;
		pb1.currentCharge = 3.8;
		
		pb2.maxCharge = 100.0;
		pb2.currentCharge = 2.52;
		
		pb3.maxCharge = 100.0;
		pb3.currentCharge = 99.89;
		
		pb1.powerBankInfo();
		pb2.powerBankInfo();
		pb3.powerBankInfo();
		System.out.println("=================================");
		
		for (int i =0; i < 256; i++) {
			pb1.reCharge();
			pb2.charging();
			pb3.charging();
		}
		pb1.powerBankInfo();
		pb2.powerBankInfo();
		pb3.powerBankInfo();
		
		
		Vehicle v1 = new Vehicle();
		Gun g1 = new Gun();
		
		v1.price = 50000000;
		v1.gun = g1;
		v1.gun.bullet = 30;
		
		for (int i = 0; i < 10; i++) {
			v1.gun.fire();
		}
		
		System.out.println(v1.getGrade());
	}
}



// 책 클래스 (설계도)
class Book{
	// n 가지의 변수(현재 상태)를 가지고 있다
	// == 필드, 멤버 변수, 인스턴스 변수, ...
	int maxPage;
	int currentPage;
	boolean used;
	String[] contents;
	
	// 클래스의 인스턴스 변수는 배열처럼 자동으로 초기화가 되어있다.
	// int - 0, float, double - 0.0, boolean - false ...
	
	// 클래스 내부의 함수(메서드)
	//  - 주로 현재 인스턴스(this)의 상태를 변화시키는 역할을 한다.
	void nextPage() {
		if(this.maxPage > this.currentPage) {
			this.currentPage++;
		} else {
			System.out.println("[Warning] 이미 책의 맨 뒤 페이지입니다.");
		}
	}
	
	void prevPage() {
		if(this.currentPage > 0) {
			this.currentPage--;
		} else {
			System.out.println("[Warning] 이미 책의 맨 앞 페이지입니다.");
		}
	}
	
	void printBookInfo() {
		System.out.printf("현재 책 상태 %d/%d(%s)\n", this.currentPage, this.maxPage, this.used ? "중고" : "새제품");
	}
}

/*
 	연습 >>
 	실제로 존재하는 현실의 객체를 하나 참고하여 클래스를 생성한 후
 	해당 클래스의 인스턴스를 생성하고 각 인스턴스의 상채를 출력해보세요
 	(인스턴스 3개이상, 필드 3개 이상, 메서드 2개이상, 책은 금지)
*/
//class PowerBank {
//	double maxCharge;
//	double currentCharge;
//	boolean needRecharge;
//	
//	void reCharge() {
//		if (this.maxCharge > this.currentCharge) {
//			this.currentCharge += 0.01 * (maxCharge / 100);
//		} else {
//			System.out.println("이미 충전이 완료되었습니다.");
//		}
//	}
//	
//	void charging() {
//		if (this.currentCharge > 0 && this.currentCharge != 0) {
//			this.currentCharge -= 0.01 * (maxCharge / 100);
//		} else if(this.currentCharge < 0) {
//			this.currentCharge = 0;
//		} else {
//			System.out.println("보조배터리의 남은 용량이 없습니다.");
//		}
//	}
//	
//	void powerBankInfo() {
//		if (currentCharge < (maxCharge / 100) * 40.0) {
//			this.needRecharge = true;
//		}else {
//			this.needRecharge = false;
//		}
//		System.out.printf("현재 충전상태 : %5.2f/%-3.0f [%s]\n", this.currentCharge, this.maxCharge, this.needRecharge ? "충전 필요" : "");
//	}
//	
//}

// 예제
class Gun{
	String name;
	int damage;
	int bullet;
	double attackSpeed;
	
	void fire() {
		if(bullet > 0) {
			System.out.printf("총을 쐈습니다! %d/30\n", --bullet);
		}
	}
}

class Vehicle {
	// Gun클래스의 gun인스턴스를 생성
	Gun gun;
	String name;
	int price;
	int fuel;
	
	void addFuel(int liter) {
		this.fuel += liter;
	}
	
	String getGrade() {
		if(price > 100000000) {
			return "럭셔리카";
		} else if(price > 80000000) {
			return "고급차";
		} else {
			return "서민차";
		}
	}
}



