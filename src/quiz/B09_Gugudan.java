package quiz;

public class B09_Gugudan {
	/*
	 	1. 구구단을 다음과같이 가로로 출력해 보세요
	 	ex)
	 	2단 : 2x1=2 2x2=4 2x3=6 ....
	 	3단 : 3x1=3 3x2=6 ...
	 	2. 구구단을 다음과 같이 세로로 출력해 보세요
	 	ex) 
	 	2단		3단		4단		...
	 	2x1=2	3x1=3	4x1=4	...
	*/
	public static void main(String[] args) {
		
		// 1.
		for (int d=2; d<=9; d++) {
			System.out.printf("%d단 : ", d);
			for (int g=1; g<=9; g++) {
				System.out.printf("%dx%d=%2d ", d, g, d*g);
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		
		// 2.
		// 행과 열을 반대로 뒤집어서 풀이함
		for (int i=2; i<=9; i++) {
			System.out.printf("%d단\t", i);
			if (i == 9) {
				System.out.println();
			}
		}
		for (int g=1; g<=9; g++) {
			for (int d=2; d<=9; d++) {
				System.out.printf("%dx%d=%2d\t", d, g, d*g);
			}
			System.out.println();
		}
				
	}
}
