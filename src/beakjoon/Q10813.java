package beakjoon;

import java.util.Scanner;

public class Q10813 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int[] nArr = new int[n];
		for (int i = 0; i < n; i++) {
			nArr[i] = i+1;
		}
		for (int a = 0; a < m; a++) {
			int i = sc.nextInt();
			int j = sc.nextInt();
			
			int temp = nArr[i-1];
			nArr[i-1] = nArr[j-1];
			nArr[j-1] = temp;
		}
		for (int i = 0; i < n; i++) {
			System.out.print(nArr[i] + " ");

		}
		
	}

}
