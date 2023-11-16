package quiz;

import java.util.Scanner;

public class B10_Prime2 {
	
	public static void main(String[] args) {

		System.out.print(" >> ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		// num을 2부터 검사
		int list = 2;
		while (list <= num) {
			// 
			int checkList = 1;
			int divCount = 0;
			while (checkList <= list) {
				// 나눈나머지가 0일때 divCount++
				if (list%checkList == 0) {
					divCount++;
					// divCount가 2이상이면 소수아니므로 빠져나감
					if(divCount > 2) {
						break;
					}
				}
				checkList++;
			}
			if(divCount == 2) {
				System.out.print(list + " ");
			}
			list++;
		}
		
	}

}
