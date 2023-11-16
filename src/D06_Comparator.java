import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class D06_Comparator {
	/*
	  	# Comparable
	  	
	  	- 이 인터페이스를 구현한 클래스는 크기 비교가 가능해진다.
	  	
	  	# Comparator
	  	
	  	- 이 인터페이스를 구현할 클래스는 크기 비교의 기준이 된다.
	*/
	static int compareGrade(String g1, String g2) {
		char firstCh1 = g1.charAt(0);
		char firstCh2 = g2.charAt(0);
		
		if(firstCh1 == firstCh2) {
			int len1 = g1.length();
			int len2 = g2.length();
			if(len1 == len2) {
				return 0;
			} else if(len1 < len2) {
				return 1;
			} else {
				return -1;
			}
		} else if(firstCh1 > firstCh2) {
			return -1;
		} else {
			return 1;
		}
	}
	
	public static void main(String[] args) {
		
		System.out.println(10 > 20);
		
		Grape g1 = new Grape(3300, 33, 10, "대관령양떼목장", 1);
		Grape g2 = new Grape(4000, 30, 8, "김씨네포도농장", 3);
		
		System.out.println(g1.compareTo(g2));
		
		List<Integer> numbers = new ArrayList<>();
		
		Collections.addAll(numbers, 99, 1, 88, -9, 13, 15, 8, 3, 99, 100);
		Collections.sort(numbers);
		
		System.out.println(numbers);
		
		// List<Peach> peaches = new ArrayList<>();
		// peaches.add(new Peach());
		// peaches.add(new Peach());
		
		// 리스트 정렬을 하기 위해서는 해당 리스트의 내용물이 크기 비교의 기준이 마련되어 있는 객체여야 한다.
		// Collections.sort(peaches);
		
		List<Grape> grapes = new ArrayList<>();
		
		grapes.add(new Grape(3300, 33, 10, "대관령양떼목장", 1));
		grapes.add(new Grape(2400, 31, 8, "김씨네복숭아농장", 3));
		grapes.add(new Grape(3500, 29, 5, "이씨네사과농장", 1));
		grapes.add(new Grape(6300, 40, 7, "박씨네닭장", 2));
		grapes.add(new Grape(5150, 55, 8, "최가네", 1));
		grapes.add(new Grape(3000, 60, 8, "김가네", 5));
		
		System.out.println(grapes);
		System.out.println();
		
		// Comparable 인터페이스가 구현된 클래스만 sort가 가능하다.
		Collections.sort(grapes);
		
		Collections.sort(grapes, new GrapeNofComparator());
		Collections.reverse(grapes);
		
		System.out.println(grapes);
		System.out.println();
		
		// 연습문제 작성코드
//		List<Peach> peaches = new ArrayList<>();
//		peaches.add(new Peach(2000, "B", 8, "김가네"));
//		peaches.add(new Peach(3500, "A+", 12, "최가네"));
//		peaches.add(new Peach(1000, "D", 5, "박가네"));
//		peaches.add(new Peach(1800, "C", 10, "수가네"));
//		System.out.println();
//		
//		Collections.sort(peaches);
//		System.out.println(peaches);
//		System.out.println();
//		Collections.sort(peaches, new PeachGradeComparator());
//		System.out.println(peaches);
		
		List<Peach> peachList = new ArrayList<>();
		
		Collections.addAll(peachList, new Peach(2000, 4.33, "D+", "아오리사과농장"),
				new Peach(2500, 5.63, "B", "동네농장"),
				new Peach(3000, 7.75, "A+", "동네농장"),
				new Peach(2800, 5.11, "A", "주말농장"));
		
		Collections.sort(peachList);
		System.out.println(peachList);
		
		// 인터페이스는 추상메소드이므로 인스턴스화 할 수 없다.
		// 익명 내부 지역 클래스(뒤에 중괄호를 넣어 바로 Comparator를 상속받아 만든다)
		Comparator<Peach> myComparator1 = new Comparator<>() {
			@Override
			public int compare(Peach o1, Peach o2) {
				int result1 = compareGrade(o1.grade, o2.grade);

				if (result1 == 0) {
					return Integer.compare(o2.price, o1.price);
				} else {
					return result1;
				}
			};
		};
		// 연습 3 : 복숭아를 등급기준으로 오름차순 정렬하고, 등급이 같은 경우 가격기준으로 내림차순 정렬 해보세요
		peachList.add(new Peach(2700, 1.13, "B", "옥상텃밭"));
		peachList.add(new Peach(2500, 2.23, "B", "앞마당"));
		peachList.add(new Peach(2390, 3.13, "B", "뒷마당"));
		peachList.add(new Peach(2420, 4.55, "B", "옆집마당"));
		
		Collections.sort(peachList, myComparator1);
		
		System.out.println("\n연습문제 3번 결과 \n" + peachList);
		System.out.println();
		
		// 연습 4 : 복숭아를 농장이름 오름차순으로 정렬하고 같은 농장인 경우 등급기준 내림차순 정렬 해보세요
		
		peachList.add(new Peach(2100, 2.22, "C+", "옥상텃밭"));
		peachList.add(new Peach(2100, 2.22, "C+", "옥상텃밭"));
		peachList.add(new Peach(2100, 2.22, "C", "옥상텃밭"));
		peachList.add(new Peach(2100, 2.22, "B", "옥상텃밭"));
		peachList.add(new Peach(2100, 2.22, "A", "옥상텃밭"));
		
		Collections.sort(peachList, new Comparator<Peach>() {
			@Override
			public int compare(Peach o1, Peach o2) {
				int result1 = o1.farm.compareTo(o2.farm);
				
				if(result1 == 0) {
					return compareGrade(o2.grade, o1.grade);
				}else {
					return result1; 
				}
			}
		});
		System.out.println("연습문제 3번 결과");
		System.out.println(peachList);
	}

}
class GrapeNofComparator implements Comparator<Grape> {
	@Override
	public int compare(Grape o1, Grape o2) {
		
		if(o1.numOfFruits == o2.numOfFruits) {
			return 0;
		} else if(o1.numOfFruits > o2.numOfFruits) {
			return 1;
		} else {
			return -1;
		}
		
	}
}

