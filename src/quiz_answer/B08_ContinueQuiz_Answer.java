package quiz_answer;

public class B08_ContinueQuiz_Answer {

	public static void main(String[] args) {
		
		int total = 0;
		
		// 1.
		for (int num = 600; num <= 800; num++) {
			if (num%7 !=0) {
				continue;
			}
			System.out.println(num);
			total += num;
		}
		
		// 2.
		for (int num = 1; num <= 200; num++) {
			if(num%2==0 || num%3==0) {
				continue;
			}
			System.out.println(num);
			total += num;
		}
		
		// 3.
		System.out.println("총합 : " + total);
	}
}
