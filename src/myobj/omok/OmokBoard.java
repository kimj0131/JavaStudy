package myobj.omok;

public class OmokBoard {

	private char[] stoneColor = {'●', '○'};
	private char[][] omokBoard = { 
			{ '┌', '┬', '┬', '┬', '┬', '┬', '┬', '┬', '┬', '┐' },
			{ '├', '┼', '┼', '┼', '┼', '┼', '┼', '┼', '┼', '┤' }, 
			{ '├', '┼', '┼', '┼', '┼', '┼', '┼', '┼', '┼', '┤' },
			{ '├', '┼', '┼', '┼', '┼', '┼', '┼', '┼', '┼', '┤' }, 
			{ '├', '┼', '┼', '┼', '┼', '┼', '┼', '┼', '┼', '┤' },
			{ '├', '┼', '┼', '┼', '┼', '┼', '┼', '┼', '┼', '┤' }, 
			{ '├', '┼', '┼', '┼', '┼', '┼', '┼', '┼', '┼', '┤' },
			{ '├', '┼', '┼', '┼', '┼', '┼', '┼', '┼', '┼', '┤' }, 
			{ '├', '┼', '┼', '┼', '┼', '┼', '┼', '┼', '┼', '┤' },
			{ '└', '┴', '┴', '┴', '┴', '┴', '┴', '┴', '┴', '┘' }};

	// 입력한 자리에 돌이 놓여있는지 확인
	public boolean dupleCheck(int inputLength, int inputWidth) {
		if (omokBoard[inputLength][inputWidth] == '●' || omokBoard[inputLength][inputWidth] == '○') {
			return true;
		} else {
			return false;
		}
	}
	
	// 위치에 돌을 넣는 메소드
	public void layingStone(int turnCheck, int inputLength, int inputWidth) {
		omokBoard[inputLength][inputWidth] = stoneColor[turnCheck];
	}

	// 바둑판 현상황을 보여주는 메소드
	public void boardPrint() {
		for (int i = 0; i < omokBoard.length; i++) {
			for (int j = 0; j < omokBoard[i].length; j++) {
				System.out.printf("%c ", omokBoard[i][j]);
			}
			System.out.println();
		}
	}
	
	// 돌이 연속되었는지 체크하는 메소드
	public boolean continuousCheck(int[] userInput, int turnCheck) {
		// 사용자가 지정한 좌표
		// omokBoard[userInput[0]][userInput[1]]
		
		// 연속됨을확인하는 변수
		int continuous = 1;
		
		// 놓은곳 근접한 곳에 돌이있는지 체크
		// 상하
		for (int i = 1; i < 5; i++) {
			if(userInput[0] - i < 0 || userInput[0] + i > 9) {
				break;
			} 
			// 상
			if (omokBoard[userInput[0] - i][userInput[1]] == stoneColor[turnCheck]) {
				continuous++;
				//System.out.println("continuous 체크 " + continuous);
			}
			// 하
			if (omokBoard[userInput[0] + i][userInput[1]] == stoneColor[turnCheck]) {
				continuous++;
				//System.out.println("continuous 체크 " + continuous);
			} 
		}
		if(continuous == 5) {
			return true;
		} else {
			continuous = 1;
		}
		
		// 좌우
		for (int i = 1; i < 5; i++) {
			if(userInput[1] - i < 0 || userInput[1] + i > 9) {
				break;
			} 
			// 좌
			if(omokBoard[userInput[0]][userInput[1] - i] == stoneColor[turnCheck]) {
				continuous++;
				//System.out.println("continuous 체크 " + continuous);
			} 
			// 우
			if(omokBoard[userInput[0]][userInput[1] + i] == stoneColor[turnCheck]) {
				continuous++;
				//System.out.println("continuous 체크 " + continuous);
			} 
		}
		if(continuous == 5) {
			return true;
		} else {
			continuous = 1;
		}
		
		// 좌하우상 대각
		for (int i = 1; i < 5; i++) {
			if(userInput[0] - i < 0 || userInput[1] - i < 0 || userInput[0] + i > 9 || userInput[1] + i > 9) {
				break;
			} 
			// 좌하
			if(omokBoard[userInput[0] - i][userInput[1] + i] == stoneColor[turnCheck]) {
				continuous++;
			} 
			// 우상
			if(omokBoard[userInput[0] + i][userInput[1] - i] == stoneColor[turnCheck]) {
				continuous++;
			} 
		}
		if(continuous == 5) {
			return true;
		} else {
			continuous = 1;
		}
		
		// 좌상우하 대각
		for (int i = 1; i < 5; i++) {
			if(userInput[0] - i < 0 || userInput[1] - i < 0 || userInput[0] + i > 9 || userInput[1] + i > 9) {
				break;
			} 
			// 좌하
			if(omokBoard[userInput[0] - i][userInput[1] - i] == stoneColor[0]) {
				continuous++;
			}
			// 우상
			if(omokBoard[userInput[0] + i][userInput[1] + i] == stoneColor[0]) {
				continuous++;
			}
		}
		if(continuous == 5) {
			return true;
		} else {
			// 전부 검사했는데 안나오면 false 리턴
			return false;
		}
		
	}
}
