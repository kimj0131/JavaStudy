package quiz;

import java.util.Scanner;

public class B03_MakeGrade {

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
	public static void main(String[] args) {
		
		int score;
		char grade;
		// 유효하지 않는 입력값확인
		boolean errCheck = true;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어점수 > ");
		score = sc.nextInt();
		if(score < 0 || score > 100) {
			System.out.println("유효하지 않는 점수입니다.");
			grade = 'F';
			errCheck = false;
		} else if(score >= 90) {
			grade = 'A';
		} else if(score >= 80) {
			grade = 'B';
		} else if(score >= 70) {
			grade = 'C';
		} else if(score >= 60) {
			grade = 'D';
		} else {
			grade = 'F';
		}
		int korScore = score;
		char korGrade = grade;
		
		System.out.print("영어점수 > ");
		score = sc.nextInt();
		if(score < 0 || score > 100) {
			System.out.println("유효하지 않는 점수입니다.");
			grade = 'F';
			errCheck = false;
		} else if(score >= 90) {
			grade = 'A';
		} else if(score >= 80) {
			grade = 'B';
		} else if(score >= 70) {
			grade = 'C';
		} else if(score >= 60) {
			grade = 'D';
		} else {
			grade = 'F';
		}
		int engScore = score;
		char engGrade = grade;
				
		System.out.print("수학점수 > ");
		score = sc.nextInt();
		if(score < 0 || score > 100) {
			System.out.println("유효하지 않는 점수입니다.");
			grade = 'F';
			errCheck = false;
		} else if(score >= 90) {
			grade = 'A';
		} else if(score >= 80) {
			grade = 'B';
		} else if(score >= 70) {
			grade = 'C';
		} else if(score >= 60) {
			grade = 'D';
		} else {
			grade = 'F';
		}
		int mathScore = score;
		char mathGrade = grade;
		
		System.out.printf("입력한 점수 확인 %d, %d, %d\n",korScore, engScore, mathScore);
		//총합 점수
		double totalScore = korScore+engScore+mathScore;
		
		// 과목별 등급과 평균점수
		if (errCheck == false) {
			System.out.println("유효하지 않은 점수를 입력했습니다.");
			korGrade = 'F';
			engGrade = 'F';
			mathGrade = 'F';
			totalScore = 0;
		}
		System.out.printf("국어과목 등급 : %c\n", korGrade);
		System.out.printf("영어과목 등급 : %c\n", engGrade);
		System.out.printf("수학과목 등급 : %c\n", mathGrade);
		
		double avgScore = totalScore/3;
		System.out.printf("평균 점수 : %.1f\n", avgScore);
		
	}
	
	
}
