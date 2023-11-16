package quiz;

import java.util.Scanner;

public class B12_UpdownGame {
	/*
	 	# Updown 게임 만들기
	 	
	 	1. 게임 이시작되면 1 ~ 100사이의 랜덤숫자를 정답으로 선택한다.
	 		(사용자에게는 비밀로한다)
	 	2. 사용자가 숫자를 입력하면 UP인지 DOWN인지 정답인지 알려준다.
	 	3. 정답이 입력한 숫자보다 크다면 UP 이라고 알려준다.
	 	   정답이 입력한 숫자보다 작다면 DOWN이라고 알려준다
	 	   정답이 입력한 숫자와 일치하면 정답이라고 알려준 후 플레이어가 승리한다.
	 	   
	 	4. 5번안에 못맞추면 정답이 뭐였는지 알려주고 플레이어의 패배로 프로그램을 종료한다.
	 	5. 정답을 맞추면 몇 번만에 맞췄는지 알려주고 프로그램을 종료한다.
	 	6. 사용자가 범위를 벗어나는 숫자를 입력하면 다시입력할 수 있게 해준다.
	*/
	
	public static void main(String[] args) {
		
		// 정답 설정
		System.out.println("숫자 맞추기 게임");
		int answer = (int)(Math.random()*100 +1);
//		System.out.println(answer);
		
		// 정답을 적었는지?
		boolean userCorrect = false;
		// 시도회수 카운트
		int answerCount = 0;
		//MAX_CHANCE 같은 변수로 변경 가능성에 대비할것
		final int MAX_CHANCE = 5;
		
		System.out.println("1 ~ 100 사이의 숫자를 입력하세요");
		Scanner sc = new Scanner(System.in);
		// 5번 기회
		for (int chance = 1; chance <= 5; chance++) {
			System.out.print(">> ");
			int userNum = sc.nextInt();
			// 잘못입력했을 경우 기회 회복
			if (userNum < 1 || userNum > 100) {
				chance -= 1;
				System.out.printf("잘못된 값을 입력했습니다. 다시입력하세요. 남은 기회 %d\n", MAX_CHANCE-chance);
			} else {
				// 시도회수 +1
				answerCount++;
				if (userNum != answer) {
					if(userNum > answer) {
						System.out.printf("정답은 DOWN! 정답이 아닙니다. 남은 기회 %d\n", MAX_CHANCE-chance);
					} else {
						System.out.printf("정답은 UP! 정답이 아닙니다. 남은 기회 %d\n", MAX_CHANCE-chance);
					}
				} else {
					// 정답을 적었을 때
					userCorrect = true;
					System.out.println("정답입니다!");
					break;
				}
			}
		}
		if (userCorrect) {
			System.out.printf("%d번만에 정답을 맞추셨습니다. 승리했습니다!\n", answerCount);
		} else {
			System.out.printf("정답은 %d 입니다. 패배했습니다.\n", answer);
		}
		
	}
}
