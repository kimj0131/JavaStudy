public class A00_Hello {
	public static void main(String[] args) {
		
		//Sytem.out.println() : ()안에 전달한 데이터를 콘솔에 출력하는 명령어
		System.out.println("Hello, World!");
		/*
		   # ()안에 전달할 수 있는 데이터의 종류(자바의 리터럴)
		   
		   1. 그냥 숫자 : 정수(Integer), 계산 가능
		   2. "" 사이에 들어간 모든 문자 : 문자열(String), +만 가능
		   3. '' 사이에 들어간 단 하나의 문자(두 글자 이상은 안됨) : 문자(Character), 계산이 가능하긴 하다.
		   4. 소수 : 긴 실수(Double), 계산 가능
		   5. true 혹은 false : 참/거짓 데이터(boolean)
		   6. 매우 큰 숫자 뒤에 L : 큰 정수(Long), 계산 가능
		   7. 소수 뒤에 F : 짧은 실수(Float), 계산 가능
		*/
		System.out.println(123);
		System.out.println(123+ 223);
		System.out.println(1231123112312222212L);
		System.out.println(123.2112323123123123123123123123);
		System.out.println(123.2117777777777777777777F);
		System.out.println("오늘의 메뉴 : 토마토 스파게티");
		System.out.println('A');
		System.out.println(true);
		System.out.println(false);
		
		
		// 숫자 끼리는 +, -, *, / 등 계산을 할 수 있다.
		System.out.println(25 * 88);
		System.out.println(90 / 3);
		System.out.println(91 / 3);		// 정수끼리 계산하면 몫만 구한다.
		System.out.println(91 / 3.0);	// 소수점 아래 계산을 원한다면 실수로 연산한다.
		System.out.println(333333333L / 1234.333);
		
		// 문자열은 다른 타입과 +를 통해 이어붙이기를 할 수 있다.
		System.out.println("Apple" + "Pen");
		System.out.println("평균 점수 : " + 85.8);
		System.out.println(300 + "개");
		System.out.println("오늘 점심을 먹었는가? " + true);
		System.out.println("안경을 썻는가? " + !true);
		
		// ()를 통해 연산 순서를 조절할 수 있다.
		System.out.println("오늘 총 점심 값 : " + 5000 * 4 +"원");
		System.out.println("오늘 총 간식 값 : " + 3500 + 5500 + "원");		// 순서대로 동작하므로 이어붙인 문자열이 생성됨 -> 오늘 총 간식 값 : 35005500원
		System.out.println("오늘 총 간식 값 : " + (3500 + 5500) + "원");		// 괄호부터 연산을 하므로 9000이 먼저 계산, 후에 문자열이 붙어서 원하는 문장이 출력됨		
	}
}














