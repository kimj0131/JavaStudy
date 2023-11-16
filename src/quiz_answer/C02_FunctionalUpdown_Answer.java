package quiz_answer;

import java.util.Scanner;

public class C02_FunctionalUpdown_Answer {
	
	/** 시작값과 끝값을 받아 랜덤숫자를 생성 */
	public static int getWinNum(int start, int end) {
		// 100 ~ 200의 랜덤숫자
		// (int)(Math.random() * (200 - 100 + 1) + 100)
		
		// (end - start + 1) : 범위내의 숫자의 개수
		// start : 시작값
		return (int)(Math.random() * (end - start + 1) + start);
	}
	
	/** 사용자로부터 입력을 받아오는 기능 */
	public static int getUserGuess() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정답을 맞춰보세요 > ");
		return sc.nextInt();
	}
	/**
	 * 사용자가 추측한 값의 결과를 반환하는 함수
	 * 
	 * @param userGuess - 사용자가 추측한 번호
	 * @param winNum - 승리번호
	 * @return 0은 Up, 1은 Down, 3는 Win
	 */
	public static int checkWin(int userGuess, int winNum) {
		if(userGuess == winNum) {
			return 2;
		} else if(userGuess > winNum) {
			return 1;
		} else if(userGuess < winNum) {
			return 0;
		}
		return -1;
	}

	
	public static void main(String[] args) {
		
		int start = 1;
		int end = 100;
		
		// 랜덤으로 정답을 하나 생성하여 받아오는 기능
		// () > 정답의 범위를 보내기
		int winNum = getWinNum(start, end);
		// 정답 입력가능 회수
		int chance = 5;
		
		while(chance > 0) {
			// 사용자로부터 입력을 하나 받아오는 기능
			int userGuess;
			while(true) {
				userGuess = getUserGuess();
				// 위의 함수에서입력받아온 값이 조건안의 범위 내일때만 break로 빠져나가
				// 밖의 while문이 정상적으로 실행됨
				if(userGuess >= start && userGuess <= end) {
					break;
				}
				System.out.printf("%d ~ %d사이의 값을 입력해주세요 \n", start, end);
			}
			// up, down, correct
			// 리턴을 int로 받아 세가지 결과를 구분
			int result = checkWin(userGuess, winNum);
			
			// checkWin 함수에서 리턴받은 값을 기준으로 확인
			switch (result) {
			case 0 :
				System.out.printf("Up! (남은기회 : %d)\n", --chance);
				break;
			case 1 :
				System.out.printf("Down! (남은기회 : %d)\n", --chance);
				break;
			case 2 :
				System.out.println("정답입니다!!");
				return;	// main에서 return은 프로그램의 종료를 의미한다.(main함수를 끝내버리므로)
			case -1 :
				System.out.println("값 체크 도중 에러가 발생했습니다");
				return;
			default :
				System.out.println("예측하지 못했던 값이 발생했습니다");
				return;
				
			}
		}
		System.out.printf("기회를 모두 소진했습니다. 정답은 %d이었습니다...", winNum);
	}
}
