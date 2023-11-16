package beakjoon;

import java.util.Scanner;

public class Q2480 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int dice1 = sc.nextInt();
		int dice2 = sc.nextInt();
		int dice3 = sc.nextInt();

//		if (dice1 != dice2 && dice1 != dice3 && dice2 != dice3) {
//			int big = 0;
//			if (dice1 * 2 > dice2 + dice3) {
//				big = dice1;
//			} else if (dice2 * 2 > dice1 + dice3) {
//				big = dice2;
//			} else if (dice3 * 2 > dice1 + dice2) {
//				big = dice3;
//			}
//			System.out.println(big * 100);
//		} else if (dice1 == dice2 && dice1 != dice3 
//				|| dice1 == dice3 && dice1 != dice2
//				|| dice2 == dice3 && dice1 != dice2) {
//			if (dice1 == dice2 || dice1 == dice3) {
//				System.out.println(1000 + dice1 * 100);
//			} else {
//				System.out.println(1000 + dice2 * 100);
//			}
//
//		} else {
//			System.out.println(10000 + dice1 * 1000);
//		}

		if (dice1 == dice2 && dice2 == dice3) {
			System.out.println(10000 + dice1 * 1000);
		} else {
			if (dice1 == dice2) {
				System.out.println(1000 + dice1 * 100);
			} else if (dice2 == dice3) {
				System.out.println(1000 + dice2 * 100);
			} else if (dice1 == dice3) {
				System.out.println(1000 + dice1 * 100);
			} else {
//				int max = dice1;
//				if (max < dice2) {
//					max = dice2;
//				}
//				if (max < dice3) {
//					max = dice3;
//				}
				// 위의 주석처리에서 같은 의미
				int max = dice1 < dice2 ? dice1 : dice2;
				max = max < dice3 ? max : dice3;
				
				System.out.println(100 * max);
			}
		}

	}
}
