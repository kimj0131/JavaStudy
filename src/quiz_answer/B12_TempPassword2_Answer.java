package quiz_answer;

public class B12_TempPassword2_Answer {
	
	public static void main(String[] args) {
		
		// final : final을 붙이고 선언한 변수는 값을 변경할 수 없다
		final String MY_PWD_CHARSET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
				+ "abcdefghijklmnopqrstuvwxyz"
				+ "0123456789"
				+ "!@#$%^&*():;=+-_[]";
		System.out.println("내 문자셋의 길이 : " + MY_PWD_CHARSET.length());
		
		int len = MY_PWD_CHARSET.length();
		
		String tempPassword = "";
		
		for (int i = 0; i < 6; i++) {
			tempPassword += MY_PWD_CHARSET.charAt((int)(Math.random() * len));
		}
		System.out.println("생성된 임시 비밀번호 : " + tempPassword);
	}

}
