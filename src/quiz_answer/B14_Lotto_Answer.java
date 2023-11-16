package quiz_answer;

import java.util.Arrays;

public class B14_Lotto_Answer {
	public static void main(String[] args) {
		
		// 중복을 제외한 번호 생성
		int[] winNums = new int[7];
		
		int i = 0;
		int len = winNums.length;
		
		// 랜덤값 넣기
		while(i < len) {
			winNums[i] = (int)(Math.random() * 45 + 1);
			// i = 방금 뽑은 새 숫자의 인덱스
			// j = 여태까지 뽑았던 숫자들의 인덱스
			int j = 0;
			boolean duplicate = false;
			while(j < i) {
				if (winNums[j] == winNums[i]) {
					duplicate = true;
					break;	
					// 중복을 하나 찾고나면 더 찾을 필요 없으므로 break;
				}
				j++;
			}
			// 중복이 없는 경우에만 다음숫자로 넘어가겠다.
			if(!duplicate) {
				i++;
			}
		}
		// 당첨 숫자 출력하기
		for (i = 0; i < len; i++) {
			System.out.printf("winNums[%d] : %d\n", i, winNums[i]);
		}
		
		// 자동 로또 돌리기
		// 위의 당첨번호 생성과 같음
		int[] userNums = new int[6];
		int buyCount = 0;
		// 무한으로 반복
		while(true) {
			// 자동 번호 6개를 뽑고
			i = 0;
			len = userNums.length;
			while(i < len) {
				userNums[i] = (int)(Math.random() * 45 + 1);
				int j = 0;
				boolean duplicate = false;
				while(j < i) {
					if(userNums[j] == userNums[i]) {
						duplicate = true;
						break;
					}
					j++;
				}
				if (!duplicate) {
					i++;
				}
			}
			buyCount++;
			
			//당첨 여부를 확인
			//   당첨번호 7개 vs 자동번호 6개
			boolean hasBonusNum = false;
			int winCount = 0;
			
			// 자동번호 하나마다 모든 당첨번호를 검사한다.
			for (int userIndex = 0; userIndex < userNums.length; userIndex++) {
				for (int winIndex = 0; winIndex < winNums.length; winIndex++) {
					// 일치하는 당첨반호가 있을 때
					if (userNums[userIndex] == winNums[winIndex]) {
						// 해당번호가 마지막 번호(보너스 번호)인 경우
						if(winIndex == 6) {
							hasBonusNum = true;
						}
						winCount++;
					}
				}
			}
			// 당첨번호가 6개일 때
			if(winCount == 6) {
				// 번호 출력해주기 (배열을 쉽게 출력하는 방법. Arrays.toString(arr);)
				System.out.printf("%s vs %s\n", Arrays.toString(winNums), Arrays.toString(userNums));
				
				
				// 보너스 번호를 가지고 있으면 2등
				if (hasBonusNum) {
					System.out.println("2등 입니다.(" + buyCount + "회)");
				} else {
					System.out.println(buyCount + "회 만에 1등 입니다.");
					break;
				}
			}
		}
		System.out.println("프로그램을 종료합니다.");
	}

}
