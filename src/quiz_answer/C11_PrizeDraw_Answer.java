package quiz_answer;

import myobj.prizedraw_answer.DrawMachine;
import myobj.prizedraw_answer.Prize;

public class C11_PrizeDraw_Answer {

	public static void main(String[] args) {
		DrawMachine m = new DrawMachine(new Prize[] {
				new Prize("TV", 30, 0.05),
				new Prize("노트북", 10, 0.02),
				new Prize("아이패드", 5, 0.01),
				new Prize("츄파츕스", 1000, 0.92)
				});
		
		for (int i = 0; i < 200; i++) {
			System.out.println(m.draw());
		}
	}
}
