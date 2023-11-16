package myobj.clapGame_Answer;

import java.util.Arrays;
import java.util.Scanner;

public class ClapGame {
	
	final int[] CLAP_NUMBERS;
	
	// String[] players = {"플레이어", "컴퓨터"};
	// 생성자를 활용해 인스턴스를 생성해 배열에 넣는다.(인스턴스 생성을 배열속으로 바로 지정)
	ClapGamePlayer[] players = {new ClapGamePlayer("플레이어"), new ClapGamePlayer("컴퓨터")};
	
	// 기본의 369게임
	public ClapGame() {
		CLAP_NUMBERS = new int[] {3, 6, 9};
	}
	
	//... 매개변수는 생성자에는 사용할 수 없다.
	// 생성자를 통해 매개변수를 받아 박수번호를 임의대로 바꿀 수 있다.
	public ClapGame(int[] clapNums) {
		CLAP_NUMBERS = clapNums;
	}
	
	// 숫자 정답(CLAP_NUMBERS)을 받으면 문자열 369 정답을 리턴하는 메소드
	//입력한값이 정답인지 체크하기위해 확인한 문자열을 리턴함
	public String getAnswerString(int answer) {
		String answerStr = "";
		int original = answer;
		// 매개변수로 받은 answer를 3,6,9가 있는지 확인하고 String 변수에 있는 순서대로 'ㅉ'을 더함
		while (answer > 0) {
			int digit = answer % 10;
			
			for(int i = 0; i < CLAP_NUMBERS.length; i++) {
				if(digit == CLAP_NUMBERS[i]) {
					answerStr += "짝";
					break;
				}
			}
			answer /= 10;
		}
		
		// 박수를 치지않을때 매개변수를 그대로 내보냄
		if(answerStr.length() == 0) {
			answerStr += original;
		}
		
		return answerStr;
	}
	
	// 정답 문자열과 사용자가 입력한 문자열을 비교하여 정답인지 알려주는 메소드
	public boolean checkAnswer(String answerStr, String userAnswer) {
		// 첫번째 문자가 숫자인지 문자인지 체크
		//char ch = answerStr.charAt(0);
		
		// 박수는 한글로 입력이 들어올것이기 때문에 9보다 크면된다.
		boolean isClapAnswer = answerStr.charAt(0) > '9';
		
		if(isClapAnswer) {
			if(userAnswer.length() != answerStr.length()) {
				return false;
			}
			// 박수를 쳤는지 체크
			// 박수를 안쳤을경우
			for(int i = 0; i < answerStr.length(); i++) {
				char ch = userAnswer.charAt(i);
				if (ch != 'ㅉ' && ch != '짝') {
					return false;
				}
			}
			// 나머지는 박수를 쳤다는 의미므로 true;
			return true;
		} else {
			// 입력한 숫자가 정답이랑 같은지 체크
			return userAnswer.equals(answerStr);
		}
	}
	
	public void play() {
		System.out.printf("%s에 박수를 쳐야하는 게임입니다.\n", Arrays.toString(CLAP_NUMBERS));
		
		// 랜덤으로 번호를 뽑고
		int turn = (int)(Math.random() * 2);
		// 뽑힌 번호를 배열을 써서 함수호출
		// players[start].name > 을 쓰지 않는 경우 : 사용자가 필드값을 임의대로 변경할 수 없게 함수로 호출하는것. 
		System.out.printf("'%s'부터 시작합니다.\n", players[turn].getName());
		
		Scanner sc = new Scanner(System.in);
		
		// 입력한값이 정답인지 체크하기
		int answer = 1;
		
		while (true) {
			ClapGamePlayer player = players[turn];
			
			// 입력해야할 정답을 확인
			String answerStr = getAnswerString(answer++);
			String userAnswer;
			
			//디버깅용 정답체크
			System.out.printf("[이번 정답 '%s']\n", answerStr);
			
			// 정답 입력받음
			String name = player.getName();
			System.out.printf("%s -> ", name);
			
			// 진행 순서
			if(name.equals("플레이어")) {
				userAnswer = player.manual(sc);
			} else {
				userAnswer = player.auto(answerStr);
				System.out.println(userAnswer);
			}
			
			// answerStr == userAnswer (ㅉ 또는 짝을 모두 정답으로 인정)
			boolean correct = checkAnswer(answerStr, userAnswer);
			
			if(!correct) {
				System.out.printf("'%s'의 패배!\n", player.getName());
				break;
			}
			
			
			// 반복하면서 0,1이 번갈아 나와 턴을 진행한다.
			turn = (turn + 1) % players.length;
		}
	}

}
