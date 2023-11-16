package quiz_answer;

import java.util.Scanner;

public class B07_IncludeUppercase_Answer {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("단어를 입력 > ");
		String word = sc.next();
		
		// 한글자씩 보면서 대문자가 있을 때 표시한다
		boolean 대문자있다 = false;
		for (int i=0; i<word.length(); i++) {
			char ch = word.charAt(i);
			if (ch >= 'A' && ch <= 'Z') {
				대문자있다 = true;
			}
		}
		
		System.out.println("대문자가 있습니까? " + 대문자있다);
	}

}
