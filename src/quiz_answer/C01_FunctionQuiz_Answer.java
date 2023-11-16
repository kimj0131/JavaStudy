package quiz_answer;

import java.util.Arrays;

public class C01_FunctionQuiz_Answer {
	
	//1. 전달한 문자가 알파벳이면 true를 반환, 아니면 false를 반환하는 함수 
	public static boolean isAlpabet(char ch) {
		// 리턴값에 boolean값이 반환되므로 한줄로 작성가능
		return ch >= 'a'&& ch <='z' || ch >= 'A' && ch <= 'Z';
	}
  	//2. 전달한 숫자가 3의 배수이면 true를 반환,아니면 false를 반환하는 함수 
	public static boolean isMul3(int num) {
		// 비교연산으로 간단하게 리턴값 반환
		return num % 3 == 0;
	}
  	//3. 숫자를 하나 전달하면 문자열 "짝수입니다" 또는 "홀수입니다"를 반환하는 함수 
	public static String chkEvenOdd(int num) {
		return num % 2 == 0 ? "짝수입니다" : "홀수입니다";
	}
  	//4. 숫자를 전달하면 해당 숫자의 모든 약수를 int[]로 반환하는 함수 
	public static int[] getDivisors(int num) {
		// 1부터 num까지 나누어 떨어지면 배열에 추가한다.
		// 배열은 한번 만들면 크기 변경이 불가능하다.
		
		// 약수의 개수를 먼저 세서 배열의 크기를 정해야 한다.
		int divisorCount = 0;
		for (int i = 1; i <=num; i++) {
			if (num % i == 0) {
				divisorCount++;
			}
		}
		
		int[] divisors = new int[divisorCount];
		int index = 0;
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				divisors[index++] = i;
			}
		}
		
		return divisors;
	}
  	//5. 전달한 정수가 소수(prime)라면 true를 반환하고 아니면 false를 반환하는 함수
	public static boolean isPrime(int num) {
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}
  	//6. 메세지와 횟수를 전달하면 해당 메세지를 전달한 횟수만큼 반복하여 출력하는 함수	
	public static void repeatMessage(String message, int repeat) {
		for (int i = 0; i < repeat; i++) {
			System.out.printf("%s [%d time(s) repeated]\n", message, i);
		}
	}
	
	
	public static void main(String[] args) {
	
		//1. boolean타입 함수는 조건대신 사용할 수 있어 굉장이 유용하다.
		if (isAlpabet('大')) {
			System.out.println("알파벳이었습니다.");
		} else {
			System.out.println("알파벳이 아니었습니다.");
		}
		System.out.printf("10은 %s\n", chkEvenOdd(10));
		for (int num = 100; num <= 200; num++) {
			System.out.println(num + "의 약수들" + Arrays.toString(getDivisors(num)));
		}
		System.out.println(isPrime(5));
		
		repeatMessage(" /)/)\n(  ..)\n(  >$\n", 3);
	}

}
