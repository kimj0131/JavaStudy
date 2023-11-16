package myobj.clapGame;

import java.util.Scanner;

public class ClapGame {
	
	int numberCheck = 0;

	public void playGame() {
		// 0 : 플레이어먼저 / 1 : 컴퓨터 먼저
		boolean keepPlaying = true;
		
		int turn =  (int) (Math.random() * 2);

		if (turn == 0) {
			System.out.println("플레이어 선공");
			System.out.println("================");
		} else {
			System.out.println("컴퓨터 선공");
			System.out.println("================");
		}

		while (true) {			
			// 사용자가 선공
			if (turn % 2 == 0) {
				numberCheck++;
				System.out.print("플레이어 차례\n>> ");
				keepPlaying = userInput();
				System.out.println();
				if(!keepPlaying) {
					break;
				}
			}else {
				numberCheck++;
				System.out.print("컴퓨터 차례\n>> ");
				keepPlaying = computerInput();
				System.out.println();
				if (!keepPlaying) {
					break;
				}
			}
			++turn;
		}
	}

	
	public boolean userInput() {
		Scanner sc = new Scanner(System.in);
		int num = numberCheck;

		// 박수칠 횟수 확인
		int clapCount = new ClapCount().comparison(num);
		
		// 문자열로 제대로 입력했는지 검사
		String userCount = sc.next();
		String checkNumber = num + "";
		// 박수칠 숫자에 제대로 쳤는지
		for (int i = 0; i < userCount.length(); i++) {
			if (clapCount > 0) {
				char userCh = userCount.charAt(i);
				if ((userCh == '짝' || userCh == 'ㅉ') && userCount.length() == clapCount) {
					return true;
				} else{
					System.out.println("================");
					System.out.println("플레이어의 패배");
					System.out.println("================");
					return false;
				}
			} else {
				char userCh = userCount.charAt(i);
				if (userCh != checkNumber.charAt(i) || userCount.length() != checkNumber.length()) {
					System.out.println("================");
					System.out.println("플레이어의 패배");
					System.out.println("================");
					return false;
				}
			}
		}
		return true;
	}
	
	public boolean computerInput() {
		int num = numberCheck;
	
		// 박수칠 횟수 확인
		int clapCount = new ClapCount().comparison(num);
		
		int probability = (int)(Math.random() * 4);
		// 3일때 오답을 말한다.
		if (probability == 3) {
			num ++;
			System.out.println(num);
			System.out.println("==============");
			System.out.println("컴퓨터의 패배");
			System.out.println("==============");
			return false;
		}else if(clapCount > 0){
			for (int i = 0; i < clapCount; i++) {
				System.out.print("짝");
			}
			System.out.println();
			return true;
		}else {
			System.out.println(num);
			return true;
		}
	}

}
