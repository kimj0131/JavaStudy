package quiz_answer;

import java.util.Scanner;

public class B12_UpdownGame_Answer {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		// 게임 횟수를 변경할 수도 있으므로 변수로 작성하는게 좋다.
		final int MAX_CHANCE = 10;
		int chance = MAX_CHANCE;
		
		int answer = (int)(Math.random()*100+1);
		boolean userWin = false;
		
		System.out.println("정답(테스트용) : " + answer);
		
		while (chance > 0) {
			System.out.print("숫자를 고르세요 (1 ~ 100) : ");
			int select = sc.nextInt();
			
			if (select > 100 || select < 1) {
				System.out.println("숫자의 범위를 올바르게 입력해주세요");
				continue;
			}
			chance--;
			if (select > answer) {
				System.out.println("DOWN!!");
			} else if(select < answer) {
				System.out.println("UP!!");
			} else {
				System.out.println("정답!!");
				userWin = true;
				break;
			}
			System.out.println("남은 기회 : " + chance);
		}
		if(userWin) {
			System.out.printf("%d번 만에 맞추셨습니다!!\n", MAX_CHANCE - chance);
		} else {
			System.out.printf("패배했습니다... 정답은 %d이였습니다.", answer);
		}
	}
}
