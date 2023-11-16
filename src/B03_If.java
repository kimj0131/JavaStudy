
public class B03_If {

	/*
	  	# if 문
	  	 - ()안의 값이 true면 {}안의 코드를 실행하는 문법
	  	 - ()안의 값이 false면 {}안의 코드를 무시한다
	  	 
	  	# else if 문
	  	 - 위의 if문에서 조건이 맞지않아 실행되지않았다면 if문처럼 동작한다.
	  	 - else if는 여러번 사용할 수 있다.
	  	 - 단독으로 사용이 불가능하다. 
	  	 
	  	# else
	  	 - 위에있는 모든 if문, else if문이 모두 실행되지 않았을때 {}의 내용을 무조건 실행
	  	 - 단독으로 사용이 불가능하다.
	  	 - else가 붙어 있으면 해당 if문 블록은 무조건 실행된다.
	*/
	public static void main(String[] args) {
		System.out.println("프로그램 시작.");
		
		int a = -55;
		
		if (a > 10) {
			System.out.println("a가 10보다 크면 실행되는 곳");
		} else if (a % 2 == 0) {
			System.out.println("a가 10보다 작으면서 짝수일때 실행되는 곳");
		} else if (a > -30) {
			System.out.println("a가 10보다 작고, 짝수도 아니며, -30보다 클때 실행되는 곳");
		} else {
			System.out.println("위의 모든 조건이 성립하지 않았습니다.");
		}
		
		
		char appleGrade = 'C';
		int price;
		
		if( appleGrade == 'A' ) {
			price = 1200;
		} else if( appleGrade == 'B') {
			price = 800;
		} else if ( appleGrade == 'C') {
			price = 600;
		} else {
			price = 0;		// else가 없으면 초기화가 되지 않을 수 있으므로 에러발생 
							// (appleGrade가 A,B,C 가 아닐 수 도 있음)
		}
		
		System.out.println("들어있는 숫자 : " + price);
		
		
		System.out.println("프로그램 끝.");
	}
	
}
