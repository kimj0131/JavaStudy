package myobj.Tong;

import java.util.Arrays;
import java.util.Scanner;

public class PlayGame {
	Scanner sc = new Scanner(System.in);
	PointSetting ps = new PointSetting();

	public void play() {
		// MAX_POINT : 전체 구멍의 개수
		// LOSE_POINT : 꽝 구멍의 수
		int maxNumber = ps.MAX_POINT;
		int loseNumber = ps.LOSE_POINT.length;
		int maxPlayCount = maxNumber - loseNumber;

		// 탈락번호 생성
		int[] losePoint = new PointSetting().losingPositionSet();
		System.out.println(Arrays.toString(losePoint));
		System.out.println("탈락번호가 생성되었습니다.");

		// 찌른 횟수
		int userGuessCount = 0;
		
		// 중복확인을 위한 boolean
		boolean isDuple = false;
		// 중복 비교하기 위한 배열생성
		int[] dupleArray = new int[ps.MAX_POINT];
		for (int i = 0; i < ps.MAX_POINT; i++) {
			dupleArray[i] = i + 1;
		}
		
		// 계속 플레이하면되는지 확인을 위한 boolean
		boolean keepPlay = true;
		// keepPlay : 성공이면 계속반복, 실패면 반복탈출
		// maxPlayCount : 유저가 최대로 칼을 꽂을 수 있는 횟수
		while (keepPlay && userGuessCount < maxPlayCount) {
			System.out.println("===========================");
			System.out.println("칼을 찌를 홈의 번호는?");
			System.out.print(">> ");

			int userGuess = sc.nextInt();
			// 중복확인함수
			isDuple = isDuplicate(userGuess, dupleArray);
			if(isDuple) {
				System.out.println("이미 입력한 번호를 입력했습니다. 다시 입력해주세요.");
				continue;
			}
			
			// 입력을 받을때 범위 밖의 번호를 입력받을 경우 되돌림
			if (userGuess < 1 || userGuess > maxNumber) {
				System.out.println("[error]잘못된 번호에 시도했습니다");
				System.out.println("다시 시도해 주세요");
				continue;
				// 성공인지 실패인지 확인시킴
			} else {
				keepPlay = comprison(userGuess, losePoint, userGuessCount);
			}
			// 찌른회수를 증가시킨다.
			userGuessCount++;
		}
	}
	
	// 꽝 여부 비교 함수
	public boolean comprison(int userGuess, int[] losePoint, int userGuessCount) {
		
		System.out.printf("선택한 번호는 [%d] 입니다\n", userGuess);
		int guessCount = userGuessCount + 1;
		boolean isUserLose = false;
		// 선택한 번호가 탈락번호에 있는지 확인하고 있으면 탈락문구를 출력
		for (int i = 0; i < losePoint.length; i++) {
			if (losePoint[i] == userGuess) {
				isUserLose = true;
				break;
			}
		}
		// 탈락번호 선택했을때
		if (isUserLose) {
			System.out.println("===========================");
			System.out.printf("통아저씨가 %d번만에 발사되었습니다!\n", guessCount);
			System.out.println("### 게임 종료 ###");
			return false;
			
			// 칼 꽂기를 성공했을때
		} else {
			System.out.println("통아저씨는 아직 살아남았습니다.");
			return true;
		}
	}
	
	// 중복입력 확인 함수
	public boolean isDuplicate(int userGuess, int[] dupleArray) {
		
		// dupleArray내에서 번호가 없으면 이미 입력한 번호이므로 true
		for (int i = 0; i < dupleArray.length; i++) {
			if(dupleArray[i] == userGuess) {
				// 중복이 아닐경우 false를 리턴
				dupleArray[i] = 0;
//				System.out.println(Arrays.toString(dupleArray));
				return false;
			}
		}
		return true;
	}
}
