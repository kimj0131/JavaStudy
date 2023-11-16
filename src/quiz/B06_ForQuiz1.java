package quiz;

public class B06_ForQuiz1 {
	/*
	  	1. 1000부터 2000 사이의 8의 배수를 모두 출력해 보세요. 
	  	2. 100부터 300까지의 총합을 구해보세요. 
	  	3. 1000부터  2000까지의 10의 배수를 한줄에 5개씩 출력해 보세요.
	*/
	public static void main(String[] args) {

		// 1.
		for (int i=1000; i<=2000; i++) {
			if(i%8 == 0) {
				System.out.println(i);
			}
		}
		System.out.println();

		// 2.
		int sum = 0;
		for (int i=100; i<=300; i++) {
			sum += i;
		}
		System.out.println(sum);
		System.out.println();

		// 3.
		int check = 0;
		for (int i=1000; i<=2000; i++) {
			if(i%10 == 0) {
				System.out.print(i + " ");
				check += 1;
				if (check%5 == 0) {
					System.out.println();
				}
			}
		}
		
		// 사이값을 미리 계산하고 코드를 짠 내용이므로 좋지않은 방법.
//		int a = 1000;
//		for (int j=0; j<20; j++) {
//			for (int i = 0; i < 5; i++) {
//				System.out.print(a + " ");
//				a += 10;
//			}
//			System.out.println();
//		}
//		System.out.println(a);
		
	}

}
