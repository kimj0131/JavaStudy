package myobj.lotto;

import java.util.Arrays;

public class LottoGame_NumericalComparison {

	
	public void comparison(int[] winNum, int[] selectNum) {
		System.out.println("당첨 번호 :\n"+Arrays.toString(winNum));
		
		System.out.println("자동 구매 번호 :\n"+Arrays.toString(selectNum));

		int sameCount = 0;
		boolean bonusNumber = false;

		for (int i = 0; i < 7; i++) { // 7 = 당첨번호배열 길이
			if (i < 6) {
				// i번째 번호 각 비교
				for (int j = 0; j < 6; j++) {
					if (winNum[i] == selectNum[j]) {
						sameCount++;
						// 번호가 같으면 반복을 탈출
						break;
					}
				}
				// 2등
				// 6번의 회수동안 5개의 번호는 맞췄고 보너스번호 비교일때
			} else if (sameCount == 5 && i == 6) {
				// 보너스 숫자 확인
				for (int j = 0; j < 6; j++) {
					if (selectNum[j] == winNum[6]) {
						sameCount++;
						bonusNumber = true;
					}
				}
			}
		}
		LottoGame_UserHistory uh = new LottoGame_UserHistory();
		
		boolean isUserWin = false;
		if (sameCount == 6 && !bonusNumber) {
			System.out.println("==================================");
			System.out.println("1등 당첨!");
			isUserWin = true;
			
			uh.price += 1000000000;
			uh.winCount[0] ++;
		} else if (sameCount == 6 && bonusNumber) {
			System.out.println("==================================");
			System.out.println("2등 당첨!");
			isUserWin = true;
			
			uh.price += 80000000;
			uh.winCount[1] ++;
		} else if (sameCount == 5) {
			System.out.println("==================================");
			System.out.println("3등 당첨!");
			isUserWin = true;
			
			uh.price += 1500000;
			uh.winCount[2] ++;
		} else if (sameCount == 4) {
			System.out.println("==================================");
			System.out.println("4등 당첨!");
			isUserWin = true;
			
			uh.price += 50000;
			uh.winCount[3] ++;
		} else if (sameCount == 3) {
			System.out.println("==================================");
			System.out.println("5등 당첨!");
			isUserWin = true;
			
			uh.price += 5000;
			uh.winCount[4]++;
		} 
		
		// 당첨 후 당첨번호 변경 후 유저메뉴 불러오기
		if (isUserWin) {
			System.out.println();
			System.out.println("초기화면으로 돌아갑니다.");
			LottoGame_UserMenu um = new LottoGame_UserMenu();
			LottoGame_WinNumber wm = new LottoGame_WinNumber();
			um.winNum = wm.creatWinNumber();
			um.menu();
		} else {
			System.out.println("==================================");
			System.out.println("낙첨입니다.");
		}
		
	}
}
