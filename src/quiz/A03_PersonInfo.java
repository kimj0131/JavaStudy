package quiz;

public class A03_PersonInfo {
	public static void main(String[] args) {
		
		String personName = "홍길동";
		int age = 20;
		String phoneNumber = "010-1234-1234";
		double height = 178.5;
		double weight = 75.0;
		String bloodType = "O";		// 혈핵형은 AB형도 있으므로 복수의 단어를 저장할 수 있는 String타입을 쓴다.
		
		System.out.println("========= 출력 결과 =========");
		System.out.println("이름\t: " + personName);
		System.out.println("나이\t: " + age);
		System.out.println("Tel\t: " + phoneNumber);
		System.out.println("키\t: " + height);
		System.out.println("몸무게\t: " + weight);
		System.out.println("혈핵형\t: " + bloodType);
		
	}
	
}
