package myobj.lotto_answer;

import java.util.Arrays;
import java.util.Scanner;

public class LottoGame {

	Scanner sc = new Scanner(System.in);
	// LottoGame 클래스를 불러올때마다 새로운 당첨번호 생성
	LottoNumber winNum = new LottoNumber(true);
	
	// 사용 금액, 당첨 횟수, 손익 계산
	int[] prizeCount = new int[6];
	long[] prizeAmount = {0, 1000000000, 80000000, 1500000, 50000, 5000};
	
	
	// play swhich case 2 : 
	// getLottoNumberManual는 LottoNumber타입을 리턴받는다
	public LottoNumber getLottoNumberManual() {
		int count = 0;
		int[] nums = new int[6];
		
		while (count < 6) {
			// 0부터 사용하는게 편하지만 사용자들에게는 1부터 나오도록한다.
			System.out.printf("%d번째 숫자를 입력해주세요 : ", count + 1);
			int num = sc.nextInt();
			
			// 범위 외 값
			if(num < 1 || num > 45) {
				System.out.println("1 ~ 45 사이의 숫자를 골라주세요!");
				continue;
			}
			// 중복값
			boolean duplicate = false;
			for (int i = 0; i < count; i++) {
				if(nums[i] == num) {
					System.out.println("중복되는 값이 있습니다! 다시 선택해 주세요.");
					duplicate = true;
					break;
				}
			}
			
			if (duplicate) {
				continue;
			}
			// 모두 통과한 숫자만 배열에 넣을 수 있다.
			nums[count++] = num;
		}
		// 만들어진 인스턴스(수동 번호)가 리턴
		// 다 만든 1 ~ 45사이의 중복값 없는 int[]을 전달해 인스턴스를 생성한 후 리턴
		return new LottoNumber(nums);
	}
	
	public void printGameInfo() {
		int spent = 0;
		long prize = 0;
		
//		prize += prizeCount[1] * 1000000000L;
//		prize += prizeCount[2] * 80000000L;
//		prize += prizeCount[3] * 1500000L;
//		prize += prizeCount[4] * 50000L;
//		prize += prizeCount[5] * 5000L;
		
		
		for (int i = 0; i < prizeCount.length; i++) {
			spent += prizeCount[i] * 1000;
			prize += prizeCount[i] * prizeAmount[i];
		}
		
		System.out.printf("총 사용금액 : %d원\n", spent);
		System.out.printf("손익 : %d원\n", prize - spent);
		
		System.out.println("## 당첨 이력 ##");
		for (int i = 1; i < prizeCount.length; i++) {
			System.out.printf("%d등 : %d회\n", i, prizeCount[i]);
		}
		System.out.println("##################\n");
	}
	
	public void play() {
		
		while(true) {
			System.out.println("1. 자동 구매");
			System.out.println("2. 수동 구매");
			System.out.println("3. 현재까지 이력확인");
			System.out.println("4. 게임 종료");
			System.out.print(">> ");
			int userSelect = sc.nextInt();
			
			int result = -1;
			
			switch(userSelect) {
			case 1:
				result = new LottoNumber(false).check(winNum);
				break;
			case 2:
				// getLottoNumberManual는 LottoNumber타입을 리턴받는다
				result = getLottoNumberManual().check(winNum);
				break;
			case 3:
				printGameInfo();
				break;
			case 4:
				System.out.println("게임을 종료합니다.");
				return;
			default:
				break;
			}
			
			if(result != -1) {
				prizeCount[result]++;
				
				System.out.println("당첨 번호\n" + Arrays.toString(winNum.numbers));
				
				if (result == 0) {
					System.out.println("당첨되지 않았습니다...");
				} else {
					System.out.printf("%d등 당첨!!\n", result);
				}
			}
		}
	}
}
