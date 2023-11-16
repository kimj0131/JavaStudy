package myobj.blackjack;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PlayBlackjack {
	private Scanner sc = new Scanner(System.in);
	private Card card = new Card();
	
	int playerCount_A = 0;
	int dealerCount_A = 0;
	
	// 뽑은 카드를 보고 최종점수를 갱신하는 메소드
	private int calScore(char num, int currentScore, String user) {
		int score = currentScore;
		// 1 (10)포함 J, Q, K 처리
 		if (num == '1' || num == 'J' || num == 'Q' || num == 'K') {
 			score += 10;
		} else if(num == 'A') {
			if(score + 11 > 21) {
				score += 1;
			} else {
				score += 11;
			}
			if (user == "플레이어") {
				playerCount_A++;
			} else {
				dealerCount_A++;
			}
			
		} else {
			score += num - '0';
		}
 		// A가 나온적이 있을 때 21이 넘어가는경우 점수 조정
		if (user == "플레이어" && playerCount_A > 0 && score > 21) {
			playerCount_A--;
			score -= 10;
		} else if (user == "딜러" && dealerCount_A > 0 && score > 21) {
			dealerCount_A--;
			score -= 10;
		}
		return score;
	}
	
	// 블랙잭 확인하는 메소드
	private boolean isBlackjack(int score, String userName) {
		if (score == 21) {
			System.out.printf("\n%s Black Jack!\n", userName);
			return true;
		} else if (score > 21) {
			System.out.printf("\n%s Bust!\n", userName);
			return false;
		}
		return false;
	}
	
	// hit할때 활용하는 메소드
	private int keepHit(int score, List<String> user, String userName) {
		user.add(card.hitCard());
		score = calScore(user.get(user.size() - 1).charAt(2), score, userName);
		System.out.printf("%s\t%d점\n", userName, score);
		System.out.println(user);
		return score;
	}
	
	// 플레이 메소드
	public void play(){
		
		// 딜러 수중에 있는 카드가 일정개수 이하로 떨어지면 다시 섞음
		if (card.cardList.size() < 20) {
			System.out.println("\n<<<<\nShuffling...\n>>>>\n");
			card = card.shuffleCard();
		}
		// A가 나왔던 횟수를 초기화
		playerCount_A = 0;
		dealerCount_A = 0;
		
		List<String> dealerCard = new ArrayList<>();
		List<String> playerCard = new ArrayList<>();
		
		int playerScore = 0;
		int dealerScore = 0;
		
		// 처음 2개의 카드 분배
		for (int i = 0; i < 2; i++) {
			playerCard.add(card.hitCard());
			playerScore = calScore(playerCard.get(i).charAt(2), playerScore, "플레이어");
			dealerCard.add(card.hitCard());
			dealerScore = calScore(dealerCard.get(i).charAt(2), dealerScore, "딜러");
		}
		System.out.printf("딜러\t\n[%s, %s]\n", dealerCard.get(0), "■");
		System.out.println("\n플레이어\t" + playerScore + "점\n" + playerCard);
		
		// 플레이어 차례
		while(true) {
			boolean player = isBlackjack(playerScore, "플레이어");
			if(player) {
				System.out.println("플레이어 승리!");
				return;
			} else if (!player && playerScore > 21){
				System.out.println("딜러 승리!");
				return;
			} else {
				System.out.println("\n[1. Hit / 2. Stand]");
				System.out.print(">>");
				if (sc.nextInt() == 1) {
					playerScore = keepHit(playerScore, playerCard, "플레이어");
				} else {
					break;
				}
			}
		}
		
		// 딜러 차례
		System.out.println("딜러\t" + dealerScore + "점\n" + dealerCard);
		while(true) {
			boolean player = isBlackjack(dealerScore, "딜러");
			if(player) {
				System.out.println("딜러 승리!");
				return;
			} else if (!player && dealerScore > 21){
				System.out.println("플레이어 승리!");
				return;
			} else {
				if(dealerScore <= 16) {
					dealerScore = keepHit(dealerScore, dealerCard, "딜러");
				} else {
					break;
				}
			}
		}
		
		// bust, blackjack 이 안나왔을경우 비교
		if (playerScore < dealerScore) {
			System.out.println("딜러 승리!");
		} else if (playerScore > dealerScore) {
			System.out.println("플레이어 승리!");
		} else {
			System.out.println("비겼습니다.");
		}
		
	}
	
}
