package quiz_answer;

import java.util.HashSet;

public class D02_CollectAllCards_Answer {
	
	static class Card {
		private static String[] colors = {"red", "blue", "green", "yellow"};
		private static String[] shapes = {"○", "△", "☆"};
		
		private String color;
		private String shape;
		
		public Card() {
			color = colors[(int)(Math.random() * colors.length)];
			shape = shapes[(int)(Math.random() * shapes.length)];
		}
		
		//Object의 equals를 사용하면 중복된값(주소값이 아닌)을 그대로 출력할 수 있으므로
		@Override
		public boolean equals(Object obj) {
			return this.hashCode() == obj.hashCode();
		}
		
		@Override
		public int hashCode() {
			return (color + shape).hashCode();
		}
		
		@Override
		public String toString() {
			return "[" + color + " " + shape + "]";
		}
	}
	
	public static void main(String[] args) {
		// 해당 클래스의 equals 메서드 결과가 일치한다면 중복으로 간주하고 Set에 추가되지 않는다.
		HashSet<Card> cards = new HashSet<>();
		
		int count = 0;
		while (cards.size() < 12) {
			cards.add(new Card());
			System.out.println(++count + "번째 카드를 추가했습니다");
		}
		System.out.println(cards);
		System.out.println("카드를 " + count + "번 뽑아서 모든 카드를 모았습니다.");
	}
}
