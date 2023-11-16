package quiz;

import java.util.Arrays;

public class B14_LottoRe {

	public static void main(String[] args) {
		// 당첨번호 생성 (보너스번호 포함)
		int winNums[] = new int[7];
		
		for (int i = 0; i < winNums.length; i++) {
			winNums[i] = (int)(Math.random()*45+1);
			for (int j = 0; j < i; j++) {
				// 중복번호 발견하면 다시 랜덤값을 넣음
				if (winNums[j] == winNums[i]) {
					i--;
				}
				// 보너스 번호를 제외한 번호 오름차순 정렬
				if (i != 6) {
					if(winNums[j] > winNums[i]) {
						int winNumsTemp = winNums[i];
						winNums[i] = winNums[j];
						winNums[j] = winNumsTemp;
					}
				}
			}
		}
		System.out.println("당첨 번호 체크 : " + Arrays.toString(winNums));
		
		int userNums[] = new int[6];
		// 비교시 맞춘번호 카운터
		int sameCount = 0;
		// 보너스번호 맞았는지 확인
		boolean hasBonusNum = false;
		int loopCount = 0;
		
		// 당첨이 나올때까지 반복
		while(sameCount != 6) {
			// 사용자 자동번호 생성
			for (int i = 0; i < userNums.length; i++) {
				userNums[i] = (int)(Math.random()*45+1);
				for (int j = 0; j < i; j++) {
					if (userNums[j] == userNums[i]) {
						i--;
					}
				}
			}
			// 당첨번호와 비교
			loopCount++;
			hasBonusNum = false;
			sameCount = 0;
			for (int winIndex = 0; winIndex < winNums.length; winIndex++) {
				for (int userIndex = 0; userIndex < userNums.length; userIndex++) {
					// 보너스 번호를 제외한 회수일때
					if(winIndex < 6) {
						if(winNums[winIndex] == userNums[userIndex]) {
							sameCount ++;
							// 맞춘걸 발견했으므로 빠져나감
							break;
						} 
					// 5번만 맞추고 보너스 번호를 맞춰야할때
					} else if(winIndex == 6 && sameCount == 5) {
						if(winNums[winIndex] == userNums[userIndex]) {
							//보너스 점수를 맞춰서 true로 변환
							sameCount ++;
							hasBonusNum = true;
						}
					}
				}
			}
			// 2등시
			if (sameCount == 6 && !hasBonusNum) {
				// 1등시
				System.out.printf("1등 당첨! [%d]번째에 성공!", loopCount);
			} else if(sameCount == 6 && hasBonusNum) {
				// 1등이 아니므로 재반복
				hasBonusNum = false;
				sameCount = 0;
				System.out.print("2등 번호 : ");
				System.out.print(Arrays.toString(userNums) + "\n");
			}
		}
		
	}
}
