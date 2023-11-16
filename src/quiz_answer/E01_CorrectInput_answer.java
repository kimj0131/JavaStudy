package quiz_answer;

import java.util.InputMismatchException;
import java.util.Scanner;

public class E01_CorrectInput_answer {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num;
		while(true) {
			try {
				System.out.print("정수 > ");
				num = sc.nextInt();
				break;
			} catch (InputMismatchException e) {
				System.out.println("숫자가 아닌 문자열이 들어왔습니다.");
				sc.nextLine();	//입력받은 찌꺼기 제거
			}
		}
		System.out.println("입력을 잘 받았습니다 : " + num);
	}
}
