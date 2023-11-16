
public class B10_While {
	
	/*
	 	# while
	 	
	 	- for문과 사용법이 약간 다른 반복문
	 	- 초기값과 증가값의 위치가 정해져 있지 않아 for문보다 자유롭다.
	 	- ()안의 내용이 true라면 {}안의 내용을 계속 반복한다.
	 	- 증감값의 위치에 따라 결과가 달라지는 것에 주의해야 한다.
	 	
	*/
	public static void main(String[] args) {
		
		
		// 단항연산자의 위치에 따른 출력값 차이
		// 0~9까지 10개
		int i = 0;
		while (i<10) {
			System.out.println(i++);
		}
		
		System.out.println("-----------");
		
		// 1~10까지 10개
		i = 0;
		while (i<10) {
			System.out.println(++i);
		}
		
		System.out.println("-----------");
		
		// 1~10까지 10개
		i = 0;
		while (i++<10) {
			System.out.println(i);
		}
		
		System.out.println("-----------");
		
		// 10이라 썼지만 1~9 까지 9개가 나와서 직관적이지 않다
		i = 0;
		while (++i<10) {
			System.out.println(i);
		}
		
		
		// while문으로 문자열 탐색해보기
		String str = "블라디미르 푸틴 러시아 대통령이 13일 러시아 아무르주 보스토치니 우주기지에서 김정은 북한 국무위원장과 정상회담을 하고,"
				+ " 북한에 군사정찰위성 개발 기술 지원 방침을 밝혔다."
				+ " 또한 러시아 쪽은 “발표되지 말아야 할 민감한 분야의 협력을 이행한다”고 말해,"
				+ " 우크라이나 전쟁을 수행중인 러시아에 북한의 포탄 등 재래식 무기를 지원하는 방안도 논의됐을 것으로 관측된다."
				+ " 한·미·일 안보협력 강화에 맞서 북·러 또한 유엔 대북제재를 무시하고 군사협력 수준을 심화시키면서, 국제정세에도 큰 파장이 예상된다.";
		int len = str.length();
		int index = 0;
		
		while (index < len) {
			char ch = str.charAt(index);
			System.out.printf("[%d] : %c\n", index, ch);
			index ++;
		}
		
	}
}