package quiz_answer;

public class C01_FunctionQuiz2_Answer {
	
	// 1.
	public static String getRandomPassword() {
		String pwd = "";
		for (int i = 0; i < 4; i++) {
			// 26 = 알파벳의 개수
			pwd += (char)(Math.random() * 26 + 'A');
		}
		return pwd;
	}
	
	// 2.
	public static String shuffleText(String text) {
		// "".toCharArray() : 문자열로 char[]을 만들어 반환한다.
		char[] arr = text.toCharArray();
		
		for (int i = 0; i < 1000; i++) {
			int ranIndex = (int)(Math.random() * (arr.length - 1) + 1);
			
			char temp = arr[0];
			arr[0] = arr[ranIndex];
			arr[ranIndex] = temp;
		}
		// char[]을 재료로 전달하여 새 문자열을 생성한다.
		// new String(arr);
		
		String shuffled = "";
		for (int i = 0; i < arr.length; i++) {
			shuffled += arr[i];
		}
		return shuffled;
	}
	
	// 3.
	public static String inverse(String text) {
		String result = "";
		// 매개변수로 전달받은 텍스트를 한 글자씩 변환한다.
		for (int i = 0; i < text.length(); i++) {
			char ch = text.charAt(i);
			if (ch >= 'A' && ch <= 'Z') {
				result += (char)(ch + ('a' - 'A'));
			} else if(ch >= 'a' && ch <= 'z') {
				result += (char)(ch - ('a' - 'A'));
			} else {
				result += ch;
			}
		}
		return result;
	}
	
	// 4.
	public static boolean isNumeric(String text) {
		// 숫자가 아닌게 하나라도 나오면 return false
		for (int i = 0; i < text.length(); i++) {
			char ch = text.charAt(i);
			if(ch < '0' || ch > '9') {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		for(int i = 0; i < 10; i++) {
			System.out.println(getRandomPassword());
		}
		System.out.println(shuffleText("고르곤졸라 피자"));
		
		System.out.println(inverse("Hello, world!"));
		System.out.println(inverse("Good Morning!"));
		
		System.out.println("숫자로만 되어있나요? " + isNumeric("1234567"));
		System.out.println("숫자로만 되어있나요? " + isNumeric("1234567a"));
	}

}
