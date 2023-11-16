package quiz;

import java.util.Scanner;

// 만들었던 Updown게임을 함수로 나눠서 다시 만들어보세요

public class C02_FunctionalUpdown {
	
	
	// * 입력한 숫자가 범위에 맞는지 체크 체크
	public static void checkNumber(int userNum, int answer, int chance) {
		if (userNum > 100 || userNum < 1 ) {
			System.out.println("숫자의 범위를 올바르게 입력해주세요");
		} else {
			updownCheck(userNum, answer, chance);
		}
	}
	// * 정답 입력 체크
	public static boolean updownCheck(int userNum, int answer, int chance) {
		boolean answerChk = false;
		if(answer > userNum && chance > 0) {
			System.out.println("DOWN!!");
			System.out.println("남은기회 : " + chance);
		} else if(answer < userNum && chance > 0) {
			System.out.println("UP!!");
			System.out.println("남은기회 : " + chance);
		} else if(chance == 0) {
			System.out.println("패배했습니다. 정답은 " + answer + "이였습니다..");
		} else {
			System.out.println("정답!!");
			answerChk = true;
		}
		return answerChk;
	}
	
	
	public static void main(String[] args) {
		
		// 맞출 수 있는 기회
		final int MAX_CHANCE = 5;
		
		System.out.println("Up Down 게임");
		// 정답 설정
		int answer = (int)(Math.random() * 100 + 1);
		System.out.println("정답(테스트용) : " + answer);
		
		
		// 사용자 입력받기
		Scanner sc = new Scanner(System.in);
		int chance = MAX_CHANCE;
		int answerCount = 0;
		// 정답이 맞는지 확인(5번동안)
		for (int i = 1; i <= MAX_CHANCE; i++) {
			System.out.print("숫자을 입력 (1 ~ 100) >> ");
			int userNum = sc.nextInt();
			answerCount++;
			chance--;
			if (updownCheck(userNum, answer, chance)) {
				System.out.println(answerCount + "번만에 맞추셨습니다.");
				break;
			} 
		}
		
		
	}
}
