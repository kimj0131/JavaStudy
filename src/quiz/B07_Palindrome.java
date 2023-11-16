package quiz;

import java.util.Scanner;

public class B07_Palindrome {

	/*
	 	사용자가 단어를 입력하면 해당 단어가 좌우대칭인지 판별해주는 프로그램을 만들어보세요
	 	ex)
	 	>> LEVEL -> 좌우대칭입니다.
	 	>> FATHER -> 좌우대칭이 아닙니다.
	 	# 심화
	 	>> Eye -> 대소문자는 다르지만 좌우대칭입니다.
	*/
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("단어를 입력 > ");
		String input = sc.next();
		
		int inputLength = input.length();
		int sameCheck;
		boolean isDifferentCase = false;
		
		// 대소문자는 다르지만 같은 글자인 경우
//		if(Math.abs(input.charAt(0) - input.charAt(inputLength-1)) == 32) {
//			System.out.println("확인");
//		}
		
		// 글자수 짝수
		if(inputLength%2 == 0) {
			sameCheck = 0;
			// i와 문자열크기를 이용해 인덱스값 비교
			for (int i=0; i<=inputLength-1-i; i++) {
				// 대소문자가 다른 같은 글자
				if(Math.abs(input.charAt(i) - input.charAt(inputLength-1-i)) == 32) {
					isDifferentCase = true;
				} 
				else {
					if (input.charAt(i) == input.charAt(inputLength-1-i)){
						System.out.println((i+1) + "번째 단어 일치");
					} else {
						System.out.println((i+1) + "번째 단어 불일치");
						sameCheck ++;
					}
				}
			}
			if(isDifferentCase && sameCheck==0) {
				System.out.println("대/소문자가 다르지만 좌우대칭입니다.");
			} else if (sameCheck > 0) {
				System.out.println("좌우대칭이 아닙니다.");
			} else {
				System.out.println("좌우대칭 입니다.");
			}
		} else {
			
			// 글자수 홀수
			sameCheck = 0;
			// i와 문자열크기를 이용해 인덱스값 비교
			for (int i=0; i<inputLength-1-i; i++) {
				// 대소문자가 다른 같은 글자
				if(Math.abs(input.charAt(i) - input.charAt(inputLength-1-i)) == 32) {
					isDifferentCase = true;
				} 
				else {
					if (input.charAt(i) == input.charAt(inputLength-1-i)){
						System.out.println((i+1) + "번째 단어 일치");
					} else {
						System.out.println((i+1) + "번째 단어 불일치");
						sameCheck ++;
					}
				}
			}
			if(isDifferentCase && sameCheck==0) {
				System.out.println("대/소문자가 다르지만 좌우대칭입니다.");
			} else if (sameCheck > 0) {
				System.out.println("좌우대칭이 아닙니다.");
			} else {
				System.out.println("좌우대칭 입니다.");
			}
		}
		
		
	}

}
