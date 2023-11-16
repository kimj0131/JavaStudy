package quiz_answer;

import java.util.Scanner;

public class B02_ConditionQuiz2_Answer {
	
	/*
	# 알맞은 조건식을 만들어보세요
	
	 1. char형 변수 a가 'q' 또는 'Q'일 때 true
	 2. char형 변수 b가 공백이나 탭이 아닐 때 true
	 3. char형 변수 c가 '0' ~ '9'일 때 true
	 4. char형 변수 d가 영문자(대문자 또는 소문자)일 때 true
	 5. char형 변수 e가 한글일 때 true (한글의 범위는 유니코드 검색)
	 6. 사용자가 입력한 문자열이 quit일 때 true
	*/
	
	// 답안
	public static void main(String[] args) {
		
		// 1.
		char a = 'q';
		System.out.println(a=='q' || a=='Q');
		// 2.
		char b = 'f';
		System.out.println(b!=' ' && b!='\t');
		System.out.println(!(b==' ' || b=='\t'));
		// 3.
		char c = '3';
		System.out.println(c>='0' && c<='9');
		// 4.	// 문자를 사용하는게 바람직하다.
		char d = 'a';
		System.out.println(d>='A' && d<='Z' || d>='a' && d<='z');
		// 5.	// 완성된 글자만 해당하는걸로
		char e = '가';
		System.out.println(e>='가' && e<='힣');
		// 6.
		System.out.print("마치려면 quit를 입력하세요 > ");
		System.out.println(new Scanner(System.in).next().equals("quit"));
		// Scanner 간략화
		
	}

}
