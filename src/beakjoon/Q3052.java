package beakjoon;

import java.util.Scanner;

public class Q3052 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int b = 42;
		int[] a = new int[10];
		int[] result = new int[10];
		int count = 0;
		
		for (int i = 0; i < 10; i++) {
			a[i] = sc.nextInt();
			result[i] = a[i] % b;
		}
		
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < i; j++) {
				if(result[j] == result[i]) {
					count++;
					break;
				}
			}
		}
		System.out.println(10 - count);
	}
}
