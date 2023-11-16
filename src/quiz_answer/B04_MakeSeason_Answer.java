package quiz_answer;

import java.util.Scanner;

public class B04_MakeSeason_Answer {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("month > ");
		int month = sc.nextInt();
		
		// 케이스 구분에 ,는 낮은버전의 jdk에선 작동안할 수 있다.
		switch(month) {
			case 11, 12, 1, 2:
				System.out.println("겨울");
				break;
			case 3, 4, 5:
				System.out.println("봄");
				break;
			case 6, 7, 8:
				System.out.println("여름");
				break;
			case 9, 10:
				System.out.println("가을");
				break;
			default:
				System.out.println("그런 달은 없습니다.");
		}
		
		if (month<1 || month>12) {
			System.out.println("그런 달은 없습니다.");
		} else if(month>=11 || month<=2) {
			System.out.println("겨울 입니다.");
		} else if(month>=9) {
			System.out.println("가을 입니다.");
		} else if(month>=6) {
			System.out.println("여름 입니다");
		} else {
			System.out.println("봄 입니다.");
		}
		
	}
	
}
