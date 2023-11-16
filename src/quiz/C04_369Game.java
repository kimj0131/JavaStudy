package quiz;

import myobj.clapGame.ClapGame;

public class C04_369Game {
	/*
	 	컴퓨터와 번갈아가면서 진행하는 369 게임을 만들어보세요
	 	1. 컴퓨터와 사용자의 1대1 대결로 진행된다.
	 	2. 선공은 랜덤으로 결정된다.
	 	3. 사용자는 3, 6, 9가 포함된 숫자마다 "짝" 또는 "ㅉ"을 입력해야한다.
	 	4. 컴퓨터는 자기차례가 되면 75% 확률로 정답을 말하고 25%확률로 오답을 말한다.
	 	5. 오답을 말하는 쪽이 패배하고 게임이 끝난다.
	*/
	
	// 2개의 랜덤번호 생성, 조건문으로 선공 정하기
	// 사용자, 컴퓨터의 입력을 넘겨받고
	// 3, 6, 9 포함되있는지 비교
	
	public static void main(String[] args) {
		
		System.out.println("3 6 9 게임");
		System.out.println("==============");
		// 선공 정하기
		// 0 : 사용자 먼저 / 1 : 컴퓨터 먼저
//		int goFirst = (int)(Math.random() * 2);
//		
//		if(goFirst == 0) {
//			System.out.println("플레이어 선공");
//		} else {
//			System.out.println("컴퓨터 선공");
//		}
		
//		new ClapGame().playGame(goFirst);
		new ClapGame().playGame();
		
	}
}
