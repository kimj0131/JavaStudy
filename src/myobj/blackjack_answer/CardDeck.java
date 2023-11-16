package myobj.blackjack_answer;

import java.util.Collections;
import java.util.List;

public class CardDeck {

	List<Card> cards;
	
	final private int shuffleCount;
	private int drawCount = 0;
	
	public CardDeck(List<Card> cards) {
		this.cards = cards;
		this.shuffleCount = cards.size();
		shuffle();
	}
	
	public void shuffle() {
		Collections.shuffle(cards);
	}
	
	public Card draw() {
		if(drawCount == shuffleCount) {
			drawCount = 0;
			shuffle();
		}
		
		return cards.get(drawCount++);
	}
}
