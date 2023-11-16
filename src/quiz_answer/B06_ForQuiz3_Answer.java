package quiz_answer;

public class B06_ForQuiz3_Answer {

	public static void main(String[] args) {
		
		// 1.
		for (int i=0; i<=99; i +=3) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		// 2.
		for (int i=-35; i<=35; i+=7) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		// 3.
		for (int i=100; i<=1000; i+=100) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		// 4.
		for (int i=100; i>=0; i--) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		// 5.
		for (int i=0; i<300; i++) {
			System.out.print(i%10 + " ");
		}
		System.out.println();
		
		// 6.
		for (int i=0; i<300; i++) {
			System.out.print(10 - (i%10) + " ");
		}
		System.out.println();
		
		// 7.
		long num = 7;
		for (int i=0; i<10; i++) {
			System.out.print(num + " ");
			num = num * 10 + 7;
		}
	}
}
