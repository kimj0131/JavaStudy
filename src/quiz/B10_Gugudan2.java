package quiz;

public class B10_Gugudan2 {
	// for문으로 출력했던 구구단 2개를 while문으로 출력해보세요
	public static void main(String[] args) {
		
		// 1. 가로
		int line = 0;
		int step = 2;
		int mul = 1;
		
		while(line < 8) {
			System.out.printf("%d단 : ", step); 
			while(mul <= 9) {
				System.out.printf("%dx%d=%-2d ", step, mul, step*mul);
				mul++;
			}
			step++;
			line++;
			System.out.println();
		}
		System.out.println();
		
		// 2. 세로
		line = 0;
		step = 2;
		mul = 0;
		
		while(line < 10) {
			step = 2;
			while(step <= 9) {
				if(line == 0) {
					System.out.printf("%d단\t", step);
					if (step == 9) {
					}
					step++;
				} else {
					System.out.printf("%dx%d=%d\t", step, mul, step*mul);
					step++;
				}
			}
			mul++;
			line++;
			System.out.println();
		}
	}
}
