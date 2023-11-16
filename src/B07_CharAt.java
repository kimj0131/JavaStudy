
public class B07_CharAt {
	/*
	 	# "문자열".charAt(index);
	 	
	 	 - 해당 문자열에서 원하는 위치(인덱스, index)의 문자를 char타입으로 꺼내는 메소드
	 	 - 시작 인덱스는 0이다.
	 	 - 마지막 인덱스는 해당 문자열의 '문자 개수 - 1' 이다.
	 	 
	 	# "문자열".length();
	 	
	 	 - 해당 문자열의 길이(문자 개수)를 알 수 있다.
	*/
	public static void main(String[] args) {
		
		char ch = "안녕하세요".charAt(0);		
//		System.out.println(ch);
		System.out.println("안녕하세요".charAt(1));
		System.out.println("안녕하세요".charAt(2));
		System.out.println("안녕하세요".charAt(3));
		System.out.println("안녕하세요".charAt(4));

		// length()를 이용하면 문자열의 마지막 글자를 쉽게 구할 수 있다.
		String str = "마지막 인덱스는 해당 문자열의 '문자 개수 - 1' 이다";
		System.out.println("마지막 글자 : " + str.charAt(str.length() - 1));

		// for문을 사용하면 문자열을 쉽게 탐색할 수 있다.
		String text = "다람쥐 헌 쳇바퀴에 타고파";
		
		for (int i=0; i<text.length(); i++) {
			char c = text.charAt(i);
			System.out.printf("%d번째 문자 : %c\n", i, c);
		}
		
		// 연습 : 문자열 str을 거꾸로 출력해 보세요
		for (int i=str.length()-1; i>=0; i--) {
			System.out.print(str.charAt(i));
		}
	}
}
