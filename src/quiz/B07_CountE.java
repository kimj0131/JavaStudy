package quiz;

import java.util.Scanner;

public class B07_CountE {
	/*
	 	사용자가 문장을 입력하면 해당 문장에 알파벳 e가 몇번 등장했는지
	 	알려주는 프로그램을 만들어 보세요
	 	(대/소문자 모두 세어야함)
	*/
	public static void main(String[] args) {
		// 문장을 입력받음
		System.out.print("문장을 입력하세요 > ");
		Scanner sc = new Scanner(System.in);
		String text = sc.nextLine();
		
		int eCount = 0;
		// 문장의 길이값으로 문자를 하나씩 체크
		int textLen = text.length();
		for (int i=0; i<textLen; i++) {
			//문자 체크 중 알파벳 e 확인하면 숫자를 셈
			char ch = text.charAt(i);
			if (ch == 'e' || ch == 'E') {
				eCount ++;
			}
		}
		// e 체크한 숫자를 셈한 값을 출력
		if (eCount > 0) {
			System.out.printf("입력하신 문장에서 알파벳 e는 모두 %d개 입니다.\n", eCount);
		} else {
			System.out.println("입력하신 문장에서 알파벳 e는 없습니다.");
		}
	}
}
