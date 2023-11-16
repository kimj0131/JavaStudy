package myobj.omok;

import java.util.Scanner;

public class OmokPlay {
	Scanner sc = new Scanner(System.in);
	
	private int[] userInput() {
		System.out.println("바둑돌을 놓을 가로위치와 세로위치를 순서대입력 (10X10 바둑판)");
		System.out.print("가로> ");
		int inputLength = sc.nextInt() - 1;
		System.out.print("세로> ");
		int inputWidth = sc.nextInt() - 1;
		
		if(inputLength >= 0 && inputLength <= 9 && inputWidth >= 0 && inputWidth <= 9) {
			int[] userInput = {inputLength, inputWidth};
			return userInput;
		} else {
			return null;
		}
	}

	public void play() {
		
		OmokBoard board = new OmokBoard();
	
		board.boardPrint();
		// 0 : 흑돌 1 : 백돌
		int turnCheck = 0;
		
		boolean dupleCheck = false;
		boolean isWinning = false;
		
		// 돌을 놓은 횟수
		int runCheck = 0;
		while (runCheck < 100) {
			
			// 유저입력 받음
			int[] userInput = userInput();
			//System.out.println("userInput 확인용 " + Arrays.toString(userInput));
			
			
			// 입력한 범위를 체크
			if(userInput == null) {
				System.out.println("\n잘못된 범위를 입력했습니다\n");
				continue;
			}
			
			// 유저가 놓을 자리에 돌이있는지 체크
			dupleCheck = board.dupleCheck(userInput[0], userInput[1]);
			if(dupleCheck) {
				System.out.println("\n### 이미 돌이 놓여져 있습니다. ###\n");
				board.boardPrint();
				continue;
			}
			// 자리에 돌을 놓는다
			board.layingStone(turnCheck, userInput[0], userInput[1]);
			
			// 오목판의 현상황을 출력
			board.boardPrint();
			
			// 돌이 5개 연속으로 놓아져있는지 체크
			isWinning = board.continuousCheck(userInput, turnCheck);
			
			// 5개가 연속이면 승리 출력하고 종료
			if (isWinning) {
				System.out.printf("%s이 승리했습니다\n", turnCheck == 0 ? "흑돌" : "백돌" );
				break;
			}
			
			// 다음턴으로 변환
			if(turnCheck == 0) {
				turnCheck = 1;
			} else {
				turnCheck = 0;
			}
			// 돌 놓은 회수를 증가
			runCheck++;
		}
	}
}
