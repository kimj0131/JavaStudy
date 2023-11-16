package quiz;

import java.util.Scanner;

public class B06_CheckDigit {

	/*
	  	사용자가 숫자를 입력하면 해당 숫자가 몇 자리 숫자인지 알려주는 프로그램을 만들어 보세요
	*/
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("입력하실 숫자 > ");
		long num = sc.nextLong();

		num = Math.abs(num);
		int count = 0;

		for (int i = 0; i < num; num /= 10) {
			count++;
		}
		System.out.println("입력한 숫자의 자리수 : " + count);
	}

}
