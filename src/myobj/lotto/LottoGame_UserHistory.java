package myobj.lotto;

import java.util.Scanner;

public class LottoGame_UserHistory {
	
	public int buyCount;
	public int price = 0;
	public int[] winCount = new int[5];
	
	
	public void history() {
		int profit = price - (buyCount * 1000);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("==================================");
		System.out.println("### 이용내역 ###");
		System.out.println("1. 현재까지 사용금액");
		System.out.println("2. 현재까지 당첨횟수");
		System.out.println("3. 현재까지 손익계산");
		System.out.println("4. 돌아가기");
		System.out.print(">> ");
		int selectMenu = sc.nextInt();
		
		switch (selectMenu) {
			case 1:
				System.out.println("==================================");
				System.out.printf("총 사용금액 : %d\n", buyCount * 1000);
				history();
				break;
			case 2:
				System.out.println("==================================");
				System.out.printf("총 당첨횟수\n");
				System.out.printf("1등 : %d\n", winCount[0]);
				System.out.printf("2등 : %d\n", winCount[1]);
				System.out.printf("3등 : %d\n", winCount[2]);
				System.out.printf("4등 : %d\n", winCount[3]);
				System.out.printf("5등 : %d\n", winCount[4]);
				history();
				break;
			case 3:
				System.out.println("==================================");
				System.out.printf("순이익 : %d\n", profit);
				history();
				break;
			case 4:
				System.out.println("==================================");
				System.out.println("상위메뉴로 돌아갑니다.");
				LottoGame_UserMenu um = new LottoGame_UserMenu();
				um.menu();
				break;
			default:
				System.out.println("==================================");
				System.out.println("오류가 발생했습니다.");
				history();
				break;
		}
		
	}
	

}
