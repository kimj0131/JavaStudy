package quiz_answer;

public class D09_CaesarCipher_answer {
	
	final static String CAESAR_CHARSET = 
			"ABCDEFGHIJKLMNOPQRSTUVWXYZ!@#$%^&*0123456789"
			+ "abcdefghijklmnopqrstuvwxyz[]/?;'\"";
	
	public static String encrypt(String text, int key) {
		StringBuilder sb = new StringBuilder();
		
		int len = text.length();
		int lenOfCharset = CAESAR_CHARSET.length();
		
		for (int i = 0; i < len; i++) {
			char ch = text.charAt(i);
			int index = CAESAR_CHARSET.indexOf(ch);
			
			if (index != -1) {
				int cipherIndex = (index + key) % lenOfCharset;
				sb.append(CAESAR_CHARSET.charAt(cipherIndex));
			} else {
				// 암호 CHARSET에 없는 경우 그대로 출력하게 한다.
				sb.append(ch);
			}
		}
		
		return sb.toString();
	}
	
	public static String decrypt(String text, int key) {
		StringBuilder sb = new StringBuilder();
		int len = text.length();
		int lenOfCharset = CAESAR_CHARSET.length();
		
		for (int i = 0; i < len; i++) {
			char ch = text.charAt(i);
			int index = CAESAR_CHARSET.indexOf(ch);
			
			if(index != -1) {
				int plainIndex = (index - key) % lenOfCharset;
				if(plainIndex < 0) {
					// key값을 뺀 결과가 0보다 작으면
					sb.append(CAESAR_CHARSET.charAt(lenOfCharset + plainIndex));
				} else {
					// key값을 뺀 결과가 0보다 크면 그대로 사용한다.
					sb.append(CAESAR_CHARSET.charAt(plainIndex));
				}
			} else {
				sb.append(ch);
			}
		}
		
		return sb.toString();
	}
	
	public static void main(String[] args) {
		String encrytedText = encrypt("Hello!!가나다", 355);
		
		System.out.println(decrypt(encrytedText, 355));
	}
	
}
