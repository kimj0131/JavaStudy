package quiz_answer;

import java.util.Scanner;

public class B09_Prime_Answer {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print(">> ");
		int num = sc.nextInt();
		
		// 약수가 두개인지 검사하기
		for (int i=2; i<=num; i++) {
			int count = 0;
			// 이번 숫자 i에 대한 약수 개수 검사
			for (int chk = 1; chk <= i; chk++) {
				if (i%chk == 0) {	
					count++;
					//System.out.printf("%d는 %d로 나누어 떨어집니다.[약수의 개수 : %d개]\n", i, chk, count);
				}
			}
			// 검사가 끝났을때 약수가 2개라면 소수
			//System.out.printf("%d는 소수인가요? %s\n", i, count==2);
			if (count==2) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
		
		// 2부터 i-1에 약수가 존재해면 소수가 아님
		for (int i=2; i<=num; i++) {
			boolean isPrime = true;
			for (int chk=2; chk < i; chk++) {
				if (i%chk == 0) {	
					isPrime = false;
					break;
				}
			}
			if (isPrime) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
		
		// 2부터 루트i 까지 약수가 존재하면 소수가 아님
		for (int i=2; i<=num; i++) {
			boolean isPrime = true;
			for (int chk=2; chk <= Math.sqrt(i); chk++) {
				if (i%chk == 0) {	
					isPrime = false;
					break;
				}
			}
			if (isPrime) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
		
	}
}
