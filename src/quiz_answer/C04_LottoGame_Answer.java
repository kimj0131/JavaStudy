package quiz_answer;

import myobj.lotto_answer.LottoGame;

public class C04_LottoGame_Answer {
	
	/*
	 	# 로또 게임 만들기
	 	1. 당첨번호는 7개이고 1등 당첨이 되면 다음 당첨 번호로 넘어간다.
	 	2. 플레이어는 번호 6개를 입력해 숫자를 맞춰야 한다.
	 	3. 1등 : 앞의 6개의 숫자를 모두 맞춤			(+ 10억)
	 	   2등 : 보너스 번호를 포함한 6개의 숫자를 맞춤		(+ 8천만원)
	 	   3등 : 5개의 숫자를 맞춤(보너스 번호 미포함)		(+ 150만원)
	 	   4등 : 4개의 숫자를 맞춤(보너스 번호 미포함)		(+ 5만원)
	 	   5등 : 3개의 숫자를 맞춤(보너스 번호 미포함)		(+ 5천원)
	 	4. 플레이어가 게임을 종료할때까지 게임이 계속 된다.
	 		<화면 예시>
	 		
	 		1.자동구매
	 		2.수동구매
	 		3.현재까지의 이력확인 (사용금액, 당첨횟수, 손익계산)
	 		4.게임종료
	 		>>
	 		
	 	1 >> 당첨번호, 플레이어번호는 게속해서 생성, 사용될 요소로 별도의 클래스를 생성
	*/

	public static void main(String[] args){
		
		new LottoGame().play();
		
//		// 당첨번호를 생성할지, 플레이어번호를 생성할지
//		LottoNumber winNum = new LottoNumber(true);
//		
//		// 플레이어번호 10개 생성해서 출력해보기
//		for (int i = 0; i < 10; i++) {
//			LottoNumber guess = new LottoNumber(false);
//			
//			// 생성된 winNum을 보내 체크를 하고 등수번호를 받아온다?
//			int result = guess.check(winNum);
//			
//			winNum.print();
//			guess.print();
//			System.out.println(result + "등 입니다!");
//		}
	}
}
