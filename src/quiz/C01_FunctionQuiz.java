package quiz;

import java.util.Arrays;

public class C01_FunctionQuiz {
	/*
	  	# 다음 함수를 정의하고올바르게 동작하는지 테스트 해보세요
	  
	  	1. 전달한 문자가 알파벳이면 true를 반환, 아니면 false를 반환하는 함수 
	  	2. 전달한 숫자가 3의 배수이면 true를 반환,아니면 false를 반환하는 함수 
	  	3. 숫자를 하나 전달하면 문자열 "짝수입니다" 또는 "홀수입니다"를 반환하는 함수 
	  	4. 숫자를 전달하면 해당 숫자의 모든 약수를 int[]로 반환하는 함수 
	  	5. 전달한 정수가 소수(prime)라면 true를 반환하고 아니면 false를 반환하는 함수 
	  	6. 메세지와 횟수를 전달하면 해당 메세지를 전달한 횟수만큼 반복하여 출력하는 함수
	 */

	// 1.
	public static boolean isAlpabet(char input) {
		if (input >= 'a' && input <= 'z' || input >= 'A' && input <= 'Z') {
			return true;
		} else {
			return false;
		}

	}

	// 2.
	public static boolean isMultipleThree(int num) {
		if (num % 3 == 0 && num != 0) {
			return true;
		} else {
			return false;
		}

	}

	// 3.
	public static String isEvenOdd(int num) {
		if (num % 2 == 0) {
			return "짝수입니다.";
		} else {
			return "홀수입니다.";
		}
	}

	// 4. 숫자를 전달하면 해당 숫자의 모든 약수를 int[]로 반환하는 함수
	public static int[] numberDivisor(int num) {
		int divCount = 0;
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				divCount++;
			}
		}
		int index = 0;
		int[] numDiv = new int[divCount];
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				numDiv[index] = i;
				index++;
			}
		}
		return numDiv;
	}

	// 5.
	public static boolean numberPrime(int num) {
		boolean isPrime = false;
		int count = 0;
		// 이번 숫자 i에 대한 약수 개수 검사
		for (int chk = 1; chk <= num; chk++) {
			if (num%chk == 0) {	
				count++;
			}
		}
		// 약수가 2개 = 소수
		if (count==2) {
			isPrime = true;
		}

		return isPrime;

	}
	
	// 6.
	public static void repeatedOutput(String text, int num) {
		for (int i = 0; i < num; i++) {
			System.out.println(text);
		}
	}


	public static void main(String[] args) {

		// 1.
		System.out.println(isAlpabet('a'));
		System.out.println(isAlpabet('!'));
		System.out.println();
		// 2.
		System.out.println(isMultipleThree(0));
		System.out.println(isMultipleThree(33));
		System.out.println();
		// 3.
		System.out.println(isEvenOdd(1));
		System.out.println(isEvenOdd(2));
		System.out.println();
		// 4.
		System.out.println(Arrays.toString(numberDivisor(10)));
		System.out.println(Arrays.toString(numberDivisor(20)));
		System.out.println();
		// 5.
		System.out.println(numberPrime(3));
		System.out.println(numberPrime(10));
		System.out.println();
		// 6.
		repeatedOutput("안녕하세요", 5);

	}

}
