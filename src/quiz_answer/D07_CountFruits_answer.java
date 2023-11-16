package quiz_answer;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class D07_CountFruits_answer {

	final public static String[] fruits = {
			"Apple", "Banana", "Orange", "Watermelon", "Strawberry",
			"Grape", "Melon", "Peach", "Cherry"	
		};
	
	public static void main(String[] args) {
		
		String[] randomFruits = new String[1000];
		
		int fruitCount = fruits.length;
		int len = randomFruits.length;
		for (int i = 0; i < len; i++) {
			randomFruits[i] = fruits[(int)(Math.random() * fruitCount)];
		}
		
		System.out.println(Arrays.toString(randomFruits));
		
		Map<String, Integer> countMap = new HashMap<>();
		
		for (String ranFruit : randomFruits) {
			if (!countMap.containsKey(ranFruit)) {
				// 처음 나오는 과일은 개수 1로 시작
				countMap.put(ranFruit , 1);
			} else {
				// 이미 추가했던 과일을 개수를 가져와서 1 더한 후 다시 저장
				countMap.put(ranFruit, countMap.get(ranFruit) + 1);
			}
		}
		System.out.println(countMap);
	}
	
}
