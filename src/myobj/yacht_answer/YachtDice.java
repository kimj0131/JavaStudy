package myobj.yacht_answer;

import java.awt.Container;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class YachtDice {
	
	ArrayList<Integer> dices = new ArrayList<>();
	
	public YachtDice() {
		for (int i = 0; i < 5; i++) {
			dices.add(randomDice());
		}
	}
	
	private int randomDice() {
		return (int)(Math.random() * 6 + 1);
	}
	
	public void showAvailableRanks() {
		// 주사위 눈이 나온개수를 체크해서 리스트에 순서대로 넣어둠
		List<Integer> counts = new ArrayList<>();
		
		for (int i = 0; i < 6; i++) {
			counts.add(Collections.frequency(dices, i + 1));
		}
		
		System.out.println("각 주사위 개수 : " + counts);
		
		int availNum = 1;
		int maxCount = Collections.max(counts);
		
		if (maxCount == 5) {
			System.out.println(availNum++ + ") Yacht");
		} 
		if(maxCount > 4) {
			System.out.println(availNum++ + ") Four of a kind");
		}
		if(maxCount > 3) {
			System.out.println(availNum++ + ") Three of a kind");
		}
		if(counts.contains(3) && counts.contains(2)) {
			System.out.println(availNum++ + ") Full House");
		}
		
		List<Integer> continuousCount = new ArrayList<>();
		
		Collections.addAll(continuousCount, 0, 0, 0);
		
		int continuousIndex = 0;
		for(Integer count : counts) {
			if(count > 0) {
				continuousCount.set(continuousIndex, continuousCount.get(continuousIndex) + 1);
			} else {
				if (continuousCount.get(continuousIndex) != 0) {
					continuousIndex++;
				}
			}
		}
		
		// Collections.max(Collection) : 해당 컬렉션에서 최대값을 구한다.
		int maxContinuousCount = Collections.max(continuousCount);
		
		if(maxContinuousCount == 5) {
			System.out.println(availNum++ + ") Large Straight");
		}
		if(maxContinuousCount >= 4) {
			System.out.println(availNum++ + ") Small Straight");
		}
	}
	
	// 주사위 굴려진 결과를 출력하기위해 오버라이드
	@Override
	public String toString() {
		return dices.toString();
	}
}
