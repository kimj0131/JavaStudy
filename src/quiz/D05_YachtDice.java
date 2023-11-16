package quiz;

import java.util.Scanner;

import myobj.yacht.Dicegame;

public class D05_YachtDice {
	/*
	 	1. 주사위를 다섯개 던진다
	 	2. 각 주사위의 눈을 가지고 어떤 패가 만들어졌는지 구분해야 한다.
	 	3. 다섯개의 주사위 눈을 통해 다음을 구분한다.
	 		(1) 풀 하우스 (같은 눈이 3 / 2 개)
	 		ex> 11222, 33311, 55566, 56556 .. 등
	 		(2) 스몰 스트레이트 (1234/2345/3456)
	 		ex> 12346, 64531 ...
	 		(3) 라지 스트레이트 (12345/23456)
	 		ex> 54321, 24356 ...
	 		(4) Three of kind (같은 주사위 눈이 3개)
	 		ex> 31323, 66651 ...
	 		(5) Four of kind(같은 주사위 눈이 4개)
	 		ex> 44144, ...
	 		(6) Yacht (같은눈 5개)
	 		ex> 66666, 11111 ...
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Dicegame d1 = new Dicegame();
		
//		d1.play();
		
		System.out.println("요트(Yacht) 게임");
		while(true) {
			System.out.println("1. 주사위 굴리기");
			System.out.println("2. 그만하기");
			if(sc.nextInt() == 1) {
				d1.play();
			} else {
				break;
			}
			System.out.println();
		}
	}
}
