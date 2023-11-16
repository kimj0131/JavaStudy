package quiz;

import java.util.Arrays;
import java.util.Scanner;

public class B14_ShuffleText {
	/*
		사용자로부터 단어를 입력받으면 
		해당 단어를 랜덤으로 섞어주는 프로그램을 만들어보세요
	*/
	public static void main(String[] args) {
		// 사용자에게 단어(문자열)을 입력받음
		Scanner sc = new Scanner(System.in);
		System.out.print("단어를 입력 > ");
		String inputStr = sc.next();
		
		// 문자열을 문자로 쪼개 배열에 넣기
		char inputStrArray[] = new char[inputStr.length()];
		for (int index = 0; index < inputStr.length(); index++) {
			inputStrArray[index] = inputStr.charAt(index);
		}
		
		// 쪼갠 문자의 인덱스를 랜덤으로 섞기
		int len = inputStrArray.length;
		
		// 랜덤으로 인덱스 번호를 생성, 중복은 제거해서 배열로 만듬
		int randomNums[] = new int[len];
		for (int i = 0; i < len; i++) {
			int ran = (int)(Math.random() * len);
			randomNums[i] = ran;
			for (int j = 0; j < i; j++) {
				if(randomNums[j] == randomNums[i]) {
					i--;
					break;
				}
			}
		}
		
		for (int i = 0; i < len; i++) {
			int a = randomNums[i];
			System.out.print(inputStrArray[a]);
		}
		System.out.println();
		
		// 얕은 복사는 배열의 주소를 그대로 복사해 사용하므로
		// 복사한 배열의 값이 변하면 원배열의 값도 같이 변함.
		// char[] shuffle = inputStrArray; // 얕은 복사
		
		char[] shuffle = new char[inputStrArray.length];
		
//		for (int i = 0; i < shuffle.length; ++i) {
//			int a = randomNums[i];
//			shuffle[i] = inputStrArray[a];
//		}
		
		
		for (int i = 0; i < len; i++) {
			int a = randomNums[i];
			shuffle[i] = inputStrArray[a];
		}
		System.out.println(Arrays.toString(shuffle));
	}
}
