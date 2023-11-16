package quiz;

import java.util.Scanner;

import myobj.Tong.PlayGame;

public class C06_TongGame {
	/*
		통 아저씨 게임을 만들어보세요
		1. 게임이 시작되면 꽝자리가 정해진다.
		2. 플레이어는 통 아저시가 발사될때 까지 계속 자리를 선택해야 한다.
		3. 칼을 찌를 수 있는 홈은 20개가 있고 그 중 4개가 꽝이 된다.
		   (꽝의 위치는 매판 랜덤으로 재설정 되어야한다.)
		4. 아저씨가 발사되면 몇 번 만에 발사 되었는지 알려주는 메세지가 나온다
	*/
	public static void main(String[] args) {
		System.out.println("통아저씨 게임");
		Scanner sc = new Scanner(System.in);
		new PlayGame().play();
		while(true) {
			
			System.out.println("게임을 다시 시작할까요?");
			System.out.println("1. 다시시작");
			System.out.println("2. 종료");
			System.out.print(">> ");
			int restart = sc.nextInt();
			switch(restart) {
				case 1:
					System.out.println("다시 시작 합니다");
					new PlayGame().play();
					break;
				default:
					System.out.println("게임을 종료합니다");
					return;
			}
			restart = 0;
				
		}
	}

}
