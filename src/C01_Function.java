
public class C01_Function {

	/*
	 	# 함수 (function)
	 	 
	 	- 기능을 미리 정의해두고 나중에 불러다 쓰는 것 
	 	- 함수는 정의한 시점에서는 실행되지 않고 나중에 호출해야 실행된다.
	 	- 나중에 재사용 할 가능성이 있는 코드들을 함수로 만들어두면 작업의 반복을 줄일 수 있다.(프로그래머의 생산성이 올라간다)
	 	- 클래스 내부에 있는 함수는 매서드(method)라고 부른다
	 	
	 	# 함수의 매개변수(argument)
	 	
	 	- 함수를 호출할 때 해당 함수에 값을 전달할 수 있도록 선언해놓는 변수
	 	- 함수를 호출할 때 ()에 전달하는 값을 인자라고 한다.
	 	- 함수를 정의할 때 ()에 선언하는 인자를 받을 수 있는 변수를 매개변수라고 한다.
	 	- 매개변수의 개수에는 제한이 없다.
	 	- 매개변수 타입에 ... 을 쓰면 해당 타입 인자를 무한대로 받을 수 있다.
	 	
	 	# 함수의 타입 (리턴 타입)
	 	
	 	- 해당 함수의 실행 결과 얻게 되는 값의 타입을 지정해 놓을 수 있다.
	 	- void : 이 함수는 실행 결과로 아무값도 돌아오지 않습니다.
	 	- 그 외 타입들 : 함수를 실행하면 해당 타입 값을 반드시 돌려줍니다.
	 	- return : 해당 함수를 즉시 종료하고 함수를 호출한 곳으로 값을 보낸다.
	 	
	*/
	
	// 함수에 설명을 작성할 수 있는 주석
	/**
	 * 사과의 개수와 바구니의 크기를 입력하면 필요한 바구니의 개수를 콘솔(System.out)에 출력해주는 함수입니다.
	 * @param apple - 사과의 개수를 입력 (0이상)
	 * @param size - 바구니의 크기를 입력 (1이상)
	 */
	
	public static void howManyBasket(int apple, int size) {
		if (apple % size == 0) {
			System.out.println("필요한 바구니 개수 : " + apple / size);
		} else {
			System.out.println("필요한 바구니 개수 : " + (apple / size + 1));
		}
	}
	
	
	public static String getBasketMessage(int appleCount) {
		if (appleCount % 10 == 0) {
			return "사과의 개수가 나누어 떨어집니다.";
		} else {
			return "사과의 개수가 나누어 떨어지지 않습니다.";
		}
	}
	
	public static int getBasket(int appleCount) {
		if (appleCount % 10 == 0) {
			return appleCount / 10;
		} else {
			return appleCount / 10 +1;
		}
	}
	
	
	public static void minus(int... num) {
		// ...으로 선언한 매개변수는 배열로 받는다.(가변인자라고 한다.)
		for (int i = 0; i < num.length; i++) {
			System.out.println("빼야하는 수 : " + num[i]);
		}
	}
	
	public static void plusAll(int...num) {
		int sum = 0;
		for (int i = 0; i < num.length; i++) {
			sum += num[i];
		}
		System.out.println("총합은 " + sum + "입니다.");
	}
	
	
	// int a, int b : 매개변수
	public static void plus(int a, int b) {
		System.out.println(a + b);
	}
	
	// rabbit 함수 작성
	public static void rabbit() {
		System.out.println(" /)/)");
		System.out.println("(  ..)");
		System.out.println("(  >$");
	}
	
	public static void main(String[] args) {
//		for (int i = 0; i < 2; i++) {
//			rabbit();
//		}
		
		// 30, 33 : 인자
		plus(30, 33);
		plus(3, -99);
		
		minus(1, 2, 3, 4, 5, 6);
		minus(100);

		plusAll(1, 2, 3, 4, 5, 100, 1, 123332);
		plusAll(99, 60, 80, 5);
		
		int basket = getBasket(15);
		System.out.println("바구니의 개수 : " + basket);
	}
}
