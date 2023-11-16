package quiz_answer;

import myobj.rpsgame_answer.RpsGame;

public class E05_Save_answer {

	public static void main(String[] args) {
		
//		// 0000 0000 / 0000 0000 / 0000 0000 / 1101 1111 
//		byte b1 = -33;
//		
//		// byte타입의 부호 비트를 값으로 취급하기 위해 0xFF를 & 연산하여 int 타입 양수로 바꾼다.
//		System.out.println(b1 & 0xFF << 8);
		
		
		RpsGame game = new RpsGame();
		
		for (int i = 0; i < 200; i++) {
			game.fight(RpsGame.ROCK);
		}
		game.save();
	}
}
