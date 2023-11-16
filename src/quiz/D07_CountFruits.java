package quiz;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class D07_CountFruits {
	
	// 다음 과일들로 가득찬 크기 1000개의 랜덤배열을 생성한 후
	// 각 과일이 몇 번 등장했는지 세어보세요
	
	final public static String[] fruits = {
		"Apple", "Banana", "Orange", "Watermelon", "Strawberry",
		"Grape", "Melon", "Peach", "Cherry"	
	};
	
	public static void main(String[] args) {
		// 랜덤배열 생성
		String[] fruitArr = new String[1000];
		for (int i = 0; i < fruitArr.length; i++) {
			fruitArr[i] = fruits[(int)(Math.random() * fruits.length)];
		}
		System.out.println(Arrays.toString(fruitArr));
		
		// 반복문으로 랜덤배열의 값을 확인후 카운트한 값을 map에 put한다.
		Map<String, Integer> fruitCount = new HashMap<>();
		for (int i = 0; i < fruits.length; i++) {
			int count = 0;
			for (int j = 0; j < fruitArr.length; j++) {
				// 문자열은 == 으로 비교 X -> equals로 비교한다
				if(fruits[i].equals(fruitArr[j])) {
					count++;
				}
			}
			fruitCount.put(fruits[i], count);
		}
		System.out.println();
		
		// keyset으로 몇번 등장했는지 출력
		Set<String> fruitSet = fruitCount.keySet();
		for (String fruit : fruitSet) {
			System.out.printf("%s = %d\n", fruit, fruitCount.get(fruit));
		}
	}
}
