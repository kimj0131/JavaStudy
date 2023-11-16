package quiz;

public class B14_RandomScores {
	/*
	  	1. 300개의 랜덤 점수를 생성한다. (0 ~ 20000)
	  	2. 해당 점수들을 한 줄에 5개씩 보기 좋게 출력한다.
	  	3. 모든 점수들의 평균을 출력한다 (소수 셋째 자리에서 반올림)
	  	4. 가장 높은 점수와 가장 낮은 점수를 찾아
	  	   그 점수가 몇 번째 사람인지를 출력한다.(중복인 경우 모두 출력한다)
	 */
	public static void main(String[] args) {
		
		int[] ran = new int[300];
		int count = 0;
		double sum = 0;
		
		System.out.println("300개의 랜덤점수들 : ");
		//1. 랜덤점수 생성
		for (int i = 0; i < ran.length; i++) {
			ran[i] = (int)(Math.random()*20001);
			//2. 해당 점수들 5개씩 나열
			System.out.printf("%6d ", ran[i]);
			count ++;
			if (count % 5 == 0) {
				System.out.println();
			}
			//3. 점수평균
			sum += ran[i];
		}
		System.out.println();
		System.out.printf("모든 점수들의 평균 : %.2f\n", sum/ran.length);
		
		//4. 가장 높은 점수와 가장 낮은 점수
		
		// 첫번째값을 비교해가면서 최대값/최소값이면 저장, 반복하여 저장하면 최대값/최소값이 확인
		int max = ran[0];
		int maxNum = 0;
		int min = ran[0];
		int minNum = 20000;
		
		for (int i = 0; i < ran.length; i++) {
			if(max < ran[i]) {
				max = ran[i];
				maxNum = i+1;
			} else if (min > ran[i]) {
				min = ran[i];
				minNum = i+1;
			}
			
		}
		System.out.printf("가장 높은 점수 : %6d, %3d번째 사람입니다.\n",max ,maxNum);
		System.out.printf("가장 낮은 점수 : %6d, %3d번째 사람입니다.\n",min ,minNum);
	}

}
