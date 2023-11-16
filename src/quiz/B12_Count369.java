package quiz;

public class B12_Count369 {
	/*
	 * 100 ~ 500 사이의 랜덤 양의 정수를 하나 생성하고 해당 숫자까지 369를 진행한다면 박수를 총 몇 번 쳐야하는지 출력해보세요
	 */
	public static void main(String[] args) {

		int lanNum = (int) (Math.random() * 401) + 100;

		lanNum = 400;
		System.out.println("임의의 숫자 : " + lanNum);

//		int clap = 0;
//		for (int count = 1; count <= lanNum; count++) {
//			for (int i = 3; i <= 9; i += 3) {
//				// 1 자리
//				clap = count % 10 == i ? ++clap : clap;
//				// 10 자리
//				clap = (count / 10) % 10 == i ? ++clap : clap;
//				// 100 자리
//				clap = count / 100 == i ? ++clap : clap;
//			}
//		}

		int clap = 0;
		for (int count = 1; count <= lanNum; count++) {
			int chck = count;
			for (int i = 0; i < count; i++) {
				int digit = chck % 10;
				clap = chck != 0 && chck % 3 == 0 ? ++clap : clap;
				chck /= 10;
			}
		}

		System.out.println("박수친 총 회수 : " + clap);
	}

}
