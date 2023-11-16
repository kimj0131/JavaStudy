package myobj.lotto;

public class LottoGame_WinNumber {
	// 당첨번호 생성
	public int[] creatWinNumber() {
		int winNum[] = new int[7];
		for (int i = 0; i < 7; i++) {
			winNum[i] = (int) (Math.random() * 45 + 1);
			for (int j = 0; j < i; j++) {
				if (winNum[i] == winNum[j]) {
					i--;
				}
				if (i != 6) {
					if (winNum[i] < winNum[j]) {
						int winNumTemp = winNum[i];
						winNum[i] = winNum[j];
						winNum[j] = winNumTemp;
					}
				}
			}
		}
		return winNum;
	}
}
