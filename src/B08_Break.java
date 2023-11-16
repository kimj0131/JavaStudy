
public class B08_Break {

	/*
	  	# break
	  	
	  	- whitch-case문 내에서 사용해 해당 case를 탈출한다.
	  	- 반목문 내부에서 사용하면 해당 반복문을 하나만 탈출한다. (여러개 겹쳐놔도 하나만 break 걸린 하나만 탈출)
	  	- if문 내부에서 사용한다고 해서 if문을 탈출하지는 않는다.
	  	
	  	# continue
	  	
	  	- 반복문 내부에서 만나면 다음번 반복으로 넘어간다.
	*/
	
	public static void main(String[] args) {
		
		// ex1)
		for (int i=0; i<100; i++) {
			System.out.println("Hello " + i + " !");
			
			if(i == 80) {
				break;
			}
		}
		
		//ex2)
		String str = "김정은 북한 국무위원장이 탄 전용열차가 "
				+ "러시아 극동 지역인 보스토치니 우주기지로 향하고 있습니다. "
				+ "어젯밤 김 위원장이 하산역에서 내려 러시아 측 환영을 받는 영상도 공개됐는데요. "
				+ "오늘 블라디미르 푸틴 러시아 대통령과 정상회담과 공식 만찬을 할 전망입니다.";
		
		for (int index=0; index<str.length(); index++) {
			char ch = str.charAt(index);
			//System.out.printf("%d번째 문자는 \"%c\"입니다\n", index, ch);
			System.out.print(ch);
			if (ch == '.') {
				System.out.println();
				break;
			}
		}
		
		// continue ex1)
		for (int i=0; i<100; i++) {
			if (i%2 == 0) {
				// continue를 만나 내려가지않고 바로 다음 반복(i++)으로 넘어감
				// ex) -> 짝수일때 아래 println();을 건너뜀
				continue;
			}
			System.out.println(i);
		}
		
	}

}
