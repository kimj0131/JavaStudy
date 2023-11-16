package myobj.lotto;

import java.util.Scanner;


public class LottoGame_UserMenu {
	
	LottoGame_UserHistory uh = new LottoGame_UserHistory();
	LottoGame_NumericalComparison nc = new LottoGame_NumericalComparison();
	LottoGame_AutomaticSelect auto = new LottoGame_AutomaticSelect();
	LottoGame_ManualSelect ms = new LottoGame_ManualSelect();
	
	LottoGame_WinNumber wm = new LottoGame_WinNumber();
	public int[] winNum = wm.creatWinNumber();
	
	public void menu() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("==================================");
		System.out.println("로또 시스템");
		System.out.println("1. 자동 구매");
		System.out.println("2. 수동 구매");
		System.out.println("3. 현재까지의 이력 확인");
		System.out.println("4. 게임종료");
		System.out.print(">> ");
		
		int selectMenu = sc.nextInt();
		
		// auto : true / manual : false
		boolean isAutoManual = true;
		// 메뉴창
		switch(selectMenu) {
			// 자동 구매 후 바로 비교
			case 1:
				uh.buyCount++;
				int[] selectNum1 = auto.automatic();
				nc.comparison(winNum, selectNum1);
				// 비교를 수행하고 나서 서브메뉴 불러오기
				subMenu(isAutoManual = true);
				break;
			// 수동 구매창
			case 2:
				uh.buyCount++;
				int[] selectNum2 = ms.manual();
				nc.comparison(winNum, selectNum2);
				subMenu(isAutoManual = false);
				break;
			// 이력 확인
			case 3:
				uh.history();
				break;
			// 종료시
			case 4:
				System.out.println("프로그램을 종료합니다.");
				return;
			default:
				System.out.println("오류가 발생했습니다.");
				menu();
				break;
		}
		
	}
	public void subMenu(boolean isAutoManual) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("==================================");
		System.out.println("### 로또 재구매 ###");
		System.out.println("1. 재구매 하기");
		System.out.println("2. 돌아가기");
		System.out.print(">> ");
		
		if(isAutoManual) {
			// 자동구매 서브메뉴창
			int selectMenu = sc.nextInt();
			switch (selectMenu) {
				case 1:
					uh.buyCount++;
					int[] selectNum = auto.automatic();
					nc.comparison(winNum, selectNum);
					subMenu(isAutoManual);
					break;
				case 2:
					menu();
					break;
				default :
					System.out.println("==================================");
					System.out.println("오류가 발생했습니다.");
					subMenu(isAutoManual);
					break;
			}
		} else if(!isAutoManual) {
			// 매뉴얼구매 서브메뉴창
			int selectMenu = sc.nextInt();
			switch (selectMenu) {
			case 1:
				uh.buyCount++;
				int[] selectNum = ms.manual();
				nc.comparison(winNum, selectNum);
				subMenu(isAutoManual);
				break;
			case 2:
				menu();
				break;
			default:
				System.out.println("==================================");
				System.out.println("오류가 발생했습니다.");
				subMenu(isAutoManual);
				break;
			}
		}
	}
}
