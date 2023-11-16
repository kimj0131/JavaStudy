package myobj.lotto;

public class LottoGame_AutomaticSelect {
	
	// 로또 번호 자동생성
	public int[] automatic() {
		
		int selectNum[] = new int[6];
		for (int i = 0; i < 6; i++) {
			selectNum[i] = (int) (Math.random() * 45 + 1);
			for (int j = 0; j < i; j++) {
				if (selectNum[i] == selectNum[j]) {
					i--;
				}
			}
		}
		return selectNum;
	}

}
