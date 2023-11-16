package quiz;

import java.util.*;

public class D02_Jiphap {
	/*
	 	1. 두 컬렉션을 매개변수로 전달 받으면 두 컬렉션의 합집합을 Set으로 반환하는 메서드
	 	[1, 2, 3] + [2, 3, 4, 5] => [1, 2, 3, 4, 5]
	 	2. 두 컬렉션을 매개변수로 전달 받으면 두 컬렉션의 교집합을 Set으로 반환하는 메서드
	 	[1, 2, 3] 교 [2, 3, 4, 5] => [2, 3]
	 	3. 두 컬렉션을 매개변수로 전달받으면 두 컬렉션의 차집합을 Set으로 반환하는 메서드
	 	[1, 2, 3] - [2, 3, 4, 5] => [1]
	 	[2, 3, 4, 5] - [1, 2, 3] => [4, 5]
	*/
	
	public static Set getUnion(Collection col_1 , Collection col_2) {
		Set set1 = new HashSet<>(col_1);
		Set set2 = new HashSet<>(col_2);
		
		set1.addAll(set2);
		return set1;	
	}
	
	public static Set getIntersection(Collection col_1 , Collection col_2) {
		Set set1 = new HashSet<>(col_1);
		Set set2 = new HashSet<>(col_2);
		
		set1.retainAll(set2);
		return set1;
	}
	
	public static Set getDifferenceSet(Collection col_1 , Collection col_2) {
		Set set1 = new HashSet<>(col_1);
		Set set2 = new HashSet<>(col_2);
		
		set1.removeAll(set2);
		return set1;
	}
	
		
	public static void main(String[] args) {
		Collection col_1  = new ArrayList<>();
		Collection col_2  = new ArrayList<>();
		
		col_1.add(1);
		col_1.add(2);
		col_1.add(3);
		
		col_2.add(2);
		col_2.add(3);
		col_2.add(4);
		col_2.add(5);
		
		Set unionResult = getUnion(col_1, col_2);
		System.out.println("합집합 결과\n" + unionResult);
		
		Set interResult = getIntersection(col_1, col_2);
		System.out.println("교집합 결과\n" + interResult);
		
		Set difResult = getDifferenceSet(col_1, col_2);
		System.out.println("차집합 결과 case 1\n" + difResult);
		difResult = getDifferenceSet(col_2, col_1);
		System.out.println("차집합 결과 case 2\n" + difResult);
		
	}
}
