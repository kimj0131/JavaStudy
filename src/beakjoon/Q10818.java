package beakjoon;

import java.util.Scanner;

public class Q10818 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] nArr = new int[n];
		
		for (int i = 0; i < n; i++) {
			int a = sc.nextInt();
			nArr[i] = a;
		}
		
		int max = nArr[0];
		int min = nArr[0];
		for (int i = 0; i < n; i++) {
			if (max < nArr[i]) {
				max = nArr[i];
			}
			if (min > nArr[i]) {
				min = nArr[i];
			}
		}
		System.out.printf("%d %d", min, max);
		
	}
}
