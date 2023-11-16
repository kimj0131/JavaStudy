package quiz;

public class B12_TempPassword2 {
	/*
		대문자, 소문자, 특수문자, 숫자로 구성된 랜덤 비밀번호 6자리 생겅하여 출력하는 프로그램
		※ 사용가능한 특수문자 : !@#$%^&*():;=+-_[]
	 */
	public static void main(String[] args) {
		
		int count = 0;
		for (int i = 0; i < 6; i++) {
			char ch = (char)(Math.random() * 90 + 33);
			
			String str = "!@#$%^&*():;=+-_[]";
			for(int j = 0; j < str.length(); j++) {
				char ch2 = str.charAt(j);
				if(ch != ch2) {
					System.out.print(ch);
					break;
				} 
			}
		}
		System.out.println();
		
	}
}
