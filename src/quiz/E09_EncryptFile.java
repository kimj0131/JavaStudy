package quiz;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalTime;
import java.time.temporal.ChronoField;

public class E09_EncryptFile {
	/*
		frankenstein.txt를 시저 암호방식으로 암호화한 파일
		frankenstein_encrypted.enc를 생성해 보세요
		
		1. char 방식으로 한 글자씩 암호화하는 속도 측정해보기
		2. char[] 방식으로 암호화하는 속도 측정해보기
		3. 버퍼를 추가하여 암호화하는 속도 측정해보기
		4. 암호화 했던 파일의 복호화 파일 생성해보기
	*/
	final static String CAESAR_CHARSET = 
			"ABCDEFGHIJKLMNOPQRSTUVWXYZ!@#$%^&*0123456789"
			+ "abcdefghijklmnopqrstuvwxyz[]/?;'\"";
	
	static File orif = new File("myfiles/frankenstein.txt");
	static File encf = new File("myfiles/frankenstein_encrypted.enc");
	
	public static void main(String[] args) {
		int key = 10;
		
		charEncFile(key);
		charArrEncFile(key);
		bufferEncFile(key);
		decFile(key);
	}
	
	// char 암호화 진행 메서드
	public static void charEncFile(int key) {
		// char
		long startTime = LocalTime.now().getLong(ChronoField.MILLI_OF_SECOND);
		try (
			FileInputStream fis_in = new FileInputStream(orif);
			FileOutputStream fos_out = new FileOutputStream(encf);
		) {
			int data;
			while((data = fis_in.read()) != -1) {
				// System.out.println("진입확인" + data);
				fos_out.write((char)encrypt(data, key));
			}
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		long endTime = LocalTime.now().getLong(ChronoField.MILLI_OF_SECOND);
		System.out.printf("char 방식 경과시간 [%s]밀리초\n", endTime - startTime);
	}
	
	// char[] 암호화 메서드
	public static void charArrEncFile(int key) {
		// char[]
		long startTime = LocalTime.now().getLong(ChronoField.MILLI_OF_SECOND);
		try (	
			FileReader fr_in = new FileReader(orif);
			BufferedReader bfr_in = new BufferedReader(fr_in);
			FileWriter fw_out = new FileWriter(encf);
			BufferedWriter bfw_out = new BufferedWriter(fw_out);
		) {
			String data;
			while((data = bfr_in.readLine()) != null) {
				// System.out.println("진입확인" + data);
				char[] dataArr = data.toCharArray();
				bfw_out.write(encrypt(dataArr, key));
				bfw_out.write('\n');
			}
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		long endTime = LocalTime.now().getLong(ChronoField.MILLI_OF_SECOND);
		System.out.printf("char[] 방식 경과시간 [%s]밀리초\n", endTime - startTime);
	}
	
	// buffer 암호화 메서드
	public static void bufferEncFile(int key) {
		// buffer
		long startTime = LocalTime.now().getLong(ChronoField.MILLI_OF_SECOND);
		try (
			FileInputStream fis_in = new FileInputStream(orif);
			InputStreamReader ifsr_in = new InputStreamReader(fis_in);
			FileOutputStream fos_out = new FileOutputStream(encf);
			BufferedOutputStream bfos_out = new BufferedOutputStream(fos_out);
		) {
			int data;
			while((data = ifsr_in.read()) != -1) {
				bfos_out.write((char)encrypt(data, key));
			}
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		long endTime = LocalTime.now().getLong(ChronoField.MILLI_OF_SECOND);
		System.out.printf("buffer 방식 경과시간 [%s]밀리초\n", endTime - startTime);
	}
		
	// 복호화 메서드
	public static void decFile(int key) {
		File encf = new File("myfiles/frankenstein_encrypted.enc");
		File decf = new File("myfiles/frankenstein_decrypted.txt");
		// 복호화 진행
		try (
				FileInputStream fis_in = new FileInputStream(encf);
				InputStreamReader ifsr_in = new InputStreamReader(fis_in);
				FileOutputStream fos_out = new FileOutputStream(decf);
				BufferedOutputStream bfos_out = new BufferedOutputStream(fos_out);
				) {
			int data;
			while((data = ifsr_in.read()) != -1) {
				bfos_out.write((char)decrypt(data, key));
			}
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
		System.out.println("복호화 완료!");
	}
		
	// 암호화 처리 메서드
	public static int encrypt(int data, int key) {
		int index = CAESAR_CHARSET.indexOf((char)data);
		int lenOfCharset = CAESAR_CHARSET.length();
		
		if(index != -1) {
			int cipherIndex = (index + key) % lenOfCharset;
			data = CAESAR_CHARSET.charAt(cipherIndex);
		}
		
		return data;
	}
	
	// 오버로딩한 암호화 처리 메서드
	public static String encrypt(char[] data, int key) {
		int len = data.length;
		int lenOfCharset = CAESAR_CHARSET.length();
		
		String result = "";
		for (int i = 0; i < len; i++) {
			char ch = data[i];
			int index = CAESAR_CHARSET.indexOf(ch);
			
			if (index != -1) {
				int cipherIndex = (index + key) % lenOfCharset;
				ch = CAESAR_CHARSET.charAt(cipherIndex);
			}
			result += ch;
		}
		return result;
	}
	
	// 복호화 처리 메서드
	public static int decrypt(int data, int key) {
		int index = CAESAR_CHARSET.indexOf((char)data);
		int lenOfCharset = CAESAR_CHARSET.length();

		if(index != -1) {
			int plainIndex = (index - key) % lenOfCharset;
			if (plainIndex < 0) {
				data = CAESAR_CHARSET.charAt(plainIndex + lenOfCharset);
			}else {
				data = CAESAR_CHARSET.charAt(plainIndex);
			}
		}
		return data;
	}
}
