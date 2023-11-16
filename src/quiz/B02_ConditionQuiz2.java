package quiz;

import java.util.Scanner;

public class B02_ConditionQuiz2 {

	/*
		# 알맞은 조건식을 만들어보세요
		
		 1. char형 변수 a가 'q' 또는 'Q'일 때 true
		 2. char형 변수 b가 공백이나 탭이 아닐 때 true
		 3. char형 변수 c가 '0' ~ '9'일 때 true
		 4. char형 변수 d가 영문자(대문자 또는 소문자)일 때 true
		 5. char형 변수 e가 한글일 때 true (한글의 범위는 유니코드 검색)
		 6. 사용자가 입력한 문자열이 quit일 때 true
	*/
	public static void main(String[] args) {
		
		// 1.
		char a = 'q';
		System.out.println(a=='q' || a=='Q');
		// 2.
		char b = 'a';
		System.out.println(b!=' ' && b!='\t');
		// 3.
		char c = '9';
		System.out.println((int)c);
		System.out.println(c>=48 && c<=57);
		// 4.
		char d = ']';
		System.out.println((int)d);
		System.out.println(d>=65 && d<=90 || d>=97 && d<=122);
		// 5.
		char e = 'ㄳ';
		System.out.println((int)e);
		System.out.println(e>=4352 && e<=4607 || e>=12592 && e<=12687 || e>=43360 && e<=43391
						|| e>=44032 && e<=55215 || e>=55216 && e<=55295);
		// 6.
		Scanner sc = new Scanner(System.in);
		System.out.print("마치려면 quit를 입력하세요 > ");
		String userInput = sc.next();
		System.out.println(userInput.equals("quit"));
		
	}
}
