package quiz_answer;

import java.util.Scanner;

import myobj.omok_Answer.OmokBoard_answer;

public class C17_Omok_Answer {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		OmokBoard_answer omok1 = new OmokBoard_answer();

		boolean isBlack = true;
		int turn = 0;
		
		while(true) {
			System.out.printf("<%d수>\n", (turn + 1));
			
			omok1.print();
			
			System.out.printf("'%s'의 차례입니다.\n", isBlack ? "흑":"백");
			System.out.print("좌표 입력 >> ");
			
			String coord = sc.next();
			
			if (omok1.put(coord, isBlack)){
				
				if(omok1.winCheck(coord, isBlack)) {
					omok1.print();
					System.out.println((isBlack ? "흑" : "백") + "이 이겼습니다!");
					break;
				}
				// 턴 변경
				isBlack = !isBlack;
				turn++;
			}
			
		}
		
	}
}
