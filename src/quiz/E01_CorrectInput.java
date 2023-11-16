package quiz;

import java.util.InputMismatchException;
import java.util.Scanner;

public class E01_CorrectInput {
	/*
		사용자로부터 스캐너로 숫자를 입력받되
		숫자가 아닌 문자를 입력하더라도 다시 입력받을 수 있는 프로그램을 만들어보세요
	*/
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			try {
				System.out.print("숫자를 입력 > ");
				System.out.println("입력한 숫자 : " + sc.nextInt());
				break;
			} catch (InputMismatchException e) {
				sc.nextLine();	//입력받은 찌꺼기 제거
				System.out.println("문자가 아닌 숫자를 입력해주세요");
			}
		}
		
	}
}
