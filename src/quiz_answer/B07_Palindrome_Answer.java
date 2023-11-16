package quiz_answer;

public class B07_Palindrome_Answer {
	
	//1. 각자 다른 케이스의 문자가 있는지 확인한다 (안내 문구를 출력하기 위해)
	//2. 비교를 위해 모든 문자를 하나의 문자 케이스로 통일한다.(대문자 or 소문자 상관없음)
	//3. 비교한다 (하나씩 비교하던지, 뒤집어서 비교하던지)
	
	public static void main(String[] args) {
		
		// 1. 맨 앞부터 글자를 하나씩 비교해 나간다(절반까지만)
		String word = "LEVel";
		// 대문자 소문자가 모두 포함되었는지 여부를 체크
		
		// 대문자 소문자의 개수를 세었을 때 둘다 1이상이면 true
		int upperCount = 0;
		int lowerCount = 0;
		
		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			if (ch >= 'A' && ch <= 'Z') {
				upperCount ++;
			} else if(ch >= 'a' && ch <= 'z') {
				lowerCount ++;
			}
		}
		boolean hasDiffCase = upperCount > 0 && lowerCount > 0;
		
		String lowercased = "";
		// 대/소문자가 다른 좌우대칭 입니다. 출력
		// 대문자를 모두 소문자로 바꾼다(문자가 같은지 확인시킴)
		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			
			if (ch >= 'A' && ch <= 'Z') {
				lowercased += (char)(ch+32);
			} else {
				lowercased += ch;
			}
		}
		System.out.println("입력 원본 : " + word);
		System.out.println("소문자로 바꾼 결과 : " + lowercased);
		
		
		// ** 항상 동일할 예정인 계산은 조건쪽에서 하면 낭비가 될 수 있다. >> 미리 계산해서 변수만 불러서 씀
		int len = lowercased.length();
		int incorrectCount = 0;
		boolean palindrome = true;
		
		// 단어의 맨 앞 인덱스부터 절반 인덱스까지 검사를 진행한다.
		for (int i = 0, half = len/2 ; incorrectCount == 0 && i < half; i++) {
			char frontCh = lowercased.charAt(i);
			char behindCh = lowercased.charAt(len - 1 - i);
			
			// &=을 이용해 false가 한번만 발생해도 false가 되도록 만들 수 있다.
			// palindrome &= frontCh == behindCh;
			
			// 앞쪽 문자와 뒤쪽 문자가 일치하지 않을때마다 불일치 카운트를 1증가
			if(frontCh != behindCh) {
				incorrectCount ++;
			}
		}
		
		if(incorrectCount > 0) {
			System.out.println("(1) 좌우대칭이 아닙니다.");
		} else if (hasDiffCase) {
			System.out.println("(1) 대/소문자가 다르지만 좌우대칭 입니다.");
		} else { 
			System.out.println("(1) 좌우대칭 입니다.");
		}
		
		
		// 2. 단어를 뒤집고 비교해서 똑같으면 좌우대칭이다
		// 비어있는 문자열에 문자를 하나씩 누적연산하면 새로운 문자열을 만들 수 있다.
		String reversed = "";
		for (int i = 0; i < lowercased.length(); i++) {
			reversed += lowercased.charAt(lowercased.length() - 1 - i);
		}
		System.out.printf("원본 : %s, 뒤집 : %s\n", lowercased, reversed);
		
		if (!lowercased.equals(reversed)) {
			System.out.println("(2) 좌우대칭이 아닙니다.");
		} else if(hasDiffCase) {
			System.out.println("(2) 대/소문자가 다르지만 좌우대칭입니다.");
		} else {
			System.out.println("(2) 좌우대칭 입니다.");
		}
		
		
		
	}

}
