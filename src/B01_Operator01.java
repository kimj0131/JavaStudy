
public class B01_Operator01 {
	
	/*
	 	# 연산자 (Operator)
	 	
	 	 - 계산 할 때 값 사이에 넣어서 쓰는 것
	 	 - +, -, *, /, >, <, &, ...
	 	 
	 	# 산술 연산자 
	 	
	 	 + : 더하기
	 	 - : 빼기
	 	 * : 곱하기
	 	 / : 나누기
	 	 % : 나머지
	 	 
	 	※ 나누기는 정수끼리 나누면 몫만 구하고, 계산에 실수가 포함되어 있으면 정확한 결과를 구한다.
	 	※ 정수끼리 산술 연산 결과는 정수이고 정수와 실수의 산술 연산 결과는 실수이다.
	 	
	*/
	public static void main(String[] args) {
		
		int a = 10, b = 7;
		double c = 7.0;
		
		System.out.println("a + b = " + (a + b));
		System.out.println("a - b = " + (a - b));
		System.out.println("a * b = " + (a * b));
		System.out.println("a / b = " + (a / b));
		System.out.println("a % b = " + (a % b));
		
		// n으로 나눈 나머지 연산의 결과는 0 ~ n - 1 이다.
		System.out.println(10 % 5);		// 0 
		System.out.println(11 % 5);		// 1
		System.out.println(12 % 5);		// 2
		System.out.println(13 % 5);		// 3
		System.out.println(14 % 5);		// 4
		System.out.println(15 % 5);		// 5
		
		// char타입은 문자로 보여주는 것 처럼
		// double / float 타입은 정수를 .0을 붙여 보여준다
		
		// 정수와 실수의 연산결과 확인
		System.out.println("a + c = " + (a + c));
		System.out.println("a - c = " + (a - c));
		System.out.println("a * c = " + (a * c));
		System.out.println("a / c = " + (a / c));
		System.out.println("a % c = " + (a % c));
		
		// Math.pow(a, b) ; a 제곱 b의 결과를 반환한다. (double 타입으로 반환된다)
		double result = Math.pow(2.2, 10);
		System.out.println("pow의 결과 " + result);

		// Math.sqrt(a) : a의 제곱근을 반환한다. (루트값)
		result = Math.sqrt(2);
		System.out.println("sqrt의 결과 " + result);
		
		// Math.abs(a) : a의 절대값을 반환한다. (넣은 타입으로 반환한다)
		int abs1 = Math.abs(-7);
		float abs2 = Math.abs(1.14f);
		double abs3 = Math.abs(3.33);
		
		System.out.println(abs1);
		System.out.println(abs2);
		System.out.println(abs3);
		
		// Math.round(a) : a를 소수 첫째 자리에서 반올림한 결과를 반환한다.
		System.out.println(Math.round(123.456));
		
		// Math.ceil(a) : a를 소숫 첫째 자리에서 올림한 결과를 반환한다.
		System.out.println(Math.ceil(123.111));
				
		// Math.floor(a) : a를 소수 첫째 자리에서 버림한 결과를 반환한다.
		System.out.println(Math.floor(123.999));
		
		/* 
		   # 원하는 자리에서 반올림하는 방법
		  
		   1. 반올림하고 싶은 자리를 소수 첫 번째 자리로 만든다.
		   2. 반올림하고 다시 원래대로 돌려놓는다.
		   3. 원래대로 돌려놓기 위해서는 소수로 나눠야 한다.
		*/
		double value = 123.123456;
		
		double unit = Math.pow(10, 4);		// 결과 10000
		
		System.out.println(value * unit);
		System.out.println(Math.round(value * unit));
		System.out.println(Math.round(value * unit) / unit);
		
		
		// 연습 1 : 12500을 반올림하여 13000으로 만들어보세요
		System.out.println();
		
		value = 12500;
		unit = 1000;
		System.out.println(Math.round(value / unit) * (int)unit);
		
		// 연습 2 : 1.138을 내림하여 1.13으로 만들어보세요
		
		value = 1.138;
		unit = 100;
		System.out.println(Math.floor(value * unit) / unit);
		
	}

}
