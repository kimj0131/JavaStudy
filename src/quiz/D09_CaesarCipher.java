package quiz;

import java.util.Scanner;

public class D09_CaesarCipher {
	/*
	 	# 시저 암호
	 	
	 	- 알파벳을 일정한 거리만큼 밀어서 다른 알파벳으로 암호화하는 암호 알고리즘
	 	- 키 값만큼 평문의 모든 알파벳을 오른쪽으로 밀어주면 암호화가 되고 
	 	  암호문을 다시 정해진 키 값만큼 왼쪽으로 밀어주면 복호화가 된다
	 		ex)
	 		
	 		ABCDEFGHIJKLMNOPQRSTUVWXYZ!@#$%^&*0123456789
	 			abcdefghijklmnopqrstuvwxyz[]/?;'"
	 		
	 		[평문]		key : 10	[암호문]
	 		Hello!!		--->		RovvyCC
	 					암호화
	 		[암호문]		key : 10	[평문]
	 		RovvyCC		--->		Hello!!
	 					복호화
	 	1. 평문과 키값이 전달되면 해당 평문을 암호화하여 리턴해주는 메소드
	 	2. 암호문과 키값이 전달되면 해당 암호문을 복호화하여 리턴해주는 메서드
	*/
	final static StringBuilder passKey = 
			new StringBuilder("ABCDEFGHIJKLMNOPQRSTUVWXYZ!@#$%^&*0123456789"
			+ "abcdefghijklmnopqrstuvwxyz[]/?;'\"");
	
	// 암호화
	public static StringBuilder encryption(String plainText, int key) {
		StringBuilder sb = new StringBuilder(plainText);
		
		for (int i = 0; i < plainText.length(); i++) {
			int charIndex = passKey.indexOf(plainText.charAt(i) + "");
			
			if (charIndex + key > passKey.length() - 1) {
				sb.replace(i, plainText.length(), passKey.charAt((charIndex + key) - passKey.length()) + "");
			}else {
				sb.replace(i, plainText.length(), passKey.charAt(charIndex + key) + "");
			}
		}
		return sb;
	}
	
	// 복호화
	public static StringBuilder decryption(StringBuilder encryptedText, int key) {
		StringBuilder sb = new StringBuilder(encryptedText.toString());
		
		for (int i = 0; i < encryptedText.length(); i++) {
			int charIndex = passKey.indexOf(encryptedText.charAt(i) + "");

			if (charIndex - key < 0) {
				sb.replace(i, encryptedText.length(), passKey.charAt(passKey.length() + (charIndex - key)) + "");
			} else {
				sb.replace(i, encryptedText.length(), passKey.charAt(charIndex - key) + "");
			}
		}
		
		return sb;
	}
	
	public static void main(String[] args) {
		System.out.println("암호 입력\n>>");
		String plainText = new Scanner(System.in).next();
		int key = 10;
		
		StringBuilder encryptedText = encryption(plainText, key);
		System.out.println("암호화 : " + encryptedText);
		
		String decrypedText = decryption(encryptedText, key).toString();
		System.out.println("복호화 : " + decrypedText);
	}
}
