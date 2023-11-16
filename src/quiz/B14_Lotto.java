package quiz;

import java.util.Arrays;

public class B14_Lotto {
	/*
	  	1. 랜덤으로 로또 당첨번호를 생성해보세요 
	  	(1 ~ 45의 중복없는 랜덤숫자 7개, 마지막 번호는 보너스 번호) 
	  		1) 1 ~ 45 사이의 숫자를 뽑는다.
	  		2) 예전에 뽑은 숫자가 있다면 같은 숫자가 있는지 검사한다.
	  		3) 중복이 있다고 판단되면 다시뽑는다. 
	  	2. 1등에 당첨될때까지 로또번호를 자동으로 계속 생성하여 몇 번 만에 당첨 되었는지 출력해보세요 
	  	(자동번호는 1 ~ 45의 중복없는 랜덤숫자 6개) 
	  	3. 1등에 당첨 될 때까지 뽑는동안 2등에 당첨되는 번호들이 있으면 출력해주세요
	 */

	public static void main(String[] args) {
		// 당첨번호 생성
		int winNum[] = new int[7];
		for (int i = 0; i < 7; i++) {
			winNum[i] = (int) (Math.random() * 45 + 1);
			for (int j = 0; j < i; j++) {
				if (winNum[i] == winNum[j]) {
					i--;
				}
				if(i!=6) {
					if (winNum[i] < winNum[j]) {
						int winNumTemp = winNum[i];
						winNum[i] = winNum[j];
						winNum[j] = winNumTemp;
					}
				}
			}
		}
		// 당첨번호확인
		System.out.print("당첨번호 체크 : ");
		for (int i = 0; i < winNum.length; i++) {
			if(i == 6) {
				System.out.print("// 보너스 번호 : ");
			}
			System.out.print(winNum[i] + " ");
		}
		System.out.println();
		System.out.println();

//		// 맞춰볼 로또 번호 자동생성
//		int selectNum[] = new int[6];
//		for (int i = 0; i < 6; i++) {
//			selectNum[i] = (int) (Math.random() * 45 + 1);
//			for (int j = 0; j < i; j++) {
//				if (selectNum[i] == selectNum[j]) {
//					i--;
//				}
//			}
//		}

		int runningNum = 0;
		int sameCount = 0;
		boolean bonusNumber = false;
		// 번호 맞춰보기
//		for (int i = 0; i < 7; i++) {
//			if (i < 6) {
//				for (int j = 0; j < 6; j++) {
//					if (winNum[i] == selectNum[j]) {
//						System.out.println(j + 1 + "번 번호 있음");
//						sameCount++;
//						break;
//					}
//				}
//			} else if (sameCount != 6 && i == 6) {
//				for (int j = 0; j < 6; j++) {
//					if (selectNum[j] == winNum[6]) {
//						bonusNumber = true;
//					}
//				}
//			}
//		}
//		System.out.println(sameCount);
		
		// 당첨될때까지 반복수행
		int secPlaceCount = 0;		// 2등당첨횟수 카운트
		while (sameCount != 6) {	// 맞춘 번호가 6개일때까지 반복
			// 자동 번호 생성
			int selectNum[] = new int[6];
			for (int i = 0; i < 6; i++) {
				selectNum[i] = (int)(Math.random() * 45 + 1);
				// 중복번호 체크
				for (int j = 0; j < i; j++) {
					if (selectNum[i] == selectNum[j]) {
						i--;
					}
				}
			}
			
			sameCount = 0;			//반복시 맞춘번호 개수를 0으로 초기화
			bonusNumber = false;
			for (int i = 0; i < 7; i++) {		// 7 = 당첨번호배열 길이
				if (i < 6) {
					// i번째 번호 각 비교
					for (int j = 0; j < 6; j++) {		// 6 = 유저번호배열 길이
						if (winNum[i] == selectNum[j]) {
							sameCount++;
							// 번호가 같으면 반복을 탈출
							break;
						} 
					}
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
			
			// 실행횟수 증가
			runningNum ++;
			
			if(sameCount == 6 && bonusNumber) {
				// 1등이 아니므로 다시 반복을 돌리기 위해 sameCount를 0으로 바꿈
				sameCount = 0;
				secPlaceCount ++;
				// 2등 번호 배열을 출력
				System.out.print("2등 번호 : ");
				System.out.print(Arrays.toString(selectNum));
				System.out.println();
			} else if(sameCount == 6 && !bonusNumber) {
				System.out.println("==================================");
				System.out.printf("1등 당첨! [%d]번째에 성공\n", runningNum);
				// 당첨번호의 배열을 출력
				System.out.print("당첨된 번호 : ");
				System.out.print(Arrays.toString(selectNum));
				System.out.println();
				System.out.println("2등 당첨 회수는 " + secPlaceCount + "번 입니다.");
				// sameCount가 6인상태로 1사이클이 마무리되므로 반복문 탈출
			} 
		}
	}

}
