package myobj.parking;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Cars {
	
	final private static String[] carTypes = {
			"장애인", "유아동승", "일반", "화물차", "경차", "중형", "대형", "소형"}; 
	final private static String symbols = "가나다라마바사아자하호허";
	
	
	private static String getRandomCarNumber() {

		StringBuilder carNum = new StringBuilder();
		// 1 ~ 999
		carNum.append(String.format("%02d", (int)(Math.random() * 999 + 1)));
		carNum.append(symbols.charAt((int)(Math.random() * symbols.length())));
		// 0101~9999
		carNum.append(String.format("%04d", (int)(Math.random() * 9898 + 101)));
		
		return carNum.toString();
	}
	
	private static LocalDateTime getRandomExitTime() {
		return LocalDateTime.now().plus((int)(Math.random() * 1000), ChronoUnit.MINUTES);
	}
	
	private static String getRandomCarType() {
		return carTypes[(int)(Math.random() * carTypes.length)];
	}
	
	public static Car getRandomCar() {
		return new Car(getRandomCarNumber(), getRandomCarType()
				, LocalDateTime.now(), getRandomExitTime());
	}
}
