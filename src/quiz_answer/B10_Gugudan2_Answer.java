package quiz_answer;

public class B10_Gugudan2_Answer {

	public static void main(String[] args) {
		
		// 가로
		int step = 2;
		int mul = 1;
		
		while(step <= 9) {
			mul = 1;
			System.out.printf("%d단 : ", step); 
			while(mul <= 9) {
				System.out.printf("%dx%d=%-2d ", step, mul, step*mul);
				mul++;
			}
			step++;
			System.out.println();
		}
		System.out.println();
		
		// 세로
		step = 2;
		while (step <= 9) {
			System.out.printf("%d단\t", step);
			step++;
		}
		System.out.println();
		
		mul = 1;
		
		while (mul <= 9) {
			step = 2;
			while (step <= 9) {
				System.out.printf("%dx%d=%d\t", step, mul, step*mul);
				step++;
			}
			System.out.println();
			mul++;
		}
		
	}
	
}
