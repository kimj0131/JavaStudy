package quiz;

import java.util.ArrayList;

public class D01_ArrayListPractice {
	/*
	 	1. 리스트에 1000 ~ 2000 사이의 랜덤 정수를 100개 추가하기
	 	2. 원본에서 짝수를 모두 제거한 후 총합을 구하기
	 	3. 원본에서 홀수를 모두 제거한 후 총합을 구하기
	 */
	public static void main(String[] args) {
		// 제네릭에는 일반형 변수 타입을 사용할 수 없다.
		// (각 기본형 타입의 참조형 버전 타입을 사용해야 한다.)
		ArrayList<Integer> number = new ArrayList<>();
		
		for (int i = 0; i < 100; i++) {
			number.add((int)((Math.random() * 1001) + 1000));
		}
		System.out.println(number);
		System.out.println();
		
		ArrayList<Integer> even = new ArrayList<>();
		ArrayList<Integer> odd = new ArrayList<>();
		int oddTotalSum = 0;
		int evenTotalSum = 0;
		
		for (int i = 0; i < number.size(); i++) {
			if (number.get(i) % 2 == 0) {
				even.add(number.get(i));
			} else {
				odd.add(number.get(i));
			}
		}
		
		number.removeAll(even);
		for (int i = 0; i < number.size(); i++) {
			oddTotalSum += number.get(i);
		}
		System.out.println("짝수를 모두 제거한 후의 값\n" + number);
		System.out.println("짝수를 모두 제거한 후의 총합 : " + oddTotalSum);
		number.addAll(even);
		System.out.println();
		
		number.removeAll(odd);
		for (int i = 0; i < number.size(); i++) {
			evenTotalSum += number.get(i);
		}
		System.out.println("홀수를 모두 제거한 후의 값\n" + number);
		System.out.println("홀수를 모두 제거한 후의 총합 : " + evenTotalSum);
	}
}
