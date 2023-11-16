package quiz;

import java.util.Arrays;

public class B14_Sort {

	/*
	 	-100 ~ 100 사이의 랜덤 정수 값이 20개 들어있는 배을을 하나 생성한 후
	 	1. 해당배열의 내용을 작은 값부터 차례대로 저장한 새로운 배열을 생성하여 출력
	 	(오름차순, Ascending)
	 	2. 해당배열의 내용을 큰 값부터 차례대로 저장한 새로운 배열을 생성하여 출력
	 	(내림차순, Descending)
	*/
	public static void main(String[] args) {
		
		int[] ranArray = new int[20];
		for (int i = 0; i < ranArray.length; i++) {
			ranArray[i] = (int)(Math.random() * 201 - 100);
		}
		System.out.println("랜덤 정수값이 20개 들어있는 배열");
		System.out.println(Arrays.toString(ranArray));
		
		int[] asc = new int[ranArray.length];
		int[] des = new int[ranArray.length];
		for (int i = 0; i < asc.length; i++) {
			asc[i] = ranArray[i];
			des[i] = ranArray[i];
		}
		
		// 1. 오름차순 정렬
		for (int i = 0; i < asc.length; i++) {
			for(int j = 0; j < i; j++) {
				if (asc[j] > asc[i]) {
					int temp = asc[j];
					asc[j] = asc[i];
					asc[i] = temp;
				}
			}
		}
		System.out.println("오름차순 정렬");
		System.out.println(Arrays.toString(asc));
		
		// 2. 내림차순 정렬
		for (int i = 0; i < des.length; i++) {
			for(int j = 0; j < i; j++) {
				if (des[j] < des[i]) {
					int temp = des[j];
					des[j] = des[i];
					des[i] = temp;
				}
			}
		}
		System.out.println("내림차순 정렬");
		System.out.println(Arrays.toString(des));
		
		
		
		
		
	}
}
