package myobj.prizedraw;

public class WinChance {
	
	private static int getPrizeProbability() {
		// 1 ~ 4등 경품 + 꽝
		// 1[1 ~ 5] 2[6 ~ 15] 3[16 ~ 35] 4[36 ~ 70] 꽝[71 ~ 100]
		int probability = (int)(Math.random() * 100 + 1);
		
		return probability;
	}
	
	static int getPrizeRank() {
		int chance = getPrizeProbability();
		
		if (chance >= 1 && chance <= 5) {
			return 1;
		} else if (chance >= 6 && chance <= 15) {
			return 2;
		} else if (chance >= 16 && chance <= 35) {
			return 3;
		} else if (chance >= 36 && chance <= 70) {
			return 4;
		} else {
			return 0;
		}
	}
	
}
