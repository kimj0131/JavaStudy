package quiz;

import java.util.Scanner;

import myobj.prizedraw.PrizeDraw;

public class C11_PrizeDraw {
	/*
	 	# 경품 추첨 프로그램을 만들어보세요
	 	1. 각 경품들은 한정된 수량이 있으면 이는 경품마다 다를 수 있다.
	 	2. 각 경품들이 나올 수 있는 확률이 모두 다르며 수량이 모두 소진된 상품은 더 이상 당첨될 수 없다.
	*/
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("경품 추첨");
		while(true) {
			new PrizeDraw().draw();
			System.out.println("1. 재시도");
			System.out.println("2. 종료");
			System.out.print(">>");
			if(sc.nextInt() != 1) {
				System.out.println("종료합니다");
				break;
			}
			
		}
	}
}
