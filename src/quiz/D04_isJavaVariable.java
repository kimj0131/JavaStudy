package quiz;

import java.util.Scanner;

public class D04_isJavaVariable {
	/*
	 	문자열을 매개변수로 전달하면 해당 문자열이 자바 변수로 사용할 수 있는 문자열인지 검사해주는 메서드를 만들어보세요
	*/
	
	static boolean isJavaVar(String checkStr){
		
		if(Character.isJavaIdentifierStart(checkStr.charAt(0))) {
			for (int i = 1; i < checkStr.length(); i++) {
				char check = checkStr.charAt(i);
				if (!Character.isJavaIdentifierPart(check)) {
					return false;
				} 
			}
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("변수로 사용가능한지 확인할 변수명을 입력\n(!exit으로 종료)");
			System.out.print(">>");
			String check = sc.nextLine();
			switch (check) {
				case "!exit" :
					return;
				default:
					if (isJavaVar(check)) {
						System.out.println("사용 가능\n");
					} else {
						System.out.println("사용 불가\n");
					}
					break;
			}
		}
	}
}
