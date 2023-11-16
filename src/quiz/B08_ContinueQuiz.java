package quiz;

public class B08_ContinueQuiz {
	/*
	 	1. 600부터 800 사이에 있는 7의 배수를 모두 출력
	 	2. 1부터 200까지의 숫자중 2의 배수도 아니고 3의 배수도 아닌 숫자들을 모두 출력
	 	3. 출력했던 모든 숫자들의 합을 출력
	*/
	public static void main(String[] args) {
		
		int sum = 0;
		// 1.
		for (int i=600; i<=800; i++) {
			if (i%7 != 0) {
				continue;
			}
			System.out.print(i + " ");
			sum += i;
		}
		System.out.println();
		
		// 2.
		for (int i=1; i<=200; i++) {
			if (i%2 == 0 || i%3 == 0) {
				continue;
			}
			System.out.print(i + " ");
			sum += i;
		}
		System.out.println();
		
		// 3.
		System.out.println(sum);
	}

}
