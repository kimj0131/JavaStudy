package myobj.clapGame;

public class ClapCount {

	
	public int comparison(int num) {
		
		int clapCount = 0;
		while (num > 0) {
			// 1의자리는 따로분리(1의 자리가 0일때 참이 되버림)
			int digit = num % 10;
			if (digit != 0 && digit % 3 == 0) {
				clapCount++;
			}
			// 한자리 검사완료했으므로 다음
			num /= 10;
		}
		return clapCount;
	}
}
