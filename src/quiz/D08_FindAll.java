package quiz;

public class D08_FindAll {
	
	static void findCharacterIndex(String text, String findCh) {
		int index = 0; 
		
		while(index < text.length()) {
			int findIndex = text.indexOf(findCh, index);
			if (findIndex == -1) {
				break;
			} else {
				System.out.printf("[%s]의 인덱스 위치 : %d\n", findCh, findIndex);
			}
			index = findIndex + 1;
		}
	}
	
	
	public static void main(String[] args) {
		// 문자열과 찾을 문자를 전달하면 해당 문자의 모든 위치를 출력해주는 메서드를 만들어 보세요(indexOf를 사용)
		String text = "apple/banana/orange/podo/gyul/pineapple/watermelon";
		
		findCharacterIndex(text, "n");
	}
}
