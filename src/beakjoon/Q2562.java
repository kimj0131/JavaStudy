package beakjoon;

import java.util.Scanner;

public class Q2562 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] userArr = new int[9];
		
		for (int i = 0; i < 9; i++) {
			int num = sc.nextInt();
			userArr[i] = num;
		}
		int max = userArr[0];
		int maxIndex = 0;
		for (int i = 0; i < 9; i++) {
			if (max < userArr[i]) {
				max = userArr[i];
				maxIndex = i;
			}
		}
		System.out.println(max);
		System.out.println(maxIndex+1);
	}
}
