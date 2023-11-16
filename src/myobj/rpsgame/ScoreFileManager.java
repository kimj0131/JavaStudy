package myobj.rpsgame;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class ScoreFileManager {

	// 전적을 저장하는 메서드
	public void scoreSave(int[] score) {
		try {
			FileOutputStream out = new FileOutputStream("myfiles/quiz/score.txt");
			for (int i = 0; i < score.length; i++) {
				int num = score[i];
				
				String result = String.valueOf(num);
				out.write(result.getBytes());
				out.write('/');
			}
			System.out.println("[NOTICE]저장이 완료되었습니다.");
			out.close();
		} catch (FileNotFoundException e) {
			System.out.println("[ERROR]저장 파일의 경로를 찾을 수 없습니다.");
		} catch (IOException e) {
			System.out.println("[ERROR]데이터 작성중 문제가 생겼습니다.");
		}
	}

	// 파일로부터 전적을 불러들이는 메서드
	public int[] scoreRead() {
		
		while (true) {
			try {
				FileInputStream in = new FileInputStream("myfiles/quiz/score.txt");
				byte[] allBytes = in.readAllBytes();
				
				int[] savedScore = new int[3];
				
				int j = 0;
				for (int i = 0; i <savedScore.length; i++) {
					String result = "";
					while (j < allBytes.length) {
						if(allBytes[j] == '/') {
							j++;
							break;
						} else {
							result += (char)allBytes[j];
						}
						j++;
					}
					// 숫자로만 문자열을 작성후 int타입으로 변환
					savedScore[i] = Integer.parseInt(result);
				}
				
				in.close();
				return savedScore;
			} catch (FileNotFoundException e) {
				System.out.println("[ERROR]저장 파일의 경로를 찾을 수 없습니다.");
				System.out.println("==================================");
				System.out.println("### 초기 데이터를 작성중입니다... ###\n");
				resetScore();
			} catch (IOException e) {
				System.out.println("[ERROR]데이터 작성중 문제가 생겼습니다.");
			} catch (NumberFormatException e) {
				System.out.println("[ERROR]불러올 데이터 타입에 문제가 발생했습니다.");
				return null;
			}
		}
	}
	
	// 초기데이터 작성 메서드
	public void resetScore() {
		try {
			FileOutputStream out = new FileOutputStream("myfiles/quiz/score.txt");
			for (int i = 0; i < 3; i++) {
				out.write((0 + "").getBytes());
				out.write('/');
			}
			out.close();
		} catch (FileNotFoundException e) {
			System.out.println("[ERROR]경로를 찾을 수 없습니다.");
		} catch (IOException e) {
			System.out.println("[ERROR]데이터 작성중 문제가 생겼습니다.");
		}
	}
}
