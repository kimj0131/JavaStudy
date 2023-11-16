
public class C16_Abstractclass {
	/*
		# 추상 클래스 (abstract class)
		
		- 추상 메서드를 가지고 있는 클래스
		- 미구현 메서드가 남아있기 때문에 인스턴스 생성이 불가능하다.
		
		# 추상 메서드 (abstract method)
		
		- 선언만 해놓고 구현은 아직 하지 않은 메서드
		- 구현은 상속받은 자식들에게 미룰 수 있다
	*/
}

// 이 클래스는 abstract method를 포함하고 있다는 뜻 (abstract class)
abstract class Tree {
	
	String name = "나무";
	
	public void breath() {
		System.out.println("이산화탄소를 먹고 산소를 뱉어줍니다.");
	}
	
	// 나중에 상속을 받아서 제대로 구현할 메서드 (abstract method)
	abstract public void harvest();
	
	abstract public void fruit();
}

// abstract 클래스를 상속을 받으면 abstract 메서드를 구현시켜야한다.
// 자식 클래스에서 abstract method를 구현하지 않으면 컴파일러가 알려준다
class OreangeTree extends Tree {

	@Override
	public void harvest() {
		
	}

	@Override
	public void fruit() {
		
	}
	
}
// abstract 메서드의 구현을 더 미룰 수도 있다
abstract class AppleTree extends Tree {}

class GreenAppleTree extends AppleTree{

	@Override
	public void harvest() {
		
	}

	@Override
	public void fruit() {
		
	}
	
}


