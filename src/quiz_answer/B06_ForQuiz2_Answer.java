package quiz_answer;

import java.util.Scanner;

public class B06_ForQuiz2_Answer {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력 > ");
		int lastNum = sc.nextInt();

		// 양수일때
		if (lastNum > 0) {
			for (int i = 0, cnt = 0; i <= lastNum; i++) {
				if (i % 5 == 0) {
					System.out.print(i + " ");
					if (cnt++ % 10 == 0) {
						System.out.println();
					}
				}
			}
		} else {
			//음수일때
			for (int i = 0, cnt = 0; i >= lastNum; i--) {
				if (i % 5 == 0) {
					System.out.print(i + " ");
					if (++cnt % 10 == 0) {
						System.out.println();
					}
				}
			}
		}
	}
}
