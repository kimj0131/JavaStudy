package quiz_answer;

import java.util.Scanner;

public class B08_Numeric_Answer {

	public static void main(String[] args) {
		
		// 방법 1 : 숫자의 개수를 센다, 문자열의 길이와 숫자의 개수가 같으면 모두 숫자. (비효율적)
		
		// 방법 2 : 하나씩 탐색하면서 숫자가 아닌게 하나라도 등장하면 모두 숫자가 아님.(검사 그만)
		Scanner sc = new Scanner(System.in);
		
		System.out.print(">> ");
		String str = sc.next();
		
		boolean onlyNumber = true;
		
		// 한 문자씩 검사하다가 숫자가 아닌것을 발견하면 onlyNumber를 false로 바꾼다
		for (int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			
			onlyNumber = ch >= '0' && ch <= '9';
			
			if (!onlyNumber) {
				break;
			}
		}
		if (onlyNumber) {
			System.out.println("숫자로만 이루어진 문자열입니다.");
		} else {
			System.out.println("숫자로만 이루어지지 않았습니다.");
		}
	}
	
}
