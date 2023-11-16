package quiz;

import java.util.Scanner;

public class B07_IncludeUppercase {
	/*
	 	사용자가 단어를 입력했을 때 해당 단어에
	 	대문자가 포함되어 있는지 여부를 체크하는 프로그램을 만들어보세요
	*/
	public static void main(String[] args) {
		// 단어를 입력받음
		System.out.print("단어를 입력 > ");
		Scanner sc = new Scanner(System.in);
		String text = sc.next();
		
		int upperCount = 0;
		// 단어의 문자들을 하나씩 확인
		int textLen = text.length();
		for (int i=0; i<textLen; i++) {
			// 문자중에 영어 대문자가 있는지 확인
			char ch = text.charAt(i);
			if (ch >= 'A' && ch <='Z') {
				// 대문자가 발견되면 카운트를 1 올림 (대문자의 갯수가 된다)
				upperCount ++;
			}
		}
		// upperCount값이 증가해 hasUpperCase가 true가 되면 대문자가 있다고 확인 메시지
		boolean haveUpperCase = upperCount > 0;
		
		if(haveUpperCase) {
			System.out.printf("입력한 단어에 대문자가 %d개 포함되어 있습니다.\n", upperCount);
		} else {
			System.out.println("입력한 단어에 대문자가 없습니다.");
		}
	}
}
