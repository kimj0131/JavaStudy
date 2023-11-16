package quiz;

import java.util.InputMismatchException;
import java.util.Scanner;

import myobj.rpsgame.RockPaperScissors;

public class E05_Save {
	/*
	 	컴퓨터와 진행하는 간단한 가위바위보 게임을 만든 후	프로그램 종료시 전적을 파일에 저장하고
	 	프로그램 실행시에는 파일에 저장된 전적 데이터를 읽어서 예전 전적이 그대로 이어지도록 만들어보세요
	*/
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		RockPaperScissors rps = new RockPaperScissors();
		rps.readScore();
		System.out.println("가위바위보 게임");
		while (true) {
			try {
				System.out.print("\n[[1.도전][2.저장하고 종료하기][3.전적보기][4.전적 초기화]]\n");
				
				int select = sc.nextInt();
				
				switch(select) {
					case 1:
						rps.play();
						break;
					case 2:
						rps.saveScore();
						return;
					case 3:
						rps.printScore();
						break;
					case 4:
						rps.resetScore();
						System.out.println("[NOTICE]전적 초기화를 마쳤습니다.");
						break;
					default :
						System.out.println("[ERROR]입력이 잘못되었습니다.");
						break;
				}
				
			} catch (InputMismatchException e) {
				System.out.println("[ERROR]숫자가 아닌 문자열을 입력했습니다.");
				sc.nextLine();
			}

		}
	}
}
