package quiz_answer;

public class B06_ForQuiz_Answer {

	public static void main(String[] args) {
		
		int num;
		// 1. 1000부터 2000 사이의 8의 배수를 모두 출력해 보세요. 
		// A between B : A와 B를 모두 포함한다.
		// 1000부터 2000까지 반복하면서
		for (num = 1000; num <= 2000; num++) {
			// 8의 배수만 출력문을 만날 수 있다.
			if(num % 8 == 0) {
				System.out.println(num);
			}
		}
		System.out.println("반복문이 끝난 후의 num의 값 "+num);
		
		// 2. 100부터 300까지의 총합을 구해보세요.
		int total = 0;
		for (num = 100; num <= 300; num++) {
			total += num;
		}
		System.out.println("다 더해진 결과 : " + total);
		
		// 3. 1000부터  2000까지의 10의 배수를 한줄에 5개씩 출력해 보세요.
		int count = 0;
		for (num = 1000; num<=2000; num++) {
			if (num % 10 == 0) {
				System.out.print(num + " ");
				// 숫자를 출력하는 횟수를 세서 5의 배수라면 줄바꿈을 출력
				if (count++ % 5 == 0) {
					System.out.println();
				}
			}
		}
	}
}
