package quiz;

import java.util.Scanner;

public class B07_Palindrome_re {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("문자를 입력 > ");
		String input = sc.next();

		int len= input.length();
		int checkCount = 0;
		boolean isDifferentCase = false;

		for (int i = 0; i < len/2; i++) {
			// 대/소문자 확인
			if (Math.abs(input.charAt(i) - input.charAt(len - 1 - i)) == 32) {
				isDifferentCase = true;
			} else if (input.charAt(i) != input.charAt(len - 1 - i)) {
				checkCount++;
			}
		}

		// 대/소문자 체크 및 같은 문자 확인이 될 때
		if (checkCount == 0 && isDifferentCase) {
			System.out.println("대/소문자가 다른 좌우대칭 입니다.");
		} else if (checkCount == 0) {
			System.out.println("좌우대칭 입니다.");
		} else {
			System.out.println("좌우대칭이 아닙니다.");
		}
		
		
	}
}
