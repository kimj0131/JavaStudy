package beakjoon;

import java.util.Scanner;

public class Q10810 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		// 최종 공이 들어간상황
		int[] nArr = new int[n];
		// m번동안 공을 넣는 작업을 함
		for (int a = 0; a < m; a++) {
			int i = sc.nextInt();
			int j = sc.nextInt();
			int k = sc.nextInt();
			
			// n번까지 바구니범위에 i~j까지 k번의 공을 넣음
			for(; i-1 <= j-1 ; i++) {
				nArr[i-1] = k;
			}
		}
		
		for (int a = 0; a < nArr.length; a++) {
			System.out.print(nArr[a] + " ");
		}
	}

}
