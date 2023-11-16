package beakjoon;

import java.util.Scanner;

public class Q10807 {
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] list = new int[n];
		for (int i = 0; i < n; i++) {
			int a = sc.nextInt();
			list[i] = a;
		}
		int v = sc.nextInt();
		int vCount = 0;
		for (int i = 0; i < list.length; i++) {
			if (list[i] == v) {
				vCount++;
			}
		}
		System.out.println(vCount);
		
	}

}
