
public class B02_Operator02 {
	
	/*
	 	# 비교 연산자
	 	
	 	 - 두 값을 비교하는 연산
	 	 - 비교 연산의 결과는 항상 참(true) 또는 거짓(false)이다.
	 	   (비교 연산의 결과는 항상 boolean 타입이다.)
	 	  
	 	# 논리 연산자
	 	
	 	 - boolean 값으로 연산하는 연산자
	 	 - && : 양 옆이 두 값이 모두 true일때 true (AND 연산)
	 	 - || : 양 옆의 두 값중 하나만 true여도 true(OR 연산)
	 	 - ! : true면 false, false면 true (NOT 연산)
	*/
	public static void main(String[] args) {
		
		int a = 10, b = 10;
		
		System.out.println(a > b);		// > : 왼쪽이 크면 true
		System.out.println(a < b);		// < : 오른쪽이 크면 true
		System.out.println(a >= b);		// >= : 왼쪽이 크거나 같으면 true
		System.out.println(a <= b);		// <= : 오른쪽이 크거나 같으면 true
		System.out.println(a == b);		// == : 두 값이 같으면 true
		System.out.println(a != b);		// != : 두 값이 다르면 true
		
		// 비교 연산은 우선 순위가 낮다.
		// ()가 없어도 산술 연산을 먼저 수행한 후 비교 연산을 진행한다.
		System.out.println(a + 5 > b * 10);
		
		// a를 2로 나누었을떄 나머지가 0이면 true (a에 짝수가 들어있으면 true)
		System.out.println(a % 2 == 0);
		
		// a는 5의 배수를 제외한 값이 true
		System.out.println(a % 5 != 0);
		
		// 논리 연산은 비교 연산보다 우선순위가 낮기 때문에
		// ()없이 비교연산을 먼저 수행한다.
		System.out.println("### AND ###");		//조건을 여러개 만족시켜야 동작하는 코드를 만들 수 있다.
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && true);		// 앞이 거짓이므로 뒤의 코드는 실행하지 않는다. (dead code)
		System.out.println(false && false);
		// ex)
		System.out.println(a % 3 == 0 && a <100 && a > -100);
		
		System.out.println("### OR ###");		
		System.out.println(true || true);		// 앞이 참이므로 뒤의 코드는 실행하지 않는다. (dead code)
		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);
		// ex)
		System.out.println(a % 3 == 0 || a <10);
		
		System.out.println("### NOT ###");		
		System.out.println(!true);
		System.out.println(!false);
		// ex)
		// a가 3보다 크지 않을때 true
		System.out.println(!(a > 3));
		
	}

}
