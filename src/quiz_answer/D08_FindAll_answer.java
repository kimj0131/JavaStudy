package quiz_answer;

public class D08_FindAll_answer {
	
	public static void findAll(String text, char ch) {
		int foundIndex = text.indexOf(ch);
		int i = 1;
		while(foundIndex != -1) {
			System.out.printf("%d번째 %c의 위치 : %d\n", i++, ch, foundIndex);
			foundIndex = text.indexOf(ch, foundIndex + 1);
		}
		
		// 간략화
//		int foundIndex = -1;
//		int i = 1;
//		while((foundIndex = text.indexOf(ch, foundIndex + 1)) != -1) {
//			System.out.printf("%d번째 %c의 위치 : %d\n", i++, ch, foundIndex);
//		}
	}

	public static void main(String[] args) {
		// 문자열과 찾을 문자를 전달하면 해당 문자의 모든 위치를 출력해주는 메서드를 만들어 보세요(indexOf를 사용)
		String text = "apple/banana/orange/podo/gyul/pineapple/watermelon";
		
		findAll(text, 'a');
	}
}
