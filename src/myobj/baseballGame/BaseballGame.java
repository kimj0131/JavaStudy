package myobj.baseballGame;

import java.util.Arrays;
import java.util.Scanner;

public class BaseballGame {

	int[] answerArr;
	int tryNumber;
	
	public BaseballGame() {
		answerArr = makeAnswerArr(4);
		tryNumber = 9;
	}
	
	public BaseballGame(int size) {
		answerArr = makeAnswerArr(size);
		tryNumber = 9;
	}
	
	// 정답배열 생성
	public int[] makeAnswerArr(int size) {
		int[] arr = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = (int)(Math.random() * 10);
			for (int j = 0; j < i; j++) {
				if (arr[j] == arr[i]) {
					i--;
				}
			}
		}
		return arr;
	}
	
	/**
	 * 유저가 입력한 숫자 문자열에 같은 숫자가 있는지 확인
	 * @param userGuess - 유저가 입력한 숫자 문자열
	 * @return 중복된 숫자가 있다면 false, 없으면 true를 리턴
	 */
	public boolean userDupleChk(String userGuess) {
		for (int i = 0; i < userGuess.length(); i++) {
			for (int j = 0; j < i; j++) {
				if(userGuess.charAt(j) == userGuess.charAt(i)) {
					return false;
				}
			}
		}
		return true;
	}
	
	/**
	 * 중복체크가 완료된 유저 입력값을 배열로 전환
	 * @param userGuess - 유저가 입력한 숫자 문자열
	 * @return 배열로 전환된 유저 입력값
	 */
	public int[] userArr(String userGuess) {
		int[] userArr = new int[4];
		for (int i = 0; i < userArr.length; i++) {
			userArr[i] = userGuess.charAt(i) - 48;
		}
//			System.out.println("입력 체크용 " + Arrays.toString(userArr));
		return userArr;
	}
	
	/**
	 * 유저가 입력한 값과 정답을 비교
	 * 같은 index에 같은 숫자가 있으면 strike를 증가
	 * index는 다르지만 같은 숫자가 있으면 ball을 증가
	 * @param userArr - 유저가 입력한 값
	 * @return 총 strike의 개수를 리턴
	 */
	public int comprison(int[] userArr) {
//		System.out.println("정답 체크용 " + Arrays.toString(answerArr));
		
		int strike = 0;
		int ball = 0;
		for (int i = 0; i < answerArr.length; i++) {
			for(int j = 0; j < userArr.length; j++) {
				if(userArr[j] == answerArr[i] && i == j) {
					strike++;
				} else if(userArr[j] == answerArr[i] && i != j) {
					ball++;
				}
			}
		}
		if (strike == 4) {
			return 4;
		}
		System.out.printf("[%d]strike [%d]ball\n\n", strike, ball);
		tryNumber--;
		System.out.printf("남은기회 : %d\n\n", tryNumber);
		return strike;
	}
	
	public void play() {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("확인해볼 번호를 입력하세요\n>> ");
			String userGuess = sc.next();
			
			// 입력한 숫자문자열의 길이가 4가 아니거나 중복된 번호를 입력했을때 
			if(!userDupleChk(userGuess) || userGuess.length() != 4) {
				System.out.println("잘못된 번호를 입력했습니다.\n");
				continue;
			}
			int strike = comprison(userArr(userGuess));
			if(strike == 4) {
				System.out.printf("[%d]strike!! 정답입니다!\n", strike);
				break;
			} else if(tryNumber == 0) {
				System.out.println("정답은 " + Arrays.toString(answerArr) + "이였습니다");
				System.out.println("남은 기회를 모두 소진했습니다.\n패배했습니다.\n");
				break;
			}
		}
		
	}
}
