package quiz_answer;

public class D08_isPhoneNumber_answer {
	
	
	public static boolean isValidPhoneNumber(String phoneNumber) {
		
		// 010으로 시작하지 않으면 false
		if(!phoneNumber.startsWith("010")) {
			System.out.printf("[INFO] %s는 010으로 시작하지 않습니다.\n", phoneNumber);
			return false;
		}
		
		// -를 제거했는데 숫자가 아닌것이 남아있으면 false
		String hyponRemovedNumber = phoneNumber.replace("-", "");
		for (int i = 0, len = hyponRemovedNumber.length(); i < len; i++) {
			if(!Character.isDigit(hyponRemovedNumber.charAt(i))) {
				System.out.printf("[INFO] %s에 숫자가 아닌것이 포함되어 있습니다.\n", phoneNumber);
				return false;
			}
		}
		
		if(hyponRemovedNumber.length() != 11){
			System.out.println("[INFO] 숫자의 개수가 11개가 아닙니다.");
			return false;
		}
		
		// -의 위치가 지정자리가 아닐경우 false
		int len = phoneNumber.length();
		if (!(len == 11 || len == 13)) {
			System.out.println("[INFO] 번호 길이가 잘못되었습니다.");
			return false;
		}
		
		if (len == 13) {
			if (phoneNumber.charAt(3) != '-' || phoneNumber.charAt(8) != '-') {
				System.out.println("[INFO] '-'가 없거나 위치가 다릅니다.");
				return false;
			}
			
			int hyponCount = 0;
			for (int i = 0; i < len; i++) {
				if(phoneNumber.charAt(i) == '-') {
					hyponCount++;
				}
			}
			if(hyponCount != 2) {
				System.out.println("[INFO] -의 개수가 너무 많습니다.");
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		
		
		System.out.println(isValidPhoneNumber("1234-1234"));
		System.out.println(isValidPhoneNumber("010-1234+1234"));
		System.out.println(isValidPhoneNumber("010-1241-2004"));
		System.out.println(isValidPhoneNumber("010--341234"));
	}
}
