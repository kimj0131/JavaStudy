package quiz;

import java.util.Scanner;

public class B04_MakeSeason {

	/*
	  	사용자가 몇 월인지 입력하면 해당하는 계절이 무엇인지 출력해 보세요
	  	(switch-case문으로 한번, if문으로 한번)
	*/
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("몇 월인지 입력해주세요 > ");
		int month = sc.nextInt();
		
		switch (month) {
			case 3, 4, 5:
				System.out.printf("%d월은 봄입니다.\n", month);
				break;
			case 6, 7, 8:
				System.out.printf("%d월은 여름입니다.\n", month);
				break;
			case 9, 10, 11:
				System.out.printf("%d월은 가을입니다.\n", month);
				break;
			case 12, 1, 2:
				System.out.printf("%d월은 겨울입니다.\n", month);
				break;
			default:
				System.out.println("잘못 입력 하셨습니다.");
				break;
		}
		
		if(month>0 && month<=12) {
			if(month>=3 && month<=5) {
				System.out.printf("%d월은 봄입니다.\n", month);
			} else if(month>=6 && month<=8) {
				System.out.printf("%d월은 여름입니다.\n", month);
			} else if(month>=9 && month<=11) {
				System.out.printf("%d월은 가을입니다.\n", month);
			} else {
				System.out.printf("%d월은 겨울입니다.\n", month);
			}
		} else {
			System.out.println("잘못 입력 하셨습니다.");
		}
	}
}
