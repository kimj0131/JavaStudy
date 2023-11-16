package myobj.clapGame_Answer;

import java.util.Scanner;

public class ClapGamePlayer {

	String name;
	
	public ClapGamePlayer(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public String auto(String answerStr) {
		// 정답을 받아서 확률적으로 알맞은 정답을 생성(90%정답, 10%오답)
		int ran = (int)(Math.random() * 10);
		
		if(ran == 0) {
			return "앗!";
		} else {
			// 정답을 그대로 반환(출력)
			return answerStr;
		}
				
	}
	
	public String manual(Scanner sc) {
		// 전달받은 스캐너로 직접 정답을 입력해서 리턴하기
		return sc.nextLine();
		
	}
}
