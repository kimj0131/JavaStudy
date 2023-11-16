package myobj.school;

public class SubLiberal extends Subject {
	int kor;
	int eng;
	int math1;
	int korHis;
	int ethics;
	int worldHis;
	
	static int getRandomScore() {
		return (int)(Math.random() * 101);
	}
	
	public SubLiberal() {
		kor = getRandomScore();
		eng = getRandomScore();
		math1 = getRandomScore();
		korHis = getRandomScore();
		ethics = getRandomScore();
		worldHis = getRandomScore();
	}
	
	@Override
	public double getAvg() {
		return getTotal() / 6.0;
	}
	
	@Override
	public String getGrade() {
		double avg = getAvg();
		
		if(avg >= 90) {
			return "A";
		} else if(avg >= 80) {
			return "B";
		} else if (avg >= 70) {
			return "C";
		} else if (avg >= 60) {
			return "D";
		} else {
			return "F";
		}
	}
	
	@Override
	public int getTotal() {
		return (kor + eng + math1 + korHis + ethics + worldHis);
	}
	
	@Override
	public void printScores() {
		System.out.println("국어\t영어\t수1\t국사\t윤리\t세계사");
		System.out.printf("%d\t%d\t%d\t%d\t%d\t%d\n", kor, eng, math1, korHis, ethics, worldHis);
	}
}
