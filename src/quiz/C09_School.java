package quiz;

import java.util.Arrays;

public class C09_School {

	/*
	 	1. 이과 학생들은 국어, 영어, 수1, 수2, 과학 점수가 있다
	 	2. 문과 학생들은 국어, 영어, 수1, 국사, 윤리, 세계사 점수가 있다
	 	3. 100명의 학생들을 랜덤으로 생성한다.
	 	   모든 학생들의 과, 점수, 이름등 모든 내용이 랜덤으로 생성되어야 하고
	 	   학생들의 학번은 중복없이 순차적으로 생성되어야 한다.
	 	4. 성적표 출력 메서드를 통해 각 학생의
	 	   [학번 / 이름 / 과목별 점수 / 총점 / 평균 / 등급]을 볼 수 있다.
	*/
	
	public static void main(String[] args) {
		StudentInfo si = new StudentInfo(20);
		si.print();
	}
	
}
class StudentInfo {
	
	int studentNumber; 	// 학생수
	int[] schoolNum;	// 학번
	String[] name;		// 학생이름
	int[] department;	// 과
	int[] score;		// 과목 점수
	
	public StudentInfo(int studentNumber) {
		this.studentNumber = studentNumber;
		this.schoolNum = new int[studentNumber];
		this.name = new String[studentNumber];
		this.department = new int[studentNumber];
		
		randomCreation();
	}
	
	void randomCreation() {
		
		// 학번
		for (int i = 0; i < schoolNum.length; i++) {
			schoolNum[i] = i + 1;
		}
		
		// 이름
		char[] lastName = {'김', '이', '박', '최', '정', '강', '조', '윤', '장', '임', '한', '오', '서', '신', '권', '황', '안', '송', '전', '홍'};
		char[] firstName = {'가', '강', '건', '경', '고', '관', '광', '구', '규', '근', '기', '길', '나', '남', '노', '누', '다',
		        '단', '달', '담', '대', '덕', '도', '동', '두', '라', '래', '로', '루', '리', '마', '만', '명', '무', '문', '미', '민', '바', '박',
		        '백', '범', '별', '병', '보', '빛', '사', '산', '상', '새', '서', '석', '선', '설', '섭', '성', '세', '소', '솔', '수', '숙', '순',
		        '숭', '슬', '승', '시', '신', '아', '안', '애', '엄', '여', '연', '영', '예', '오', '옥', '완', '요', '용', '우', '원', '월', '위',
		        '유', '윤', '율', '으', '은', '의', '이', '익', '인', '일', '잎', '자', '잔', '장', '재', '전', '정', '제', '조', '종', '주', '준',
		        '중', '지', '진', '찬', '창', '채', '천', '철', '초', '춘', '충', '치', '탐', '태', '택', '판', '하', '한', '해', '혁', '현', '형',
		        '혜', '호', '홍', '화', '환', '회', '효', '훈', '휘', '희', '운', '모', '배', '부', '림', '봉', '혼', '황', '량', '린', '을', '비',
		        '솜', '공', '면', '탁', '온', '디', '항', '후', '려', '균', '묵', '송', '욱', '휴', '언', '령', '섬', '들', '견', '추', '걸', '삼',
		        '열', '웅', '분', '변', '양', '출', '타', '흥', '겸', '곤', '번', '식', '란', '더', '손', '술', '훔', '반', '빈', '실', '직', '흠',
		        '흔', '악', '람', '뜸', '권', '복', '심', '헌', '엽', '학', '개', '롱', '평', '늘', '늬', '랑', '얀', '향', '울', '련'};
		for (int i = 0; i < name.length; i++) {
			String stdName = "";
			stdName += lastName[(int)(Math.random() * lastName.length)];
			stdName += firstName[(int)(Math.random() * firstName.length)];
			stdName += firstName[(int)(Math.random() * firstName.length)];
			name[i] = stdName;
		}
		
		// 과
		// 1 : 이과, 2 : 문과
		for (int i = 0; i < department.length; i++) {
			int ran = (int)(Math.random() * 2 + 1);
			department[i] = ran;
		}
		
	}
	
	StudentScore randomScore(int department) {
		int[] subScore;
		if (department == 1) {
			ScienceStudent ss = new ScienceStudent();
			subScore = new int[5];
			for (int i = 0; i < subScore.length; i++) {
				subScore[i] = (int)(Math.random() * 100 + 1);
			}
			
			ss.korean = subScore[0];
			ss.english = subScore[1];
			ss.math1 = subScore[2];
			ss.math2 = subScore[3];
			ss.science = subScore[4];
			StudentScore ss1 = (StudentScore)ss;
			return ss1;
		} else {
			LiberalStudent ls = new LiberalStudent();
			subScore = new int[6];
			for (int i = 0; i < subScore.length; i++) {
				subScore[i] = (int)(Math.random() * 100 + 1);
			}
			
			ls.korean = subScore[0];
			ls.english = subScore[1];
			ls.math1 = subScore[2];
			ls.historyKorea = subScore[3];
			ls.ethics = subScore[4];
			ls.historyWorld = subScore[5];
			StudentScore ss1 = (StudentScore)ls;
			return ss1;
		}
		
	}
	
//	void grade() {
//		int i = 0;
//		while(true) {
//			randomScore(department[i]);
//			
//			i++;
//		}
//	}
	
	void print() {
		for (int i = 0; i < studentNumber; i++) {
			int totalScore = 0;
			System.out.printf("[학번:%-3d/ %s /%s/", schoolNum[i], name[i], department[i] == 1 ? "이과" : "문과");
			if(department[i] == 1) {
				
				ScienceStudent si = (ScienceStudent) randomScore(department[i]);
				totalScore = si.korean + si.english + si.math1 + si.math2 + si.science;
				System.out.printf("[국어:%-3d영어:%-3d수1:%-3d수2:%-3d과학:%-3d]\t",si.korean, si.english, si.math1, si.math2, si.science);
				System.out.printf("\t/ 총점:%-3d / 평균:%.2f]", totalScore, totalScore/5.0);

			}else {
				
				LiberalStudent li = (LiberalStudent) randomScore(department[i]);
				totalScore = li.korean + li.english + li.math1 + li.historyKorea + li.ethics + li.historyWorld;
				System.out.printf("[국어:%-3d영어:%-3d수1:%-3d국사:%-3d윤리:%-3d세계사:%-3d]", li.korean, li.english, li.math1, li.historyKorea, li.ethics, li.historyWorld);
				System.out.printf("\t/ 총점:%-3d / 평균:%.2f]", totalScore, totalScore/6.0);
			}
			System.out.println();
		}
	}
}

class StudentScore {
	int korean;
	int english;
	int math1;
}

class ScienceStudent extends StudentScore{
	int math2;
	int science;
}

class LiberalStudent extends StudentScore{
	int historyKorea;
	int ethics;
	int historyWorld;
}