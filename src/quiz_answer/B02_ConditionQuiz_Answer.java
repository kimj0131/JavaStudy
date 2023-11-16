package quiz_answer;

import java.util.Scanner;

public class B02_ConditionQuiz_Answer {
	
	/*
	  # 알맞은 비교 연산을 만들어 보세요
	  
	    1. int형 변수 a가 10보다 크고 20보다 작을 때 true
	    2. int형 변수 b가 짝수일때 true
	    3. int형 변수 c가 7의 배수일 때 true
	    4. int형 변수 d와 e의 차이가 30일 때 true
	    5. int형 변수 year가 400으로 나누어 떨어지거나 또는 4로 나누어 떨어지고 100으로 나누어 떨어지지 않을 때 true
	    6. boolean형 변수 powerOn이 false일 때 true
	    7. 문자열 참조변수 str이 "yes"일 때 true
	    
	*/
	
	// 답안
	public static void main(String[] args) {
		
		
		// 1. int형 변수 a가 10보다 크고 20보다 작을 때 true
		int a = 3;
		System.out.println(a>10 && a<20);
		// 2. int형 변수 b가 짝수일때 true
		int b = 10;
		System.out.println(b%2 == 0);
		// 3. int형 변수 c가 7의 배수일 때 true
		int c = 7;
		System.out.println(c%7 == 0);
		// 4. int형 변수 d와 e의 차이가 30일 때 true
		int d = 40, e = 10;
		System.out.println(d-e == 30 || e-d == 30);
		System.out.println(Math.abs(d-e) == 30);
		// 5. int형 변수 year가 400으로 나누어 떨어지거나 또는 4로 나누어 떨어지고 100으로 나누어 떨어지지 않을 때 true
		// (2월이 하루 더 있는 해를 구하는 방식) (윤년)
		int year = 2023;
		// && 를 ||보다 먼저한다.
		System.out.println(year%4 == 0 && year%100 != 0 || year%400 == 0);
		// 6. boolean형 변수 powerOn이 false일 때 true
		boolean powerOn = false;
		System.out.println(!powerOn);
		// 7. 문자열 참조변수 str이 "yes"일 때 true
		Scanner sc = new Scanner(System.in);
		
		String str = "yes";
		System.out.println(str == "yes");
				
		System.out.print("정말 제출 하시겠습니까? (yes/no) > ");
		String userInput = sc.next();
		System.out.println(userInput.equals("yes"));			// 문자열은 == 으로 비교하면 안된다. (될때도 있고 안될때도 있음)
		// 문자열은 비교할 때 .equals() 메소드를 사용해야 한다. -> ex) (userInput의 문자열과 입력받은 문자열이 같은지 비교)
		// (모든 참조형 변수는 equals() 메소드를 통해 비교해야 한다.)
		
	}

}
