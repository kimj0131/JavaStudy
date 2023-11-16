package myobj.blackjack;

import java.util.ArrayList;
import java.util.List;

public class Card {
	final static char[] CARD_SHAPE = {'♠', '♥', '♣', '◆'};
	final static String[] CARD_NUMBER = {
			"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
	List<String> cardList = new ArrayList<>();
	
	public Card() {
		for (int i = 0; i < CARD_SHAPE.length; i++) {
			for (int j = 0; j < CARD_NUMBER.length; j++) {
				cardList.add(CARD_SHAPE[i] + "-" + CARD_NUMBER[j]);
			}
		}
	}

	public String hitCard() {
		int ran = (int)(Math.random() * cardList.size());
		String str = cardList.get(ran);
		cardList.remove(ran);
		return str;
	}
	
	public Card shuffleCard() {
		return new Card();
	}
	
	@Override
	public String toString() {
		return cardList.toString();
	}
}
