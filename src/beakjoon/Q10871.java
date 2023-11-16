package beakjoon;

import java.util.Scanner;

public class Q10871 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		
		int[] nArr = new int[n];
		for (int i = 0; i < n ; i++) {
			int a = sc.nextInt();
			nArr[i] = a;
			if (nArr[i] < x) {
				System.out.print(nArr[i] + " ");
			}
		}
	}

}
