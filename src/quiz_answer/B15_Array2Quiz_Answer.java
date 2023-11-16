package quiz_answer;

import java.util.Arrays;

public class B15_Array2Quiz_Answer {

	public static void main(String[] args) {
		
		int[][] myArr = {
				{1, 1, 1, 1, 1, 1},
				{1, 1, 1, 1},
				{1, 1},
				{1, 1, 1, 1, 1, 1, 1, 1},
				{1, 1, 1, 1}
		};
		
		// 1. 랜덤숫자로 변경
		for(int i = 0; i< myArr.length; i++) {
			for (int j = 0; j < myArr[i].length;j++) {
				myArr[i][j] = (int)(Math.random() * 500 + 1);
			}
		}
		
		// 2. 총합과 평균
		int sum = 0;
		int count = 0;
		for(int i = 0; i< myArr.length; i++) {
			// 각 배열의 길이를 더해 총 개수를 구할 수도 있다.
			count += myArr[i].length;
			for (int j = 0; j < myArr[i].length;j++) {
				sum += myArr[i][j];
			}
		}
		System.out.println("총합 : " + sum);
		System.out.println("평균 : " + sum / (double)count);
		
		// 3. 행의 합을 각각 출력
		int[] rowSum = new int[myArr.length];
		
		for (int row = 0; row < myArr.length; row++) {
			for(int col = 0; col < myArr[row].length; col++) {
				rowSum[row] += myArr[row][col];
			}
		}
		
		System.out.println("각 행의 합 : " + Arrays.toString(rowSum));
		
		//4. 열의 합을 각각 출력
		// 제일 긴 길이의 배열을 찾는다.
		int maxColSize = 0;
		for (int i = 0; i < myArr.length; i++) {
			int colSize = myArr[i].length;
			if(maxColSize < colSize) {
				maxColSize = colSize;
			}
			// maxColSize = maxColSize < colSize ? colSize : maxColSize;
		}
		
		int[] colSum = new int[maxColSize];
		
		for(int row = 0; row < myArr.length; row++) {
			for (int col = 0; col < myArr[row].length; col++) {
				colSum[col] += myArr[row][col];
			}
			
		}
		System.out.println("열의 합 : " + Arrays.toString(colSum));
		
	}
}
