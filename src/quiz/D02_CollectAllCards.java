package quiz;

import java.util.ArrayList;
import java.util.HashSet;

public class D02_CollectAllCards {
	/*
		카드를 랜덤으로 생성하여 HashSet에 모든 종류의 카드를 하나씩 추가해보세요
		1. 카드는 색상과 모양이 있다.
		2. 색은 빨강/파랑/초록/노랑이 있다.
		3. 모양은 동그라미/세모/별이 있다.
		4. 카드 클래스를 직접 생성하여 풀어야 한다.
		모든 종류의 카드를 HashSet에 추가한 후에는 모든 카드를 추가하기위해 카드를 몇 번이나 생성했는지도 출력해보세요
	*/
	class Card {
		
		private static ArrayList<String> colors = new ArrayList<>();
		private static ArrayList<String> shapes = new ArrayList<>();
		
		public Card() {
			colors.add("red");
			colors.add("blue");
			colors.add("green");
			colors.add("yellow");
			
			shapes.add("○");
			shapes.add("△");
			shapes.add("□");
		}
		private static HashSet<String> getCard(){
			
			HashSet<String> allCard = new HashSet<>();
			int colorSize = colors.size();
			int shapeSize = shapes.size();
			
			int makeCount = 0;
			while(allCard.size() < colorSize * shapeSize) {
				allCard.add(colors.get((int)(Math.random() * colorSize)) 
						+ "/" + shapes.get((int)(Math.random() * shapeSize)));
				makeCount++;
			}
			System.out.println("카드생성 시도 횟수 : " + makeCount);
			return allCard;
		}
		
		public void print() {
			System.out.println("생성결과 \n" + getCard());
		}
	}
	
	public static void main(String[] args) {
		D02_CollectAllCards instance = new D02_CollectAllCards();
		Card card = instance.new Card();
		card.print();
	}
}
