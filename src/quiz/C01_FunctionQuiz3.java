package quiz;

import java.util.Arrays;

public class C01_FunctionQuiz3 {
	/*
	  	실행하면 1 ~ 45의 중복없는 7개의 숫자로 이루어진 int[]을 반환하는 함수를 만들어보세요
	*/
	public static int[] noDuplicateNumbers() {
		
		int[] numbers = new int[7];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = (int)(Math.random() * 45 + 1);
			for (int j = 0; j < i; j ++) {
				if (numbers[j] == numbers[i]) {
					i--;
				}
			}
		}
		return numbers;
	}
	
	public static void main(String[] args) {
		System.out.println(Arrays.toString(noDuplicateNumbers()));
	}
}
