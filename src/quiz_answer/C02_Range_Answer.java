package quiz_answer;

import java.util.Arrays;

public class C02_Range_Answer {
	
	// 1.
	public static int[] range(int num) {
		int[] arr = new int[num];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i;
		}
		return arr;
	}
	
	// 2.
	public static int[] range(int start, int end) {
		int size = Math.abs(start - end);
		
		int[] arr = new int[size];
		
		// start가 더 작을때 증가, end가 더 작을땐 감소
		// 증감값을 변수로 지정, 비슷한 반복문의 사용을 줄임
		int increment = start < end ? 1 : -1;
		
		// 반복문은 횟수만큼 반복한다고 생각하고 증감값을 넣어서 원하는 값을 유도하기
		for (int i = 0; i < arr.length; i++) {
			arr[i] = start + (increment * i);
		}
		
		return arr;
	}
	
	// 3.
	// 변수명을 알아보기 쉽게 작성하면 알고리즘 짜는데 도움이 될것
	public static int[] range(int start, int end, int increment) {
		
		// 나눠떨어질때는 정상적으로 개수가 나오지만
		// 나눈값이 0.1이라도 발생하면 나눈값에서 값이 하나 더 발생하므로 소수 첫째자리 올림으로 개수를 맞춘다
		int size = (int)Math.ceil((end - start) / (double)increment);
		// 위 계산에서 size가 -가 나온다면 방향이 잘못된 것이다.
		
		// 방향이잘못된 입력값은 제외시키기
		if(size < 0) {
			return null;
		}
		int [] arr = new int[size];
		
		for(int i = 0; i < size; i++) {
			arr[i] = start + (increment * i);
		}
		return arr;
	}
	
	public static void main(String[] args) {
		System.out.println(Arrays.toString(range(10, 15)));
		System.out.println(Arrays.toString(range(10, 20, 3)));
		// 해당 함수에서 null을 리턴할 가능성이 있는경우
		// null이 아닐때만 해당 값을 활용하도록 코드를 작성하는 것이 좋다.
		int[] result = range(10, 80, -1);
		if (result != null) {
			System.out.println(Arrays.toString(result));
		} else {
			System.out.println("null이 나왔습니다.");
		}
	}

}
