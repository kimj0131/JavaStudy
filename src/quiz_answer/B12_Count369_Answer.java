package quiz_answer;

public class B12_Count369_Answer {
	
	public static void main(String[] args) {
		
		int ran = (int)(Math.random() * 401 + 100);
		
		int clapCount = 0;
		
		for (int i = 0; i <= ran; i++) {
			System.out.print(i + ": ");
			
			// 1. 숫자를 문자열로 바꿔서 센다
//			String numStr = "" + i;
//			
//			for (int j = 0; j < numStr.length(); j++) {
//				char ch = numStr.charAt(j);
//				// 나열한 숫자를 문자열로 입력시켜놓고 3, 6, 9 인지 센다
//				if (ch == '3' || ch == '6' || ch == '9') {
//					System.out.print("짝");
//					clapCount++;
//				}
//			}
			
			// 2. 숫자를 한자리씩 검사하며 3, 6, 9 인지 센다
			int chkNum = i;
			
			while (chkNum > 0) {
				// 1의자리는 따로분리(1의 자리가 0일때 참이 되버림)
				int digit = chkNum % 10;
				if (digit != 0 && digit % 3 == 0) {
					System.out.print("짝");
					clapCount++;
				}
				// 한자리 검사완료했으므로 다음 
				chkNum /= 10;
			}
			// ex) i = 133일경우
			// digit = 133 % 10 = 3
			// digit은 0도 아니고 3으로 나누면 나머지가 0이므로 3, 6, 9중에 하나이다.
			// 박수카운트 증가(1의 자리)
			// 10의 자리 검사를 위해 10으로 나눔
			// digit = 10 % 13 = 3
			// digit은 3, 6, 9중에 하나이다.
			// 박수카운트 증가 (10의 자리)
			// 계속..
			
			System.out.print("\t\t\t누적 " + clapCount + "회");
			System.out.println();
		}
		
		System.out.printf("박수 횟수는 %d회 입니다.\n", clapCount);
	}
}
