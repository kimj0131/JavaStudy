package quiz;

import java.util.Scanner;

public class B02_ConditionQuiz {
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
	
	public static void main(String[] args) {
		
		int a = 13;
		int b = 4;
		int c = 28;
		int d = 20;
		int e = 50;
		int year = 2004;
		boolean powerOn = false;
		String str = "yes";
		
		
		System.out.println("1." + (10<a && a<20));
		System.out.println("2." + (b%2 == 0));
		System.out.println("3." + (c%7 == 0));
		System.out.println("4." + ((d-e) == 30 || (e-d) == 30));
		System.out.println("5." + (year%400 == 0 || year%4 == 0 && year%100 != 0)); 		// 앞쪽 비교연산부터 실행
		System.out.println("6." + !powerOn);
		System.out.println("7." + (str == "yes"));
		
		
	}

}
