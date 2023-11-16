package quiz;

import java.util.Scanner;

public class B00_Starbucks {
	/*
	 	
	   커피 3개의 각 개수를 입력받고
	   각 메뉴를 몇 잔 시켰는지와 총 가격은 얼마인지 출력해주는 프로그램을 만들어보세요
	   
	   아메리카노가 1600원  카페라떼가 2700원  카페모카가 3300원
	*/
	
	public static void main(String[] args) {
		
		int americano_price = 1600;
		int cafelatte_price = 2700;
		int cafemocha_price = 3300;
		
		System.out.println("구매하실 음료의 개수를 입력해주세요");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("아메리카노 : ");
		int baverage_americano = sc.nextInt();
		
		System.out.print("카페라떼 : ");
		int baverage_cafelatte = sc.nextInt();
		
		System.out.print("카페모카 : ");
		int baverage_cafemocha = sc.nextInt();
		
		int total_qty = baverage_americano + baverage_cafelatte + baverage_cafemocha; 
		
		System.out.printf("아메리카노 %d잔, 카페라떼 %d잔, 카페모카 %d잔\n", baverage_americano, baverage_cafelatte, baverage_cafemocha);
		System.out.println("주문하시는 음료의 총 합계는 : " + total_qty);
		
		int total_price = (baverage_americano * americano_price)+(baverage_cafelatte * cafelatte_price)
				+(baverage_cafemocha * cafemocha_price);
		System.out.printf("총 주문 금액은 %d 입니다.\n", total_price);
		
	}
	
}
