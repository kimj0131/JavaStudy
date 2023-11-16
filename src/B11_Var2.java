
public class B11_Var2 {
	
	public static void main(String[] args) {
		
		// 1. 변수는 {}를 벗어나면 죽는다 
		if(true) {
			// 변수는 선언된 {}를 벗어나면 생명이 다한
			int x = 10;
			
			System.out.println("inner x : " + x);
		}
		// 위의 if문 안의 변수x는 사용완료되고 사라졌으므로 다시 변수 x로 선언할 수 있다.
		int x = 20;
		System.out.println("outer x : " + x);
		
		// for문 내부에서 선언한 변수는 for문의 {}내부에서 선언한 것으로 간주한다.
		for (int i = 0; i < 10; i++) {
			System.out.println("hello!");
		}
		
		// 2. 중괄호 바깥에서 선언한 변수는 중괄호가 끝나도 계속 사용할 수 있다.
		int num = 20;
		
		if (true) {
			System.out.println(num);
			num = 88;
		}
		System.out.println(num);
		
		/* 
		  	# 들여쓰기 원칙		
		  	
		  	1. 새로운 {}가 열리면 한번 들여쓰기 한다.
		  	2. } 뒤에 무언가를 쓰지말자.
		  	3. 스페이스바로 줄을 맞추지 말자.
		  	4. 빨간 줄(에러)이 있는 채로 무언가를 하면 자동 들여쓰기의 도움을 받을 수 없다.
		  	
		  	※ 자세한 내용은 '자바 코드 컨벤션' 검색
		*/
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.println(i);
			}
		}
	}

}
