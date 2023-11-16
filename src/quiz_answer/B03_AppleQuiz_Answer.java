package quiz_answer;

import java.util.Scanner;

public class B03_AppleQuiz_Answer {

	/*
	  사과를 10개씩 담을 수 있는 바구니가 있을 때 사용자가 사과의 개수를 입력하면 사과를 모두 담기 위해 바구니가 총 몇 개 필요한지
	  알려주는 프로그램을 만들어보세요
	 */

	// 풀이답안
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int BASKET_SIZE = 10; // 변하지 않는 수이므로 대문자로

		System.out.print("사과의 개수를 입력해주세요 > ");
		int appleCount = sc.nextInt();

		// ctrl + shift + F : 들여쓰기 맞추는 단축키
		// 블록지정하고 ctrl + i : 블록지정한 부분 들여쓰기 맞추기
		
		// 입력값 체크를 가장 먼저 처리하는것이 좋다.
		if (appleCount < 0) {
			System.out.println("개수가 이상해 프로그램을 종료합니다.");
		} else {

			int basketCount = appleCount / BASKET_SIZE; // 단순 10개를 나눈 몫을 확인
			int remain = appleCount % BASKET_SIZE; // 나머지가 있는지 확인

			if (remain > 0) {
				basketCount = basketCount + 1;
			}

			// if문을 사용하지 않고 코드작성법
//			int basketCount = (int)Math.ceil(appleCount / (double)BASKET_SIZE);

			System.out.printf("필요한 바구니의 개수는 %d개 입니다. \n", basketCount);
		}

	}
}
