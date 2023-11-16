package quiz_answer;

public class B09_Gugudan_Answer {

	public static void main(String[] args) {
		
		// 1. 가로로
		for (int line = 0; line < 8; line++) {
			// 한 줄의 시작
			int step = line + 2;
			System.out.printf("%d단 : ", step);
			for (int mul = 1; mul <= 9; mul++) {
				System.out.printf("%dx%d=%-2d ", step, mul, step*mul);
			}
			// 한 줄의 끝
			System.out.println();
		}
		System.out.println();
		
		// 2.세로로
		// 행과 열의 의미는 그대로 두고 조합만 다르게
		for (int line = 0; line < 10; line++) {
			int mul = line;
			for (int step = 2; step <= 9; step++) {
				if(line == 0) {
					System.out.printf("%d단\t", step);
				} else {
					System.out.printf("%dx%d=%-2d\t", step, mul, step*mul);
				}
			}
			System.out.println();
		}
	}
}
