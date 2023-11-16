package quiz;

import java.util.Scanner;

public class B03_AppleQuiz {

	/*
	  	사과를 10개씩 담을 수 있는 바구니가 있을 때 
	  	사용자가 사과의 개수를 입력하면
	  	사과를 모두 담기 위해 바구니가 
	  	총 몇 개 필요한지 알려주는 프로그램을 만들어보세요
	*/
	
	public static void main(String[] args) {
		
		int basket = 10;
		
		System.out.print("사과의 개수는? > ");
		Scanner sc = new Scanner(System.in);
		int appleQty = sc.nextInt();
		
		int needBasket = appleQty / basket;
		
		if (needBasket > 0 && appleQty%10 != 0) {
			System.out.printf("필요한 바구니 개수 > %d", (needBasket + 1));
		} else if(needBasket > 0 && appleQty%10 == 0) {
			System.out.printf("필요한 바구니 개수 > %d", needBasket);
		} else {		
			System.out.println("잘못된 입력입니다.");
		}
		
	}
	
}
