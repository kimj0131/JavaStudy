package quiz_answer;

import myobj.yacht_answer.YachtDice;

public class D05_YachtDice_answer {
	
	public static void main(String[] args) {
		
		for (int i = 0; i < 20; i++) {
			YachtDice dice1 = new YachtDice();
			
			System.out.println(dice1);
			dice1.showAvailableRanks();
		}
		
		
	}
	
}
