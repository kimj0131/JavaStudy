package myobj.parksys;

import java.time.LocalDateTime;
import java.time.temporal.ChronoField;
import java.util.Map;

public class PaySystem {

	int parkingFareCal(String scanNum, Map<String, LocalDateTime> parkList) {
		LocalDateTime pastTime = parkList.get(scanNum);
		LocalDateTime now = LocalDateTime.now();
		
		
		int fare = 0;
		int passingDate = now.getDayOfYear() - pastTime.getDayOfYear();
		long passingMin = now.get(ChronoField.MINUTE_OF_DAY)
				- pastTime.get(ChronoField.MINUTE_OF_DAY);
		
		System.out.printf("[NOTICE]총 주차시간(분) : %d일 %d분\n", passingDate, passingMin);
		if (passingDate > 0) {
			fare += 8000 * passingDate;
		} 
		if (passingMin <= 30) {
			return fare;
		} else if (passingMin > 30 && passingMin <= 60) {
			passingMin -= 30;
			fare += (passingMin / 10) * 200;
		} else {
			passingMin -= 30;
			fare += (passingMin / 10) * 300;
			fare -= 600;
		}
		return fare;
	}
}
