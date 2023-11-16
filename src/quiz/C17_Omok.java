package quiz;

import myobj.omok.OmokPlay;

public class C17_Omok {
	/*
	  	오목을 만들어보세요
	  
	  	1. 같은 색상의 돌이 연속으로 5개 놓이면 해당 색상의 승리 (6개가 연속으로 놓이면 승리가 아님) 
	  	2. 가로/세로/대각선 모두 연속으로 간주한다. 
	  	3. 번갈아가면서 돌을 놓는다 
	  	4. 한 게임에 각 플레이어 당 한번씩 무르기 기능이 있다. 
	  	   (무르기를 하면 그 사람이 돌을 놓기 전으로 돌아간다) 
	  	   
	  	   ## 3x3금지를 구현할 수 있으면 구현
	 */

	public static void main(String[] args) {
		new OmokPlay().play();
	}
}
