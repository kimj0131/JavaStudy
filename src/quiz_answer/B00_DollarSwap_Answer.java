package quiz_answer;

import java.util.Scanner;

public class B00_DollarSwap_Answer {
	
	/*
  	한국 돈을 입력하면 현재 환율료 몇 달러인지 알려주는 프로그램을 만들어보세요
  	(현재 환율은 검색해서 사용)
	*/

	// 풀이답안
	public static void mian(String[] args) {
	
		Scanner sc = new Scanner(System.in);
	  	
	  	System.out.print("얼마를 바꾸시겠습니까? ");
	  	int krw = sc.nextInt();
	  	double exchange_rate = 1332.74;
	  	
	  	// 한국돈으로 달러 구하는 법 (개발과 관련없는 사전지식)
		// 한국돈 / 환율 = 달러
		double usd = krw / exchange_rate;
		
		System.out.printf("%dKRW은 %.2fUSD 입니다.\n", krw, usd);
	 
		
	}
}
