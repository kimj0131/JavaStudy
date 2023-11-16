package myobj.prizedraw;

public class PrizeResult {
	
	int prizeNum;
	int[] prizeResult;
	
	public PrizeResult(int prizeNum, int[] prizeResult) {
		this.prizeNum = prizeNum;
		this.prizeResult = prizeResult;
	}

	public int getPrizeNum() {
		return prizeNum;
	}
	
	public int[] getPrizeResult() {
		return prizeResult;
	}
}
