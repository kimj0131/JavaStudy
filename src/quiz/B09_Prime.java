package quiz;

import java.util.Scanner;

public class B09_Prime {
	/*
		사용자가 정수를 입력하면
		1부터 입력한 정수 사이에 있는 모든 소수를 출력해보세요
		※ 소수(Prime) : 나누어 떨어지는 수가 1과 자기 자신밖에 없는 수
		>> 10
		-> 2, 3, 5 ,7
		>> 30
		-> 2, 3, 5, 7, 11, 13, 17, 19, 23, 29
	*/
	public static void main(String[] args) {
		
		// 사용자로부터 입력받은 정수
		System.out.print("숫자 입력 >> ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		// 1은 소수가 아니므로 제외하고 2부터
		for (int i=2; i<=num; i++) {
			int divCount = 0;
			//i를 1~i 까지 나눠본다.
			for (int j=1; j<=i; j++) {
				if (i%j == 0) {
					divCount ++;
					// 나눠지고 나머지 0인 회수가 2번 초과면 
					// 그 i값은 소수가 아니므로 탈출
					if(divCount > 2) {
						break;
					}
				}
			}
			if (divCount == 2) {				
				System.out.print(i + " ");
			}
		}
	}
}
