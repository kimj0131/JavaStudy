package quiz;

import java.util.Scanner;

import myobj.blackjack.PlayBlackjack;

public class D05_Blackjack {
	/*
	 	# 블랙잭을 만들어 보세요 (https://247blackjack.com)
	 	1. 컴퓨터(딜러) 사람(플레이어)이 카드를 뽑는다.
	 	2. 처음에는 둘 모두 2장씩 받는다. 이 때 딜러의 카드는 한장 가려놓는다.
	 	3. 플레이어는 받은 카드를 보고 더뽑을지(hit) 그만뽑고 여기서 멈출지(stand)를 결정해야한다.
	 	   hit를 선택하면 플레이어만 카드를 한 장 더 받는다.
	 	4. 플레이어가 stand를 선택하면 딜러가 가려놨던 카드를 오픈하고 정해진 규칙에 따라 카드를 계속 뽑는다.
	 	   딜러는 의사결정을 할 수 없고 정해진 규칙에만 따라야 한다.
	 	   ※ 딜러의 규칙 - 가진 카드의 합이 16이하라면 뽑는다. 17이상이면 멈춘다.
	 	5. 숫자는 J, Q, K는 모두 10의 가치를 지닌다.
	 	6. A는 1로 쓸수도 있고 11로 쓸수도있다.
	 	   (A는 처음에는 11의 가치를 가지고 있다가 가치가 21을 넘으면 1로 바뀐다)
	 	7. 가진 카드의 가치의 합이 21이 넘으면 버스트, 21을 맞추면 블랙잭 
	 	   21을 맞추고 나면 더이상 hit가 불가능하고 딜러가 카드를 바로 뽑는다.
	 	   플레이어가 버스트를 당하면 딜러는 카드를 뽑지않고 승리한다.
	*/
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Black Jack\n");
		PlayBlackjack play1 = new PlayBlackjack();
		while (true) {
			System.out.println("[1.Bets 2. Exit]\n");
			System.out.print(">>");
			if(sc.nextInt() == 1) {
				play1.play();
			} else {
				break;
			}
			System.out.println("\n### Retry? ###");
		}
	}
}
