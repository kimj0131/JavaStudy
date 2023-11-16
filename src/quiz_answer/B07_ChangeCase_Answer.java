package quiz_answer;

import java.util.Scanner;

public class B07_ChangeCase_Answer {
	
	public static void main(String[] args) {
		
		System.out.print("문장을 입력 > ");
		Scanner sc = new Scanner(System.in);
		String text = sc.nextLine();
		
		String result = "";
		
		// 입력받은 문장의 길이만큼 반복
		for (int i = 0; i < text.length(); i++) {
			// 한 문자씩 빼서
			char ch = text.charAt(i);
			// 소문자를 확인 후 대문자로 변경 한다음 result에 넣음
			if(ch >= 'a' && ch <= 'z') {
				result += (char)(ch - 32);
			// 대문자를 확인 후 소문자로 변경 한다음 result에 넣음 
			} else if(ch >= 'A' && ch <= 'Z') {
				result += (char)(ch + 32);
			// 나머지 문자를 result에 넣음
			} else {
				result += ch;
			}
		}
		
		System.out.println("원본 : " + text);
		System.out.println("바뀐것 : " + result);
		
	}

}
