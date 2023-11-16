
public class C14_InstanceLifeCycle {
	/*
	  	# 인스턴스 생명 주기
	  	
	  	- 하나의 인스턴스가 생성될 때 실행되는 코드의 순서
	  	
	  	  1. 스태틱 영역 (최초의 클래스 호출 시 단 한 번 실행)
	  	  2. 인스턴스 영역 (새 인스턴스 생성할 때 마다 실행)
	  	  3. 생성자 영역 (새 인스턴스 생성할 때 마다 실행)
	*/
	
	public static void main(String[] args) {
		// 스태틱 > 인스턴스 > 생성자
		new LifeCycleTest();
		new LifeCycleTest();
		new LifeCycleTest();
		new LifeCycleTest();
		new LifeCycleTest();
	}
	
}

class LifeCycleTest {
	
	// 스태틱 영역
	static int num = 10;
	static int[] numArr = {1, 2, 3, 4, 5};
	// 스태틱 블록
	static {
		for (int i = 0; i < 10; i++) {
			System.out.println("static block " + i);
		}
	}
	// 인스턴스 영역
	String text = "Hello!";
	// 인스턴스 블록
	{
		System.out.println("인스턴스 블록이 실행되었습니다.");
	}
	// 생성자 영역
	public LifeCycleTest() {
		System.out.println("생성자가 실행되었습니다.");
	}
	
}