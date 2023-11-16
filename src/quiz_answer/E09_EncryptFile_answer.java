package quiz_answer;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class E09_EncryptFile_answer {
	
	final private static String CAESAR_CHARSET = 
			"ABCDEFGHIJKLMNOPQRSTUVWXYZ!@#$%^&*()-_=\\ "
			+ "abcdefghijklmnopqrstuvwxyz/<>?,.';:";
	
	
	final private static int CAESAR_LENGHT = CAESAR_CHARSET.length();
	
	public static int encrypt(int ch, int key) {
		
		int idx = CAESAR_CHARSET.indexOf(ch);
		
		if (idx == -1) {
			return ch;
		} else {
			return CAESAR_CHARSET.charAt((idx + key) % CAESAR_LENGHT);
		}

	}
	
	public static char[] encrypt(char[] text, int key, int len) {
		for (int i = 0; i < len; i++) {
			text[i] = (char)encrypt(text[i], key);
		}
		return text;
	}
	
	public static int getRandomKey() {
		return (int)(Math.random() * (CAESAR_LENGHT -1) + 1);
	}
	
	
	// char방식 (한문자씩 읽어서 암호화)
	public static int encryptTextFile1 (String path) {
		File srcFile = new File(path);
		 
		String srcFileName = srcFile.getName();
		
		// getParentFile() : 부모파일의 경로 (여기서는 path)
		File targetFile = new File(
				srcFile.getParentFile(),
				srcFileName
				.substring(0, srcFileName.lastIndexOf('.')) 
				+ "_encrypted.enc");
		
		int key = getRandomKey();
		
		// FileReader : char타입으로 한글자씩 읽음
		try (
			FileReader in = new FileReader(srcFile);
			FileWriter out = new FileWriter(targetFile);
		){
			int ch;
			while ((ch = in.read()) != -1) {
				out.write(encrypt(ch, key));
			}
			return key;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			return -1;
		} catch (IOException e) {
			e.printStackTrace();
			return -1;
		}
	}
	
	
	// char[] 방식(버퍼크기를 미리 설정해서 char배열크기를 정하고 암호화)
	public static int encryptTextFile2 (String path) {
		File srcFile = new File(path);
		 
		String srcFileName = srcFile.getName();
		
		// getParentFile() : 부모파일의 경로 (여기서는 path)
		File targetFile = new File(
				srcFile.getParentFile(),
				srcFileName
				.substring(0, srcFileName.lastIndexOf('.')) 
				+ "_encrypted2.enc");
		
		int key = getRandomKey();
		
		try (
			FileReader in = new FileReader(srcFile);
			FileWriter out = new FileWriter(targetFile);
		){
			// char[] 버퍼 크기를 정해 불러들임
			char[] buff = new char[1024];
			
			int len;
			while ((len = in.read(buff)) != -1) {
				out.write(encrypt(buff, key, len));
			}
			return key;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			return -1;
		} catch (IOException e) {
			e.printStackTrace();
			return -1;
		}
	}
	
	// buffer 방식
	public static int encryptTextFile3 (String path) {
		File srcFile = new File(path);
		 
		String srcFileName = srcFile.getName();
		
		// getParentFile() : 부모파일의 경로 (여기서는 path)
		File targetFile = new File(
				srcFile.getParentFile(),
				srcFileName
				.substring(0, srcFileName.lastIndexOf('.')) 
				+ "_encrypted3.enc");
		
		int key = getRandomKey();
		
		try (
			FileReader fin = new FileReader(srcFile);
			BufferedReader in = new BufferedReader(fin);
			FileWriter fout = new FileWriter(targetFile);
			BufferedWriter out = new BufferedWriter(fout);
		){
			int ch;
			while ((ch = in.read()) != -1) {
				out.write(encrypt(ch, key));
			}
			return key;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			return -1;
		} catch (IOException e) {
			e.printStackTrace();
			return -1;
		}
	}
	
	public static void main(String[] args) {
		long before = System.currentTimeMillis();
		encryptTextFile1("myfiles/frankenstein.txt");
		long after = System.currentTimeMillis();
		System.out.println("time1 : " + (after - before) + "ms");
		
		before = System.currentTimeMillis();
		encryptTextFile2("myfiles/frankenstein.txt");
		after = System.currentTimeMillis();
		System.out.println("time2 : " + (after - before) + "ms");
		
		
		// 버퍼방식은 자동으로 버퍼크기를 정하는등 내부적으로 자동과정을 진행하므로 수동으로 지정하는것보다는 느리게 나올 수는 있다.
		before = System.currentTimeMillis();
		encryptTextFile3("myfiles/frankenstein.txt");
		after = System.currentTimeMillis();
		System.out.println("time3 : " + (after - before) + "ms");
	}
}
