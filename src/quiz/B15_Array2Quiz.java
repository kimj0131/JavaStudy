package quiz;

import java.util.Arrays;

public class B15_Array2Quiz {

	public static void main(String[] args) {
		
		int[][] myArr = {
				{1, 1, 1, 1, 1, 1},
				{1, 1, 1, 1},
				{1, 1},
				{1, 1, 1, 1, 1, 1, 1, 1},
				{1, 1, 1, 1}
		};
		
		// 1. myArr의 모든 값을  1 ~ 500 사이의 랜덤 값으로 바꾸기
		// 2. 랜덤으로 바뀐 모든 값의 총합과 평균을 구하기
		// 3. myArr의 각 행(row)의 합을 구해서 출력하기(가로)
		// 4. myArr의 각 열(column)의 합을 구해서 출력하기(세로)
		
		
		// 1. 랜덤숫자로 바꾸기
		for (int i = 0; i < myArr.length; i++) {
			for(int j = 0; j < myArr[i].length; j++) {
				myArr[i][j] = (int)(Math.random() * 500 + 1);
				System.out.printf("myArr[%d][%d] : %d\n", i, j, myArr[i][j]);
			}
			System.out.println("====================");
		}
		
		// 2. 총합, 평균
		int totalSum = 0;
		int totalVal = 0;
		
		for (int i = 0; i < myArr.length; i++) {
			for(int j = 0; j < myArr[i].length; j++) {
				totalSum += myArr[i][j];
				totalVal++;
			}
		}
		System.out.printf("모든 값의 총합 : %d\n", totalSum);
		System.out.printf("평균 값 : %f\n", totalSum/(double)totalVal);
		
		// 3. 행
		int rowSum = 0;
		for (int i = 0; i < myArr.length; i++) {
			rowSum = 0;
			for(int j = 0; j < myArr[i].length; j++) {
				rowSum += myArr[i][j];
			}
			System.out.printf("[%d]번째 행의 합 : %d\n", i+1, rowSum);
		} 
		System.out.println("====================");
		
		// 4. 열	(오답)
		// 열의 합
		int colSum = 0;
		for (int i = 0; i < myArr.length; i++) {
			colSum = 0;
			for (int j = 0; j < myArr[i].length; j++) {
				// 열의 배열을 생성하고 각통에 누적해서 더하는 방법을 쓰면될것.
				colSum += myArr[i][j];
			}
			System.out.printf("[%d]번째 열의 합 : %d\n", i+1, colSum);
		}
		
		
	}
}