// 제네릭 타입이있는 인터페이스
class Grape implements Comparable<Grape> {
	int price;
	int numOfFruits;
	int sweet;
	String farm;
	int grade;
	
	public Grape(int price, int numOfFruits, int sweet, String farm, int grade) {
		this.price = price;
		this.numOfFruits = numOfFruits;
		this.sweet = sweet;
		this.farm = farm;
		this.grade = grade;
	}
	
	@Override
	public String toString() {
		return String.format("[%d/%d/%d/%s/%d]", price, numOfFruits, sweet, farm, grade);
	}
	
	// 비교에 사용하는 메서드
	@Override
	public int compareTo(Grape o) {
		// 이곳에서 현재 인스턴스와 전달되는 인스턴스의 비교 결과를 정의한다.
		
		// 두 객체의 크기가 같다면 0을 리턴
		// 두 객체 중 현재 객체의 크기가 더 크다면 1을 리턴
		// 두 객체 중 매개변수로 전달받은 객체의 크기가 더 크면 -1을 리턴

		if (this.price == o.price) {
			return 0;
		} else if(this.price > o.price) {
			return 1;
		} else {
			return -1;
		}
	}
}

// 연습 1 : 복숭아 클래스를 마저 정의해보세요
// 		   복숭아는 가격, 등급, 무게, 농장이름 필드값을 가지고있습니다.
// 		   (등급은 A+, A, B+, B, C ,D..등 영어로 매긴다)
// 연습 2 : 복숭아를 정렬하면 기본적으로 무게를 기준으로 내림차순으로 정렬되게 만들어보세요
// 연습 3 : 복숭아를 등급기준으로 오름차순 정렬하고, 등급이 같은 경우 가격기준으로 내림차순 정렬 해보세요
// 연습 4 : 복숭아를 농장이름 오름차순으로 정렬하고 같은 농장인 경우 등급기준 내림차순 정렬 해보세요

class Peach implements Comparable<Peach>{
	int price;
	double weight;
	String grade;
	String farm;
	
	public Peach(int price, double weight, String grade, String farm) {
		this.price = price;
		this.weight = weight;
		this.grade = grade;
		this.farm = farm;
	}
	
	@Override
	public String toString() {
		return String.format("%d/%.2f/%s/%s", price, weight, grade, farm);
	}
	
	@Override
	public int compareTo(Peach o) {
		// Integer, Double, String 등은 이미 Comparable이 구현된 클래스이다.
		return Double.compare(o.weight, this.weight);
	}
	
}

// 작성코드

//	String grade;
//	int gradeNum;
//	int weight;
//	public Peach(int price, String grade, int weight, String farm) {
//		this.price = price;
//		this.grade = grade;
//		switch(grade) {
//			case "A+" :
//				this.gradeNum = 1;
//				break;
//			case "A" :
//				this.gradeNum = 2;
//				break;
//			case "B+" :
//				this.gradeNum = 3;
//				break;
//			case "B" :
//				this.gradeNum = 4;
//				break;
//			case "C" :
//				this.gradeNum = 5;
//				break;
//			case "D" :
//				this.gradeNum = 6;
//				break;
//		}
//		this.weight = weight;
//		this.farm = farm;
//	}
//	
//	@Override
//	public String toString() {
//		return String.format("[%d/%s/%d/%s]", price, grade, weight, farm);
//	}
//	
//	@Override
//	public int compareTo(Peach o) {
//		if (this.weight == o.weight) {
//			return 0;
//		} else if (this.weight > o.weight) {
//			return -1;
//		} else {
//			return 1;
//		}
//	}
	
//class PeachGradeComparator implements Comparator<Peach> {
//	@Override
//	public int compare(Peach o1, Peach o2) {
//		if (o1.gradeNum == o2.gradeNum) {
//			return 0;
//		} else if (o1.gradeNum > o2.gradeNum) {
//			return 1;
//		} else {
//			return -1;
//		}
//	}
//}
