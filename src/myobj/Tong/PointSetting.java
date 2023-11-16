package myobj.Tong;

import java.util.Arrays;

public class PointSetting {

	final int MAX_POINT;
	final int[] LOSE_POINT;

	public PointSetting() {
		this.MAX_POINT = 20;
		this.LOSE_POINT = new int[4];
	}
	/**
	 * 
	 * @param maxPoint : 구멍의 총개수
	 * @param losePoint : 꽝 구멍의 개수
	 */
	public PointSetting(int maxPoint, int losePoint) {
		this.MAX_POINT = maxPoint;
		this.LOSE_POINT = new int[losePoint];
	}
	
	// 꽝 자리를 랜덤으로 선택함
	public int[] losingPositionSet() {
		int maxPoint = MAX_POINT;
		int[] losePoint = new int[LOSE_POINT.length];
		
		// 랜덤으로 꽝 자리 선정
		for (int i = 0; i < losePoint.length; i++) {
			// 1번부터 maxPoint번 까지
			losePoint[i] = (int)(Math.random() * maxPoint + 1);
			for (int j = 0; j < i; j++) {
				// 중복되는 번호는 다시뽑는다.
				if (losePoint[j] == losePoint[i]) {
					i--;
				}
			}
		}
		return losePoint;
	}
}
