package quiz;

public class C01_FunctionQuiz2 {
	/*
	  	1. 실행하면 영어 대문자로만 이루어진 4자리 임시 비밀번호는 생성하여 반환해주는 함수
	  	2. 문자열을 전달하면 해당 문자열을 마구 뒤섞은 문자열을 반환해주는 함수
	  	3. 문자열을 전달하면 해당 문자열의 대소문자를 반전시킨 문자열을 반환해주는 함수
	  	4. 문자열을 전달하면 해당 문자열이 숫자로만 이루어져있는지 여부를 알려주는 함수
	*/
	// 1.
	public static String randomPassword() {
		
		final String RAN_PASSWORD = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		String password = "";
		for (int i = 0; i < 4; i++) {
			password += RAN_PASSWORD.charAt((int)(Math.random()*RAN_PASSWORD.length()));
		}
		return password;
	}
	
	// 2. 
	public static String mixingString(String str) {
		char[] chs = new char[str.length()];
		for (int i = 0; i < str.length(); i++) {
			chs[i] = str.charAt(i);
		}
		
		for (int i = 0; i < 100; i++) {
			// 랜덤 인덱스 번호 생성
			int ran = (int)(Math.random() * (chs.length - 1) + 1);
			
			char temp = chs[0];
			chs[0] = chs[ran];
			chs[ran] = temp;
		}
		String mixed = "";
		for (int i = 0; i < chs.length; i++) {
			mixed += chs[i];
		}
		return mixed;
	}
	
	// 3.
	public static String reverseString(String str) {
		String reverse = "";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch >= 'a' && ch <= 'z') {
				reverse += (char)(ch - 32);
			} else if(ch >= 'A' && ch <= 'Z') {
				reverse += (char)(ch + 32);
			} else {
				reverse += ch;
			}
		}
		return reverse;
	}
	
	// 4.
	public static boolean isStringNumber(String input) {
		int len = input.length();
		boolean isNumber = true;
		for (int i = 0; i < len; i++) {
			if(input.charAt(i) < '0' || input.charAt(i) > '9') {
				isNumber = false;
				break;
			} 
		}
		
		return isNumber;
	}
	
	
	
	public static void main(String[] args) {
		// 1. 
		System.out.println(randomPassword());
		
		// 2.
		System.out.println(mixingString("가나다라마바사"));
		
		// 3.
		System.out.println(reverseString("AbcdE"));
		
		// 4.
		System.out.println(isStringNumber("1245!"));
	}
}
