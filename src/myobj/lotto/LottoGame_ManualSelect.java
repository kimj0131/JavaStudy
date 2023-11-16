package myobj.lotto;

import java.util.Scanner;

public class LottoGame_ManualSelect {

	public int[] manual() {
		
		System.out.println("==================================");
		Scanner sc = new Scanner(System.in);
		int[] manual = new int[6];
		int inputCount = 0;
		for (int i = 0; i < manual.length; i++) {
			inputCount++;
			System.out.printf("%d번째 번호를 입력해주세요 >> ", inputCount);
			int input = sc.nextInt();
			
			manual[i] = input;
			
			for (int j = 0; j < i; j++) {
				if (manual[i] == manual[j]) {
					System.out.println("중복된 번호입니다.");
					i--;
					inputCount--;
				}
			}
		}
		
		return manual;
	}
	
}
