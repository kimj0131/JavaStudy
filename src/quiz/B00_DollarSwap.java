package quiz;

import java.util.Scanner;

public class B00_DollarSwap {

	/*
	  	한국 돈을 입력하면 현재 환율료 몇 달러인지 알려주는 프로그램을 만들어보세요
	  	(현재 환율은 검색해서 사용)
	*/
	public static void main(String[] args) {
		
	
		double dollarExchange = 0.000751;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("계산을 원하는 금액(원)을 입력하세요 : ");
		
		int korWon = sc.nextInt();
		
		double dollar = korWon * dollarExchange ;
		
		System.out.printf("달러로 환산한 금액 : %.2f 달러", dollar);
		
	}
	
}
