package quiz;

import java.util.Scanner;

public class D08_isPhoneNumber {
	/*
		 사용자로부터 입력받은 문자열이 유효한 핸드폰 번호인지 검사하는 메서드를 만들어 보세요
	*/
	public static void checkPhoneNumber(String hp) {
		hp = hp.trim();
		char checkCh;
		if (hp.startsWith("010")) {
			int dashChk = 0;
			for(int i = 1; i < hp.length(); i++) {
				if ((checkCh = hp.substring(i - 1).charAt(0)) == '-') {
					dashChk++;
				}
				if(!Character.isDigit(checkCh) && checkCh != '-') {
					System.out.println("입력하신 번호에 문자 혹은 공백이 들어있습니다.");
					return;
				} else if (dashChk > 2 
						|| hp.length() == 13 && hp.charAt(3) != '-' && hp.charAt(8) != '-'
						|| hp.length() == 11 && hp.charAt(i) == '-') {
					System.out.println("입력한 번호에 오류가 있습니다.");
					return;
				} 
				
			}
			System.out.println("입력하신 번호는 유효한 번호입니다.");
		} else {
			System.out.println("입력하신 번호는 유효하지 않은 핸드폰 번호입니다.");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("핸드폰 번호를 입력\n>>");
		
//		String phoneNumber = sc.next();
//		checkPhoneNumber(phoneNumber);
		
		checkPhoneNumber("01012001234  ");
	}
}
