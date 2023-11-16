package quiz;

import java.util.Scanner;

public class B07_ChangeCase {
	/*
	 	사용자가 문장을 입력하면 
	 	대문자는 소문자로, 소문자는 대문자로 출력해 보세요
	 	(영어가 아닌 문자는 그대로 출력)
	*/
	public static void main(String[] args) {
		// 문장을 입력받음
		// 영어인 경우 (65~90 or 97~122)를 체크해서 대소문자 변환
		// 영단어가 아닌 문자와 변환한 영단어를 순서에 맞게 다시 문자열에 삽입
		// 완료된 문자열을 출력
		
		Scanner sc = new Scanner(System.in);
		System.out.print("문장을 입력 > ");
		String entStr = sc.nextLine();
		// 문자열 길이 체크 후 길이값을 통해 문자들을 하나씩 체크
		int strLen = entStr.length();
		// 빈문자열 생성
		String change = "";
		
		for (int i=0; i<strLen; i++) {
			// 문자가 영단어인지 체크
			if(entStr.charAt(i) >= 'A' && entStr.charAt(i) <= 'Z') {
				change += (char)(entStr.charAt(i) + 32);
			} else if (entStr.charAt(i) >= 'a' && entStr.charAt(i) <= 'z') {
				change += (char)(entStr.charAt(i) - 32);
			} else {
				change += entStr.charAt(i);
			}
		}
		System.out.println(change);
	}
}
