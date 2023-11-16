package myobj.prizedraw;

import java.util.Arrays;

public class PrizeDraw {
	
	public void draw() {
		
		PrizeResult result = PrizePieces.prizePcs();
		int prize = result.prizeNum;
		int[] prizeArr = result.prizeResult;
		
		System.out.println(Arrays.toString(prizeArr));
		
		if(prize != 0) {
			System.out.printf("%d등 당첨!\n", prize);
		} else {
			System.out.println("꽝입니다.");
		}
	}
	
}
