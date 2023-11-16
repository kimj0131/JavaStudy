package quiz;

import java.util.Scanner;

public class B06_ForQuiz2 {
	/*
	 	사용자로부터 숫자를 입력받으면 0부터 해당 숫자 사이에 존재하는 모든 5의 배수를 한줄에 10개 씩 출력해 보세요
	 	(단, 음수를 입력하는 경우에도 프로그램이 올바르게 동작할 것.)
	*/
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력 > ");
		int num = sc.nextInt();
		int check = 0;
		if (num < 0) {
			for (int i=0; i>=num; i--) {
				if(i%5 == 0) {
					System.out.printf("%5d ",i);
					check ++;
					if(check%10 == 0) {
						System.out.println();
					}
				}
			}
		} else {
			check = 0;
			for(int i=0; i<=num; i++) {
				if(i%5 == 0) {
					System.out.printf("%5d ",i);
					check ++;
					if(check%10 == 0) {
						System.out.println();
					}
				}
			}
		}
	}
}
