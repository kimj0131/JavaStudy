package quiz_answer;

import java.util.Scanner;

public class B07_CountE_Answer {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("> ");
		String str = sc.nextLine();
		
		int len = str.length();
		int eCount = 0;
		
		//문장 전체를 반복하면서
		for(int i=0; i<len; i++) {
			// 문자를 하나 꺼내고
			char ch = str.charAt(i);
			// 해당 문자가 'e'또는 'E'일때만 개수가 증가
			if (ch == 'e' || ch == 'E') {
				eCount ++;
			}
		}
		System.out.printf("eCount : %d\n", eCount);
	}

}
