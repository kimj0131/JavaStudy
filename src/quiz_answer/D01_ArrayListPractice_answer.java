package quiz_answer;

import java.util.ArrayList;

public class D01_ArrayListPractice_answer {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<>();
		
		// 1. 리스트에 1000 ~ 2000 사이의 랜덤정수 100개 추가
		
		for (int i = 0; i < 100; i++) {
			numbers.add((int)(Math.random() * 1001) + 1000);
		}
		System.out.println(numbers);
		
		// 2. 원본에서 짝수를 모두 제거한 후 총합을 구하기
		int evenSum = 0;
		for (int i = 0; i < numbers.size(); i++) {
			int num = numbers.get(i);
			
			if(num % 2 == 0) {
				evenSum += numbers.remove(i--);
			}
		}
		System.out.println("\n<< 짝수가 제거된 후의 numbers >>");
		System.out.println(numbers);
		System.out.println("제거한 짝수의 합 : " + evenSum);
		
		// 3. 원본에서 홀수를 모두 제거한 후 총합을 구하기
		int oddSum = 0;
		for (int i = 0; i < numbers.size(); i++) {
			int num = numbers.get(i);
			
			if(num % 2 == 1) {
				oddSum += numbers.remove(i--);
			}
		}
		System.out.println("\n<< 홀수가 제거된 후의 numbers >>");
		System.out.println(numbers);
		System.out.println("제거한 홀수의 합 : " + oddSum);
	}
}
