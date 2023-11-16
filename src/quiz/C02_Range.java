package quiz;

import java.util.Arrays;

public class C02_Range {
	/*
	 	1. 정수값을 전달 받으면 0부터 해당 값 미만의 int[]을 생성하여 반환하는 range 함수를 만들어보세요
	 	ex) range(8)의 결과 -> [0, 1, 2, 3, 4, 5, 6, 7]
	 	2. 정수 최소값과 정수 최대값을 전달받으면 최소값부터 최대값 미만인 int[]을 생성하여 반환하는 range함수를 만들어보세요
	 	ex) range(10, 15) -> [10, 11, 12, 13, 14]
	 		range(15, 10) -> [15, 14, 13, 12, 11]
	 	3. 최소값 최대값 증감값을 인자로 전달 받으면 최소값부터 최대값 미만까지 증감값만큼 증가하는 int[]을 생성하여 반환하는 range함수를 만들어보세요
	 	ex) range(10, 20, 2) -> [10, 12, 14, 16, 18]
	 		range(40, 30, -3) -> [40, 37, 34, 31]
	 		range(20, 10, 5) -> [] 
	*/
	
	// 1.
	public static int[] range(int num) {
		int[] numArr = new int[num];
		for (int i = 0; i < num; i++) {
			numArr[i] = i;
		}
		return numArr;
	}
	
	// 2. 오답
	public static int[] range(int num1, int num2) {
		int[] numArr = new int[Math.abs(num1 - num2)];
		if(num1 - num2 > 0) {
			int index = 0;
			for (int i = num1; i < num2; i++) {
				numArr[index++] = i;
			}
		} else {
			int index = 0;
			for (int i = num1; i < num2; i++) {
				numArr[index++] = i;
			}
		}
		return numArr;
	}
	
	// 3.
	public static int[] range(int num1, int num2, int num3) {
		
		if((num2 - num1) / num3 < 0) {
			return new int[0];
			
		} else {
			int count = 0;
			for (int i = 0; i < Math.abs(num1 - num2); i += Math.abs(num3)) {
				count++;
			}
			int[] numArr = new int[count];
			
			if(num1 < num2) {
				int index = 0;
				for (int i = num1; i < num2; i += num3) {
					numArr[index++] = i;
				}
				return numArr;
				
			} else if(num1 > num2) {
				int index = 0;
				for (int i = num1; i > num2; i += num3) {
					numArr[index++] = i;
				}
				return numArr;
				
			} else {
				return new int[0];
			}
		}
	}
	

	public static void main(String[] args) {
		System.out.println(Arrays.toString(range(5)));
		System.out.println(Arrays.toString(range(15, 10)));
		System.out.println(Arrays.toString(range(20, 10, -3)));
	}
}
