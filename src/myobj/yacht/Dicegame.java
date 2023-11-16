package myobj.yacht;

import java.util.ArrayList;
import java.util.Collections;

public class Dicegame {
	final static int DICE_EYE = 6;
	final static int MAX_ROLLS = 5;
	
	private int roll() {
		return (int)(Math.random() * 6 + 1);
	}
	
	private ArrayList<Integer> stackRolls() {
		ArrayList<Integer> rollResult = new ArrayList<>();
		for (int i = 0; i < MAX_ROLLS; i++) {
			rollResult.add(roll());
		}
		return rollResult;
	}
	
	private void checkRank(ArrayList<Integer> rollResult) {
		System.out.println("굴린 결과\n" + rollResult);
		// 정렬
		Collections.sort(rollResult);
		
		boolean isPrize = false;
		
		// 같은 눈개수 확인
		for (int i = 1; i <= DICE_EYE; i++) {
			int diceCount = Collections.frequency(rollResult, i);
			if (diceCount == MAX_ROLLS) {
				isPrize = true;
				System.out.println("Yacht!!");
			}
			
			if (diceCount >= 4) {
				isPrize = true;
				System.out.println("Four of kind!");
			}
			if (diceCount >= 3) {
				isPrize = true;
				// 풀하우스도 같이 확인
				boolean isFull = false;
				for (int j = 1; j <= DICE_EYE; j++) {
					if (j == i) {
						continue;
					}
					int anotherCount = Collections.frequency(rollResult, j);
					if (anotherCount == 2) {
						isFull = true;
						break;
					}
				}
				if (isFull) {
					System.out.println("Full House!");
				} 
				System.out.println("Three of kind!");
			}
		}
		
		// 연속되는 눈을 확인
		int continuousCount = 1;
		for (int i = 0; i < MAX_ROLLS - 1; i++) {
			if(rollResult.get(i) + 1 == rollResult.get(i + 1)) {
				continuousCount++;
			} else {
				break;
			}
		}
		if (continuousCount == 5) {
			isPrize = true;
			System.out.println("Large Straight!");
		} 
		if(continuousCount >= 4) {
			isPrize = true;
			System.out.println("Small Straight!");
		} 
		
		// 위에 해당하지도 않고 isPrize가 false일때
		if(!isPrize) {
			System.out.println("당첨되지 않았습니다.");
		}
	}
	
	public void play() {
		ArrayList<Integer> rollResult = new ArrayList<>();
		// 디버그용
//		Collections.addAll(rollResult, 1, 2, 4, 5, 6);
//		checkRank(rollResult);
		
		rollResult = stackRolls();
		checkRank(rollResult);
	}
}
