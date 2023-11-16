package myobj.prizedraw;

public class PrizePieces{
	
	// 상품개수
	static int first = 1;
	static int second = 3;
	static int third = 5;
	static int fourth = 10;
	
	
	public static PrizeResult prizePcs() {
		
		int prizeNum = WinChance.getPrizeRank();
		
		boolean check = true;
		while(check) {
			switch(prizeNum) {
				case 1 :
					if(first == 0) {
						prizeNum++;
						continue;
					} else {
						first--;
						check = false;
						break;
					}
				case 2 :
					if(second == 0) {
						prizeNum++;
						continue;
					} else {
						second--;
						check = false;
						break;
					}
				case 3 :
					if(third == 0) {
						prizeNum++;
						continue;
					} else {
						third--;
						check = false;
						break;
					}
				case 4 :
					if(fourth == 0) {
						prizeNum++;
						continue;
					} else {
						fourth--;
						check = false;
						break;
					}
				default :
					prizeNum = 0;
					check = false;
					break;
			}
		}
		int[] prizeResult = {first, second, third, fourth};
		
		PrizeResult result = new PrizeResult(prizeNum, prizeResult);
		
		return result;
	}
}
