package quiz_answer;

import java.util.Scanner;

public class B14_ShuffleText_Answer {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 >> ");
		String word = sc.next();
		
		int len = word.length();
		int[] ranIndex = new int[len];
		
		// 문자열의 길이가 10일때 0 ~ 9까지의 중복없는 랜덤 숫자를 생성
		for (int i = 0; i < len; i++) {
			ranIndex[i] = (int)(Math.random()*len);
			
			// 이번에 뽑은 번호중에 이전번호중에 있는지 검사
			for (int j = 0; j < i; j++) {
				if(ranIndex[i] == ranIndex[j]) {
					i--;
					break;
				}
			}
		}
		
		// 문자열을 그 순서대로 출력
		char wordChar[] = new char[len];
		for (int i = 0; i < len; i++) {
			wordChar[i] = word.charAt(ranIndex[i]);
			System.out.print(wordChar[i]);
		}
		System.out.println();
		
//====================================================
		// #### 더 좋은방법 ####
		
		String input = word;
		
		// 문자열 길이 크기의 char[]로 변환
		char [] chs = new char[input.length()];
		
		for (int i = 0; i < input.length(); i++) {
			chs[i] = input.charAt(i);
		}
		
		// 배열의 순서를 섞는다. (랜덤위치의 두 문자의 순서를 계속 바꾼다.)
		for (int i = 0; i < 100; i++) {
			// 문자열 길이가 12일때 1 ~ 11까지의 랜덤 인덱스를 생성 
			// >> 첫번째 인덱스의 문자를 랜덤한 숫자의 인덱스로 계속 변경할것임.
			int ran = (int)(Math.random() * (chs.length - 1) + 1);
			
			// 맨 앞의 문자와 랜덤 위치의 문자를 교환한다.
			char temp = chs[0];
			chs[0] = chs[ran];
			chs[ran] = temp;
		}
		
		System.out.print("섞은 후 : ");
		System.out.println(chs);
		
//		// 배열은 그냥 출력하면 주소값이 나온다.
//		System.out.println(new int[10]);
//		// char[]만 예외로 주소대신 문자열이 출력된다.
//		System.out.println(chs);
	
	}

}
