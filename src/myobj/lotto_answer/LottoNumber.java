package myobj.lotto_answer;

import java.util.Arrays;

public class LottoNumber {
	
	// ※ 해당 메서드에서 this를 사용할 에정이라면 static을 사용하지 않는다
	
	// 당첨번호는 7개, 뽑는 번호는 6개
	int[] numbers;
	
	// 내가 고른 int[]을 전달하면 인스턴스가 생성됨
	public LottoNumber(int[] numbers) {
		this.numbers = numbers;
	}
	
	// 당첨번호인지 자동번호인지 선택하면 자동번호가 들어간 인스턴스가 생성됨
	public LottoNumber(boolean winNum) {
		// 당첨번호인지 boolean값으로 확인한 후 
		// 확인한값을 토대로 배열의 길이를 정함
		if(winNum) {
			numbers = new int[7];
		} else {
			numbers = new int[6];
		}
		generate();
	}
	
	// 랜덤번호 생성 동작 자체를 간소화시킨 느낌으로
	public int getRandomNumber() {
		return (int)(Math.random() * 45 + 1);
	}
	
	
	// 현재 인스턴스의 numbers 배열을 중복없는 랜덤 숫자로 가득 채움
	// 리턴되는 값은 없지만 외부에 변화를 주고있는 메소드
	public void generate() {
		int len = numbers.length;
		for(int i = 0; i < len; i++) {
			numbers[i] = getRandomNumber();
			for (int j = 0; j < i; j++) {
				if (numbers[i] == numbers[j]) {
					i--;
					break;
				}
			}
		}
	}
	
	// 당첨번호 인스턴스를 전달 받으면 등수 값을 리턴하는 메서드
	public int check(LottoNumber winNum) {
		// boolean타입 매개변수 winNum을 받고 당첨번호 배열생성
		int winLen = winNum.numbers.length;
		// 매개변수winNum을 받지 않았으므로 길이6의 플레이어번호 배열생성
		int guessLen = this.numbers.length;
		
		int winCount = 0;
		boolean hasBonus = false;
		
		if(winLen != 7) {
			// -1등은 에러체크
			return -1;
		}
		for (int i = 0; i < guessLen; i++) {
			for (int j = 0; j < winLen; j++) {
				if(this.numbers[i] == winNum.numbers[j]) {
					winCount++;
					// 당첨번호의 마지막 번호와 일치한다면 bonus번호를 맞춘것
					if (!hasBonus && j == winLen -1) {
						hasBonus = true;
					}
					break;
				}
			}
		}
		// winCount횟수로 당첨등수번호 리턴
		if (winCount == 6) {
			if (hasBonus) {
				return 2;
			} else {
				return 1;
			}
		}
		// 보너스 번호를 가지고 있다면 맞춘번호를 1뺀다
		// 3등부터는 보너스번호가 의미가 없으므로 winCount를 하나 빼서 비교한다.
		// (5개 맞추고 그중 보너스 맞췄으면 실질적으로 4개맞춘셈)
		winCount = hasBonus ? winCount - 1 : winCount;
		if(winCount == 5) {
			return 3;	//3등
		} else if (winCount == 4) {
			return 4;	//4등
		} else if (winCount == 3) {
			return 5;	//5등
		} else {
			return 0;	//낙첨
		}
	}
	
	// 로또번호의 정보를 출력하는 메소드
	public void print() {
		System.out.println(Arrays.toString(numbers));
	}

}
