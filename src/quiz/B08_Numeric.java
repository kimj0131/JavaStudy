package quiz;

import java.util.Scanner;

public class B08_Numeric {
	/*
	 	사용자가 입력한 문자열이 모두 숫자로만 구성된 문자열인지
	 	판별하는 프로그램을 만들어보세요
	 	ex)
	 	>> a1234
	 	-> 모두 숫자인 문자열이 아닙니다.
	 	
	 	>> 1233213
	 	-> 모두 숫자인 문자열입니다.
	*/
	public static void main(String[] args) {
		
		// 사용자에게 문자열을 입력받음
		System.out.print("문자를 입력 > ");
		Scanner sc = new Scanner(System.in);
		String inputText = sc.next();
		
		int inputLen = inputText.length();
		boolean charCheck = false;
		// 문자열내 문자들을 분석
		for (int i=0; i<inputLen; i++) {
			// 숫자가 아니면 멈춤
			char ch = inputText.charAt(i);
			if (ch<'0' || ch>'9') {
				//숫자가 아닌 문자가있는지 체크
				charCheck = true;
				break;
			}
		}
		if (charCheck) {
			System.out.println("숫자로 이루어진 문자열이 아닙니다.");
		} else {
			System.out.println("모두 숫자인 문자열 입니다.");
		}
	}

}
