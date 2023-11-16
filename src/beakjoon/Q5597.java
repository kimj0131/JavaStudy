package beakjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Q5597 {

	public static void main(String[] args) {

		// 학생들 출석번호 목록
		int[] stuList = new int[30];
		for (int i = 1; i <= stuList.length; i++) {
			stuList[i - 1] = i;
		}
//		System.out.println(Arrays.toString(stuList));

		// 과제를 제출한 학생목록
		int[] checkStu = new int[28];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < checkStu.length; i++) {
			int n = sc.nextInt();
			checkStu[i] = n;
		}
//		System.out.println(Arrays.toString(checkStu));

		// 없는지 비교
		for (int i = 0; i < checkStu.length; i++) {
			for (int j = 0; j < stuList.length; j++) {
				if (stuList[j] == checkStu[i]) {
					stuList[j] = 0;
				}
			}
		}
//		System.out.println(Arrays.toString(stuList));
		
		for (int i = 0; i < stuList.length; i++) {
			if (stuList[i] != 0) {
				System.out.println(stuList[i]);
			}
		}
	}

}
