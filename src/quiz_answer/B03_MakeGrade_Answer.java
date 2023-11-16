package quiz_answer;

import java.util.Scanner;

public class B03_MakeGrade_Answer {
	
	/*
  	국어, 영어, 수학 점수를 순서대로 입력받아 평균 점수를 구한 후에
  	각 과목의 점수와 등급 및 평균점수를 출력해주는 프로그램을 만들어보세요
  	
    1.	90점 이상 : A
  		80점 이상 : B
  		70점 이상 : C
  		60점 이상 : D
			그 외  : F
		2.	각 과목의 유효 점수는 0~100점 이다.
			유효하지 않은 점수가 하나라도 있다면 모든 과목이 F이고
			평균 점수는 0점
		3.	평균 점수는 소수 둘째 자리에서 반올림하여 변수에 저장한 후 출력
			
	*/
	
	//풀이 답안
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 점수를 입력 > ");
		int kor = sc.nextInt();
		System.out.print("영어 점수를 입력 > ");
		int eng = sc.nextInt();
		System.out.print("수학 점수를 입력 > ");
		int math = sc.nextInt();
		
		char korGrade, engGrade, mathGrade;
		double avg = 0;
		// 점수가 유효한지 체크 (유효성 검사)
		if (kor>100 || kor<0 || eng>100 || eng<0 || math>100 || math<0) {
			kor = 0;
			eng = 0;
			math = 0;
			korGrade = 'F';
			engGrade = 'F';
			mathGrade = 'F';
			avg = 0.0;
		} else {
			// 점수가 모두 유효한 곳
			
			// 각 과목 등급 만들기
			// 국어
			if(kor>=90) {
				korGrade = 'A';
			} else if(kor>=80) {
				korGrade = 'B';
			} else if(kor>=70) {
				korGrade = 'C';
			} else if(kor>=60) {
				korGrade = 'D';
			} else {
				korGrade = 'F';
			}
			// 영어
			if(eng>=90) {
				engGrade = 'A';
			} else if(eng>=80) {
				engGrade = 'B';
			} else if(eng>=70) {
				engGrade = 'C';
			} else if(eng>=60) {
				engGrade = 'D';
			} else {
				engGrade = 'F';
			}
			// 수학
			if(math>=90) {
				mathGrade = 'A';
			} else if(math>=80) {
				mathGrade = 'B';
			} else if(math>=70) {
				mathGrade = 'C';
			} else if(math>=60) {
				mathGrade = 'D';
			} else {
				mathGrade = 'F';
			}
			// 평균 점수 (둘째 자리에서 반올림)
			avg = Math.round((kor+eng+math) / 3.0 * 10) / 10.0;
		}
		// 계산된 결과를 출력하기
		System.out.println("\t점수\t등급");
		System.out.printf("국어\t%d\t%c\n", kor, korGrade);
		System.out.printf("영어\t%d\t%c\n", eng, engGrade);
		System.out.printf("수학\t%d\t%c\n", math, mathGrade);
		System.out.println("=====================");
		System.out.printf("평균\t\t%.1f", avg);
	}

}
