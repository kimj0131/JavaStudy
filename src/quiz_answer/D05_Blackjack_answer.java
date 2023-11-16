package quiz_answer;

import java.util.Scanner;

import myobj.blackjack_answer.Card;
import myobj.blackjack_answer.CardDeck;
import myobj.blackjack_answer.Player;

public class D05_Blackjack_answer {
	
	public static void main(String[] args) {
		CardDeck deck = Card.getDeck(3);
		
		Player player = new Player("철수");
		Player dealer = new Player("딜러");
		
		Scanner sc = new Scanner(System.in);
		
		player.addCard(deck.draw());
		dealer.addCard(deck.draw());
		player.addCard(deck.draw());
		dealer.addCard(deck.draw()); 
		dealer.hide(0);
		
		while(true) {
			System.out.println(player);
			System.out.println("-- 플레이어 --");
			player.showHands();
			System.out.println("플레이어 패의 가치 : " + player.getHandValue());
			System.out.println("-- 딜러 --");
			dealer.showHands();
			
			System.out.print("\n1. hit\n2. Stand\n>>");
			int select = sc.nextInt();
			
			if(select == 1) {
				player.addCard(deck.draw());
				int value = player.getHandValue();
				if (value == -1 || value == 21) {
					break;
				}
			}else if(select == 2) {
				break;
			} else {
				System.out.println("[Warning] 1번 또는 2번을 선택해주세요!");
			}
		}
		
		int playerHandValue = player.getHandValue();
		if(playerHandValue == -1) {
			System.out.println();
			System.out.println("-- 플레이어 --");
			player.showHands();
			System.out.println("플레이어의 버스트로 딜러의 승리!");
			return;
		}
		
		for (int value = dealer.getHandValue(); value < 17 && value != -1; value = dealer.getHandValue()) {
			dealer.addCard(deck.draw());
		}
		
		// 위 for 반복문의 while문
//		int v;
//		while((v = dealer.getHandValue()) < 17 && v != -1) {
//			dealer.addCard(deck.draw());
//		}
		int dealerHandValue = dealer.getHandValue();
		dealer.open(0);
		
		System.out.println("\n\n## 결과 ##");
		player.showHands();
		System.out.println("플레이어 패의 가치 : " + playerHandValue);
		dealer.showHands();
		System.out.println("딜러 패의 가치 : " + dealerHandValue);
		
		
		if(dealerHandValue == -1) {
			dealer.showHands();
			System.out.println("딜러의 버스트로 플레이어 승리!");
		} else if (playerHandValue == dealerHandValue) {
			System.out.println("무승부!!");
		} else if (playerHandValue > dealerHandValue) {
			System.out.println("플레이어의 승리!!");
		} else if (playerHandValue < dealerHandValue) {
			System.out.println("딜러의 승리!!");
		}
		
	}
	
}
