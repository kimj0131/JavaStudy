package quiz;

public class A02_SwapValue {
	
	public static void main(String[] args) {
		
		int a = (int)(Math.random() * 30);
		int b = (int)(Math.random() * 30);

		System.out.println("바꾸기 전 a : "+ a);
		System.out.println("바꾸기 전 b : "+ b);
		
		// 코드를 추가해 두 변수의 값을 바꿔서 출력해보세요
		
		//int a1 = a, b1 = b;
		//a = b1;
		//b = a1;
		
		// 더 나은방법
		
		int swap;
		swap = a;
		a = b;
		b = swap;
		
		
		System.out.println("바꾼 후 a : "+ a);
		System.out.println("바꾼 후 b : "+ b);
		
	}

}
