package quiz;

import java.util.Arrays;

import myobj.*;
import myobj.lotto.LottoGame_UserMenu;

public class C04_LottoGame {
	/*
	 	# 로또 게임 만들기
	 	1. 당첨번호는 7개이고 1등 당첨이 되면 다음 당첨 번호로 넘어간다.
	 	2. 플레이어는 번호 6개를 입력해 숫자를 맞춰야 한다.
	 	3. 1등 : 앞의 6개의 숫자를 모두 맞춤			(+ 10억)
	 	   2등 : 보너스 번호를 포함한 6개의 숫자를 맞춤		(+ 8천만원)
	 	   3등 : 5개의 숫자를 맞춤(보너스 번호 미포함)		(+ 150만원)
	 	   4등 : 4개의 숫자를 맞춤(보너스 번호 미포함)		(+ 5만원)
	 	   5등 : 3개의 숫자를 맞춤(보너스 번호 미포함)		(+ 5천원)
	 	4. 플레이어가 게임을 종료할때까지 게임이 계속 된다.
	 		<화면 예시>
	 		
	 		1.자동구매
	 		2.수동구매
	 		3.현재까지의 이력확인 (사용금액, 당첨횟수, 손익계산)
	 		4.게임종료
	 		>>
	 */
	

	public static void main(String[] args) {
		
		
		//사용자 메뉴
		LottoGame_UserMenu userMenu = new LottoGame_UserMenu();
		userMenu.menu();
		
	}
	

}
