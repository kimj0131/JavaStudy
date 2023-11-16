package quiz_answer;

public class B14_RandomScores_Answer {

	public static void main(String[] args) {
		
		// 300개의 정수를 담을 수 있는 배열을 생성
		int[] scores = new int[300];
		
		// 0 ~ 299번 방까지 숫자를 랜덤으로 채운다
		for(int i = 0; i <scores.length; i++) {
			scores[i] = (int)(Math.random() * 20001);
			
		}
		
		// 총합 구하기
		int sum = 0;
		for (int i = 0; i < scores.length; i++) {
			sum += scores[i];
			System.out.print(scores[i] + "\t");
			if (i % 5 == 4) {
				System.out.println();
			}
		}
		
		System.out.println("총합 : " + sum);
		System.out.printf("평균 : %.2f\n",  sum / (double)scores.length);
		
		// 제일 높은 점수, 제일 낮은 점수
		// 첫번째 점수로 초기화 후 두번째 점수부터 하나씩 비교한다.
		int bestScore = scores[0];
		int worstScore = scores[0];
		
		for (int i = 0; i < scores.length; i++) {
			// 현재 최고 점수보다 i번째 점수가 더 크다면 그 점수를 최고 점수로 바꾼다.
			if (scores[i] > bestScore) {
				bestScore = scores[i];
			}
			// 현재 최저 점수보다 i번째 점수가 더 작다면 그 점수를 최저 점수로 바꾼다.
			if (scores[i] < worstScore) {
				worstScore = scores[i];
			}
		}
		
		System.out.println("최고 점수 : " + bestScore);
		// 최고 점수인 사람들을 모두 출력한다
		for (int i = 0; i < scores.length; i++) {
			int score = scores[i];
			if (scores[i] == bestScore) {
				System.out.printf("%d번째 참가자 [%d점]\n", i, score);
			}
		}
		System.out.println("최저 점수 : " + worstScore);
		// 최저 점수인 사람들을 모두 출력한다
		for (int i = 0; i < scores.length; i++) {
			int score = scores[i];
			if (scores[i] == worstScore) {
				System.out.printf("%d번째 참가자 [%d점]\n", i, score);
			}
		}
	}
}
