package quiz_answer;

import java.util.Arrays;

public class C01_FunctionQuiz3_Answer {
	
	public static int[] getLottoSet() {
		int[] winNum = new int[7];
		
		for (int i = 0; i < winNum.length; i++) {
			winNum[i] = (int)(Math.random() * 45 + 1);
			
			for (int j = 0; j < i; j++) {
				if (winNum[j] == winNum[i]) {
					i--;
					break;
				}
			}
		}
		return winNum;
	}
	
	public static void main(String[] args) {
		System.out.println(Arrays.toString(getLottoSet()));
	}

}
