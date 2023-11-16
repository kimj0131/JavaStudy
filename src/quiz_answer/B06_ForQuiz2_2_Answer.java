package quiz_answer;

import java.util.Scanner;

public class B06_ForQuiz2_2_Answer {
	// ForQuiz2번 하나로 만들어보기
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int lastNum = sc.nextInt();
		
		boolean isMinus = lastNum < 0;
		lastNum = Math.abs(lastNum);
		
		for (int i = 0, cnt = 0; i <= lastNum; i++) {
			if(i % 5 == 0) {
				if (isMinus) {
					System.out.printf("-%d", i);
				} else {
					System.out.print(i + " ");
				}
				
				if (++cnt % 10 == 0) {
					System.out.println();
				}
			}
		}
		
	}

}
