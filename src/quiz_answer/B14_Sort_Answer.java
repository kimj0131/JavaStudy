package quiz_answer;

import java.math.BigDecimal;
import java.util.Arrays;

public class B14_Sort_Answer {
	
	public static void main(String[] args) {
		
		int[] arr = new int[20];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 201 - 100);
		}
		
		System.out.println(" == 원본 == ");
		System.out.println(Arrays.toString(arr));
		
		int step = 0;
		while(step < arr.length) {
			// 가장 큰 것을 골라서 맨앞에 놓는다.
			// 0단계일때 가장 큰 숫자를 골라서 0번 위치에 놓는다.
			// 1단게일때는 0번위치에 이미 가장 큰 숫자가 있으므로 
			// 1번 인덱스 부터 비교할 수 있다, 나머지중 가장 큰 숫자를 골라서 1번위치에 놓는다.
			// ... 반복
			int biggestIndex = step;
			// 제일 큰값을 찾아서 계속 biggestIndex에 인덱스값을 넣는다
			for (int i = step + 1; i < arr.length; i++) {
				if (arr[biggestIndex] < arr[i]) {
					biggestIndex = i;
				}
			}
			int temp = arr[step];
			arr[step] = arr[biggestIndex];
			arr[biggestIndex] = temp;
			
			step++;
		}
		System.out.println("내림차순 정렬 후");
		System.out.println(Arrays.toString(arr));
		
		// 위의 방법으로 가장작은것을 골라 맨앞에 두는방법
		step = 0;
		while (step < arr.length) {
			int smallestIndx = step;
			
			for (int i = step + 1; i < arr.length; i++) {
				if (arr[smallestIndx] > arr[i]) {
					smallestIndx = i;
				}
			}
			
			int temp = arr[step];
			arr[step] = arr[smallestIndx];
			arr[smallestIndx] = temp;
			
			step++;
		}
		System.out.println("오름차순 정렬(1) 후");
		System.out.println(Arrays.toString(arr));
		
		// 가장 큰것을 골라 맨뒤로 두는 방법
		step = 0;
		while (step < arr.length) {
			int biggestIndex = arr.length - step - 1;
			
			for (int i = 0; i < arr.length - step; i++) {
				if (arr[biggestIndex] < arr[i]) {
					biggestIndex = i;
				}
			}
			
			int temp = arr[arr.length - 1 - step];
			arr[arr.length - 1 - step] = arr[biggestIndex];
			arr[biggestIndex] = temp;
			
			step++;
		}
		System.out.println("오름차순 정렬(2) 후");
		System.out.println(Arrays.toString(arr));
		
		
	}

}
